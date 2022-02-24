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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FrancisGovernorControlKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroFrancis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro Francis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTs <em>Ts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getQn <em>Qn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getKt <em>Kt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getEtamax <em>Etamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getHn <em>Hn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getAm <em>Am</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getGovernorControl <em>Governor Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getAv0 <em>Av0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getAv1 <em>Av1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getZsfc <em>Zsfc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getQc0 <em>Qc0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getValvmin <em>Valvmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getWaterTunnelSurgeChamberSimulation <em>Water Tunnel Surge Chamber Simulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTwng <em>Twng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getTwnc <em>Twnc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getValvmax <em>Valvmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getVa <em>Va</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroFrancisImpl#getVc <em>Vc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydroFrancisImpl extends TurbineGovernorDynamicsImpl implements GovHydroFrancis {
    /**
     * The default value of the '{@link #getDb1() <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb1()
     * @generated
     * @ordered
     */
    protected static final Double DB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb1() <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb1()
     * @generated
     * @ordered
     */
    protected Double db1 = DB1_EDEFAULT;

    /**
     * This is true if the Db1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean db1ESet;

    /**
     * The default value of the '{@link #getTx() <em>Tx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx()
     * @generated
     * @ordered
     */
    protected static final Double TX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTx() <em>Tx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx()
     * @generated
     * @ordered
     */
    protected Double tx = TX_EDEFAULT;

    /**
     * This is true if the Tx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean txESet;

    /**
     * The default value of the '{@link #getTs() <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs()
     * @generated
     * @ordered
     */
    protected static final Double TS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs() <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs()
     * @generated
     * @ordered
     */
    protected Double ts = TS_EDEFAULT;

    /**
     * This is true if the Ts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsESet;

    /**
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Double TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Double td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

    /**
     * The default value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected static final Double TA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected Double ta = TA_EDEFAULT;

    /**
     * This is true if the Ta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taESet;

    /**
     * The default value of the '{@link #getQn() <em>Qn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQn()
     * @generated
     * @ordered
     */
    protected static final Double QN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQn() <em>Qn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQn()
     * @generated
     * @ordered
     */
    protected Double qn = QN_EDEFAULT;

    /**
     * This is true if the Qn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qnESet;

    /**
     * The default value of the '{@link #getKt() <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKt()
     * @generated
     * @ordered
     */
    protected static final Double KT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKt() <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKt()
     * @generated
     * @ordered
     */
    protected Double kt = KT_EDEFAULT;

    /**
     * This is true if the Kt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ktESet;

    /**
     * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected static final Double KC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected Double kc = KC_EDEFAULT;

    /**
     * This is true if the Kc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcESet;

    /**
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Double KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Double kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getEtamax() <em>Etamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtamax()
     * @generated
     * @ordered
     */
    protected static final Double ETAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEtamax() <em>Etamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtamax()
     * @generated
     * @ordered
     */
    protected Double etamax = ETAMAX_EDEFAULT;

    /**
     * This is true if the Etamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean etamaxESet;

    /**
     * The default value of the '{@link #getHn() <em>Hn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHn()
     * @generated
     * @ordered
     */
    protected static final Double HN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHn() <em>Hn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHn()
     * @generated
     * @ordered
     */
    protected Double hn = HN_EDEFAULT;

    /**
     * This is true if the Hn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hnESet;

    /**
     * The default value of the '{@link #getH1() <em>H1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH1()
     * @generated
     * @ordered
     */
    protected static final Double H1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getH1() <em>H1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH1()
     * @generated
     * @ordered
     */
    protected Double h1 = H1_EDEFAULT;

    /**
     * This is true if the H1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean h1ESet;

    /**
     * The default value of the '{@link #getH2() <em>H2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH2()
     * @generated
     * @ordered
     */
    protected static final Double H2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getH2() <em>H2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH2()
     * @generated
     * @ordered
     */
    protected Double h2 = H2_EDEFAULT;

    /**
     * This is true if the H2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean h2ESet;

    /**
     * The default value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected static final Double BP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected Double bp = BP_EDEFAULT;

    /**
     * This is true if the Bp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bpESet;

    /**
     * The default value of the '{@link #getAm() <em>Am</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAm()
     * @generated
     * @ordered
     */
    protected static final Double AM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAm() <em>Am</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAm()
     * @generated
     * @ordered
     */
    protected Double am = AM_EDEFAULT;

    /**
     * This is true if the Am attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amESet;

    /**
     * The default value of the '{@link #getGovernorControl() <em>Governor Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorControl()
     * @generated
     * @ordered
     */
    protected static final FrancisGovernorControlKind GOVERNOR_CONTROL_EDEFAULT = FrancisGovernorControlKind.MECHANIC_HYDROLIC_TACHO_ACCELERATOR;

    /**
     * The cached value of the '{@link #getGovernorControl() <em>Governor Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorControl()
     * @generated
     * @ordered
     */
    protected FrancisGovernorControlKind governorControl = GOVERNOR_CONTROL_EDEFAULT;

    /**
     * This is true if the Governor Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean governorControlESet;

    /**
     * The default value of the '{@link #getAv0() <em>Av0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAv0()
     * @generated
     * @ordered
     */
    protected static final Double AV0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAv0() <em>Av0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAv0()
     * @generated
     * @ordered
     */
    protected Double av0 = AV0_EDEFAULT;

    /**
     * This is true if the Av0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean av0ESet;

    /**
     * The default value of the '{@link #getAv1() <em>Av1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAv1()
     * @generated
     * @ordered
     */
    protected static final Double AV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAv1() <em>Av1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAv1()
     * @generated
     * @ordered
     */
    protected Double av1 = AV1_EDEFAULT;

    /**
     * This is true if the Av1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean av1ESet;

    /**
     * The default value of the '{@link #getZsfc() <em>Zsfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZsfc()
     * @generated
     * @ordered
     */
    protected static final Double ZSFC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZsfc() <em>Zsfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZsfc()
     * @generated
     * @ordered
     */
    protected Double zsfc = ZSFC_EDEFAULT;

    /**
     * This is true if the Zsfc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zsfcESet;

    /**
     * The default value of the '{@link #getQc0() <em>Qc0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQc0()
     * @generated
     * @ordered
     */
    protected static final Double QC0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQc0() <em>Qc0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQc0()
     * @generated
     * @ordered
     */
    protected Double qc0 = QC0_EDEFAULT;

    /**
     * This is true if the Qc0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qc0ESet;

    /**
     * The default value of the '{@link #getValvmin() <em>Valvmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValvmin()
     * @generated
     * @ordered
     */
    protected static final Double VALVMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValvmin() <em>Valvmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValvmin()
     * @generated
     * @ordered
     */
    protected Double valvmin = VALVMIN_EDEFAULT;

    /**
     * This is true if the Valvmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valvminESet;

    /**
     * The default value of the '{@link #getWaterTunnelSurgeChamberSimulation() <em>Water Tunnel Surge Chamber Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterTunnelSurgeChamberSimulation()
     * @generated
     * @ordered
     */
    protected static final Boolean WATER_TUNNEL_SURGE_CHAMBER_SIMULATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaterTunnelSurgeChamberSimulation() <em>Water Tunnel Surge Chamber Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterTunnelSurgeChamberSimulation()
     * @generated
     * @ordered
     */
    protected Boolean waterTunnelSurgeChamberSimulation = WATER_TUNNEL_SURGE_CHAMBER_SIMULATION_EDEFAULT;

    /**
     * This is true if the Water Tunnel Surge Chamber Simulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean waterTunnelSurgeChamberSimulationESet;

    /**
     * The default value of the '{@link #getTwng() <em>Twng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwng()
     * @generated
     * @ordered
     */
    protected static final Double TWNG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwng() <em>Twng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwng()
     * @generated
     * @ordered
     */
    protected Double twng = TWNG_EDEFAULT;

    /**
     * This is true if the Twng attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twngESet;

    /**
     * The default value of the '{@link #getTwnc() <em>Twnc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwnc()
     * @generated
     * @ordered
     */
    protected static final Double TWNC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwnc() <em>Twnc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwnc()
     * @generated
     * @ordered
     */
    protected Double twnc = TWNC_EDEFAULT;

    /**
     * This is true if the Twnc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twncESet;

    /**
     * The default value of the '{@link #getValvmax() <em>Valvmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValvmax()
     * @generated
     * @ordered
     */
    protected static final Double VALVMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValvmax() <em>Valvmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValvmax()
     * @generated
     * @ordered
     */
    protected Double valvmax = VALVMAX_EDEFAULT;

    /**
     * This is true if the Valvmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valvmaxESet;

    /**
     * The default value of the '{@link #getVa() <em>Va</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVa()
     * @generated
     * @ordered
     */
    protected static final Double VA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVa() <em>Va</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVa()
     * @generated
     * @ordered
     */
    protected Double va = VA_EDEFAULT;

    /**
     * This is true if the Va attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vaESet;

    /**
     * The default value of the '{@link #getVc() <em>Vc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVc()
     * @generated
     * @ordered
     */
    protected static final Double VC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVc() <em>Vc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVc()
     * @generated
     * @ordered
     */
    protected Double vc = VC_EDEFAULT;

    /**
     * This is true if the Vc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydroFrancisImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydroFrancis();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDb1() {
        return db1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb1( Double newDb1 ) {
        Double oldDb1 = db1;
        db1 = newDb1;
        boolean oldDb1ESet = db1ESet;
        db1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__DB1, oldDb1, db1,
                    !oldDb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb1() {
        Double oldDb1 = db1;
        boolean oldDb1ESet = db1ESet;
        db1 = DB1_EDEFAULT;
        db1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__DB1, oldDb1,
                    DB1_EDEFAULT, oldDb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb1() {
        return db1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTx() {
        return tx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTx( Double newTx ) {
        Double oldTx = tx;
        tx = newTx;
        boolean oldTxESet = txESet;
        txESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TX, oldTx, tx,
                    !oldTxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTx() {
        Double oldTx = tx;
        boolean oldTxESet = txESet;
        tx = TX_EDEFAULT;
        txESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TX, oldTx,
                    TX_EDEFAULT, oldTxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTx() {
        return txESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs() {
        return ts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs( Double newTs ) {
        Double oldTs = ts;
        ts = newTs;
        boolean oldTsESet = tsESet;
        tsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TS, oldTs, ts,
                    !oldTsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs() {
        Double oldTs = ts;
        boolean oldTsESet = tsESet;
        ts = TS_EDEFAULT;
        tsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TS, oldTs,
                    TS_EDEFAULT, oldTsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs() {
        return tsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Double newTd ) {
        Double oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TD, oldTd, td,
                    !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Double oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TD, oldTd,
                    TD_EDEFAULT, oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTa() {
        return ta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa( Double newTa ) {
        Double oldTa = ta;
        ta = newTa;
        boolean oldTaESet = taESet;
        taESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TA, oldTa, ta,
                    !oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa() {
        Double oldTa = ta;
        boolean oldTaESet = taESet;
        ta = TA_EDEFAULT;
        taESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TA, oldTa,
                    TA_EDEFAULT, oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa() {
        return taESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQn() {
        return qn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQn( Double newQn ) {
        Double oldQn = qn;
        qn = newQn;
        boolean oldQnESet = qnESet;
        qnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__QN, oldQn, qn,
                    !oldQnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQn() {
        Double oldQn = qn;
        boolean oldQnESet = qnESet;
        qn = QN_EDEFAULT;
        qnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__QN, oldQn,
                    QN_EDEFAULT, oldQnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQn() {
        return qnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKt() {
        return kt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKt( Double newKt ) {
        Double oldKt = kt;
        kt = newKt;
        boolean oldKtESet = ktESet;
        ktESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__KT, oldKt, kt,
                    !oldKtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKt() {
        Double oldKt = kt;
        boolean oldKtESet = ktESet;
        kt = KT_EDEFAULT;
        ktESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__KT, oldKt,
                    KT_EDEFAULT, oldKtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKt() {
        return ktESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKc() {
        return kc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKc( Double newKc ) {
        Double oldKc = kc;
        kc = newKc;
        boolean oldKcESet = kcESet;
        kcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__KC, oldKc, kc,
                    !oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKc() {
        Double oldKc = kc;
        boolean oldKcESet = kcESet;
        kc = KC_EDEFAULT;
        kcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__KC, oldKc,
                    KC_EDEFAULT, oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKc() {
        return kcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Double newKg ) {
        Double oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__KG, oldKg, kg,
                    !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Double oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__KG, oldKg,
                    KG_EDEFAULT, oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEtamax() {
        return etamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEtamax( Double newEtamax ) {
        Double oldEtamax = etamax;
        etamax = newEtamax;
        boolean oldEtamaxESet = etamaxESet;
        etamaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__ETAMAX, oldEtamax,
                    etamax, !oldEtamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEtamax() {
        Double oldEtamax = etamax;
        boolean oldEtamaxESet = etamaxESet;
        etamax = ETAMAX_EDEFAULT;
        etamaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__ETAMAX, oldEtamax,
                    ETAMAX_EDEFAULT, oldEtamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEtamax() {
        return etamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHn() {
        return hn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHn( Double newHn ) {
        Double oldHn = hn;
        hn = newHn;
        boolean oldHnESet = hnESet;
        hnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__HN, oldHn, hn,
                    !oldHnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHn() {
        Double oldHn = hn;
        boolean oldHnESet = hnESet;
        hn = HN_EDEFAULT;
        hnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__HN, oldHn,
                    HN_EDEFAULT, oldHnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHn() {
        return hnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getH1() {
        return h1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setH1( Double newH1 ) {
        Double oldH1 = h1;
        h1 = newH1;
        boolean oldH1ESet = h1ESet;
        h1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__H1, oldH1, h1,
                    !oldH1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetH1() {
        Double oldH1 = h1;
        boolean oldH1ESet = h1ESet;
        h1 = H1_EDEFAULT;
        h1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__H1, oldH1,
                    H1_EDEFAULT, oldH1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetH1() {
        return h1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getH2() {
        return h2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setH2( Double newH2 ) {
        Double oldH2 = h2;
        h2 = newH2;
        boolean oldH2ESet = h2ESet;
        h2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__H2, oldH2, h2,
                    !oldH2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetH2() {
        Double oldH2 = h2;
        boolean oldH2ESet = h2ESet;
        h2 = H2_EDEFAULT;
        h2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__H2, oldH2,
                    H2_EDEFAULT, oldH2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetH2() {
        return h2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBp() {
        return bp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBp( Double newBp ) {
        Double oldBp = bp;
        bp = newBp;
        boolean oldBpESet = bpESet;
        bpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__BP, oldBp, bp,
                    !oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBp() {
        Double oldBp = bp;
        boolean oldBpESet = bpESet;
        bp = BP_EDEFAULT;
        bpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__BP, oldBp,
                    BP_EDEFAULT, oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBp() {
        return bpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAm() {
        return am;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAm( Double newAm ) {
        Double oldAm = am;
        am = newAm;
        boolean oldAmESet = amESet;
        amESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__AM, oldAm, am,
                    !oldAmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAm() {
        Double oldAm = am;
        boolean oldAmESet = amESet;
        am = AM_EDEFAULT;
        amESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__AM, oldAm,
                    AM_EDEFAULT, oldAmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAm() {
        return amESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FrancisGovernorControlKind getGovernorControl() {
        return governorControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGovernorControl( FrancisGovernorControlKind newGovernorControl ) {
        FrancisGovernorControlKind oldGovernorControl = governorControl;
        governorControl = newGovernorControl == null ? GOVERNOR_CONTROL_EDEFAULT : newGovernorControl;
        boolean oldGovernorControlESet = governorControlESet;
        governorControlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL,
                    oldGovernorControl, governorControl, !oldGovernorControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGovernorControl() {
        FrancisGovernorControlKind oldGovernorControl = governorControl;
        boolean oldGovernorControlESet = governorControlESet;
        governorControl = GOVERNOR_CONTROL_EDEFAULT;
        governorControlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL,
                    oldGovernorControl, GOVERNOR_CONTROL_EDEFAULT, oldGovernorControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGovernorControl() {
        return governorControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAv0() {
        return av0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAv0( Double newAv0 ) {
        Double oldAv0 = av0;
        av0 = newAv0;
        boolean oldAv0ESet = av0ESet;
        av0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__AV0, oldAv0, av0,
                    !oldAv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAv0() {
        Double oldAv0 = av0;
        boolean oldAv0ESet = av0ESet;
        av0 = AV0_EDEFAULT;
        av0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__AV0, oldAv0,
                    AV0_EDEFAULT, oldAv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAv0() {
        return av0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAv1() {
        return av1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAv1( Double newAv1 ) {
        Double oldAv1 = av1;
        av1 = newAv1;
        boolean oldAv1ESet = av1ESet;
        av1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__AV1, oldAv1, av1,
                    !oldAv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAv1() {
        Double oldAv1 = av1;
        boolean oldAv1ESet = av1ESet;
        av1 = AV1_EDEFAULT;
        av1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__AV1, oldAv1,
                    AV1_EDEFAULT, oldAv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAv1() {
        return av1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZsfc() {
        return zsfc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZsfc( Double newZsfc ) {
        Double oldZsfc = zsfc;
        zsfc = newZsfc;
        boolean oldZsfcESet = zsfcESet;
        zsfcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__ZSFC, oldZsfc, zsfc,
                    !oldZsfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZsfc() {
        Double oldZsfc = zsfc;
        boolean oldZsfcESet = zsfcESet;
        zsfc = ZSFC_EDEFAULT;
        zsfcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__ZSFC, oldZsfc,
                    ZSFC_EDEFAULT, oldZsfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZsfc() {
        return zsfcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQc0() {
        return qc0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQc0( Double newQc0 ) {
        Double oldQc0 = qc0;
        qc0 = newQc0;
        boolean oldQc0ESet = qc0ESet;
        qc0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__QC0, oldQc0, qc0,
                    !oldQc0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQc0() {
        Double oldQc0 = qc0;
        boolean oldQc0ESet = qc0ESet;
        qc0 = QC0_EDEFAULT;
        qc0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__QC0, oldQc0,
                    QC0_EDEFAULT, oldQc0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQc0() {
        return qc0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getValvmin() {
        return valvmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValvmin( Double newValvmin ) {
        Double oldValvmin = valvmin;
        valvmin = newValvmin;
        boolean oldValvminESet = valvminESet;
        valvminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__VALVMIN, oldValvmin,
                    valvmin, !oldValvminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValvmin() {
        Double oldValvmin = valvmin;
        boolean oldValvminESet = valvminESet;
        valvmin = VALVMIN_EDEFAULT;
        valvminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__VALVMIN, oldValvmin,
                    VALVMIN_EDEFAULT, oldValvminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValvmin() {
        return valvminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWaterTunnelSurgeChamberSimulation() {
        return waterTunnelSurgeChamberSimulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWaterTunnelSurgeChamberSimulation( Boolean newWaterTunnelSurgeChamberSimulation ) {
        Boolean oldWaterTunnelSurgeChamberSimulation = waterTunnelSurgeChamberSimulation;
        waterTunnelSurgeChamberSimulation = newWaterTunnelSurgeChamberSimulation;
        boolean oldWaterTunnelSurgeChamberSimulationESet = waterTunnelSurgeChamberSimulationESet;
        waterTunnelSurgeChamberSimulationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION,
                    oldWaterTunnelSurgeChamberSimulation, waterTunnelSurgeChamberSimulation,
                    !oldWaterTunnelSurgeChamberSimulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWaterTunnelSurgeChamberSimulation() {
        Boolean oldWaterTunnelSurgeChamberSimulation = waterTunnelSurgeChamberSimulation;
        boolean oldWaterTunnelSurgeChamberSimulationESet = waterTunnelSurgeChamberSimulationESet;
        waterTunnelSurgeChamberSimulation = WATER_TUNNEL_SURGE_CHAMBER_SIMULATION_EDEFAULT;
        waterTunnelSurgeChamberSimulationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION,
                    oldWaterTunnelSurgeChamberSimulation, WATER_TUNNEL_SURGE_CHAMBER_SIMULATION_EDEFAULT,
                    oldWaterTunnelSurgeChamberSimulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWaterTunnelSurgeChamberSimulation() {
        return waterTunnelSurgeChamberSimulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTwng() {
        return twng;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwng( Double newTwng ) {
        Double oldTwng = twng;
        twng = newTwng;
        boolean oldTwngESet = twngESet;
        twngESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TWNG, oldTwng, twng,
                    !oldTwngESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwng() {
        Double oldTwng = twng;
        boolean oldTwngESet = twngESet;
        twng = TWNG_EDEFAULT;
        twngESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TWNG, oldTwng,
                    TWNG_EDEFAULT, oldTwngESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwng() {
        return twngESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTwnc() {
        return twnc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwnc( Double newTwnc ) {
        Double oldTwnc = twnc;
        twnc = newTwnc;
        boolean oldTwncESet = twncESet;
        twncESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__TWNC, oldTwnc, twnc,
                    !oldTwncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwnc() {
        Double oldTwnc = twnc;
        boolean oldTwncESet = twncESet;
        twnc = TWNC_EDEFAULT;
        twncESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__TWNC, oldTwnc,
                    TWNC_EDEFAULT, oldTwncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwnc() {
        return twncESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getValvmax() {
        return valvmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValvmax( Double newValvmax ) {
        Double oldValvmax = valvmax;
        valvmax = newValvmax;
        boolean oldValvmaxESet = valvmaxESet;
        valvmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__VALVMAX, oldValvmax,
                    valvmax, !oldValvmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValvmax() {
        Double oldValvmax = valvmax;
        boolean oldValvmaxESet = valvmaxESet;
        valvmax = VALVMAX_EDEFAULT;
        valvmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__VALVMAX, oldValvmax,
                    VALVMAX_EDEFAULT, oldValvmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValvmax() {
        return valvmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVa() {
        return va;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVa( Double newVa ) {
        Double oldVa = va;
        va = newVa;
        boolean oldVaESet = vaESet;
        vaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__VA, oldVa, va,
                    !oldVaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVa() {
        Double oldVa = va;
        boolean oldVaESet = vaESet;
        va = VA_EDEFAULT;
        vaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__VA, oldVa,
                    VA_EDEFAULT, oldVaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVa() {
        return vaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVc() {
        return vc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVc( Double newVc ) {
        Double oldVc = vc;
        vc = newVc;
        boolean oldVcESet = vcESet;
        vcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_FRANCIS__VC, oldVc, vc,
                    !oldVcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVc() {
        Double oldVc = vc;
        boolean oldVcESet = vcESet;
        vc = VC_EDEFAULT;
        vcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_FRANCIS__VC, oldVc,
                    VC_EDEFAULT, oldVcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVc() {
        return vcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO_FRANCIS__DB1:
            return getDb1();
        case CimPackage.GOV_HYDRO_FRANCIS__TX:
            return getTx();
        case CimPackage.GOV_HYDRO_FRANCIS__TS:
            return getTs();
        case CimPackage.GOV_HYDRO_FRANCIS__TD:
            return getTd();
        case CimPackage.GOV_HYDRO_FRANCIS__TA:
            return getTa();
        case CimPackage.GOV_HYDRO_FRANCIS__QN:
            return getQn();
        case CimPackage.GOV_HYDRO_FRANCIS__KT:
            return getKt();
        case CimPackage.GOV_HYDRO_FRANCIS__KC:
            return getKc();
        case CimPackage.GOV_HYDRO_FRANCIS__KG:
            return getKg();
        case CimPackage.GOV_HYDRO_FRANCIS__ETAMAX:
            return getEtamax();
        case CimPackage.GOV_HYDRO_FRANCIS__HN:
            return getHn();
        case CimPackage.GOV_HYDRO_FRANCIS__H1:
            return getH1();
        case CimPackage.GOV_HYDRO_FRANCIS__H2:
            return getH2();
        case CimPackage.GOV_HYDRO_FRANCIS__BP:
            return getBp();
        case CimPackage.GOV_HYDRO_FRANCIS__AM:
            return getAm();
        case CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL:
            return getGovernorControl();
        case CimPackage.GOV_HYDRO_FRANCIS__AV0:
            return getAv0();
        case CimPackage.GOV_HYDRO_FRANCIS__AV1:
            return getAv1();
        case CimPackage.GOV_HYDRO_FRANCIS__ZSFC:
            return getZsfc();
        case CimPackage.GOV_HYDRO_FRANCIS__QC0:
            return getQc0();
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMIN:
            return getValvmin();
        case CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
            return getWaterTunnelSurgeChamberSimulation();
        case CimPackage.GOV_HYDRO_FRANCIS__TWNG:
            return getTwng();
        case CimPackage.GOV_HYDRO_FRANCIS__TWNC:
            return getTwnc();
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMAX:
            return getValvmax();
        case CimPackage.GOV_HYDRO_FRANCIS__VA:
            return getVa();
        case CimPackage.GOV_HYDRO_FRANCIS__VC:
            return getVc();
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
        case CimPackage.GOV_HYDRO_FRANCIS__DB1:
            setDb1( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TX:
            setTx( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TS:
            setTs( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TD:
            setTd( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__QN:
            setQn( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KT:
            setKt( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KC:
            setKc( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KG:
            setKg( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__ETAMAX:
            setEtamax( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__HN:
            setHn( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__H1:
            setH1( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__H2:
            setH2( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__BP:
            setBp( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AM:
            setAm( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL:
            setGovernorControl( ( FrancisGovernorControlKind ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AV0:
            setAv0( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AV1:
            setAv1( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__ZSFC:
            setZsfc( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__QC0:
            setQc0( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMIN:
            setValvmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
            setWaterTunnelSurgeChamberSimulation( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TWNG:
            setTwng( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TWNC:
            setTwnc( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMAX:
            setValvmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VA:
            setVa( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VC:
            setVc( ( Double ) newValue );
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
        case CimPackage.GOV_HYDRO_FRANCIS__DB1:
            unsetDb1();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TX:
            unsetTx();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TS:
            unsetTs();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TD:
            unsetTd();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TA:
            unsetTa();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__QN:
            unsetQn();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KT:
            unsetKt();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KC:
            unsetKc();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__KG:
            unsetKg();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__ETAMAX:
            unsetEtamax();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__HN:
            unsetHn();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__H1:
            unsetH1();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__H2:
            unsetH2();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__BP:
            unsetBp();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AM:
            unsetAm();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL:
            unsetGovernorControl();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AV0:
            unsetAv0();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__AV1:
            unsetAv1();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__ZSFC:
            unsetZsfc();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__QC0:
            unsetQc0();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMIN:
            unsetValvmin();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
            unsetWaterTunnelSurgeChamberSimulation();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TWNG:
            unsetTwng();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__TWNC:
            unsetTwnc();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMAX:
            unsetValvmax();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VA:
            unsetVa();
            return;
        case CimPackage.GOV_HYDRO_FRANCIS__VC:
            unsetVc();
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
        case CimPackage.GOV_HYDRO_FRANCIS__DB1:
            return isSetDb1();
        case CimPackage.GOV_HYDRO_FRANCIS__TX:
            return isSetTx();
        case CimPackage.GOV_HYDRO_FRANCIS__TS:
            return isSetTs();
        case CimPackage.GOV_HYDRO_FRANCIS__TD:
            return isSetTd();
        case CimPackage.GOV_HYDRO_FRANCIS__TA:
            return isSetTa();
        case CimPackage.GOV_HYDRO_FRANCIS__QN:
            return isSetQn();
        case CimPackage.GOV_HYDRO_FRANCIS__KT:
            return isSetKt();
        case CimPackage.GOV_HYDRO_FRANCIS__KC:
            return isSetKc();
        case CimPackage.GOV_HYDRO_FRANCIS__KG:
            return isSetKg();
        case CimPackage.GOV_HYDRO_FRANCIS__ETAMAX:
            return isSetEtamax();
        case CimPackage.GOV_HYDRO_FRANCIS__HN:
            return isSetHn();
        case CimPackage.GOV_HYDRO_FRANCIS__H1:
            return isSetH1();
        case CimPackage.GOV_HYDRO_FRANCIS__H2:
            return isSetH2();
        case CimPackage.GOV_HYDRO_FRANCIS__BP:
            return isSetBp();
        case CimPackage.GOV_HYDRO_FRANCIS__AM:
            return isSetAm();
        case CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL:
            return isSetGovernorControl();
        case CimPackage.GOV_HYDRO_FRANCIS__AV0:
            return isSetAv0();
        case CimPackage.GOV_HYDRO_FRANCIS__AV1:
            return isSetAv1();
        case CimPackage.GOV_HYDRO_FRANCIS__ZSFC:
            return isSetZsfc();
        case CimPackage.GOV_HYDRO_FRANCIS__QC0:
            return isSetQc0();
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMIN:
            return isSetValvmin();
        case CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
            return isSetWaterTunnelSurgeChamberSimulation();
        case CimPackage.GOV_HYDRO_FRANCIS__TWNG:
            return isSetTwng();
        case CimPackage.GOV_HYDRO_FRANCIS__TWNC:
            return isSetTwnc();
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMAX:
            return isSetValvmax();
        case CimPackage.GOV_HYDRO_FRANCIS__VA:
            return isSetVa();
        case CimPackage.GOV_HYDRO_FRANCIS__VC:
            return isSetVc();
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
        result.append( " (db1: " );
        if( db1ESet )
            result.append( db1 );
        else
            result.append( "<unset>" );
        result.append( ", tx: " );
        if( txESet )
            result.append( tx );
        else
            result.append( "<unset>" );
        result.append( ", ts: " );
        if( tsESet )
            result.append( ts );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", qn: " );
        if( qnESet )
            result.append( qn );
        else
            result.append( "<unset>" );
        result.append( ", kt: " );
        if( ktESet )
            result.append( kt );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", etamax: " );
        if( etamaxESet )
            result.append( etamax );
        else
            result.append( "<unset>" );
        result.append( ", hn: " );
        if( hnESet )
            result.append( hn );
        else
            result.append( "<unset>" );
        result.append( ", h1: " );
        if( h1ESet )
            result.append( h1 );
        else
            result.append( "<unset>" );
        result.append( ", h2: " );
        if( h2ESet )
            result.append( h2 );
        else
            result.append( "<unset>" );
        result.append( ", bp: " );
        if( bpESet )
            result.append( bp );
        else
            result.append( "<unset>" );
        result.append( ", am: " );
        if( amESet )
            result.append( am );
        else
            result.append( "<unset>" );
        result.append( ", governorControl: " );
        if( governorControlESet )
            result.append( governorControl );
        else
            result.append( "<unset>" );
        result.append( ", av0: " );
        if( av0ESet )
            result.append( av0 );
        else
            result.append( "<unset>" );
        result.append( ", av1: " );
        if( av1ESet )
            result.append( av1 );
        else
            result.append( "<unset>" );
        result.append( ", zsfc: " );
        if( zsfcESet )
            result.append( zsfc );
        else
            result.append( "<unset>" );
        result.append( ", qc0: " );
        if( qc0ESet )
            result.append( qc0 );
        else
            result.append( "<unset>" );
        result.append( ", valvmin: " );
        if( valvminESet )
            result.append( valvmin );
        else
            result.append( "<unset>" );
        result.append( ", waterTunnelSurgeChamberSimulation: " );
        if( waterTunnelSurgeChamberSimulationESet )
            result.append( waterTunnelSurgeChamberSimulation );
        else
            result.append( "<unset>" );
        result.append( ", twng: " );
        if( twngESet )
            result.append( twng );
        else
            result.append( "<unset>" );
        result.append( ", twnc: " );
        if( twncESet )
            result.append( twnc );
        else
            result.append( "<unset>" );
        result.append( ", valvmax: " );
        if( valvmaxESet )
            result.append( valvmax );
        else
            result.append( "<unset>" );
        result.append( ", va: " );
        if( vaESet )
            result.append( va );
        else
            result.append( "<unset>" );
        result.append( ", vc: " );
        if( vcESet )
            result.append( vc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydroFrancisImpl
