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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShortCircuitRotorKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineOperatingMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getIkk <em>Ikk</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getEarthing <em>Earthing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getSatDirectTransX <em>Sat Direct Trans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getEarthingStarPointX <em>Earthing Star Point X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getEarthingStarPointR <em>Earthing Star Point R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getVoltageRegulationRange <em>Voltage Regulation Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getSatDirectSyncX <em>Sat Direct Sync X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineImpl#getReferencePriority <em>Reference Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineImpl extends RotatingMachineImpl implements SynchronousMachine {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SynchronousMachineKind TYPE_EDEFAULT = SynchronousMachineKind.GENERATOR;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SynchronousMachineKind type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Double MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Double maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPercent()
     * @generated
     * @ordered
     */
    protected static final Double QPERCENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPercent()
     * @generated
     * @ordered
     */
    protected Double qPercent = QPERCENT_EDEFAULT;

    /**
     * This is true if the QPercent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qPercentESet;

    /**
     * The cached value of the '{@link #getInitialReactiveCapabilityCurve() <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialReactiveCapabilityCurve()
     * @generated
     * @ordered
     */
    protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;

    /**
     * This is true if the Initial Reactive Capability Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialReactiveCapabilityCurveESet;

    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Double MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Double minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics synchronousMachineDynamics;

    /**
     * This is true if the Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineDynamicsESet;

    /**
     * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected static final Double MU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected Double mu = MU_EDEFAULT;

    /**
     * This is true if the Mu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean muESet;

    /**
     * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected static final Double R2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected Double r2 = R2_EDEFAULT;

    /**
     * This is true if the R2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r2ESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Double R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Double r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getIkk() <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkk()
     * @generated
     * @ordered
     */
    protected static final Double IKK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIkk() <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkk()
     * @generated
     * @ordered
     */
    protected Double ikk = IKK_EDEFAULT;

    /**
     * This is true if the Ikk attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ikkESet;

    /**
     * The default value of the '{@link #getEarthing() <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthing()
     * @generated
     * @ordered
     */
    protected static final Boolean EARTHING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthing() <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthing()
     * @generated
     * @ordered
     */
    protected Boolean earthing = EARTHING_EDEFAULT;

    /**
     * This is true if the Earthing attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingESet;

    /**
     * The default value of the '{@link #getSatDirectTransX() <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectTransX()
     * @generated
     * @ordered
     */
    protected static final Double SAT_DIRECT_TRANS_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectTransX() <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectTransX()
     * @generated
     * @ordered
     */
    protected Double satDirectTransX = SAT_DIRECT_TRANS_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Trans X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectTransXESet;

    /**
     * The default value of the '{@link #getEarthingStarPointX() <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointX()
     * @generated
     * @ordered
     */
    protected static final Double EARTHING_STAR_POINT_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthingStarPointX() <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointX()
     * @generated
     * @ordered
     */
    protected Double earthingStarPointX = EARTHING_STAR_POINT_X_EDEFAULT;

    /**
     * This is true if the Earthing Star Point X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingStarPointXESet;

    /**
     * The default value of the '{@link #getEarthingStarPointR() <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointR()
     * @generated
     * @ordered
     */
    protected static final Double EARTHING_STAR_POINT_R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthingStarPointR() <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointR()
     * @generated
     * @ordered
     */
    protected Double earthingStarPointR = EARTHING_STAR_POINT_R_EDEFAULT;

    /**
     * This is true if the Earthing Star Point R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingStarPointRESet;

    /**
     * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected static final Double X2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected Double x2 = X2_EDEFAULT;

    /**
     * This is true if the X2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x2ESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Double X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Double x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getSatDirectSubtransX() <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSubtransX()
     * @generated
     * @ordered
     */
    protected static final Double SAT_DIRECT_SUBTRANS_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectSubtransX() <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSubtransX()
     * @generated
     * @ordered
     */
    protected Double satDirectSubtransX = SAT_DIRECT_SUBTRANS_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Subtrans X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectSubtransXESet;

    /**
     * The default value of the '{@link #getVoltageRegulationRange() <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageRegulationRange()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_REGULATION_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageRegulationRange() <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageRegulationRange()
     * @generated
     * @ordered
     */
    protected Double voltageRegulationRange = VOLTAGE_REGULATION_RANGE_EDEFAULT;

    /**
     * This is true if the Voltage Regulation Range attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageRegulationRangeESet;

    /**
     * The default value of the '{@link #getSatDirectSyncX() <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSyncX()
     * @generated
     * @ordered
     */
    protected static final Double SAT_DIRECT_SYNC_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectSyncX() <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSyncX()
     * @generated
     * @ordered
     */
    protected Double satDirectSyncX = SAT_DIRECT_SYNC_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Sync X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectSyncXESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Double R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Double r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getShortCircuitRotorType() <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitRotorType()
     * @generated
     * @ordered
     */
    protected static final ShortCircuitRotorKind SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT = ShortCircuitRotorKind.TURBO_SERIES1;

    /**
     * The cached value of the '{@link #getShortCircuitRotorType() <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitRotorType()
     * @generated
     * @ordered
     */
    protected ShortCircuitRotorKind shortCircuitRotorType = SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT;

    /**
     * This is true if the Short Circuit Rotor Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortCircuitRotorTypeESet;

    /**
     * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected static final SynchronousMachineOperatingMode OPERATING_MODE_EDEFAULT = SynchronousMachineOperatingMode.MOTOR;

    /**
     * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected SynchronousMachineOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

    /**
     * This is true if the Operating Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingModeESet;

    /**
     * The default value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected static final BigInteger REFERENCE_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected BigInteger referencePriority = REFERENCE_PRIORITY_EDEFAULT;

    /**
     * This is true if the Reference Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referencePriorityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Double newMinQ ) {
        Double oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ,
                    minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Double oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ,
                    MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null && synchronousMachineDynamics.eIsProxy() ) {
            InternalEObject oldSynchronousMachineDynamics = ( InternalEObject ) synchronousMachineDynamics;
            synchronousMachineDynamics = ( SynchronousMachineDynamics ) eResolveProxy( oldSynchronousMachineDynamics );
            if( synchronousMachineDynamics != oldSynchronousMachineDynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                            synchronousMachineDynamics ) );
            }
        }
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineDynamics basicGetSynchronousMachineDynamics() {
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineDynamics(
            SynchronousMachineDynamics newSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = newSynchronousMachineDynamics;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet );
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
    public void setSynchronousMachineDynamics( SynchronousMachineDynamics newSynchronousMachineDynamics ) {
        if( newSynchronousMachineDynamics != synchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            if( newSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            msgs = basicSetSynchronousMachineDynamics( newSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, newSynchronousMachineDynamics,
                        newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = null;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics, null,
                    oldSynchronousMachineDynamicsESet );
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
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                    msgs );
            msgs = basicUnsetSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                        oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMu() {
        return mu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMu( Double newMu ) {
        Double oldMu = mu;
        mu = newMu;
        boolean oldMuESet = muESet;
        muESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__MU, oldMu, mu,
                    !oldMuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMu() {
        Double oldMu = mu;
        boolean oldMuESet = muESet;
        mu = MU_EDEFAULT;
        muESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__MU, oldMu,
                    MU_EDEFAULT, oldMuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMu() {
        return muESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR2() {
        return r2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR2( Double newR2 ) {
        Double oldR2 = r2;
        r2 = newR2;
        boolean oldR2ESet = r2ESet;
        r2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__R2, oldR2, r2,
                    !oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR2() {
        Double oldR2 = r2;
        boolean oldR2ESet = r2ESet;
        r2 = R2_EDEFAULT;
        r2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__R2, oldR2,
                    R2_EDEFAULT, oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR2() {
        return r2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Double newR0 ) {
        Double oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__R0, oldR0, r0,
                    !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Double oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__R0, oldR0,
                    R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIkk() {
        return ikk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIkk( Double newIkk ) {
        Double oldIkk = ikk;
        ikk = newIkk;
        boolean oldIkkESet = ikkESet;
        ikkESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__IKK, oldIkk, ikk,
                    !oldIkkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIkk() {
        Double oldIkk = ikk;
        boolean oldIkkESet = ikkESet;
        ikk = IKK_EDEFAULT;
        ikkESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__IKK, oldIkk,
                    IKK_EDEFAULT, oldIkkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIkk() {
        return ikkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEarthing() {
        return earthing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthing( Boolean newEarthing ) {
        Boolean oldEarthing = earthing;
        earthing = newEarthing;
        boolean oldEarthingESet = earthingESet;
        earthingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING,
                    oldEarthing, earthing, !oldEarthingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthing() {
        Boolean oldEarthing = earthing;
        boolean oldEarthingESet = earthingESet;
        earthing = EARTHING_EDEFAULT;
        earthingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING,
                    oldEarthing, EARTHING_EDEFAULT, oldEarthingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthing() {
        return earthingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSatDirectTransX() {
        return satDirectTransX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectTransX( Double newSatDirectTransX ) {
        Double oldSatDirectTransX = satDirectTransX;
        satDirectTransX = newSatDirectTransX;
        boolean oldSatDirectTransXESet = satDirectTransXESet;
        satDirectTransXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X,
                    oldSatDirectTransX, satDirectTransX, !oldSatDirectTransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectTransX() {
        Double oldSatDirectTransX = satDirectTransX;
        boolean oldSatDirectTransXESet = satDirectTransXESet;
        satDirectTransX = SAT_DIRECT_TRANS_X_EDEFAULT;
        satDirectTransXESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X, oldSatDirectTransX, SAT_DIRECT_TRANS_X_EDEFAULT,
                    oldSatDirectTransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectTransX() {
        return satDirectTransXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEarthingStarPointX() {
        return earthingStarPointX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthingStarPointX( Double newEarthingStarPointX ) {
        Double oldEarthingStarPointX = earthingStarPointX;
        earthingStarPointX = newEarthingStarPointX;
        boolean oldEarthingStarPointXESet = earthingStarPointXESet;
        earthingStarPointXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X, oldEarthingStarPointX, earthingStarPointX,
                    !oldEarthingStarPointXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthingStarPointX() {
        Double oldEarthingStarPointX = earthingStarPointX;
        boolean oldEarthingStarPointXESet = earthingStarPointXESet;
        earthingStarPointX = EARTHING_STAR_POINT_X_EDEFAULT;
        earthingStarPointXESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X, oldEarthingStarPointX,
                    EARTHING_STAR_POINT_X_EDEFAULT, oldEarthingStarPointXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthingStarPointX() {
        return earthingStarPointXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEarthingStarPointR() {
        return earthingStarPointR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthingStarPointR( Double newEarthingStarPointR ) {
        Double oldEarthingStarPointR = earthingStarPointR;
        earthingStarPointR = newEarthingStarPointR;
        boolean oldEarthingStarPointRESet = earthingStarPointRESet;
        earthingStarPointRESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R, oldEarthingStarPointR, earthingStarPointR,
                    !oldEarthingStarPointRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthingStarPointR() {
        Double oldEarthingStarPointR = earthingStarPointR;
        boolean oldEarthingStarPointRESet = earthingStarPointRESet;
        earthingStarPointR = EARTHING_STAR_POINT_R_EDEFAULT;
        earthingStarPointRESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R, oldEarthingStarPointR,
                    EARTHING_STAR_POINT_R_EDEFAULT, oldEarthingStarPointRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthingStarPointR() {
        return earthingStarPointRESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX2() {
        return x2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX2( Double newX2 ) {
        Double oldX2 = x2;
        x2 = newX2;
        boolean oldX2ESet = x2ESet;
        x2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__X2, oldX2, x2,
                    !oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX2() {
        Double oldX2 = x2;
        boolean oldX2ESet = x2ESet;
        x2 = X2_EDEFAULT;
        x2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__X2, oldX2,
                    X2_EDEFAULT, oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX2() {
        return x2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Double newX0 ) {
        Double oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__X0, oldX0, x0,
                    !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Double oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__X0, oldX0,
                    X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSatDirectSubtransX() {
        return satDirectSubtransX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectSubtransX( Double newSatDirectSubtransX ) {
        Double oldSatDirectSubtransX = satDirectSubtransX;
        satDirectSubtransX = newSatDirectSubtransX;
        boolean oldSatDirectSubtransXESet = satDirectSubtransXESet;
        satDirectSubtransXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X, oldSatDirectSubtransX, satDirectSubtransX,
                    !oldSatDirectSubtransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectSubtransX() {
        Double oldSatDirectSubtransX = satDirectSubtransX;
        boolean oldSatDirectSubtransXESet = satDirectSubtransXESet;
        satDirectSubtransX = SAT_DIRECT_SUBTRANS_X_EDEFAULT;
        satDirectSubtransXESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X, oldSatDirectSubtransX,
                    SAT_DIRECT_SUBTRANS_X_EDEFAULT, oldSatDirectSubtransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectSubtransX() {
        return satDirectSubtransXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageRegulationRange() {
        return voltageRegulationRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageRegulationRange( Double newVoltageRegulationRange ) {
        Double oldVoltageRegulationRange = voltageRegulationRange;
        voltageRegulationRange = newVoltageRegulationRange;
        boolean oldVoltageRegulationRangeESet = voltageRegulationRangeESet;
        voltageRegulationRangeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE, oldVoltageRegulationRange,
                    voltageRegulationRange, !oldVoltageRegulationRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageRegulationRange() {
        Double oldVoltageRegulationRange = voltageRegulationRange;
        boolean oldVoltageRegulationRangeESet = voltageRegulationRangeESet;
        voltageRegulationRange = VOLTAGE_REGULATION_RANGE_EDEFAULT;
        voltageRegulationRangeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE, oldVoltageRegulationRange,
                    VOLTAGE_REGULATION_RANGE_EDEFAULT, oldVoltageRegulationRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageRegulationRange() {
        return voltageRegulationRangeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSatDirectSyncX() {
        return satDirectSyncX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectSyncX( Double newSatDirectSyncX ) {
        Double oldSatDirectSyncX = satDirectSyncX;
        satDirectSyncX = newSatDirectSyncX;
        boolean oldSatDirectSyncXESet = satDirectSyncXESet;
        satDirectSyncXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X,
                    oldSatDirectSyncX, satDirectSyncX, !oldSatDirectSyncXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectSyncX() {
        Double oldSatDirectSyncX = satDirectSyncX;
        boolean oldSatDirectSyncXESet = satDirectSyncXESet;
        satDirectSyncX = SAT_DIRECT_SYNC_X_EDEFAULT;
        satDirectSyncXESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X,
                    oldSatDirectSyncX, SAT_DIRECT_SYNC_X_EDEFAULT, oldSatDirectSyncXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectSyncX() {
        return satDirectSyncXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Double newR ) {
        Double oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__R, oldR, r,
                    !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Double oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__R, oldR,
                    R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShortCircuitRotorKind getShortCircuitRotorType() {
        return shortCircuitRotorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortCircuitRotorType( ShortCircuitRotorKind newShortCircuitRotorType ) {
        ShortCircuitRotorKind oldShortCircuitRotorType = shortCircuitRotorType;
        shortCircuitRotorType = newShortCircuitRotorType == null ? SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT
                : newShortCircuitRotorType;
        boolean oldShortCircuitRotorTypeESet = shortCircuitRotorTypeESet;
        shortCircuitRotorTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE, oldShortCircuitRotorType,
                    shortCircuitRotorType, !oldShortCircuitRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortCircuitRotorType() {
        ShortCircuitRotorKind oldShortCircuitRotorType = shortCircuitRotorType;
        boolean oldShortCircuitRotorTypeESet = shortCircuitRotorTypeESet;
        shortCircuitRotorType = SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT;
        shortCircuitRotorTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE, oldShortCircuitRotorType,
                    SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT, oldShortCircuitRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortCircuitRotorType() {
        return shortCircuitRotorTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineOperatingMode getOperatingMode() {
        return operatingMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperatingMode( SynchronousMachineOperatingMode newOperatingMode ) {
        SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
        operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE,
                    oldOperatingMode, operatingMode, !oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatingMode() {
        SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingMode = OPERATING_MODE_EDEFAULT;
        operatingModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE,
                    oldOperatingMode, OPERATING_MODE_EDEFAULT, oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingMode() {
        return operatingModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getReferencePriority() {
        return referencePriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferencePriority( BigInteger newReferencePriority ) {
        BigInteger oldReferencePriority = referencePriority;
        referencePriority = newReferencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY,
                    oldReferencePriority, referencePriority, !oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferencePriority() {
        BigInteger oldReferencePriority = referencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriority = REFERENCE_PRIORITY_EDEFAULT;
        referencePriorityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY, oldReferencePriority,
                    REFERENCE_PRIORITY_EDEFAULT, oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferencePriority() {
        return referencePriorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQPercent() {
        return qPercent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQPercent( Double newQPercent ) {
        Double oldQPercent = qPercent;
        qPercent = newQPercent;
        boolean oldQPercentESet = qPercentESet;
        qPercentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__QPERCENT,
                    oldQPercent, qPercent, !oldQPercentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQPercent() {
        Double oldQPercent = qPercent;
        boolean oldQPercentESet = qPercentESet;
        qPercent = QPERCENT_EDEFAULT;
        qPercentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__QPERCENT,
                    oldQPercent, QPERCENT_EDEFAULT, oldQPercentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQPercent() {
        return qPercentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
        return initialReactiveCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialReactiveCapabilityCurve(
            ReactiveCapabilityCurve newInitialReactiveCapabilityCurve, NotificationChain msgs ) {
        ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
        initialReactiveCapabilityCurve = newInitialReactiveCapabilityCurve;
        boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
        initialReactiveCapabilityCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                    oldInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve,
                    !oldInitialReactiveCapabilityCurveESet );
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
    public void setInitialReactiveCapabilityCurve( ReactiveCapabilityCurve newInitialReactiveCapabilityCurve ) {
        if( newInitialReactiveCapabilityCurve != initialReactiveCapabilityCurve ) {
            NotificationChain msgs = null;
            if( initialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            if( newInitialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) newInitialReactiveCapabilityCurve ).eInverseAdd( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            msgs = basicSetInitialReactiveCapabilityCurve( newInitialReactiveCapabilityCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
            initialReactiveCapabilityCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                        newInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve,
                        !oldInitialReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInitialReactiveCapabilityCurve( NotificationChain msgs ) {
        ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
        initialReactiveCapabilityCurve = null;
        boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
        initialReactiveCapabilityCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                    oldInitialReactiveCapabilityCurve, null, oldInitialReactiveCapabilityCurveESet );
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
    public void unsetInitialReactiveCapabilityCurve() {
        if( initialReactiveCapabilityCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                    ReactiveCapabilityCurve.class, msgs );
            msgs = basicUnsetInitialReactiveCapabilityCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
            initialReactiveCapabilityCurveESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, null, null,
                        oldInitialReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialReactiveCapabilityCurve() {
        return initialReactiveCapabilityCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Double newMaxQ ) {
        Double oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ,
                    maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Double oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ,
                    MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineKind getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( SynchronousMachineKind newType ) {
        SynchronousMachineKind oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__TYPE, oldType, type,
                    !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        SynchronousMachineKind oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            if( initialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            return basicSetInitialReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            return basicSetSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return basicUnsetInitialReactiveCapabilityCurve( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetSynchronousMachineDynamics( msgs );
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
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            return getType();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            return getMaxQ();
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            return getQPercent();
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return getInitialReactiveCapabilityCurve();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            return getMinQ();
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getSynchronousMachineDynamics();
            return basicGetSynchronousMachineDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            return getMu();
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            return getR2();
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            return getR0();
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            return getIkk();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            return getEarthing();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            return getSatDirectTransX();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            return getEarthingStarPointX();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            return getEarthingStarPointR();
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            return getX2();
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            return getX0();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            return getSatDirectSubtransX();
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            return getVoltageRegulationRange();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            return getSatDirectSyncX();
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            return getR();
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            return getShortCircuitRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            return getOperatingMode();
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            return getReferencePriority();
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
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            setType( ( SynchronousMachineKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            setMaxQ( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            setQPercent( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            setInitialReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            setMinQ( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            setSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            setMu( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            setR2( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            setR0( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            setIkk( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            setEarthing( ( Boolean ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            setSatDirectTransX( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            setEarthingStarPointX( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            setEarthingStarPointR( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            setX2( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            setX0( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            setSatDirectSubtransX( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            setVoltageRegulationRange( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            setSatDirectSyncX( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            setShortCircuitRotorType( ( ShortCircuitRotorKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            setOperatingMode( ( SynchronousMachineOperatingMode ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            setReferencePriority( ( BigInteger ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            unsetType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            unsetQPercent();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            unsetInitialReactiveCapabilityCurve();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            unsetMu();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            unsetR2();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            unsetR0();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            unsetIkk();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            unsetEarthing();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            unsetSatDirectTransX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            unsetEarthingStarPointX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            unsetEarthingStarPointR();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            unsetX2();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            unsetX0();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            unsetSatDirectSubtransX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            unsetVoltageRegulationRange();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            unsetSatDirectSyncX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            unsetR();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            unsetShortCircuitRotorType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            unsetOperatingMode();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            unsetReferencePriority();
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
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            return isSetType();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            return isSetMaxQ();
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            return isSetQPercent();
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return isSetInitialReactiveCapabilityCurve();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            return isSetMinQ();
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            return isSetMu();
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            return isSetR2();
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            return isSetR0();
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            return isSetIkk();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            return isSetEarthing();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            return isSetSatDirectTransX();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            return isSetEarthingStarPointX();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            return isSetEarthingStarPointR();
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            return isSetX2();
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            return isSetX0();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            return isSetSatDirectSubtransX();
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            return isSetVoltageRegulationRange();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            return isSetSatDirectSyncX();
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            return isSetR();
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            return isSetShortCircuitRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            return isSetOperatingMode();
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            return isSetReferencePriority();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", qPercent: " );
        if( qPercentESet )
            result.append( qPercent );
        else
            result.append( "<unset>" );
        result.append( ", minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", mu: " );
        if( muESet )
            result.append( mu );
        else
            result.append( "<unset>" );
        result.append( ", r2: " );
        if( r2ESet )
            result.append( r2 );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", ikk: " );
        if( ikkESet )
            result.append( ikk );
        else
            result.append( "<unset>" );
        result.append( ", earthing: " );
        if( earthingESet )
            result.append( earthing );
        else
            result.append( "<unset>" );
        result.append( ", satDirectTransX: " );
        if( satDirectTransXESet )
            result.append( satDirectTransX );
        else
            result.append( "<unset>" );
        result.append( ", earthingStarPointX: " );
        if( earthingStarPointXESet )
            result.append( earthingStarPointX );
        else
            result.append( "<unset>" );
        result.append( ", earthingStarPointR: " );
        if( earthingStarPointRESet )
            result.append( earthingStarPointR );
        else
            result.append( "<unset>" );
        result.append( ", x2: " );
        if( x2ESet )
            result.append( x2 );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", satDirectSubtransX: " );
        if( satDirectSubtransXESet )
            result.append( satDirectSubtransX );
        else
            result.append( "<unset>" );
        result.append( ", voltageRegulationRange: " );
        if( voltageRegulationRangeESet )
            result.append( voltageRegulationRange );
        else
            result.append( "<unset>" );
        result.append( ", satDirectSyncX: " );
        if( satDirectSyncXESet )
            result.append( satDirectSyncX );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", shortCircuitRotorType: " );
        if( shortCircuitRotorTypeESet )
            result.append( shortCircuitRotorType );
        else
            result.append( "<unset>" );
        result.append( ", operatingMode: " );
        if( operatingModeESet )
            result.append( operatingMode );
        else
            result.append( "<unset>" );
        result.append( ", referencePriority: " );
        if( referencePriorityESet )
            result.append( referencePriority );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchronousMachineImpl
