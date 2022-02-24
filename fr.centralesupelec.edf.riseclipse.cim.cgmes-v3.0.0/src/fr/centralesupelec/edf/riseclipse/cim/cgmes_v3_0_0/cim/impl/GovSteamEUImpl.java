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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Steam EU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTrh <em>Trh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTdp <em>Tdp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTfp <em>Tfp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTen <em>Ten</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getThp <em>Thp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getCio <em>Cio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getCic <em>Cic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getCho <em>Cho</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTip <em>Tip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getChc <em>Chc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTlp <em>Tlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWmax1 <em>Wmax1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWmax2 <em>Wmax2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getPrhmax <em>Prhmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getKhp <em>Khp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getKlp <em>Klp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getHhpmax <em>Hhpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getKomegacor <em>Komegacor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWwmin <em>Wwmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWwmax <em>Wwmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTvhp <em>Tvhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTvip <em>Tvip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getSimx <em>Simx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getKfcor <em>Kfcor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWfmin <em>Wfmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getWfmax <em>Wfmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamEUImpl#getKe <em>Ke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovSteamEUImpl extends TurbineGovernorDynamicsImpl implements GovSteamEU {
    /**
     * The default value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected static final Double TRH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected Double trh = TRH_EDEFAULT;

    /**
     * This is true if the Trh attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trhESet;

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
     * The default value of the '{@link #getDb2() <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb2()
     * @generated
     * @ordered
     */
    protected static final Double DB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb2() <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb2()
     * @generated
     * @ordered
     */
    protected Double db2 = DB2_EDEFAULT;

    /**
     * This is true if the Db2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean db2ESet;

    /**
     * The default value of the '{@link #getTdp() <em>Tdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdp()
     * @generated
     * @ordered
     */
    protected static final Double TDP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdp() <em>Tdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdp()
     * @generated
     * @ordered
     */
    protected Double tdp = TDP_EDEFAULT;

    /**
     * This is true if the Tdp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdpESet;

    /**
     * The default value of the '{@link #getTfp() <em>Tfp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfp()
     * @generated
     * @ordered
     */
    protected static final Double TFP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfp() <em>Tfp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfp()
     * @generated
     * @ordered
     */
    protected Double tfp = TFP_EDEFAULT;

    /**
     * This is true if the Tfp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfpESet;

    /**
     * The default value of the '{@link #getTen() <em>Ten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTen()
     * @generated
     * @ordered
     */
    protected static final Double TEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTen() <em>Ten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTen()
     * @generated
     * @ordered
     */
    protected Double ten = TEN_EDEFAULT;

    /**
     * This is true if the Ten attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tenESet;

    /**
     * The default value of the '{@link #getThp() <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThp()
     * @generated
     * @ordered
     */
    protected static final Double THP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThp() <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThp()
     * @generated
     * @ordered
     */
    protected Double thp = THP_EDEFAULT;

    /**
     * This is true if the Thp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thpESet;

    /**
     * The default value of the '{@link #getCio() <em>Cio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCio()
     * @generated
     * @ordered
     */
    protected static final Double CIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCio() <em>Cio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCio()
     * @generated
     * @ordered
     */
    protected Double cio = CIO_EDEFAULT;

    /**
     * This is true if the Cio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cioESet;

    /**
     * The default value of the '{@link #getCic() <em>Cic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCic()
     * @generated
     * @ordered
     */
    protected static final Double CIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCic() <em>Cic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCic()
     * @generated
     * @ordered
     */
    protected Double cic = CIC_EDEFAULT;

    /**
     * This is true if the Cic attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cicESet;

    /**
     * The default value of the '{@link #getCho() <em>Cho</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCho()
     * @generated
     * @ordered
     */
    protected static final Double CHO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCho() <em>Cho</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCho()
     * @generated
     * @ordered
     */
    protected Double cho = CHO_EDEFAULT;

    /**
     * This is true if the Cho attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean choESet;

    /**
     * The default value of the '{@link #getTip() <em>Tip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTip()
     * @generated
     * @ordered
     */
    protected static final Double TIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTip() <em>Tip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTip()
     * @generated
     * @ordered
     */
    protected Double tip = TIP_EDEFAULT;

    /**
     * This is true if the Tip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tipESet;

    /**
     * The default value of the '{@link #getChc() <em>Chc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChc()
     * @generated
     * @ordered
     */
    protected static final Double CHC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChc() <em>Chc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChc()
     * @generated
     * @ordered
     */
    protected Double chc = CHC_EDEFAULT;

    /**
     * This is true if the Chc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean chcESet;

    /**
     * The default value of the '{@link #getTlp() <em>Tlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTlp()
     * @generated
     * @ordered
     */
    protected static final Double TLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTlp() <em>Tlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTlp()
     * @generated
     * @ordered
     */
    protected Double tlp = TLP_EDEFAULT;

    /**
     * This is true if the Tlp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tlpESet;

    /**
     * The default value of the '{@link #getWmax1() <em>Wmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWmax1()
     * @generated
     * @ordered
     */
    protected static final Double WMAX1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWmax1() <em>Wmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWmax1()
     * @generated
     * @ordered
     */
    protected Double wmax1 = WMAX1_EDEFAULT;

    /**
     * This is true if the Wmax1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wmax1ESet;

    /**
     * The default value of the '{@link #getWmax2() <em>Wmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWmax2()
     * @generated
     * @ordered
     */
    protected static final Double WMAX2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWmax2() <em>Wmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWmax2()
     * @generated
     * @ordered
     */
    protected Double wmax2 = WMAX2_EDEFAULT;

    /**
     * This is true if the Wmax2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wmax2ESet;

    /**
     * The default value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected static final Double PMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected Double pmax = PMAX_EDEFAULT;

    /**
     * This is true if the Pmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxESet;

    /**
     * The default value of the '{@link #getPrhmax() <em>Prhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrhmax()
     * @generated
     * @ordered
     */
    protected static final Double PRHMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrhmax() <em>Prhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrhmax()
     * @generated
     * @ordered
     */
    protected Double prhmax = PRHMAX_EDEFAULT;

    /**
     * This is true if the Prhmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prhmaxESet;

    /**
     * The default value of the '{@link #getKhp() <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKhp()
     * @generated
     * @ordered
     */
    protected static final Double KHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKhp() <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKhp()
     * @generated
     * @ordered
     */
    protected Double khp = KHP_EDEFAULT;

    /**
     * This is true if the Khp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean khpESet;

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
     * The default value of the '{@link #getKlp() <em>Klp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlp()
     * @generated
     * @ordered
     */
    protected static final Double KLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKlp() <em>Klp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlp()
     * @generated
     * @ordered
     */
    protected Double klp = KLP_EDEFAULT;

    /**
     * This is true if the Klp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klpESet;

    /**
     * The default value of the '{@link #getHhpmax() <em>Hhpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHhpmax()
     * @generated
     * @ordered
     */
    protected static final Double HHPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHhpmax() <em>Hhpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHhpmax()
     * @generated
     * @ordered
     */
    protected Double hhpmax = HHPMAX_EDEFAULT;

    /**
     * This is true if the Hhpmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hhpmaxESet;

    /**
     * The default value of the '{@link #getKomegacor() <em>Komegacor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegacor()
     * @generated
     * @ordered
     */
    protected static final Double KOMEGACOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKomegacor() <em>Komegacor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegacor()
     * @generated
     * @ordered
     */
    protected Double komegacor = KOMEGACOR_EDEFAULT;

    /**
     * This is true if the Komegacor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean komegacorESet;

    /**
     * The default value of the '{@link #getWwmin() <em>Wwmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWwmin()
     * @generated
     * @ordered
     */
    protected static final Double WWMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWwmin() <em>Wwmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWwmin()
     * @generated
     * @ordered
     */
    protected Double wwmin = WWMIN_EDEFAULT;

    /**
     * This is true if the Wwmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wwminESet;

    /**
     * The default value of the '{@link #getWwmax() <em>Wwmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWwmax()
     * @generated
     * @ordered
     */
    protected static final Double WWMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWwmax() <em>Wwmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWwmax()
     * @generated
     * @ordered
     */
    protected Double wwmax = WWMAX_EDEFAULT;

    /**
     * This is true if the Wwmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wwmaxESet;

    /**
     * The default value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected static final Double TW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected Double tw = TW_EDEFAULT;

    /**
     * This is true if the Tw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twESet;

    /**
     * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected static final Double TP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected Double tp = TP_EDEFAULT;

    /**
     * This is true if the Tp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpESet;

    /**
     * The default value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected static final Double TF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected Double tf = TF_EDEFAULT;

    /**
     * This is true if the Tf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfESet;

    /**
     * The default value of the '{@link #getTvhp() <em>Tvhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvhp()
     * @generated
     * @ordered
     */
    protected static final Double TVHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTvhp() <em>Tvhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvhp()
     * @generated
     * @ordered
     */
    protected Double tvhp = TVHP_EDEFAULT;

    /**
     * This is true if the Tvhp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvhpESet;

    /**
     * The default value of the '{@link #getTvip() <em>Tvip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvip()
     * @generated
     * @ordered
     */
    protected static final Double TVIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTvip() <em>Tvip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvip()
     * @generated
     * @ordered
     */
    protected Double tvip = TVIP_EDEFAULT;

    /**
     * This is true if the Tvip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvipESet;

    /**
     * The default value of the '{@link #getSimx() <em>Simx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSimx()
     * @generated
     * @ordered
     */
    protected static final Double SIMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSimx() <em>Simx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSimx()
     * @generated
     * @ordered
     */
    protected Double simx = SIMX_EDEFAULT;

    /**
     * This is true if the Simx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean simxESet;

    /**
     * The default value of the '{@link #getKfcor() <em>Kfcor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKfcor()
     * @generated
     * @ordered
     */
    protected static final Double KFCOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKfcor() <em>Kfcor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKfcor()
     * @generated
     * @ordered
     */
    protected Double kfcor = KFCOR_EDEFAULT;

    /**
     * This is true if the Kfcor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfcorESet;

    /**
     * The default value of the '{@link #getWfmin() <em>Wfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfmin()
     * @generated
     * @ordered
     */
    protected static final Double WFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfmin() <em>Wfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfmin()
     * @generated
     * @ordered
     */
    protected Double wfmin = WFMIN_EDEFAULT;

    /**
     * This is true if the Wfmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfminESet;

    /**
     * The default value of the '{@link #getWfmax() <em>Wfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfmax()
     * @generated
     * @ordered
     */
    protected static final Double WFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfmax() <em>Wfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfmax()
     * @generated
     * @ordered
     */
    protected Double wfmax = WFMAX_EDEFAULT;

    /**
     * This is true if the Wfmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfmaxESet;

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
     * The default value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected static final Double KE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected Double ke = KE_EDEFAULT;

    /**
     * This is true if the Ke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovSteamEUImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovSteamEU();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTrh() {
        return trh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrh( Double newTrh ) {
        Double oldTrh = trh;
        trh = newTrh;
        boolean oldTrhESet = trhESet;
        trhESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TRH, oldTrh, trh,
                    !oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrh() {
        Double oldTrh = trh;
        boolean oldTrhESet = trhESet;
        trh = TRH_EDEFAULT;
        trhESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TRH, oldTrh,
                    TRH_EDEFAULT, oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrh() {
        return trhESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__DB1, oldDb1, db1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__DB1, oldDb1,
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
    public Double getDb2() {
        return db2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb2( Double newDb2 ) {
        Double oldDb2 = db2;
        db2 = newDb2;
        boolean oldDb2ESet = db2ESet;
        db2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__DB2, oldDb2, db2,
                    !oldDb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb2() {
        Double oldDb2 = db2;
        boolean oldDb2ESet = db2ESet;
        db2 = DB2_EDEFAULT;
        db2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__DB2, oldDb2,
                    DB2_EDEFAULT, oldDb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb2() {
        return db2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTdp() {
        return tdp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdp( Double newTdp ) {
        Double oldTdp = tdp;
        tdp = newTdp;
        boolean oldTdpESet = tdpESet;
        tdpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TDP, oldTdp, tdp,
                    !oldTdpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdp() {
        Double oldTdp = tdp;
        boolean oldTdpESet = tdpESet;
        tdp = TDP_EDEFAULT;
        tdpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TDP, oldTdp,
                    TDP_EDEFAULT, oldTdpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdp() {
        return tdpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTfp() {
        return tfp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfp( Double newTfp ) {
        Double oldTfp = tfp;
        tfp = newTfp;
        boolean oldTfpESet = tfpESet;
        tfpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TFP, oldTfp, tfp,
                    !oldTfpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfp() {
        Double oldTfp = tfp;
        boolean oldTfpESet = tfpESet;
        tfp = TFP_EDEFAULT;
        tfpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TFP, oldTfp,
                    TFP_EDEFAULT, oldTfpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfp() {
        return tfpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTen() {
        return ten;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTen( Double newTen ) {
        Double oldTen = ten;
        ten = newTen;
        boolean oldTenESet = tenESet;
        tenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TEN, oldTen, ten,
                    !oldTenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTen() {
        Double oldTen = ten;
        boolean oldTenESet = tenESet;
        ten = TEN_EDEFAULT;
        tenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TEN, oldTen,
                    TEN_EDEFAULT, oldTenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTen() {
        return tenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getThp() {
        return thp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThp( Double newThp ) {
        Double oldThp = thp;
        thp = newThp;
        boolean oldThpESet = thpESet;
        thpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__THP, oldThp, thp,
                    !oldThpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThp() {
        Double oldThp = thp;
        boolean oldThpESet = thpESet;
        thp = THP_EDEFAULT;
        thpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__THP, oldThp,
                    THP_EDEFAULT, oldThpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThp() {
        return thpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCio() {
        return cio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCio( Double newCio ) {
        Double oldCio = cio;
        cio = newCio;
        boolean oldCioESet = cioESet;
        cioESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__CIO, oldCio, cio,
                    !oldCioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCio() {
        Double oldCio = cio;
        boolean oldCioESet = cioESet;
        cio = CIO_EDEFAULT;
        cioESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__CIO, oldCio,
                    CIO_EDEFAULT, oldCioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCio() {
        return cioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCic() {
        return cic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCic( Double newCic ) {
        Double oldCic = cic;
        cic = newCic;
        boolean oldCicESet = cicESet;
        cicESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__CIC, oldCic, cic,
                    !oldCicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCic() {
        Double oldCic = cic;
        boolean oldCicESet = cicESet;
        cic = CIC_EDEFAULT;
        cicESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__CIC, oldCic,
                    CIC_EDEFAULT, oldCicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCic() {
        return cicESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCho() {
        return cho;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCho( Double newCho ) {
        Double oldCho = cho;
        cho = newCho;
        boolean oldChoESet = choESet;
        choESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__CHO, oldCho, cho,
                    !oldChoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCho() {
        Double oldCho = cho;
        boolean oldChoESet = choESet;
        cho = CHO_EDEFAULT;
        choESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__CHO, oldCho,
                    CHO_EDEFAULT, oldChoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCho() {
        return choESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTip() {
        return tip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTip( Double newTip ) {
        Double oldTip = tip;
        tip = newTip;
        boolean oldTipESet = tipESet;
        tipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TIP, oldTip, tip,
                    !oldTipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTip() {
        Double oldTip = tip;
        boolean oldTipESet = tipESet;
        tip = TIP_EDEFAULT;
        tipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TIP, oldTip,
                    TIP_EDEFAULT, oldTipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTip() {
        return tipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getChc() {
        return chc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChc( Double newChc ) {
        Double oldChc = chc;
        chc = newChc;
        boolean oldChcESet = chcESet;
        chcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__CHC, oldChc, chc,
                    !oldChcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChc() {
        Double oldChc = chc;
        boolean oldChcESet = chcESet;
        chc = CHC_EDEFAULT;
        chcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__CHC, oldChc,
                    CHC_EDEFAULT, oldChcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChc() {
        return chcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTlp() {
        return tlp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTlp( Double newTlp ) {
        Double oldTlp = tlp;
        tlp = newTlp;
        boolean oldTlpESet = tlpESet;
        tlpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TLP, oldTlp, tlp,
                    !oldTlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTlp() {
        Double oldTlp = tlp;
        boolean oldTlpESet = tlpESet;
        tlp = TLP_EDEFAULT;
        tlpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TLP, oldTlp,
                    TLP_EDEFAULT, oldTlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTlp() {
        return tlpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWmax1() {
        return wmax1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWmax1( Double newWmax1 ) {
        Double oldWmax1 = wmax1;
        wmax1 = newWmax1;
        boolean oldWmax1ESet = wmax1ESet;
        wmax1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WMAX1, oldWmax1, wmax1,
                    !oldWmax1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWmax1() {
        Double oldWmax1 = wmax1;
        boolean oldWmax1ESet = wmax1ESet;
        wmax1 = WMAX1_EDEFAULT;
        wmax1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WMAX1, oldWmax1,
                    WMAX1_EDEFAULT, oldWmax1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWmax1() {
        return wmax1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWmax2() {
        return wmax2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWmax2( Double newWmax2 ) {
        Double oldWmax2 = wmax2;
        wmax2 = newWmax2;
        boolean oldWmax2ESet = wmax2ESet;
        wmax2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WMAX2, oldWmax2, wmax2,
                    !oldWmax2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWmax2() {
        Double oldWmax2 = wmax2;
        boolean oldWmax2ESet = wmax2ESet;
        wmax2 = WMAX2_EDEFAULT;
        wmax2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WMAX2, oldWmax2,
                    WMAX2_EDEFAULT, oldWmax2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWmax2() {
        return wmax2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmax() {
        return pmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmax( Double newPmax ) {
        Double oldPmax = pmax;
        pmax = newPmax;
        boolean oldPmaxESet = pmaxESet;
        pmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__PMAX, oldPmax, pmax,
                    !oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmax() {
        Double oldPmax = pmax;
        boolean oldPmaxESet = pmaxESet;
        pmax = PMAX_EDEFAULT;
        pmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__PMAX, oldPmax,
                    PMAX_EDEFAULT, oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmax() {
        return pmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPrhmax() {
        return prhmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrhmax( Double newPrhmax ) {
        Double oldPrhmax = prhmax;
        prhmax = newPrhmax;
        boolean oldPrhmaxESet = prhmaxESet;
        prhmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__PRHMAX, oldPrhmax, prhmax,
                    !oldPrhmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrhmax() {
        Double oldPrhmax = prhmax;
        boolean oldPrhmaxESet = prhmaxESet;
        prhmax = PRHMAX_EDEFAULT;
        prhmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__PRHMAX, oldPrhmax,
                    PRHMAX_EDEFAULT, oldPrhmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrhmax() {
        return prhmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKhp() {
        return khp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKhp( Double newKhp ) {
        Double oldKhp = khp;
        khp = newKhp;
        boolean oldKhpESet = khpESet;
        khpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__KHP, oldKhp, khp,
                    !oldKhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKhp() {
        Double oldKhp = khp;
        boolean oldKhpESet = khpESet;
        khp = KHP_EDEFAULT;
        khpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__KHP, oldKhp,
                    KHP_EDEFAULT, oldKhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKhp() {
        return khpESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__MWBASE, oldMwbase, mwbase,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__MWBASE, oldMwbase,
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
    public Double getKlp() {
        return klp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKlp( Double newKlp ) {
        Double oldKlp = klp;
        klp = newKlp;
        boolean oldKlpESet = klpESet;
        klpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__KLP, oldKlp, klp,
                    !oldKlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKlp() {
        Double oldKlp = klp;
        boolean oldKlpESet = klpESet;
        klp = KLP_EDEFAULT;
        klpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__KLP, oldKlp,
                    KLP_EDEFAULT, oldKlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKlp() {
        return klpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHhpmax() {
        return hhpmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHhpmax( Double newHhpmax ) {
        Double oldHhpmax = hhpmax;
        hhpmax = newHhpmax;
        boolean oldHhpmaxESet = hhpmaxESet;
        hhpmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__HHPMAX, oldHhpmax, hhpmax,
                    !oldHhpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHhpmax() {
        Double oldHhpmax = hhpmax;
        boolean oldHhpmaxESet = hhpmaxESet;
        hhpmax = HHPMAX_EDEFAULT;
        hhpmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__HHPMAX, oldHhpmax,
                    HHPMAX_EDEFAULT, oldHhpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHhpmax() {
        return hhpmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKomegacor() {
        return komegacor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKomegacor( Double newKomegacor ) {
        Double oldKomegacor = komegacor;
        komegacor = newKomegacor;
        boolean oldKomegacorESet = komegacorESet;
        komegacorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__KOMEGACOR, oldKomegacor,
                    komegacor, !oldKomegacorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKomegacor() {
        Double oldKomegacor = komegacor;
        boolean oldKomegacorESet = komegacorESet;
        komegacor = KOMEGACOR_EDEFAULT;
        komegacorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__KOMEGACOR, oldKomegacor,
                    KOMEGACOR_EDEFAULT, oldKomegacorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKomegacor() {
        return komegacorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWwmin() {
        return wwmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWwmin( Double newWwmin ) {
        Double oldWwmin = wwmin;
        wwmin = newWwmin;
        boolean oldWwminESet = wwminESet;
        wwminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WWMIN, oldWwmin, wwmin,
                    !oldWwminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWwmin() {
        Double oldWwmin = wwmin;
        boolean oldWwminESet = wwminESet;
        wwmin = WWMIN_EDEFAULT;
        wwminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WWMIN, oldWwmin,
                    WWMIN_EDEFAULT, oldWwminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWwmin() {
        return wwminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWwmax() {
        return wwmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWwmax( Double newWwmax ) {
        Double oldWwmax = wwmax;
        wwmax = newWwmax;
        boolean oldWwmaxESet = wwmaxESet;
        wwmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WWMAX, oldWwmax, wwmax,
                    !oldWwmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWwmax() {
        Double oldWwmax = wwmax;
        boolean oldWwmaxESet = wwmaxESet;
        wwmax = WWMAX_EDEFAULT;
        wwmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WWMAX, oldWwmax,
                    WWMAX_EDEFAULT, oldWwmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWwmax() {
        return wwmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw() {
        return tw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw( Double newTw ) {
        Double oldTw = tw;
        tw = newTw;
        boolean oldTwESet = twESet;
        twESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TW, oldTw, tw,
                    !oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw() {
        Double oldTw = tw;
        boolean oldTwESet = twESet;
        tw = TW_EDEFAULT;
        twESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TW, oldTw, TW_EDEFAULT,
                    oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw() {
        return twESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTp() {
        return tp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTp( Double newTp ) {
        Double oldTp = tp;
        tp = newTp;
        boolean oldTpESet = tpESet;
        tpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TP, oldTp, tp,
                    !oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTp() {
        Double oldTp = tp;
        boolean oldTpESet = tpESet;
        tp = TP_EDEFAULT;
        tpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TP, oldTp, TP_EDEFAULT,
                    oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTp() {
        return tpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTf() {
        return tf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf( Double newTf ) {
        Double oldTf = tf;
        tf = newTf;
        boolean oldTfESet = tfESet;
        tfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TF, oldTf, tf,
                    !oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf() {
        Double oldTf = tf;
        boolean oldTfESet = tfESet;
        tf = TF_EDEFAULT;
        tfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TF, oldTf, TF_EDEFAULT,
                    oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf() {
        return tfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTvhp() {
        return tvhp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTvhp( Double newTvhp ) {
        Double oldTvhp = tvhp;
        tvhp = newTvhp;
        boolean oldTvhpESet = tvhpESet;
        tvhpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TVHP, oldTvhp, tvhp,
                    !oldTvhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTvhp() {
        Double oldTvhp = tvhp;
        boolean oldTvhpESet = tvhpESet;
        tvhp = TVHP_EDEFAULT;
        tvhpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TVHP, oldTvhp,
                    TVHP_EDEFAULT, oldTvhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTvhp() {
        return tvhpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTvip() {
        return tvip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTvip( Double newTvip ) {
        Double oldTvip = tvip;
        tvip = newTvip;
        boolean oldTvipESet = tvipESet;
        tvipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TVIP, oldTvip, tvip,
                    !oldTvipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTvip() {
        Double oldTvip = tvip;
        boolean oldTvipESet = tvipESet;
        tvip = TVIP_EDEFAULT;
        tvipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TVIP, oldTvip,
                    TVIP_EDEFAULT, oldTvipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTvip() {
        return tvipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSimx() {
        return simx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSimx( Double newSimx ) {
        Double oldSimx = simx;
        simx = newSimx;
        boolean oldSimxESet = simxESet;
        simxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__SIMX, oldSimx, simx,
                    !oldSimxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSimx() {
        Double oldSimx = simx;
        boolean oldSimxESet = simxESet;
        simx = SIMX_EDEFAULT;
        simxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__SIMX, oldSimx,
                    SIMX_EDEFAULT, oldSimxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSimx() {
        return simxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKfcor() {
        return kfcor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKfcor( Double newKfcor ) {
        Double oldKfcor = kfcor;
        kfcor = newKfcor;
        boolean oldKfcorESet = kfcorESet;
        kfcorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__KFCOR, oldKfcor, kfcor,
                    !oldKfcorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKfcor() {
        Double oldKfcor = kfcor;
        boolean oldKfcorESet = kfcorESet;
        kfcor = KFCOR_EDEFAULT;
        kfcorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__KFCOR, oldKfcor,
                    KFCOR_EDEFAULT, oldKfcorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKfcor() {
        return kfcorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWfmin() {
        return wfmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfmin( Double newWfmin ) {
        Double oldWfmin = wfmin;
        wfmin = newWfmin;
        boolean oldWfminESet = wfminESet;
        wfminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WFMIN, oldWfmin, wfmin,
                    !oldWfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfmin() {
        Double oldWfmin = wfmin;
        boolean oldWfminESet = wfminESet;
        wfmin = WFMIN_EDEFAULT;
        wfminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WFMIN, oldWfmin,
                    WFMIN_EDEFAULT, oldWfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfmin() {
        return wfminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getWfmax() {
        return wfmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfmax( Double newWfmax ) {
        Double oldWfmax = wfmax;
        wfmax = newWfmax;
        boolean oldWfmaxESet = wfmaxESet;
        wfmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__WFMAX, oldWfmax, wfmax,
                    !oldWfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfmax() {
        Double oldWfmax = wfmax;
        boolean oldWfmaxESet = wfmaxESet;
        wfmax = WFMAX_EDEFAULT;
        wfmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__WFMAX, oldWfmax,
                    WFMAX_EDEFAULT, oldWfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfmax() {
        return wfmaxESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__TB, oldTb, tb,
                    !oldTbESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__TB, oldTb, TB_EDEFAULT,
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
    public Double getKe() {
        return ke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe( Double newKe ) {
        Double oldKe = ke;
        ke = newKe;
        boolean oldKeESet = keESet;
        keESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_EU__KE, oldKe, ke,
                    !oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe() {
        Double oldKe = ke;
        boolean oldKeESet = keESet;
        ke = KE_EDEFAULT;
        keESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_EU__KE, oldKe, KE_EDEFAULT,
                    oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe() {
        return keESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_STEAM_EU__TRH:
            return getTrh();
        case CimPackage.GOV_STEAM_EU__DB1:
            return getDb1();
        case CimPackage.GOV_STEAM_EU__DB2:
            return getDb2();
        case CimPackage.GOV_STEAM_EU__TDP:
            return getTdp();
        case CimPackage.GOV_STEAM_EU__TFP:
            return getTfp();
        case CimPackage.GOV_STEAM_EU__TEN:
            return getTen();
        case CimPackage.GOV_STEAM_EU__THP:
            return getThp();
        case CimPackage.GOV_STEAM_EU__CIO:
            return getCio();
        case CimPackage.GOV_STEAM_EU__CIC:
            return getCic();
        case CimPackage.GOV_STEAM_EU__CHO:
            return getCho();
        case CimPackage.GOV_STEAM_EU__TIP:
            return getTip();
        case CimPackage.GOV_STEAM_EU__CHC:
            return getChc();
        case CimPackage.GOV_STEAM_EU__TLP:
            return getTlp();
        case CimPackage.GOV_STEAM_EU__WMAX1:
            return getWmax1();
        case CimPackage.GOV_STEAM_EU__WMAX2:
            return getWmax2();
        case CimPackage.GOV_STEAM_EU__PMAX:
            return getPmax();
        case CimPackage.GOV_STEAM_EU__PRHMAX:
            return getPrhmax();
        case CimPackage.GOV_STEAM_EU__KHP:
            return getKhp();
        case CimPackage.GOV_STEAM_EU__MWBASE:
            return getMwbase();
        case CimPackage.GOV_STEAM_EU__KLP:
            return getKlp();
        case CimPackage.GOV_STEAM_EU__HHPMAX:
            return getHhpmax();
        case CimPackage.GOV_STEAM_EU__KOMEGACOR:
            return getKomegacor();
        case CimPackage.GOV_STEAM_EU__WWMIN:
            return getWwmin();
        case CimPackage.GOV_STEAM_EU__WWMAX:
            return getWwmax();
        case CimPackage.GOV_STEAM_EU__TW:
            return getTw();
        case CimPackage.GOV_STEAM_EU__TP:
            return getTp();
        case CimPackage.GOV_STEAM_EU__TF:
            return getTf();
        case CimPackage.GOV_STEAM_EU__TVHP:
            return getTvhp();
        case CimPackage.GOV_STEAM_EU__TVIP:
            return getTvip();
        case CimPackage.GOV_STEAM_EU__SIMX:
            return getSimx();
        case CimPackage.GOV_STEAM_EU__KFCOR:
            return getKfcor();
        case CimPackage.GOV_STEAM_EU__WFMIN:
            return getWfmin();
        case CimPackage.GOV_STEAM_EU__WFMAX:
            return getWfmax();
        case CimPackage.GOV_STEAM_EU__TB:
            return getTb();
        case CimPackage.GOV_STEAM_EU__KE:
            return getKe();
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
        case CimPackage.GOV_STEAM_EU__TRH:
            setTrh( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__DB1:
            setDb1( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__DB2:
            setDb2( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TDP:
            setTdp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TFP:
            setTfp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TEN:
            setTen( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__THP:
            setThp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__CIO:
            setCio( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__CIC:
            setCic( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__CHO:
            setCho( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TIP:
            setTip( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__CHC:
            setChc( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TLP:
            setTlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WMAX1:
            setWmax1( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WMAX2:
            setWmax2( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__PMAX:
            setPmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__PRHMAX:
            setPrhmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__KHP:
            setKhp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__KLP:
            setKlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__HHPMAX:
            setHhpmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__KOMEGACOR:
            setKomegacor( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WWMIN:
            setWwmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WWMAX:
            setWwmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TW:
            setTw( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TP:
            setTp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TVHP:
            setTvhp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TVIP:
            setTvip( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__SIMX:
            setSimx( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__KFCOR:
            setKfcor( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WFMIN:
            setWfmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__WFMAX:
            setWfmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_EU__KE:
            setKe( ( Double ) newValue );
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
        case CimPackage.GOV_STEAM_EU__TRH:
            unsetTrh();
            return;
        case CimPackage.GOV_STEAM_EU__DB1:
            unsetDb1();
            return;
        case CimPackage.GOV_STEAM_EU__DB2:
            unsetDb2();
            return;
        case CimPackage.GOV_STEAM_EU__TDP:
            unsetTdp();
            return;
        case CimPackage.GOV_STEAM_EU__TFP:
            unsetTfp();
            return;
        case CimPackage.GOV_STEAM_EU__TEN:
            unsetTen();
            return;
        case CimPackage.GOV_STEAM_EU__THP:
            unsetThp();
            return;
        case CimPackage.GOV_STEAM_EU__CIO:
            unsetCio();
            return;
        case CimPackage.GOV_STEAM_EU__CIC:
            unsetCic();
            return;
        case CimPackage.GOV_STEAM_EU__CHO:
            unsetCho();
            return;
        case CimPackage.GOV_STEAM_EU__TIP:
            unsetTip();
            return;
        case CimPackage.GOV_STEAM_EU__CHC:
            unsetChc();
            return;
        case CimPackage.GOV_STEAM_EU__TLP:
            unsetTlp();
            return;
        case CimPackage.GOV_STEAM_EU__WMAX1:
            unsetWmax1();
            return;
        case CimPackage.GOV_STEAM_EU__WMAX2:
            unsetWmax2();
            return;
        case CimPackage.GOV_STEAM_EU__PMAX:
            unsetPmax();
            return;
        case CimPackage.GOV_STEAM_EU__PRHMAX:
            unsetPrhmax();
            return;
        case CimPackage.GOV_STEAM_EU__KHP:
            unsetKhp();
            return;
        case CimPackage.GOV_STEAM_EU__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_STEAM_EU__KLP:
            unsetKlp();
            return;
        case CimPackage.GOV_STEAM_EU__HHPMAX:
            unsetHhpmax();
            return;
        case CimPackage.GOV_STEAM_EU__KOMEGACOR:
            unsetKomegacor();
            return;
        case CimPackage.GOV_STEAM_EU__WWMIN:
            unsetWwmin();
            return;
        case CimPackage.GOV_STEAM_EU__WWMAX:
            unsetWwmax();
            return;
        case CimPackage.GOV_STEAM_EU__TW:
            unsetTw();
            return;
        case CimPackage.GOV_STEAM_EU__TP:
            unsetTp();
            return;
        case CimPackage.GOV_STEAM_EU__TF:
            unsetTf();
            return;
        case CimPackage.GOV_STEAM_EU__TVHP:
            unsetTvhp();
            return;
        case CimPackage.GOV_STEAM_EU__TVIP:
            unsetTvip();
            return;
        case CimPackage.GOV_STEAM_EU__SIMX:
            unsetSimx();
            return;
        case CimPackage.GOV_STEAM_EU__KFCOR:
            unsetKfcor();
            return;
        case CimPackage.GOV_STEAM_EU__WFMIN:
            unsetWfmin();
            return;
        case CimPackage.GOV_STEAM_EU__WFMAX:
            unsetWfmax();
            return;
        case CimPackage.GOV_STEAM_EU__TB:
            unsetTb();
            return;
        case CimPackage.GOV_STEAM_EU__KE:
            unsetKe();
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
        case CimPackage.GOV_STEAM_EU__TRH:
            return isSetTrh();
        case CimPackage.GOV_STEAM_EU__DB1:
            return isSetDb1();
        case CimPackage.GOV_STEAM_EU__DB2:
            return isSetDb2();
        case CimPackage.GOV_STEAM_EU__TDP:
            return isSetTdp();
        case CimPackage.GOV_STEAM_EU__TFP:
            return isSetTfp();
        case CimPackage.GOV_STEAM_EU__TEN:
            return isSetTen();
        case CimPackage.GOV_STEAM_EU__THP:
            return isSetThp();
        case CimPackage.GOV_STEAM_EU__CIO:
            return isSetCio();
        case CimPackage.GOV_STEAM_EU__CIC:
            return isSetCic();
        case CimPackage.GOV_STEAM_EU__CHO:
            return isSetCho();
        case CimPackage.GOV_STEAM_EU__TIP:
            return isSetTip();
        case CimPackage.GOV_STEAM_EU__CHC:
            return isSetChc();
        case CimPackage.GOV_STEAM_EU__TLP:
            return isSetTlp();
        case CimPackage.GOV_STEAM_EU__WMAX1:
            return isSetWmax1();
        case CimPackage.GOV_STEAM_EU__WMAX2:
            return isSetWmax2();
        case CimPackage.GOV_STEAM_EU__PMAX:
            return isSetPmax();
        case CimPackage.GOV_STEAM_EU__PRHMAX:
            return isSetPrhmax();
        case CimPackage.GOV_STEAM_EU__KHP:
            return isSetKhp();
        case CimPackage.GOV_STEAM_EU__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_STEAM_EU__KLP:
            return isSetKlp();
        case CimPackage.GOV_STEAM_EU__HHPMAX:
            return isSetHhpmax();
        case CimPackage.GOV_STEAM_EU__KOMEGACOR:
            return isSetKomegacor();
        case CimPackage.GOV_STEAM_EU__WWMIN:
            return isSetWwmin();
        case CimPackage.GOV_STEAM_EU__WWMAX:
            return isSetWwmax();
        case CimPackage.GOV_STEAM_EU__TW:
            return isSetTw();
        case CimPackage.GOV_STEAM_EU__TP:
            return isSetTp();
        case CimPackage.GOV_STEAM_EU__TF:
            return isSetTf();
        case CimPackage.GOV_STEAM_EU__TVHP:
            return isSetTvhp();
        case CimPackage.GOV_STEAM_EU__TVIP:
            return isSetTvip();
        case CimPackage.GOV_STEAM_EU__SIMX:
            return isSetSimx();
        case CimPackage.GOV_STEAM_EU__KFCOR:
            return isSetKfcor();
        case CimPackage.GOV_STEAM_EU__WFMIN:
            return isSetWfmin();
        case CimPackage.GOV_STEAM_EU__WFMAX:
            return isSetWfmax();
        case CimPackage.GOV_STEAM_EU__TB:
            return isSetTb();
        case CimPackage.GOV_STEAM_EU__KE:
            return isSetKe();
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
        result.append( " (trh: " );
        if( trhESet )
            result.append( trh );
        else
            result.append( "<unset>" );
        result.append( ", db1: " );
        if( db1ESet )
            result.append( db1 );
        else
            result.append( "<unset>" );
        result.append( ", db2: " );
        if( db2ESet )
            result.append( db2 );
        else
            result.append( "<unset>" );
        result.append( ", tdp: " );
        if( tdpESet )
            result.append( tdp );
        else
            result.append( "<unset>" );
        result.append( ", tfp: " );
        if( tfpESet )
            result.append( tfp );
        else
            result.append( "<unset>" );
        result.append( ", ten: " );
        if( tenESet )
            result.append( ten );
        else
            result.append( "<unset>" );
        result.append( ", thp: " );
        if( thpESet )
            result.append( thp );
        else
            result.append( "<unset>" );
        result.append( ", cio: " );
        if( cioESet )
            result.append( cio );
        else
            result.append( "<unset>" );
        result.append( ", cic: " );
        if( cicESet )
            result.append( cic );
        else
            result.append( "<unset>" );
        result.append( ", cho: " );
        if( choESet )
            result.append( cho );
        else
            result.append( "<unset>" );
        result.append( ", tip: " );
        if( tipESet )
            result.append( tip );
        else
            result.append( "<unset>" );
        result.append( ", chc: " );
        if( chcESet )
            result.append( chc );
        else
            result.append( "<unset>" );
        result.append( ", tlp: " );
        if( tlpESet )
            result.append( tlp );
        else
            result.append( "<unset>" );
        result.append( ", wmax1: " );
        if( wmax1ESet )
            result.append( wmax1 );
        else
            result.append( "<unset>" );
        result.append( ", wmax2: " );
        if( wmax2ESet )
            result.append( wmax2 );
        else
            result.append( "<unset>" );
        result.append( ", pmax: " );
        if( pmaxESet )
            result.append( pmax );
        else
            result.append( "<unset>" );
        result.append( ", prhmax: " );
        if( prhmaxESet )
            result.append( prhmax );
        else
            result.append( "<unset>" );
        result.append( ", khp: " );
        if( khpESet )
            result.append( khp );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", klp: " );
        if( klpESet )
            result.append( klp );
        else
            result.append( "<unset>" );
        result.append( ", hhpmax: " );
        if( hhpmaxESet )
            result.append( hhpmax );
        else
            result.append( "<unset>" );
        result.append( ", komegacor: " );
        if( komegacorESet )
            result.append( komegacor );
        else
            result.append( "<unset>" );
        result.append( ", wwmin: " );
        if( wwminESet )
            result.append( wwmin );
        else
            result.append( "<unset>" );
        result.append( ", wwmax: " );
        if( wwmaxESet )
            result.append( wwmax );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tvhp: " );
        if( tvhpESet )
            result.append( tvhp );
        else
            result.append( "<unset>" );
        result.append( ", tvip: " );
        if( tvipESet )
            result.append( tvip );
        else
            result.append( "<unset>" );
        result.append( ", simx: " );
        if( simxESet )
            result.append( simx );
        else
            result.append( "<unset>" );
        result.append( ", kfcor: " );
        if( kfcorESet )
            result.append( kfcor );
        else
            result.append( "<unset>" );
        result.append( ", wfmin: " );
        if( wfminESet )
            result.append( wfmin );
        else
            result.append( "<unset>" );
        result.append( ", wfmax: " );
        if( wfmaxESet )
            result.append( wfmax );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovSteamEUImpl
