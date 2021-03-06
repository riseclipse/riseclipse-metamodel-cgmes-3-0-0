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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DroopSignalFeedbackKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov CT1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getVmin <em>Vmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKdgov <em>Kdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTpelec <em>Tpelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getRdown <em>Rdown</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getRselect <em>Rselect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getRup <em>Rup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getLdref <em>Ldref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKturb <em>Kturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKiload <em>Kiload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTeng <em>Teng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getWfnl <em>Wfnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKpgov <em>Kpgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getMinerr <em>Minerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTfload <em>Tfload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTdgov <em>Tdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKimw <em>Kimw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKpload <em>Kpload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getWfspd <em>Wfspd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getAset <em>Aset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTact <em>Tact</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getRopen <em>Ropen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getRclose <em>Rclose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getDm <em>Dm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKigov <em>Kigov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getMaxerr <em>Maxerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTsb <em>Tsb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovCT1Impl#getTsa <em>Tsa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovCT1Impl extends TurbineGovernorDynamicsImpl implements GovCT1 {
    /**
     * The default value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin()
     * @generated
     * @ordered
     */
    protected static final Double VMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin()
     * @generated
     * @ordered
     */
    protected Double vmin = VMIN_EDEFAULT;

    /**
     * This is true if the Vmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vminESet;

    /**
     * The default value of the '{@link #getKdgov() <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdgov()
     * @generated
     * @ordered
     */
    protected static final Double KDGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdgov() <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdgov()
     * @generated
     * @ordered
     */
    protected Double kdgov = KDGOV_EDEFAULT;

    /**
     * This is true if the Kdgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdgovESet;

    /**
     * The default value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected static final Double TPELEC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected Double tpelec = TPELEC_EDEFAULT;

    /**
     * This is true if the Tpelec attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpelecESet;

    /**
     * The default value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected static final Double MWBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected Double mwbase = MWBASE_EDEFAULT;

    /**
     * This is true if the Mwbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwbaseESet;

    /**
     * The default value of the '{@link #getRdown() <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdown()
     * @generated
     * @ordered
     */
    protected static final Double RDOWN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRdown() <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdown()
     * @generated
     * @ordered
     */
    protected Double rdown = RDOWN_EDEFAULT;

    /**
     * This is true if the Rdown attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rdownESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Double TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Double tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected static final Double TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected Double tc = TC_EDEFAULT;

    /**
     * This is true if the Tc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcESet;

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
     * The default value of the '{@link #getRselect() <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRselect()
     * @generated
     * @ordered
     */
    protected static final DroopSignalFeedbackKind RSELECT_EDEFAULT = DroopSignalFeedbackKind.NONE;

    /**
     * The cached value of the '{@link #getRselect() <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRselect()
     * @generated
     * @ordered
     */
    protected DroopSignalFeedbackKind rselect = RSELECT_EDEFAULT;

    /**
     * This is true if the Rselect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rselectESet;

    /**
     * The default value of the '{@link #getRup() <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRup()
     * @generated
     * @ordered
     */
    protected static final Double RUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRup() <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRup()
     * @generated
     * @ordered
     */
    protected Double rup = RUP_EDEFAULT;

    /**
     * This is true if the Rup attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rupESet;

    /**
     * The default value of the '{@link #getLdref() <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdref()
     * @generated
     * @ordered
     */
    protected static final Double LDREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdref() <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdref()
     * @generated
     * @ordered
     */
    protected Double ldref = LDREF_EDEFAULT;

    /**
     * This is true if the Ldref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldrefESet;

    /**
     * The default value of the '{@link #getKturb() <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKturb()
     * @generated
     * @ordered
     */
    protected static final Double KTURB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKturb() <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKturb()
     * @generated
     * @ordered
     */
    protected Double kturb = KTURB_EDEFAULT;

    /**
     * This is true if the Kturb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kturbESet;

    /**
     * The default value of the '{@link #getKiload() <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiload()
     * @generated
     * @ordered
     */
    protected static final Double KILOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiload() <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiload()
     * @generated
     * @ordered
     */
    protected Double kiload = KILOAD_EDEFAULT;

    /**
     * This is true if the Kiload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiloadESet;

    /**
     * The default value of the '{@link #getTeng() <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeng()
     * @generated
     * @ordered
     */
    protected static final Double TENG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTeng() <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeng()
     * @generated
     * @ordered
     */
    protected Double teng = TENG_EDEFAULT;

    /**
     * This is true if the Teng attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tengESet;

    /**
     * The default value of the '{@link #getWfnl() <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfnl()
     * @generated
     * @ordered
     */
    protected static final Double WFNL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfnl() <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfnl()
     * @generated
     * @ordered
     */
    protected Double wfnl = WFNL_EDEFAULT;

    /**
     * This is true if the Wfnl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfnlESet;

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
     * The default value of the '{@link #getKpgov() <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpgov()
     * @generated
     * @ordered
     */
    protected static final Double KPGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpgov() <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpgov()
     * @generated
     * @ordered
     */
    protected Double kpgov = KPGOV_EDEFAULT;

    /**
     * This is true if the Kpgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpgovESet;

    /**
     * The default value of the '{@link #getMinerr() <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinerr()
     * @generated
     * @ordered
     */
    protected static final Double MINERR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinerr() <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinerr()
     * @generated
     * @ordered
     */
    protected Double minerr = MINERR_EDEFAULT;

    /**
     * This is true if the Minerr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minerrESet;

    /**
     * The default value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax()
     * @generated
     * @ordered
     */
    protected static final Double VMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax()
     * @generated
     * @ordered
     */
    protected Double vmax = VMAX_EDEFAULT;

    /**
     * This is true if the Vmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmaxESet;

    /**
     * The default value of the '{@link #getTfload() <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfload()
     * @generated
     * @ordered
     */
    protected static final Double TFLOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfload() <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfload()
     * @generated
     * @ordered
     */
    protected Double tfload = TFLOAD_EDEFAULT;

    /**
     * This is true if the Tfload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfloadESet;

    /**
     * The default value of the '{@link #getTdgov() <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdgov()
     * @generated
     * @ordered
     */
    protected static final Double TDGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdgov() <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdgov()
     * @generated
     * @ordered
     */
    protected Double tdgov = TDGOV_EDEFAULT;

    /**
     * This is true if the Tdgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdgovESet;

    /**
     * The default value of the '{@link #getKimw() <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKimw()
     * @generated
     * @ordered
     */
    protected static final Double KIMW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKimw() <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKimw()
     * @generated
     * @ordered
     */
    protected Double kimw = KIMW_EDEFAULT;

    /**
     * This is true if the Kimw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kimwESet;

    /**
     * The default value of the '{@link #getKpload() <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpload()
     * @generated
     * @ordered
     */
    protected static final Double KPLOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpload() <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpload()
     * @generated
     * @ordered
     */
    protected Double kpload = KPLOAD_EDEFAULT;

    /**
     * This is true if the Kpload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kploadESet;

    /**
     * The default value of the '{@link #getWfspd() <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfspd()
     * @generated
     * @ordered
     */
    protected static final Boolean WFSPD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfspd() <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfspd()
     * @generated
     * @ordered
     */
    protected Boolean wfspd = WFSPD_EDEFAULT;

    /**
     * This is true if the Wfspd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfspdESet;

    /**
     * The default value of the '{@link #getAset() <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAset()
     * @generated
     * @ordered
     */
    protected static final Double ASET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAset() <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAset()
     * @generated
     * @ordered
     */
    protected Double aset = ASET_EDEFAULT;

    /**
     * This is true if the Aset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asetESet;

    /**
     * The default value of the '{@link #getTact() <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTact()
     * @generated
     * @ordered
     */
    protected static final Double TACT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTact() <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTact()
     * @generated
     * @ordered
     */
    protected Double tact = TACT_EDEFAULT;

    /**
     * This is true if the Tact attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tactESet;

    /**
     * The default value of the '{@link #getRopen() <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRopen()
     * @generated
     * @ordered
     */
    protected static final Double ROPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRopen() <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRopen()
     * @generated
     * @ordered
     */
    protected Double ropen = ROPEN_EDEFAULT;

    /**
     * This is true if the Ropen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ropenESet;

    /**
     * The default value of the '{@link #getRclose() <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRclose()
     * @generated
     * @ordered
     */
    protected static final Double RCLOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRclose() <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRclose()
     * @generated
     * @ordered
     */
    protected Double rclose = RCLOSE_EDEFAULT;

    /**
     * This is true if the Rclose attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcloseESet;

    /**
     * The default value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected static final Double DB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected Double db = DB_EDEFAULT;

    /**
     * This is true if the Db attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dbESet;

    /**
     * The default value of the '{@link #getDm() <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDm()
     * @generated
     * @ordered
     */
    protected static final Double DM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDm() <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDm()
     * @generated
     * @ordered
     */
    protected Double dm = DM_EDEFAULT;

    /**
     * This is true if the Dm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dmESet;

    /**
     * The default value of the '{@link #getKigov() <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKigov()
     * @generated
     * @ordered
     */
    protected static final Double KIGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKigov() <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKigov()
     * @generated
     * @ordered
     */
    protected Double kigov = KIGOV_EDEFAULT;

    /**
     * This is true if the Kigov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kigovESet;

    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Double KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Double ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getMaxerr() <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxerr()
     * @generated
     * @ordered
     */
    protected static final Double MAXERR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxerr() <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxerr()
     * @generated
     * @ordered
     */
    protected Double maxerr = MAXERR_EDEFAULT;

    /**
     * This is true if the Maxerr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxerrESet;

    /**
     * The default value of the '{@link #getTsb() <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsb()
     * @generated
     * @ordered
     */
    protected static final Double TSB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsb() <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsb()
     * @generated
     * @ordered
     */
    protected Double tsb = TSB_EDEFAULT;

    /**
     * This is true if the Tsb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsbESet;

    /**
     * The default value of the '{@link #getTsa() <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsa()
     * @generated
     * @ordered
     */
    protected static final Double TSA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsa() <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsa()
     * @generated
     * @ordered
     */
    protected Double tsa = TSA_EDEFAULT;

    /**
     * This is true if the Tsa attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovCT1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovCT1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmin() {
        return vmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmin( Double newVmin ) {
        Double oldVmin = vmin;
        vmin = newVmin;
        boolean oldVminESet = vminESet;
        vminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__VMIN, oldVmin, vmin,
                    !oldVminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmin() {
        Double oldVmin = vmin;
        boolean oldVminESet = vminESet;
        vmin = VMIN_EDEFAULT;
        vminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__VMIN, oldVmin, VMIN_EDEFAULT,
                    oldVminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmin() {
        return vminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKdgov() {
        return kdgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdgov( Double newKdgov ) {
        Double oldKdgov = kdgov;
        kdgov = newKdgov;
        boolean oldKdgovESet = kdgovESet;
        kdgovESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KDGOV, oldKdgov, kdgov,
                    !oldKdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdgov() {
        Double oldKdgov = kdgov;
        boolean oldKdgovESet = kdgovESet;
        kdgov = KDGOV_EDEFAULT;
        kdgovESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KDGOV, oldKdgov,
                    KDGOV_EDEFAULT, oldKdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdgov() {
        return kdgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpelec() {
        return tpelec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpelec( Double newTpelec ) {
        Double oldTpelec = tpelec;
        tpelec = newTpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelecESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TPELEC, oldTpelec, tpelec,
                    !oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpelec() {
        Double oldTpelec = tpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelec = TPELEC_EDEFAULT;
        tpelecESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TPELEC, oldTpelec,
                    TPELEC_EDEFAULT, oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpelec() {
        return tpelecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMwbase() {
        return mwbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwbase( Double newMwbase ) {
        Double oldMwbase = mwbase;
        mwbase = newMwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__MWBASE, oldMwbase, mwbase,
                    !oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwbase() {
        Double oldMwbase = mwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbase = MWBASE_EDEFAULT;
        mwbaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__MWBASE, oldMwbase,
                    MWBASE_EDEFAULT, oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwbase() {
        return mwbaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRdown() {
        return rdown;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRdown( Double newRdown ) {
        Double oldRdown = rdown;
        rdown = newRdown;
        boolean oldRdownESet = rdownESet;
        rdownESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__RDOWN, oldRdown, rdown,
                    !oldRdownESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRdown() {
        Double oldRdown = rdown;
        boolean oldRdownESet = rdownESet;
        rdown = RDOWN_EDEFAULT;
        rdownESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__RDOWN, oldRdown,
                    RDOWN_EDEFAULT, oldRdownESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRdown() {
        return rdownESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Double newTb ) {
        Double oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Double oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TB, oldTb, TB_EDEFAULT,
                    oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTc() {
        return tc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc( Double newTc ) {
        Double oldTc = tc;
        tc = newTc;
        boolean oldTcESet = tcESet;
        tcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TC, oldTc, tc, !oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc() {
        Double oldTc = tc;
        boolean oldTcESet = tcESet;
        tc = TC_EDEFAULT;
        tcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TC, oldTc, TC_EDEFAULT,
                    oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc() {
        return tcESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TA, oldTa, ta, !oldTaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TA, oldTa, TA_EDEFAULT,
                    oldTaESet ) );
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
    public DroopSignalFeedbackKind getRselect() {
        return rselect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRselect( DroopSignalFeedbackKind newRselect ) {
        DroopSignalFeedbackKind oldRselect = rselect;
        rselect = newRselect == null ? RSELECT_EDEFAULT : newRselect;
        boolean oldRselectESet = rselectESet;
        rselectESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__RSELECT, oldRselect, rselect,
                    !oldRselectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRselect() {
        DroopSignalFeedbackKind oldRselect = rselect;
        boolean oldRselectESet = rselectESet;
        rselect = RSELECT_EDEFAULT;
        rselectESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__RSELECT, oldRselect,
                    RSELECT_EDEFAULT, oldRselectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRselect() {
        return rselectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRup() {
        return rup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRup( Double newRup ) {
        Double oldRup = rup;
        rup = newRup;
        boolean oldRupESet = rupESet;
        rupESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__RUP, oldRup, rup,
                    !oldRupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRup() {
        Double oldRup = rup;
        boolean oldRupESet = rupESet;
        rup = RUP_EDEFAULT;
        rupESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__RUP, oldRup, RUP_EDEFAULT,
                    oldRupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRup() {
        return rupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLdref() {
        return ldref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdref( Double newLdref ) {
        Double oldLdref = ldref;
        ldref = newLdref;
        boolean oldLdrefESet = ldrefESet;
        ldrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__LDREF, oldLdref, ldref,
                    !oldLdrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdref() {
        Double oldLdref = ldref;
        boolean oldLdrefESet = ldrefESet;
        ldref = LDREF_EDEFAULT;
        ldrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__LDREF, oldLdref,
                    LDREF_EDEFAULT, oldLdrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdref() {
        return ldrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKturb() {
        return kturb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKturb( Double newKturb ) {
        Double oldKturb = kturb;
        kturb = newKturb;
        boolean oldKturbESet = kturbESet;
        kturbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KTURB, oldKturb, kturb,
                    !oldKturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKturb() {
        Double oldKturb = kturb;
        boolean oldKturbESet = kturbESet;
        kturb = KTURB_EDEFAULT;
        kturbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KTURB, oldKturb,
                    KTURB_EDEFAULT, oldKturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKturb() {
        return kturbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiload() {
        return kiload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiload( Double newKiload ) {
        Double oldKiload = kiload;
        kiload = newKiload;
        boolean oldKiloadESet = kiloadESet;
        kiloadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KILOAD, oldKiload, kiload,
                    !oldKiloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiload() {
        Double oldKiload = kiload;
        boolean oldKiloadESet = kiloadESet;
        kiload = KILOAD_EDEFAULT;
        kiloadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KILOAD, oldKiload,
                    KILOAD_EDEFAULT, oldKiloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiload() {
        return kiloadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTeng() {
        return teng;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTeng( Double newTeng ) {
        Double oldTeng = teng;
        teng = newTeng;
        boolean oldTengESet = tengESet;
        tengESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TENG, oldTeng, teng,
                    !oldTengESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTeng() {
        Double oldTeng = teng;
        boolean oldTengESet = tengESet;
        teng = TENG_EDEFAULT;
        tengESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TENG, oldTeng, TENG_EDEFAULT,
                    oldTengESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTeng() {
        return tengESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWfnl() {
        return wfnl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfnl( Double newWfnl ) {
        Double oldWfnl = wfnl;
        wfnl = newWfnl;
        boolean oldWfnlESet = wfnlESet;
        wfnlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__WFNL, oldWfnl, wfnl,
                    !oldWfnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfnl() {
        Double oldWfnl = wfnl;
        boolean oldWfnlESet = wfnlESet;
        wfnl = WFNL_EDEFAULT;
        wfnlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__WFNL, oldWfnl, WFNL_EDEFAULT,
                    oldWfnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfnl() {
        return wfnlESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__R, oldR, r, !oldRESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__R, oldR, R_EDEFAULT,
                    oldRESet ) );
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
    public Double getKpgov() {
        return kpgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpgov( Double newKpgov ) {
        Double oldKpgov = kpgov;
        kpgov = newKpgov;
        boolean oldKpgovESet = kpgovESet;
        kpgovESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KPGOV, oldKpgov, kpgov,
                    !oldKpgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpgov() {
        Double oldKpgov = kpgov;
        boolean oldKpgovESet = kpgovESet;
        kpgov = KPGOV_EDEFAULT;
        kpgovESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KPGOV, oldKpgov,
                    KPGOV_EDEFAULT, oldKpgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpgov() {
        return kpgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinerr() {
        return minerr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinerr( Double newMinerr ) {
        Double oldMinerr = minerr;
        minerr = newMinerr;
        boolean oldMinerrESet = minerrESet;
        minerrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__MINERR, oldMinerr, minerr,
                    !oldMinerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinerr() {
        Double oldMinerr = minerr;
        boolean oldMinerrESet = minerrESet;
        minerr = MINERR_EDEFAULT;
        minerrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__MINERR, oldMinerr,
                    MINERR_EDEFAULT, oldMinerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinerr() {
        return minerrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmax() {
        return vmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmax( Double newVmax ) {
        Double oldVmax = vmax;
        vmax = newVmax;
        boolean oldVmaxESet = vmaxESet;
        vmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__VMAX, oldVmax, vmax,
                    !oldVmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmax() {
        Double oldVmax = vmax;
        boolean oldVmaxESet = vmaxESet;
        vmax = VMAX_EDEFAULT;
        vmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__VMAX, oldVmax, VMAX_EDEFAULT,
                    oldVmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmax() {
        return vmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTfload() {
        return tfload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfload( Double newTfload ) {
        Double oldTfload = tfload;
        tfload = newTfload;
        boolean oldTfloadESet = tfloadESet;
        tfloadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TFLOAD, oldTfload, tfload,
                    !oldTfloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfload() {
        Double oldTfload = tfload;
        boolean oldTfloadESet = tfloadESet;
        tfload = TFLOAD_EDEFAULT;
        tfloadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TFLOAD, oldTfload,
                    TFLOAD_EDEFAULT, oldTfloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfload() {
        return tfloadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTdgov() {
        return tdgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdgov( Double newTdgov ) {
        Double oldTdgov = tdgov;
        tdgov = newTdgov;
        boolean oldTdgovESet = tdgovESet;
        tdgovESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TDGOV, oldTdgov, tdgov,
                    !oldTdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdgov() {
        Double oldTdgov = tdgov;
        boolean oldTdgovESet = tdgovESet;
        tdgov = TDGOV_EDEFAULT;
        tdgovESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TDGOV, oldTdgov,
                    TDGOV_EDEFAULT, oldTdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdgov() {
        return tdgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKimw() {
        return kimw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKimw( Double newKimw ) {
        Double oldKimw = kimw;
        kimw = newKimw;
        boolean oldKimwESet = kimwESet;
        kimwESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KIMW, oldKimw, kimw,
                    !oldKimwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKimw() {
        Double oldKimw = kimw;
        boolean oldKimwESet = kimwESet;
        kimw = KIMW_EDEFAULT;
        kimwESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KIMW, oldKimw, KIMW_EDEFAULT,
                    oldKimwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKimw() {
        return kimwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpload() {
        return kpload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpload( Double newKpload ) {
        Double oldKpload = kpload;
        kpload = newKpload;
        boolean oldKploadESet = kploadESet;
        kploadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KPLOAD, oldKpload, kpload,
                    !oldKploadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpload() {
        Double oldKpload = kpload;
        boolean oldKploadESet = kploadESet;
        kpload = KPLOAD_EDEFAULT;
        kploadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KPLOAD, oldKpload,
                    KPLOAD_EDEFAULT, oldKploadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpload() {
        return kploadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWfspd() {
        return wfspd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfspd( Boolean newWfspd ) {
        Boolean oldWfspd = wfspd;
        wfspd = newWfspd;
        boolean oldWfspdESet = wfspdESet;
        wfspdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__WFSPD, oldWfspd, wfspd,
                    !oldWfspdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfspd() {
        Boolean oldWfspd = wfspd;
        boolean oldWfspdESet = wfspdESet;
        wfspd = WFSPD_EDEFAULT;
        wfspdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__WFSPD, oldWfspd,
                    WFSPD_EDEFAULT, oldWfspdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfspd() {
        return wfspdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAset() {
        return aset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAset( Double newAset ) {
        Double oldAset = aset;
        aset = newAset;
        boolean oldAsetESet = asetESet;
        asetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__ASET, oldAset, aset,
                    !oldAsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAset() {
        Double oldAset = aset;
        boolean oldAsetESet = asetESet;
        aset = ASET_EDEFAULT;
        asetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__ASET, oldAset, ASET_EDEFAULT,
                    oldAsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAset() {
        return asetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTact() {
        return tact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTact( Double newTact ) {
        Double oldTact = tact;
        tact = newTact;
        boolean oldTactESet = tactESet;
        tactESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TACT, oldTact, tact,
                    !oldTactESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTact() {
        Double oldTact = tact;
        boolean oldTactESet = tactESet;
        tact = TACT_EDEFAULT;
        tactESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TACT, oldTact, TACT_EDEFAULT,
                    oldTactESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTact() {
        return tactESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRopen() {
        return ropen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRopen( Double newRopen ) {
        Double oldRopen = ropen;
        ropen = newRopen;
        boolean oldRopenESet = ropenESet;
        ropenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__ROPEN, oldRopen, ropen,
                    !oldRopenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRopen() {
        Double oldRopen = ropen;
        boolean oldRopenESet = ropenESet;
        ropen = ROPEN_EDEFAULT;
        ropenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__ROPEN, oldRopen,
                    ROPEN_EDEFAULT, oldRopenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRopen() {
        return ropenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRclose() {
        return rclose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRclose( Double newRclose ) {
        Double oldRclose = rclose;
        rclose = newRclose;
        boolean oldRcloseESet = rcloseESet;
        rcloseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__RCLOSE, oldRclose, rclose,
                    !oldRcloseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRclose() {
        Double oldRclose = rclose;
        boolean oldRcloseESet = rcloseESet;
        rclose = RCLOSE_EDEFAULT;
        rcloseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__RCLOSE, oldRclose,
                    RCLOSE_EDEFAULT, oldRcloseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRclose() {
        return rcloseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDb() {
        return db;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb( Double newDb ) {
        Double oldDb = db;
        db = newDb;
        boolean oldDbESet = dbESet;
        dbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__DB, oldDb, db, !oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb() {
        Double oldDb = db;
        boolean oldDbESet = dbESet;
        db = DB_EDEFAULT;
        dbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__DB, oldDb, DB_EDEFAULT,
                    oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb() {
        return dbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDm() {
        return dm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDm( Double newDm ) {
        Double oldDm = dm;
        dm = newDm;
        boolean oldDmESet = dmESet;
        dmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__DM, oldDm, dm, !oldDmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDm() {
        Double oldDm = dm;
        boolean oldDmESet = dmESet;
        dm = DM_EDEFAULT;
        dmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__DM, oldDm, DM_EDEFAULT,
                    oldDmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDm() {
        return dmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKigov() {
        return kigov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKigov( Double newKigov ) {
        Double oldKigov = kigov;
        kigov = newKigov;
        boolean oldKigovESet = kigovESet;
        kigovESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KIGOV, oldKigov, kigov,
                    !oldKigovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKigov() {
        Double oldKigov = kigov;
        boolean oldKigovESet = kigovESet;
        kigov = KIGOV_EDEFAULT;
        kigovESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KIGOV, oldKigov,
                    KIGOV_EDEFAULT, oldKigovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKigov() {
        return kigovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Double newKa ) {
        Double oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__KA, oldKa, ka, !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Double oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__KA, oldKa, KA_EDEFAULT,
                    oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxerr() {
        return maxerr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxerr( Double newMaxerr ) {
        Double oldMaxerr = maxerr;
        maxerr = newMaxerr;
        boolean oldMaxerrESet = maxerrESet;
        maxerrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__MAXERR, oldMaxerr, maxerr,
                    !oldMaxerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxerr() {
        Double oldMaxerr = maxerr;
        boolean oldMaxerrESet = maxerrESet;
        maxerr = MAXERR_EDEFAULT;
        maxerrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__MAXERR, oldMaxerr,
                    MAXERR_EDEFAULT, oldMaxerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxerr() {
        return maxerrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTsb() {
        return tsb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsb( Double newTsb ) {
        Double oldTsb = tsb;
        tsb = newTsb;
        boolean oldTsbESet = tsbESet;
        tsbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TSB, oldTsb, tsb,
                    !oldTsbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsb() {
        Double oldTsb = tsb;
        boolean oldTsbESet = tsbESet;
        tsb = TSB_EDEFAULT;
        tsbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TSB, oldTsb, TSB_EDEFAULT,
                    oldTsbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsb() {
        return tsbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTsa() {
        return tsa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsa( Double newTsa ) {
        Double oldTsa = tsa;
        tsa = newTsa;
        boolean oldTsaESet = tsaESet;
        tsaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT1__TSA, oldTsa, tsa,
                    !oldTsaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsa() {
        Double oldTsa = tsa;
        boolean oldTsaESet = tsaESet;
        tsa = TSA_EDEFAULT;
        tsaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT1__TSA, oldTsa, TSA_EDEFAULT,
                    oldTsaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsa() {
        return tsaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_CT1__VMIN:
            return getVmin();
        case CimPackage.GOV_CT1__KDGOV:
            return getKdgov();
        case CimPackage.GOV_CT1__TPELEC:
            return getTpelec();
        case CimPackage.GOV_CT1__MWBASE:
            return getMwbase();
        case CimPackage.GOV_CT1__RDOWN:
            return getRdown();
        case CimPackage.GOV_CT1__TB:
            return getTb();
        case CimPackage.GOV_CT1__TC:
            return getTc();
        case CimPackage.GOV_CT1__TA:
            return getTa();
        case CimPackage.GOV_CT1__RSELECT:
            return getRselect();
        case CimPackage.GOV_CT1__RUP:
            return getRup();
        case CimPackage.GOV_CT1__LDREF:
            return getLdref();
        case CimPackage.GOV_CT1__KTURB:
            return getKturb();
        case CimPackage.GOV_CT1__KILOAD:
            return getKiload();
        case CimPackage.GOV_CT1__TENG:
            return getTeng();
        case CimPackage.GOV_CT1__WFNL:
            return getWfnl();
        case CimPackage.GOV_CT1__R:
            return getR();
        case CimPackage.GOV_CT1__KPGOV:
            return getKpgov();
        case CimPackage.GOV_CT1__MINERR:
            return getMinerr();
        case CimPackage.GOV_CT1__VMAX:
            return getVmax();
        case CimPackage.GOV_CT1__TFLOAD:
            return getTfload();
        case CimPackage.GOV_CT1__TDGOV:
            return getTdgov();
        case CimPackage.GOV_CT1__KIMW:
            return getKimw();
        case CimPackage.GOV_CT1__KPLOAD:
            return getKpload();
        case CimPackage.GOV_CT1__WFSPD:
            return getWfspd();
        case CimPackage.GOV_CT1__ASET:
            return getAset();
        case CimPackage.GOV_CT1__TACT:
            return getTact();
        case CimPackage.GOV_CT1__ROPEN:
            return getRopen();
        case CimPackage.GOV_CT1__RCLOSE:
            return getRclose();
        case CimPackage.GOV_CT1__DB:
            return getDb();
        case CimPackage.GOV_CT1__DM:
            return getDm();
        case CimPackage.GOV_CT1__KIGOV:
            return getKigov();
        case CimPackage.GOV_CT1__KA:
            return getKa();
        case CimPackage.GOV_CT1__MAXERR:
            return getMaxerr();
        case CimPackage.GOV_CT1__TSB:
            return getTsb();
        case CimPackage.GOV_CT1__TSA:
            return getTsa();
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
        case CimPackage.GOV_CT1__VMIN:
            setVmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KDGOV:
            setKdgov( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TPELEC:
            setTpelec( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__RDOWN:
            setRdown( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TC:
            setTc( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__RSELECT:
            setRselect( ( DroopSignalFeedbackKind ) newValue );
            return;
        case CimPackage.GOV_CT1__RUP:
            setRup( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__LDREF:
            setLdref( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KTURB:
            setKturb( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KILOAD:
            setKiload( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TENG:
            setTeng( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__WFNL:
            setWfnl( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KPGOV:
            setKpgov( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__MINERR:
            setMinerr( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__VMAX:
            setVmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TFLOAD:
            setTfload( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TDGOV:
            setTdgov( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KIMW:
            setKimw( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KPLOAD:
            setKpload( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__WFSPD:
            setWfspd( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_CT1__ASET:
            setAset( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TACT:
            setTact( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__ROPEN:
            setRopen( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__RCLOSE:
            setRclose( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__DB:
            setDb( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__DM:
            setDm( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KIGOV:
            setKigov( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__KA:
            setKa( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__MAXERR:
            setMaxerr( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TSB:
            setTsb( ( Double ) newValue );
            return;
        case CimPackage.GOV_CT1__TSA:
            setTsa( ( Double ) newValue );
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
        case CimPackage.GOV_CT1__VMIN:
            unsetVmin();
            return;
        case CimPackage.GOV_CT1__KDGOV:
            unsetKdgov();
            return;
        case CimPackage.GOV_CT1__TPELEC:
            unsetTpelec();
            return;
        case CimPackage.GOV_CT1__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_CT1__RDOWN:
            unsetRdown();
            return;
        case CimPackage.GOV_CT1__TB:
            unsetTb();
            return;
        case CimPackage.GOV_CT1__TC:
            unsetTc();
            return;
        case CimPackage.GOV_CT1__TA:
            unsetTa();
            return;
        case CimPackage.GOV_CT1__RSELECT:
            unsetRselect();
            return;
        case CimPackage.GOV_CT1__RUP:
            unsetRup();
            return;
        case CimPackage.GOV_CT1__LDREF:
            unsetLdref();
            return;
        case CimPackage.GOV_CT1__KTURB:
            unsetKturb();
            return;
        case CimPackage.GOV_CT1__KILOAD:
            unsetKiload();
            return;
        case CimPackage.GOV_CT1__TENG:
            unsetTeng();
            return;
        case CimPackage.GOV_CT1__WFNL:
            unsetWfnl();
            return;
        case CimPackage.GOV_CT1__R:
            unsetR();
            return;
        case CimPackage.GOV_CT1__KPGOV:
            unsetKpgov();
            return;
        case CimPackage.GOV_CT1__MINERR:
            unsetMinerr();
            return;
        case CimPackage.GOV_CT1__VMAX:
            unsetVmax();
            return;
        case CimPackage.GOV_CT1__TFLOAD:
            unsetTfload();
            return;
        case CimPackage.GOV_CT1__TDGOV:
            unsetTdgov();
            return;
        case CimPackage.GOV_CT1__KIMW:
            unsetKimw();
            return;
        case CimPackage.GOV_CT1__KPLOAD:
            unsetKpload();
            return;
        case CimPackage.GOV_CT1__WFSPD:
            unsetWfspd();
            return;
        case CimPackage.GOV_CT1__ASET:
            unsetAset();
            return;
        case CimPackage.GOV_CT1__TACT:
            unsetTact();
            return;
        case CimPackage.GOV_CT1__ROPEN:
            unsetRopen();
            return;
        case CimPackage.GOV_CT1__RCLOSE:
            unsetRclose();
            return;
        case CimPackage.GOV_CT1__DB:
            unsetDb();
            return;
        case CimPackage.GOV_CT1__DM:
            unsetDm();
            return;
        case CimPackage.GOV_CT1__KIGOV:
            unsetKigov();
            return;
        case CimPackage.GOV_CT1__KA:
            unsetKa();
            return;
        case CimPackage.GOV_CT1__MAXERR:
            unsetMaxerr();
            return;
        case CimPackage.GOV_CT1__TSB:
            unsetTsb();
            return;
        case CimPackage.GOV_CT1__TSA:
            unsetTsa();
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
        case CimPackage.GOV_CT1__VMIN:
            return isSetVmin();
        case CimPackage.GOV_CT1__KDGOV:
            return isSetKdgov();
        case CimPackage.GOV_CT1__TPELEC:
            return isSetTpelec();
        case CimPackage.GOV_CT1__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_CT1__RDOWN:
            return isSetRdown();
        case CimPackage.GOV_CT1__TB:
            return isSetTb();
        case CimPackage.GOV_CT1__TC:
            return isSetTc();
        case CimPackage.GOV_CT1__TA:
            return isSetTa();
        case CimPackage.GOV_CT1__RSELECT:
            return isSetRselect();
        case CimPackage.GOV_CT1__RUP:
            return isSetRup();
        case CimPackage.GOV_CT1__LDREF:
            return isSetLdref();
        case CimPackage.GOV_CT1__KTURB:
            return isSetKturb();
        case CimPackage.GOV_CT1__KILOAD:
            return isSetKiload();
        case CimPackage.GOV_CT1__TENG:
            return isSetTeng();
        case CimPackage.GOV_CT1__WFNL:
            return isSetWfnl();
        case CimPackage.GOV_CT1__R:
            return isSetR();
        case CimPackage.GOV_CT1__KPGOV:
            return isSetKpgov();
        case CimPackage.GOV_CT1__MINERR:
            return isSetMinerr();
        case CimPackage.GOV_CT1__VMAX:
            return isSetVmax();
        case CimPackage.GOV_CT1__TFLOAD:
            return isSetTfload();
        case CimPackage.GOV_CT1__TDGOV:
            return isSetTdgov();
        case CimPackage.GOV_CT1__KIMW:
            return isSetKimw();
        case CimPackage.GOV_CT1__KPLOAD:
            return isSetKpload();
        case CimPackage.GOV_CT1__WFSPD:
            return isSetWfspd();
        case CimPackage.GOV_CT1__ASET:
            return isSetAset();
        case CimPackage.GOV_CT1__TACT:
            return isSetTact();
        case CimPackage.GOV_CT1__ROPEN:
            return isSetRopen();
        case CimPackage.GOV_CT1__RCLOSE:
            return isSetRclose();
        case CimPackage.GOV_CT1__DB:
            return isSetDb();
        case CimPackage.GOV_CT1__DM:
            return isSetDm();
        case CimPackage.GOV_CT1__KIGOV:
            return isSetKigov();
        case CimPackage.GOV_CT1__KA:
            return isSetKa();
        case CimPackage.GOV_CT1__MAXERR:
            return isSetMaxerr();
        case CimPackage.GOV_CT1__TSB:
            return isSetTsb();
        case CimPackage.GOV_CT1__TSA:
            return isSetTsa();
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
        result.append( " (vmin: " );
        if( vminESet )
            result.append( vmin );
        else
            result.append( "<unset>" );
        result.append( ", kdgov: " );
        if( kdgovESet )
            result.append( kdgov );
        else
            result.append( "<unset>" );
        result.append( ", tpelec: " );
        if( tpelecESet )
            result.append( tpelec );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", rdown: " );
        if( rdownESet )
            result.append( rdown );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", rselect: " );
        if( rselectESet )
            result.append( rselect );
        else
            result.append( "<unset>" );
        result.append( ", rup: " );
        if( rupESet )
            result.append( rup );
        else
            result.append( "<unset>" );
        result.append( ", ldref: " );
        if( ldrefESet )
            result.append( ldref );
        else
            result.append( "<unset>" );
        result.append( ", kturb: " );
        if( kturbESet )
            result.append( kturb );
        else
            result.append( "<unset>" );
        result.append( ", kiload: " );
        if( kiloadESet )
            result.append( kiload );
        else
            result.append( "<unset>" );
        result.append( ", teng: " );
        if( tengESet )
            result.append( teng );
        else
            result.append( "<unset>" );
        result.append( ", wfnl: " );
        if( wfnlESet )
            result.append( wfnl );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", kpgov: " );
        if( kpgovESet )
            result.append( kpgov );
        else
            result.append( "<unset>" );
        result.append( ", minerr: " );
        if( minerrESet )
            result.append( minerr );
        else
            result.append( "<unset>" );
        result.append( ", vmax: " );
        if( vmaxESet )
            result.append( vmax );
        else
            result.append( "<unset>" );
        result.append( ", tfload: " );
        if( tfloadESet )
            result.append( tfload );
        else
            result.append( "<unset>" );
        result.append( ", tdgov: " );
        if( tdgovESet )
            result.append( tdgov );
        else
            result.append( "<unset>" );
        result.append( ", kimw: " );
        if( kimwESet )
            result.append( kimw );
        else
            result.append( "<unset>" );
        result.append( ", kpload: " );
        if( kploadESet )
            result.append( kpload );
        else
            result.append( "<unset>" );
        result.append( ", wfspd: " );
        if( wfspdESet )
            result.append( wfspd );
        else
            result.append( "<unset>" );
        result.append( ", aset: " );
        if( asetESet )
            result.append( aset );
        else
            result.append( "<unset>" );
        result.append( ", tact: " );
        if( tactESet )
            result.append( tact );
        else
            result.append( "<unset>" );
        result.append( ", ropen: " );
        if( ropenESet )
            result.append( ropen );
        else
            result.append( "<unset>" );
        result.append( ", rclose: " );
        if( rcloseESet )
            result.append( rclose );
        else
            result.append( "<unset>" );
        result.append( ", db: " );
        if( dbESet )
            result.append( db );
        else
            result.append( "<unset>" );
        result.append( ", dm: " );
        if( dmESet )
            result.append( dm );
        else
            result.append( "<unset>" );
        result.append( ", kigov: " );
        if( kigovESet )
            result.append( kigov );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", maxerr: " );
        if( maxerrESet )
            result.append( maxerr );
        else
            result.append( "<unset>" );
        result.append( ", tsb: " );
        if( tsbESet )
            result.append( tsb );
        else
            result.append( "<unset>" );
        result.append( ", tsa: " );
        if( tsaESet )
            result.append( tsa );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovCT1Impl
