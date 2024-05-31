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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratorControlSource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getTotalEfficiency <em>Total Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GeneratingUnitImpl#getNormalPF <em>Normal PF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratingUnitImpl extends EquipmentImpl implements GeneratingUnit {
    /**
     * The default value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal VARIABLE_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableCost()
     * @generated
     * @ordered
     */
    protected BigDecimal variableCost = VARIABLE_COST_EDEFAULT;

    /**
     * This is true if the Variable Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean variableCostESet;

    /**
     * The default value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMaxP()
     * @generated
     * @ordered
     */
    protected static final Double RATED_GROSS_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMaxP()
     * @generated
     * @ordered
     */
    protected Double ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;

    /**
     * This is true if the Rated Gross Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedGrossMaxPESet;

    /**
     * The default value of the '{@link #getTotalEfficiency() <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalEfficiency()
     * @generated
     * @ordered
     */
    protected static final Double TOTAL_EFFICIENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTotalEfficiency() <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalEfficiency()
     * @generated
     * @ordered
     */
    protected Double totalEfficiency = TOTAL_EFFICIENCY_EDEFAULT;

    /**
     * This is true if the Total Efficiency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean totalEfficiencyESet;

    /**
     * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlAreaGeneratingUnit()
     * @generated
     * @ordered
     */
    protected EList< ControlAreaGeneratingUnit > controlAreaGeneratingUnit;

    /**
     * The default value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedNetMaxP()
     * @generated
     * @ordered
     */
    protected static final Double RATED_NET_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedNetMaxP()
     * @generated
     * @ordered
     */
    protected Double ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;

    /**
     * This is true if the Rated Net Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedNetMaxPESet;

    /**
     * The cached value of the '{@link #getGrossToNetActivePowerCurves() <em>Gross To Net Active Power Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     * @ordered
     */
    protected EList< GrossToNetActivePowerCurve > grossToNetActivePowerCurves;

    /**
     * The default value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalP()
     * @generated
     * @ordered
     */
    protected static final Double NOMINAL_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalP()
     * @generated
     * @ordered
     */
    protected Double nominalP = NOMINAL_P_EDEFAULT;

    /**
     * This is true if the Nominal P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalPESet;

    /**
     * The default value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOperatingP()
     * @generated
     * @ordered
     */
    protected static final Double MAX_OPERATING_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOperatingP()
     * @generated
     * @ordered
     */
    protected Double maxOperatingP = MAX_OPERATING_P_EDEFAULT;

    /**
     * This is true if the Max Operating P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxOperatingPESet;

    /**
     * The default value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMinP()
     * @generated
     * @ordered
     */
    protected static final Double RATED_GROSS_MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMinP()
     * @generated
     * @ordered
     */
    protected Double ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;

    /**
     * This is true if the Rated Gross Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedGrossMinPESet;

    /**
     * The default value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected static final Double GOVERNOR_SCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected Double governorSCD = GOVERNOR_SCD_EDEFAULT;

    /**
     * This is true if the Governor SCD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean governorSCDESet;

    /**
     * The default value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     * @ordered
     */
    protected static final Double MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     * @ordered
     */
    protected Double maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;

    /**
     * This is true if the Maximum Allowable Spinning Reserve attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumAllowableSpinningReserveESet;

    /**
     * The default value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLongPF()
     * @generated
     * @ordered
     */
    protected static final Double LONG_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLongPF()
     * @generated
     * @ordered
     */
    protected Double longPF = LONG_PF_EDEFAULT;

    /**
     * This is true if the Long PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean longPFESet;

    /**
     * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal STARTUP_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected BigDecimal startupCost = STARTUP_COST_EDEFAULT;

    /**
     * This is true if the Startup Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupCostESet;

    /**
     * The default value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortPF()
     * @generated
     * @ordered
     */
    protected static final Double SHORT_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortPF()
     * @generated
     * @ordered
     */
    protected Double shortPF = SHORT_PF_EDEFAULT;

    /**
     * This is true if the Short PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortPFESet;

    /**
     * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupTime()
     * @generated
     * @ordered
     */
    protected static final Double STARTUP_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupTime()
     * @generated
     * @ordered
     */
    protected Double startupTime = STARTUP_TIME_EDEFAULT;

    /**
     * This is true if the Startup Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupTimeESet;

    /**
     * The default value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlSource()
     * @generated
     * @ordered
     */
    protected static final GeneratorControlSource GEN_CONTROL_SOURCE_EDEFAULT = GeneratorControlSource.OFF_AGC;

    /**
     * The cached value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlSource()
     * @generated
     * @ordered
     */
    protected GeneratorControlSource genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;

    /**
     * This is true if the Gen Control Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genControlSourceESet;

    /**
     * The default value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOperatingP()
     * @generated
     * @ordered
     */
    protected static final Double MIN_OPERATING_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOperatingP()
     * @generated
     * @ordered
     */
    protected Double minOperatingP = MIN_OPERATING_P_EDEFAULT;

    /**
     * This is true if the Min Operating P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minOperatingPESet;

    /**
     * The cached value of the '{@link #getRotatingMachine() <em>Rotating Machine</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotatingMachine()
     * @generated
     * @ordered
     */
    protected EList< RotatingMachine > rotatingMachine;

    /**
     * The default value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalPF()
     * @generated
     * @ordered
     */
    protected static final Double NORMAL_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalPF()
     * @generated
     * @ordered
     */
    protected Double normalPF = NORMAL_PF_EDEFAULT;

    /**
     * This is true if the Normal PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalPFESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTotalEfficiency() {
        return totalEfficiency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalEfficiency( Double newTotalEfficiency ) {
        Double oldTotalEfficiency = totalEfficiency;
        totalEfficiency = newTotalEfficiency;
        boolean oldTotalEfficiencyESet = totalEfficiencyESet;
        totalEfficiencyESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY,
                    oldTotalEfficiency, totalEfficiency, !oldTotalEfficiencyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTotalEfficiency() {
        Double oldTotalEfficiency = totalEfficiency;
        boolean oldTotalEfficiencyESet = totalEfficiencyESet;
        totalEfficiency = TOTAL_EFFICIENCY_EDEFAULT;
        totalEfficiencyESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY,
                    oldTotalEfficiency, TOTAL_EFFICIENCY_EDEFAULT, oldTotalEfficiencyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTotalEfficiency() {
        return totalEfficiencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedGrossMinP( Double newRatedGrossMinP ) {
        Double oldRatedGrossMinP = ratedGrossMinP;
        ratedGrossMinP = newRatedGrossMinP;
        boolean oldRatedGrossMinPESet = ratedGrossMinPESet;
        ratedGrossMinPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P,
                    oldRatedGrossMinP, ratedGrossMinP, !oldRatedGrossMinPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedGrossMinP() {
        Double oldRatedGrossMinP = ratedGrossMinP;
        boolean oldRatedGrossMinPESet = ratedGrossMinPESet;
        ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;
        ratedGrossMinPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P,
                    oldRatedGrossMinP, RATED_GROSS_MIN_P_EDEFAULT, oldRatedGrossMinPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedGrossMinP() {
        return ratedGrossMinPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getStartupCost() {
        return startupCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupCost( BigDecimal newStartupCost ) {
        BigDecimal oldStartupCost = startupCost;
        startupCost = newStartupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCostESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__STARTUP_COST,
                    oldStartupCost, startupCost, !oldStartupCostESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupCost() {
        BigDecimal oldStartupCost = startupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCost = STARTUP_COST_EDEFAULT;
        startupCostESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__STARTUP_COST,
                    oldStartupCost, STARTUP_COST_EDEFAULT, oldStartupCostESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupCost() {
        return startupCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedNetMaxP( Double newRatedNetMaxP ) {
        Double oldRatedNetMaxP = ratedNetMaxP;
        ratedNetMaxP = newRatedNetMaxP;
        boolean oldRatedNetMaxPESet = ratedNetMaxPESet;
        ratedNetMaxPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__RATED_NET_MAX_P,
                    oldRatedNetMaxP, ratedNetMaxP, !oldRatedNetMaxPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedNetMaxP() {
        Double oldRatedNetMaxP = ratedNetMaxP;
        boolean oldRatedNetMaxPESet = ratedNetMaxPESet;
        ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;
        ratedNetMaxPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_NET_MAX_P,
                    oldRatedNetMaxP, RATED_NET_MAX_P_EDEFAULT, oldRatedNetMaxPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedNetMaxP() {
        return ratedNetMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxOperatingP() {
        return maxOperatingP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxOperatingP( Double newMaxOperatingP ) {
        Double oldMaxOperatingP = maxOperatingP;
        maxOperatingP = newMaxOperatingP;
        boolean oldMaxOperatingPESet = maxOperatingPESet;
        maxOperatingPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__MAX_OPERATING_P,
                    oldMaxOperatingP, maxOperatingP, !oldMaxOperatingPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxOperatingP() {
        Double oldMaxOperatingP = maxOperatingP;
        boolean oldMaxOperatingPESet = maxOperatingPESet;
        maxOperatingP = MAX_OPERATING_P_EDEFAULT;
        maxOperatingPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MAX_OPERATING_P,
                    oldMaxOperatingP, MAX_OPERATING_P_EDEFAULT, oldMaxOperatingPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxOperatingP() {
        return maxOperatingPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedGrossMaxP( Double newRatedGrossMaxP ) {
        Double oldRatedGrossMaxP = ratedGrossMaxP;
        ratedGrossMaxP = newRatedGrossMaxP;
        boolean oldRatedGrossMaxPESet = ratedGrossMaxPESet;
        ratedGrossMaxPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P,
                    oldRatedGrossMaxP, ratedGrossMaxP, !oldRatedGrossMaxPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedGrossMaxP() {
        Double oldRatedGrossMaxP = ratedGrossMaxP;
        boolean oldRatedGrossMaxPESet = ratedGrossMaxPESet;
        ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;
        ratedGrossMaxPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P,
                    oldRatedGrossMaxP, RATED_GROSS_MAX_P_EDEFAULT, oldRatedGrossMaxPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedGrossMaxP() {
        return ratedGrossMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getShortPF() {
        return shortPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortPF( Double newShortPF ) {
        Double oldShortPF = shortPF;
        shortPF = newShortPF;
        boolean oldShortPFESet = shortPFESet;
        shortPFESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__SHORT_PF, oldShortPF,
                    shortPF, !oldShortPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortPF() {
        Double oldShortPF = shortPF;
        boolean oldShortPFESet = shortPFESet;
        shortPF = SHORT_PF_EDEFAULT;
        shortPFESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__SHORT_PF, oldShortPF,
                    SHORT_PF_EDEFAULT, oldShortPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortPF() {
        return shortPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNominalP() {
        return nominalP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalP( Double newNominalP ) {
        Double oldNominalP = nominalP;
        nominalP = newNominalP;
        boolean oldNominalPESet = nominalPESet;
        nominalPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__NOMINAL_P, oldNominalP,
                    nominalP, !oldNominalPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalP() {
        Double oldNominalP = nominalP;
        boolean oldNominalPESet = nominalPESet;
        nominalP = NOMINAL_P_EDEFAULT;
        nominalPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__NOMINAL_P,
                    oldNominalP, NOMINAL_P_EDEFAULT, oldNominalPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalP() {
        return nominalPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getStartupTime() {
        return startupTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupTime( Double newStartupTime ) {
        Double oldStartupTime = startupTime;
        startupTime = newStartupTime;
        boolean oldStartupTimeESet = startupTimeESet;
        startupTimeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__STARTUP_TIME,
                    oldStartupTime, startupTime, !oldStartupTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupTime() {
        Double oldStartupTime = startupTime;
        boolean oldStartupTimeESet = startupTimeESet;
        startupTime = STARTUP_TIME_EDEFAULT;
        startupTimeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__STARTUP_TIME,
                    oldStartupTime, STARTUP_TIME_EDEFAULT, oldStartupTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupTime() {
        return startupTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGovernorSCD() {
        return governorSCD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGovernorSCD( Double newGovernorSCD ) {
        Double oldGovernorSCD = governorSCD;
        governorSCD = newGovernorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCDESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__GOVERNOR_SCD,
                    oldGovernorSCD, governorSCD, !oldGovernorSCDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGovernorSCD() {
        Double oldGovernorSCD = governorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCD = GOVERNOR_SCD_EDEFAULT;
        governorSCDESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__GOVERNOR_SCD,
                    oldGovernorSCD, GOVERNOR_SCD_EDEFAULT, oldGovernorSCDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGovernorSCD() {
        return governorSCDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GrossToNetActivePowerCurve > getGrossToNetActivePowerCurves() {
        if( grossToNetActivePowerCurves == null ) {
            grossToNetActivePowerCurves = new EObjectWithInverseResolvingEList.Unsettable< >(
                    GrossToNetActivePowerCurve.class, this,
                    CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES,
                    CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT );
        }
        return grossToNetActivePowerCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrossToNetActivePowerCurves() {
        if( grossToNetActivePowerCurves != null ) {
            ( ( InternalEList.Unsettable< ? > ) grossToNetActivePowerCurves ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrossToNetActivePowerCurves() {
        return grossToNetActivePowerCurves != null
                && ( ( InternalEList.Unsettable< ? > ) grossToNetActivePowerCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratorControlSource getGenControlSource() {
        return genControlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenControlSource( GeneratorControlSource newGenControlSource ) {
        GeneratorControlSource oldGenControlSource = genControlSource;
        genControlSource = newGenControlSource == null ? GEN_CONTROL_SOURCE_EDEFAULT : newGenControlSource;
        boolean oldGenControlSourceESet = genControlSourceESet;
        genControlSourceESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE,
                    oldGenControlSource, genControlSource, !oldGenControlSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenControlSource() {
        GeneratorControlSource oldGenControlSource = genControlSource;
        boolean oldGenControlSourceESet = genControlSourceESet;
        genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;
        genControlSourceESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE,
                    oldGenControlSource, GEN_CONTROL_SOURCE_EDEFAULT, oldGenControlSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenControlSource() {
        return genControlSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RotatingMachine > getRotatingMachine() {
        if( rotatingMachine == null ) {
            rotatingMachine = new EObjectWithInverseResolvingEList.Unsettable< >( RotatingMachine.class,
                    this, CimPackage.GENERATING_UNIT__ROTATING_MACHINE, CimPackage.ROTATING_MACHINE__GENERATING_UNIT );
        }
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotatingMachine() {
        if( rotatingMachine != null ) {
            ( ( InternalEList.Unsettable< ? > ) rotatingMachine ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotatingMachine() {
        return rotatingMachine != null && ( ( InternalEList.Unsettable< ? > ) rotatingMachine ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNormalPF() {
        return normalPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalPF( Double newNormalPF ) {
        Double oldNormalPF = normalPF;
        normalPF = newNormalPF;
        boolean oldNormalPFESet = normalPFESet;
        normalPFESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__NORMAL_PF, oldNormalPF,
                    normalPF, !oldNormalPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalPF() {
        Double oldNormalPF = normalPF;
        boolean oldNormalPFESet = normalPFESet;
        normalPF = NORMAL_PF_EDEFAULT;
        normalPFESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__NORMAL_PF,
                    oldNormalPF, NORMAL_PF_EDEFAULT, oldNormalPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalPF() {
        return normalPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLongPF() {
        return longPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLongPF( Double newLongPF ) {
        Double oldLongPF = longPF;
        longPF = newLongPF;
        boolean oldLongPFESet = longPFESet;
        longPFESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__LONG_PF, oldLongPF,
                    longPF, !oldLongPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLongPF() {
        Double oldLongPF = longPF;
        boolean oldLongPFESet = longPFESet;
        longPF = LONG_PF_EDEFAULT;
        longPFESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__LONG_PF, oldLongPF,
                    LONG_PF_EDEFAULT, oldLongPFESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLongPF() {
        return longPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit == null ) {
            controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ControlAreaGeneratingUnit.class, this, CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT );
        }
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit != null ) {
            ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlAreaGeneratingUnit() {
        return controlAreaGeneratingUnit != null
                && ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinOperatingP() {
        return minOperatingP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinOperatingP( Double newMinOperatingP ) {
        Double oldMinOperatingP = minOperatingP;
        minOperatingP = newMinOperatingP;
        boolean oldMinOperatingPESet = minOperatingPESet;
        minOperatingPESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__MIN_OPERATING_P,
                    oldMinOperatingP, minOperatingP, !oldMinOperatingPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinOperatingP() {
        Double oldMinOperatingP = minOperatingP;
        boolean oldMinOperatingPESet = minOperatingPESet;
        minOperatingP = MIN_OPERATING_P_EDEFAULT;
        minOperatingPESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MIN_OPERATING_P,
                    oldMinOperatingP, MIN_OPERATING_P_EDEFAULT, oldMinOperatingPESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinOperatingP() {
        return minOperatingPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getVariableCost() {
        return variableCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariableCost( BigDecimal newVariableCost ) {
        BigDecimal oldVariableCost = variableCost;
        variableCost = newVariableCost;
        boolean oldVariableCostESet = variableCostESet;
        variableCostESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__VARIABLE_COST,
                    oldVariableCost, variableCost, !oldVariableCostESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariableCost() {
        BigDecimal oldVariableCost = variableCost;
        boolean oldVariableCostESet = variableCostESet;
        variableCost = VARIABLE_COST_EDEFAULT;
        variableCostESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__VARIABLE_COST,
                    oldVariableCost, VARIABLE_COST_EDEFAULT, oldVariableCostESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariableCost() {
        return variableCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumAllowableSpinningReserve( Double newMaximumAllowableSpinningReserve ) {
        Double oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
        maximumAllowableSpinningReserve = newMaximumAllowableSpinningReserve;
        boolean oldMaximumAllowableSpinningReserveESet = maximumAllowableSpinningReserveESet;
        maximumAllowableSpinningReserveESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve,
                    maximumAllowableSpinningReserve, !oldMaximumAllowableSpinningReserveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumAllowableSpinningReserve() {
        Double oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
        boolean oldMaximumAllowableSpinningReserveESet = maximumAllowableSpinningReserveESet;
        maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;
        maximumAllowableSpinningReserveESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve,
                    MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT, oldMaximumAllowableSpinningReserveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserveESet;
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
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControlAreaGeneratingUnit() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGrossToNetActivePowerCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRotatingMachine() )
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
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< ? > ) getControlAreaGeneratingUnit() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return ( ( InternalEList< ? > ) getGrossToNetActivePowerCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return ( ( InternalEList< ? > ) getRotatingMachine() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            return getVariableCost();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            return getRatedGrossMaxP();
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            return getTotalEfficiency();
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return getControlAreaGeneratingUnit();
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            return getRatedNetMaxP();
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return getGrossToNetActivePowerCurves();
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            return getNominalP();
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            return getMaxOperatingP();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            return getRatedGrossMinP();
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            return getGovernorSCD();
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            return getMaximumAllowableSpinningReserve();
        case CimPackage.GENERATING_UNIT__LONG_PF:
            return getLongPF();
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            return getStartupCost();
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            return getShortPF();
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            return getStartupTime();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            return getGenControlSource();
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            return getMinOperatingP();
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return getRotatingMachine();
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            return getNormalPF();
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
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            setVariableCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            setRatedGrossMaxP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            setTotalEfficiency( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            getControlAreaGeneratingUnit().clear();
            getControlAreaGeneratingUnit().addAll( ( Collection< ? extends ControlAreaGeneratingUnit > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            setRatedNetMaxP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            getGrossToNetActivePowerCurves().clear();
            getGrossToNetActivePowerCurves().addAll( ( Collection< ? extends GrossToNetActivePowerCurve > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            setNominalP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            setMaxOperatingP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            setRatedGrossMinP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            setGovernorSCD( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            setMaximumAllowableSpinningReserve( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__LONG_PF:
            setLongPF( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            setStartupCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            setShortPF( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            setStartupTime( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            setGenControlSource( ( GeneratorControlSource ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            setMinOperatingP( ( Double ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            getRotatingMachine().clear();
            getRotatingMachine().addAll( ( Collection< ? extends RotatingMachine > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            setNormalPF( ( Double ) newValue );
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
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            unsetVariableCost();
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            unsetRatedGrossMaxP();
            return;
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            unsetTotalEfficiency();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            unsetControlAreaGeneratingUnit();
            return;
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            unsetRatedNetMaxP();
            return;
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            unsetGrossToNetActivePowerCurves();
            return;
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            unsetNominalP();
            return;
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            unsetMaxOperatingP();
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            unsetRatedGrossMinP();
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            unsetGovernorSCD();
            return;
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            unsetMaximumAllowableSpinningReserve();
            return;
        case CimPackage.GENERATING_UNIT__LONG_PF:
            unsetLongPF();
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            unsetStartupCost();
            return;
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            unsetShortPF();
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            unsetStartupTime();
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            unsetGenControlSource();
            return;
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            unsetMinOperatingP();
            return;
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            unsetRotatingMachine();
            return;
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            unsetNormalPF();
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
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            return isSetVariableCost();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            return isSetRatedGrossMaxP();
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            return isSetTotalEfficiency();
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return isSetControlAreaGeneratingUnit();
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            return isSetRatedNetMaxP();
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return isSetGrossToNetActivePowerCurves();
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            return isSetNominalP();
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            return isSetMaxOperatingP();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            return isSetRatedGrossMinP();
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            return isSetGovernorSCD();
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            return isSetMaximumAllowableSpinningReserve();
        case CimPackage.GENERATING_UNIT__LONG_PF:
            return isSetLongPF();
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            return isSetStartupCost();
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            return isSetShortPF();
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            return isSetStartupTime();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            return isSetGenControlSource();
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            return isSetMinOperatingP();
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return isSetRotatingMachine();
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            return isSetNormalPF();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (variableCost: " );
        if( variableCostESet ) {
            result.append( variableCost );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ratedGrossMaxP: " );
        if( ratedGrossMaxPESet ) {
            result.append( ratedGrossMaxP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", totalEfficiency: " );
        if( totalEfficiencyESet ) {
            result.append( totalEfficiency );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ratedNetMaxP: " );
        if( ratedNetMaxPESet ) {
            result.append( ratedNetMaxP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", nominalP: " );
        if( nominalPESet ) {
            result.append( nominalP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maxOperatingP: " );
        if( maxOperatingPESet ) {
            result.append( maxOperatingP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ratedGrossMinP: " );
        if( ratedGrossMinPESet ) {
            result.append( ratedGrossMinP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", governorSCD: " );
        if( governorSCDESet ) {
            result.append( governorSCD );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", maximumAllowableSpinningReserve: " );
        if( maximumAllowableSpinningReserveESet ) {
            result.append( maximumAllowableSpinningReserve );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", longPF: " );
        if( longPFESet ) {
            result.append( longPF );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", startupCost: " );
        if( startupCostESet ) {
            result.append( startupCost );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", shortPF: " );
        if( shortPFESet ) {
            result.append( shortPF );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", startupTime: " );
        if( startupTimeESet ) {
            result.append( startupTime );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", genControlSource: " );
        if( genControlSourceESet ) {
            result.append( genControlSource );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", minOperatingP: " );
        if( minOperatingPESet ) {
            result.append( minOperatingP );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", normalPF: " );
        if( normalPFESet ) {
            result.append( normalPF );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //GeneratingUnitImpl
