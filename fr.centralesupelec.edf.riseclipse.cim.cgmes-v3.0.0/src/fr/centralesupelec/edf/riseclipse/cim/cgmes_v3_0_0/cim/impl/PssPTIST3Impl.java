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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss PTIST3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getAthres <em>Athres</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getDtp <em>Dtp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getNcr <em>Ncr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getNcl <em>Ncl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getNav <em>Nav</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getDtf <em>Dtf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getDtc <em>Dtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getIsw <em>Isw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getDl <em>Dl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA3 <em>A3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA0 <em>A0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA5 <em>A5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getA4 <em>A4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getAl <em>Al</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB0 <em>B0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB4 <em>B4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB3 <em>B3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB2 <em>B2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB1 <em>B1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getB5 <em>B5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST3Impl#getLthres <em>Lthres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssPTIST3Impl extends PowerSystemStabilizerDynamicsImpl implements PssPTIST3 {
    /**
     * The default value of the '{@link #getAthres() <em>Athres</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAthres()
     * @generated
     * @ordered
     */
    protected static final Double ATHRES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAthres() <em>Athres</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAthres()
     * @generated
     * @ordered
     */
    protected Double athres = ATHRES_EDEFAULT;

    /**
     * This is true if the Athres attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean athresESet;

    /**
     * The default value of the '{@link #getDtp() <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtp()
     * @generated
     * @ordered
     */
    protected static final Double DTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtp() <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtp()
     * @generated
     * @ordered
     */
    protected Double dtp = DTP_EDEFAULT;

    /**
     * This is true if the Dtp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtpESet;

    /**
     * The default value of the '{@link #getNcr() <em>Ncr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNcr()
     * @generated
     * @ordered
     */
    protected static final Double NCR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNcr() <em>Ncr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNcr()
     * @generated
     * @ordered
     */
    protected Double ncr = NCR_EDEFAULT;

    /**
     * This is true if the Ncr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ncrESet;

    /**
     * The default value of the '{@link #getNcl() <em>Ncl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNcl()
     * @generated
     * @ordered
     */
    protected static final Double NCL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNcl() <em>Ncl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNcl()
     * @generated
     * @ordered
     */
    protected Double ncl = NCL_EDEFAULT;

    /**
     * This is true if the Ncl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nclESet;

    /**
     * The default value of the '{@link #getNav() <em>Nav</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNav()
     * @generated
     * @ordered
     */
    protected static final Double NAV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNav() <em>Nav</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNav()
     * @generated
     * @ordered
     */
    protected Double nav = NAV_EDEFAULT;

    /**
     * This is true if the Nav attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean navESet;

    /**
     * The default value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected static final Double K_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected Double k = K_EDEFAULT;

    /**
     * This is true if the K attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kESet;

    /**
     * The default value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected static final Double M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected Double m = M_EDEFAULT;

    /**
     * This is true if the M attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mESet;

    /**
     * The default value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected static final Double PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected Double pmin = PMIN_EDEFAULT;

    /**
     * This is true if the Pmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pminESet;

    /**
     * The default value of the '{@link #getDtf() <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtf()
     * @generated
     * @ordered
     */
    protected static final Double DTF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtf() <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtf()
     * @generated
     * @ordered
     */
    protected Double dtf = DTF_EDEFAULT;

    /**
     * This is true if the Dtf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtfESet;

    /**
     * The default value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected static final Double DTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected Double dtc = DTC_EDEFAULT;

    /**
     * This is true if the Dtc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtcESet;

    /**
     * The default value of the '{@link #getIsw() <em>Isw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsw()
     * @generated
     * @ordered
     */
    protected static final Boolean ISW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsw() <em>Isw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsw()
     * @generated
     * @ordered
     */
    protected Boolean isw = ISW_EDEFAULT;

    /**
     * This is true if the Isw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iswESet;

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
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Double T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Double t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Double T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Double t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected static final Double T6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected Double t6 = T6_EDEFAULT;

    /**
     * This is true if the T6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t6ESet;

    /**
     * The default value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected static final Double T5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected Double t5 = T5_EDEFAULT;

    /**
     * This is true if the T5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5ESet;

    /**
     * The default value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected static final Double T4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected Double t4 = T4_EDEFAULT;

    /**
     * This is true if the T4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4ESet;

    /**
     * The default value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected static final Double T3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected Double t3 = T3_EDEFAULT;

    /**
     * This is true if the T3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3ESet;

    /**
     * The default value of the '{@link #getDl() <em>Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDl()
     * @generated
     * @ordered
     */
    protected static final Double DL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDl() <em>Dl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDl()
     * @generated
     * @ordered
     */
    protected Double dl = DL_EDEFAULT;

    /**
     * This is true if the Dl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dlESet;

    /**
     * The default value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected static final Double A3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected Double a3 = A3_EDEFAULT;

    /**
     * This is true if the A3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a3ESet;

    /**
     * The default value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected static final Double A2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected Double a2 = A2_EDEFAULT;

    /**
     * This is true if the A2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a2ESet;

    /**
     * The default value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected static final Double A1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected Double a1 = A1_EDEFAULT;

    /**
     * This is true if the A1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a1ESet;

    /**
     * The default value of the '{@link #getA0() <em>A0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA0()
     * @generated
     * @ordered
     */
    protected static final Double A0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA0() <em>A0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA0()
     * @generated
     * @ordered
     */
    protected Double a0 = A0_EDEFAULT;

    /**
     * This is true if the A0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a0ESet;

    /**
     * The default value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected static final Double A5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected Double a5 = A5_EDEFAULT;

    /**
     * This is true if the A5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a5ESet;

    /**
     * The default value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected static final Double A4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected Double a4 = A4_EDEFAULT;

    /**
     * This is true if the A4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a4ESet;

    /**
     * The default value of the '{@link #getAl() <em>Al</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAl()
     * @generated
     * @ordered
     */
    protected static final Double AL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAl() <em>Al</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAl()
     * @generated
     * @ordered
     */
    protected Double al = AL_EDEFAULT;

    /**
     * This is true if the Al attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alESet;

    /**
     * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected static final Double B0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected Double b0 = B0_EDEFAULT;

    /**
     * This is true if the B0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0ESet;

    /**
     * The default value of the '{@link #getB4() <em>B4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB4()
     * @generated
     * @ordered
     */
    protected static final Double B4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB4() <em>B4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB4()
     * @generated
     * @ordered
     */
    protected Double b4 = B4_EDEFAULT;

    /**
     * This is true if the B4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b4ESet;

    /**
     * The default value of the '{@link #getB3() <em>B3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB3()
     * @generated
     * @ordered
     */
    protected static final Double B3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB3() <em>B3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB3()
     * @generated
     * @ordered
     */
    protected Double b3 = B3_EDEFAULT;

    /**
     * This is true if the B3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b3ESet;

    /**
     * The default value of the '{@link #getB2() <em>B2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB2()
     * @generated
     * @ordered
     */
    protected static final Double B2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB2() <em>B2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB2()
     * @generated
     * @ordered
     */
    protected Double b2 = B2_EDEFAULT;

    /**
     * This is true if the B2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b2ESet;

    /**
     * The default value of the '{@link #getB1() <em>B1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB1()
     * @generated
     * @ordered
     */
    protected static final Double B1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB1() <em>B1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB1()
     * @generated
     * @ordered
     */
    protected Double b1 = B1_EDEFAULT;

    /**
     * This is true if the B1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b1ESet;

    /**
     * The default value of the '{@link #getB5() <em>B5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB5()
     * @generated
     * @ordered
     */
    protected static final Double B5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB5() <em>B5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB5()
     * @generated
     * @ordered
     */
    protected Double b5 = B5_EDEFAULT;

    /**
     * This is true if the B5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b5ESet;

    /**
     * The default value of the '{@link #getLthres() <em>Lthres</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLthres()
     * @generated
     * @ordered
     */
    protected static final Double LTHRES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLthres() <em>Lthres</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLthres()
     * @generated
     * @ordered
     */
    protected Double lthres = LTHRES_EDEFAULT;

    /**
     * This is true if the Lthres attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lthresESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssPTIST3Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssPTIST3();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAthres() {
        return athres;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAthres( Double newAthres ) {
        Double oldAthres = athres;
        athres = newAthres;
        boolean oldAthresESet = athresESet;
        athresESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__ATHRES, oldAthres, athres,
                    !oldAthresESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAthres() {
        Double oldAthres = athres;
        boolean oldAthresESet = athresESet;
        athres = ATHRES_EDEFAULT;
        athresESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__ATHRES, oldAthres,
                    ATHRES_EDEFAULT, oldAthresESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAthres() {
        return athresESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDtp() {
        return dtp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtp( Double newDtp ) {
        Double oldDtp = dtp;
        dtp = newDtp;
        boolean oldDtpESet = dtpESet;
        dtpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__DTP, oldDtp, dtp,
                    !oldDtpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtp() {
        Double oldDtp = dtp;
        boolean oldDtpESet = dtpESet;
        dtp = DTP_EDEFAULT;
        dtpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__DTP, oldDtp, DTP_EDEFAULT,
                    oldDtpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtp() {
        return dtpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNcr() {
        return ncr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNcr( Double newNcr ) {
        Double oldNcr = ncr;
        ncr = newNcr;
        boolean oldNcrESet = ncrESet;
        ncrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__NCR, oldNcr, ncr,
                    !oldNcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNcr() {
        Double oldNcr = ncr;
        boolean oldNcrESet = ncrESet;
        ncr = NCR_EDEFAULT;
        ncrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__NCR, oldNcr, NCR_EDEFAULT,
                    oldNcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNcr() {
        return ncrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNcl() {
        return ncl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNcl( Double newNcl ) {
        Double oldNcl = ncl;
        ncl = newNcl;
        boolean oldNclESet = nclESet;
        nclESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__NCL, oldNcl, ncl,
                    !oldNclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNcl() {
        Double oldNcl = ncl;
        boolean oldNclESet = nclESet;
        ncl = NCL_EDEFAULT;
        nclESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__NCL, oldNcl, NCL_EDEFAULT,
                    oldNclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNcl() {
        return nclESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNav() {
        return nav;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNav( Double newNav ) {
        Double oldNav = nav;
        nav = newNav;
        boolean oldNavESet = navESet;
        navESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__NAV, oldNav, nav,
                    !oldNavESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNav() {
        Double oldNav = nav;
        boolean oldNavESet = navESet;
        nav = NAV_EDEFAULT;
        navESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__NAV, oldNav, NAV_EDEFAULT,
                    oldNavESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNav() {
        return navESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK() {
        return k;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK( Double newK ) {
        Double oldK = k;
        k = newK;
        boolean oldKESet = kESet;
        kESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__K, oldK, k, !oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK() {
        Double oldK = k;
        boolean oldKESet = kESet;
        k = K_EDEFAULT;
        kESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__K, oldK, K_EDEFAULT,
                    oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK() {
        return kESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getM() {
        return m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setM( Double newM ) {
        Double oldM = m;
        m = newM;
        boolean oldMESet = mESet;
        mESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__M, oldM, m, !oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetM() {
        Double oldM = m;
        boolean oldMESet = mESet;
        m = M_EDEFAULT;
        mESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__M, oldM, M_EDEFAULT,
                    oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetM() {
        return mESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmin() {
        return pmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmin( Double newPmin ) {
        Double oldPmin = pmin;
        pmin = newPmin;
        boolean oldPminESet = pminESet;
        pminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__PMIN, oldPmin, pmin,
                    !oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmin() {
        Double oldPmin = pmin;
        boolean oldPminESet = pminESet;
        pmin = PMIN_EDEFAULT;
        pminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__PMIN, oldPmin,
                    PMIN_EDEFAULT, oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmin() {
        return pminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDtf() {
        return dtf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtf( Double newDtf ) {
        Double oldDtf = dtf;
        dtf = newDtf;
        boolean oldDtfESet = dtfESet;
        dtfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__DTF, oldDtf, dtf,
                    !oldDtfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtf() {
        Double oldDtf = dtf;
        boolean oldDtfESet = dtfESet;
        dtf = DTF_EDEFAULT;
        dtfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__DTF, oldDtf, DTF_EDEFAULT,
                    oldDtfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtf() {
        return dtfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDtc() {
        return dtc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtc( Double newDtc ) {
        Double oldDtc = dtc;
        dtc = newDtc;
        boolean oldDtcESet = dtcESet;
        dtcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__DTC, oldDtc, dtc,
                    !oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtc() {
        Double oldDtc = dtc;
        boolean oldDtcESet = dtcESet;
        dtc = DTC_EDEFAULT;
        dtcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__DTC, oldDtc, DTC_EDEFAULT,
                    oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtc() {
        return dtcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsw() {
        return isw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsw( Boolean newIsw ) {
        Boolean oldIsw = isw;
        isw = newIsw;
        boolean oldIswESet = iswESet;
        iswESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__ISW, oldIsw, isw,
                    !oldIswESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsw() {
        Boolean oldIsw = isw;
        boolean oldIswESet = iswESet;
        isw = ISW_EDEFAULT;
        iswESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__ISW, oldIsw, ISW_EDEFAULT,
                    oldIswESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsw() {
        return iswESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__TF, oldTf, tf,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__TF, oldTf, TF_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__TP, oldTp, tp,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__TP, oldTp, TP_EDEFAULT,
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
    public Double getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Double newT2 ) {
        Double oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T2, oldT2, t2,
                    !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Double oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T2, oldT2, T2_EDEFAULT,
                    oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Double newT1 ) {
        Double oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T1, oldT1, t1,
                    !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Double oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T1, oldT1, T1_EDEFAULT,
                    oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT6() {
        return t6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT6( Double newT6 ) {
        Double oldT6 = t6;
        t6 = newT6;
        boolean oldT6ESet = t6ESet;
        t6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T6, oldT6, t6,
                    !oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT6() {
        Double oldT6 = t6;
        boolean oldT6ESet = t6ESet;
        t6 = T6_EDEFAULT;
        t6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T6, oldT6, T6_EDEFAULT,
                    oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT6() {
        return t6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT5() {
        return t5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5( Double newT5 ) {
        Double oldT5 = t5;
        t5 = newT5;
        boolean oldT5ESet = t5ESet;
        t5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T5, oldT5, t5,
                    !oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5() {
        Double oldT5 = t5;
        boolean oldT5ESet = t5ESet;
        t5 = T5_EDEFAULT;
        t5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T5, oldT5, T5_EDEFAULT,
                    oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5() {
        return t5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4() {
        return t4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4( Double newT4 ) {
        Double oldT4 = t4;
        t4 = newT4;
        boolean oldT4ESet = t4ESet;
        t4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T4, oldT4, t4,
                    !oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4() {
        Double oldT4 = t4;
        boolean oldT4ESet = t4ESet;
        t4 = T4_EDEFAULT;
        t4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T4, oldT4, T4_EDEFAULT,
                    oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4() {
        return t4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT3() {
        return t3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3( Double newT3 ) {
        Double oldT3 = t3;
        t3 = newT3;
        boolean oldT3ESet = t3ESet;
        t3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__T3, oldT3, t3,
                    !oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3() {
        Double oldT3 = t3;
        boolean oldT3ESet = t3ESet;
        t3 = T3_EDEFAULT;
        t3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__T3, oldT3, T3_EDEFAULT,
                    oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3() {
        return t3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDl() {
        return dl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDl( Double newDl ) {
        Double oldDl = dl;
        dl = newDl;
        boolean oldDlESet = dlESet;
        dlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__DL, oldDl, dl,
                    !oldDlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDl() {
        Double oldDl = dl;
        boolean oldDlESet = dlESet;
        dl = DL_EDEFAULT;
        dlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__DL, oldDl, DL_EDEFAULT,
                    oldDlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDl() {
        return dlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA3() {
        return a3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA3( Double newA3 ) {
        Double oldA3 = a3;
        a3 = newA3;
        boolean oldA3ESet = a3ESet;
        a3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A3, oldA3, a3,
                    !oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA3() {
        Double oldA3 = a3;
        boolean oldA3ESet = a3ESet;
        a3 = A3_EDEFAULT;
        a3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A3, oldA3, A3_EDEFAULT,
                    oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA3() {
        return a3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA2() {
        return a2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA2( Double newA2 ) {
        Double oldA2 = a2;
        a2 = newA2;
        boolean oldA2ESet = a2ESet;
        a2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A2, oldA2, a2,
                    !oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA2() {
        Double oldA2 = a2;
        boolean oldA2ESet = a2ESet;
        a2 = A2_EDEFAULT;
        a2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A2, oldA2, A2_EDEFAULT,
                    oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA2() {
        return a2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA1() {
        return a1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA1( Double newA1 ) {
        Double oldA1 = a1;
        a1 = newA1;
        boolean oldA1ESet = a1ESet;
        a1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A1, oldA1, a1,
                    !oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA1() {
        Double oldA1 = a1;
        boolean oldA1ESet = a1ESet;
        a1 = A1_EDEFAULT;
        a1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A1, oldA1, A1_EDEFAULT,
                    oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA1() {
        return a1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA0() {
        return a0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA0( Double newA0 ) {
        Double oldA0 = a0;
        a0 = newA0;
        boolean oldA0ESet = a0ESet;
        a0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A0, oldA0, a0,
                    !oldA0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA0() {
        Double oldA0 = a0;
        boolean oldA0ESet = a0ESet;
        a0 = A0_EDEFAULT;
        a0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A0, oldA0, A0_EDEFAULT,
                    oldA0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA0() {
        return a0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA5() {
        return a5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA5( Double newA5 ) {
        Double oldA5 = a5;
        a5 = newA5;
        boolean oldA5ESet = a5ESet;
        a5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A5, oldA5, a5,
                    !oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA5() {
        Double oldA5 = a5;
        boolean oldA5ESet = a5ESet;
        a5 = A5_EDEFAULT;
        a5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A5, oldA5, A5_EDEFAULT,
                    oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA5() {
        return a5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA4() {
        return a4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA4( Double newA4 ) {
        Double oldA4 = a4;
        a4 = newA4;
        boolean oldA4ESet = a4ESet;
        a4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__A4, oldA4, a4,
                    !oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA4() {
        Double oldA4 = a4;
        boolean oldA4ESet = a4ESet;
        a4 = A4_EDEFAULT;
        a4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__A4, oldA4, A4_EDEFAULT,
                    oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA4() {
        return a4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAl() {
        return al;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAl( Double newAl ) {
        Double oldAl = al;
        al = newAl;
        boolean oldAlESet = alESet;
        alESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__AL, oldAl, al,
                    !oldAlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAl() {
        Double oldAl = al;
        boolean oldAlESet = alESet;
        al = AL_EDEFAULT;
        alESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__AL, oldAl, AL_EDEFAULT,
                    oldAlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAl() {
        return alESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB0() {
        return b0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0( Double newB0 ) {
        Double oldB0 = b0;
        b0 = newB0;
        boolean oldB0ESet = b0ESet;
        b0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B0, oldB0, b0,
                    !oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0() {
        Double oldB0 = b0;
        boolean oldB0ESet = b0ESet;
        b0 = B0_EDEFAULT;
        b0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B0, oldB0, B0_EDEFAULT,
                    oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0() {
        return b0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB4() {
        return b4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB4( Double newB4 ) {
        Double oldB4 = b4;
        b4 = newB4;
        boolean oldB4ESet = b4ESet;
        b4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B4, oldB4, b4,
                    !oldB4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB4() {
        Double oldB4 = b4;
        boolean oldB4ESet = b4ESet;
        b4 = B4_EDEFAULT;
        b4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B4, oldB4, B4_EDEFAULT,
                    oldB4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB4() {
        return b4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB3() {
        return b3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB3( Double newB3 ) {
        Double oldB3 = b3;
        b3 = newB3;
        boolean oldB3ESet = b3ESet;
        b3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B3, oldB3, b3,
                    !oldB3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB3() {
        Double oldB3 = b3;
        boolean oldB3ESet = b3ESet;
        b3 = B3_EDEFAULT;
        b3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B3, oldB3, B3_EDEFAULT,
                    oldB3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB3() {
        return b3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB2() {
        return b2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB2( Double newB2 ) {
        Double oldB2 = b2;
        b2 = newB2;
        boolean oldB2ESet = b2ESet;
        b2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B2, oldB2, b2,
                    !oldB2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB2() {
        Double oldB2 = b2;
        boolean oldB2ESet = b2ESet;
        b2 = B2_EDEFAULT;
        b2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B2, oldB2, B2_EDEFAULT,
                    oldB2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB2() {
        return b2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB1() {
        return b1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB1( Double newB1 ) {
        Double oldB1 = b1;
        b1 = newB1;
        boolean oldB1ESet = b1ESet;
        b1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B1, oldB1, b1,
                    !oldB1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB1() {
        Double oldB1 = b1;
        boolean oldB1ESet = b1ESet;
        b1 = B1_EDEFAULT;
        b1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B1, oldB1, B1_EDEFAULT,
                    oldB1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB1() {
        return b1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB5() {
        return b5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB5( Double newB5 ) {
        Double oldB5 = b5;
        b5 = newB5;
        boolean oldB5ESet = b5ESet;
        b5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__B5, oldB5, b5,
                    !oldB5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB5() {
        Double oldB5 = b5;
        boolean oldB5ESet = b5ESet;
        b5 = B5_EDEFAULT;
        b5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__B5, oldB5, B5_EDEFAULT,
                    oldB5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB5() {
        return b5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLthres() {
        return lthres;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLthres( Double newLthres ) {
        Double oldLthres = lthres;
        lthres = newLthres;
        boolean oldLthresESet = lthresESet;
        lthresESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST3__LTHRES, oldLthres, lthres,
                    !oldLthresESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLthres() {
        Double oldLthres = lthres;
        boolean oldLthresESet = lthresESet;
        lthres = LTHRES_EDEFAULT;
        lthresESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST3__LTHRES, oldLthres,
                    LTHRES_EDEFAULT, oldLthresESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLthres() {
        return lthresESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_PTIST3__ATHRES:
            return getAthres();
        case CimPackage.PSS_PTIST3__DTP:
            return getDtp();
        case CimPackage.PSS_PTIST3__NCR:
            return getNcr();
        case CimPackage.PSS_PTIST3__NCL:
            return getNcl();
        case CimPackage.PSS_PTIST3__NAV:
            return getNav();
        case CimPackage.PSS_PTIST3__K:
            return getK();
        case CimPackage.PSS_PTIST3__M:
            return getM();
        case CimPackage.PSS_PTIST3__PMIN:
            return getPmin();
        case CimPackage.PSS_PTIST3__DTF:
            return getDtf();
        case CimPackage.PSS_PTIST3__DTC:
            return getDtc();
        case CimPackage.PSS_PTIST3__ISW:
            return getIsw();
        case CimPackage.PSS_PTIST3__TF:
            return getTf();
        case CimPackage.PSS_PTIST3__TP:
            return getTp();
        case CimPackage.PSS_PTIST3__T2:
            return getT2();
        case CimPackage.PSS_PTIST3__T1:
            return getT1();
        case CimPackage.PSS_PTIST3__T6:
            return getT6();
        case CimPackage.PSS_PTIST3__T5:
            return getT5();
        case CimPackage.PSS_PTIST3__T4:
            return getT4();
        case CimPackage.PSS_PTIST3__T3:
            return getT3();
        case CimPackage.PSS_PTIST3__DL:
            return getDl();
        case CimPackage.PSS_PTIST3__A3:
            return getA3();
        case CimPackage.PSS_PTIST3__A2:
            return getA2();
        case CimPackage.PSS_PTIST3__A1:
            return getA1();
        case CimPackage.PSS_PTIST3__A0:
            return getA0();
        case CimPackage.PSS_PTIST3__A5:
            return getA5();
        case CimPackage.PSS_PTIST3__A4:
            return getA4();
        case CimPackage.PSS_PTIST3__AL:
            return getAl();
        case CimPackage.PSS_PTIST3__B0:
            return getB0();
        case CimPackage.PSS_PTIST3__B4:
            return getB4();
        case CimPackage.PSS_PTIST3__B3:
            return getB3();
        case CimPackage.PSS_PTIST3__B2:
            return getB2();
        case CimPackage.PSS_PTIST3__B1:
            return getB1();
        case CimPackage.PSS_PTIST3__B5:
            return getB5();
        case CimPackage.PSS_PTIST3__LTHRES:
            return getLthres();
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
        case CimPackage.PSS_PTIST3__ATHRES:
            setAthres( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__DTP:
            setDtp( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__NCR:
            setNcr( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__NCL:
            setNcl( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__NAV:
            setNav( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__K:
            setK( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__M:
            setM( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__PMIN:
            setPmin( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__DTF:
            setDtf( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__DTC:
            setDtc( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__ISW:
            setIsw( ( Boolean ) newValue );
            return;
        case CimPackage.PSS_PTIST3__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__TP:
            setTp( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T6:
            setT6( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T5:
            setT5( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__DL:
            setDl( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A3:
            setA3( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A2:
            setA2( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A1:
            setA1( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A0:
            setA0( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A5:
            setA5( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__A4:
            setA4( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__AL:
            setAl( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B0:
            setB0( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B4:
            setB4( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B3:
            setB3( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B2:
            setB2( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B1:
            setB1( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__B5:
            setB5( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST3__LTHRES:
            setLthres( ( Double ) newValue );
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
        case CimPackage.PSS_PTIST3__ATHRES:
            unsetAthres();
            return;
        case CimPackage.PSS_PTIST3__DTP:
            unsetDtp();
            return;
        case CimPackage.PSS_PTIST3__NCR:
            unsetNcr();
            return;
        case CimPackage.PSS_PTIST3__NCL:
            unsetNcl();
            return;
        case CimPackage.PSS_PTIST3__NAV:
            unsetNav();
            return;
        case CimPackage.PSS_PTIST3__K:
            unsetK();
            return;
        case CimPackage.PSS_PTIST3__M:
            unsetM();
            return;
        case CimPackage.PSS_PTIST3__PMIN:
            unsetPmin();
            return;
        case CimPackage.PSS_PTIST3__DTF:
            unsetDtf();
            return;
        case CimPackage.PSS_PTIST3__DTC:
            unsetDtc();
            return;
        case CimPackage.PSS_PTIST3__ISW:
            unsetIsw();
            return;
        case CimPackage.PSS_PTIST3__TF:
            unsetTf();
            return;
        case CimPackage.PSS_PTIST3__TP:
            unsetTp();
            return;
        case CimPackage.PSS_PTIST3__T2:
            unsetT2();
            return;
        case CimPackage.PSS_PTIST3__T1:
            unsetT1();
            return;
        case CimPackage.PSS_PTIST3__T6:
            unsetT6();
            return;
        case CimPackage.PSS_PTIST3__T5:
            unsetT5();
            return;
        case CimPackage.PSS_PTIST3__T4:
            unsetT4();
            return;
        case CimPackage.PSS_PTIST3__T3:
            unsetT3();
            return;
        case CimPackage.PSS_PTIST3__DL:
            unsetDl();
            return;
        case CimPackage.PSS_PTIST3__A3:
            unsetA3();
            return;
        case CimPackage.PSS_PTIST3__A2:
            unsetA2();
            return;
        case CimPackage.PSS_PTIST3__A1:
            unsetA1();
            return;
        case CimPackage.PSS_PTIST3__A0:
            unsetA0();
            return;
        case CimPackage.PSS_PTIST3__A5:
            unsetA5();
            return;
        case CimPackage.PSS_PTIST3__A4:
            unsetA4();
            return;
        case CimPackage.PSS_PTIST3__AL:
            unsetAl();
            return;
        case CimPackage.PSS_PTIST3__B0:
            unsetB0();
            return;
        case CimPackage.PSS_PTIST3__B4:
            unsetB4();
            return;
        case CimPackage.PSS_PTIST3__B3:
            unsetB3();
            return;
        case CimPackage.PSS_PTIST3__B2:
            unsetB2();
            return;
        case CimPackage.PSS_PTIST3__B1:
            unsetB1();
            return;
        case CimPackage.PSS_PTIST3__B5:
            unsetB5();
            return;
        case CimPackage.PSS_PTIST3__LTHRES:
            unsetLthres();
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
        case CimPackage.PSS_PTIST3__ATHRES:
            return isSetAthres();
        case CimPackage.PSS_PTIST3__DTP:
            return isSetDtp();
        case CimPackage.PSS_PTIST3__NCR:
            return isSetNcr();
        case CimPackage.PSS_PTIST3__NCL:
            return isSetNcl();
        case CimPackage.PSS_PTIST3__NAV:
            return isSetNav();
        case CimPackage.PSS_PTIST3__K:
            return isSetK();
        case CimPackage.PSS_PTIST3__M:
            return isSetM();
        case CimPackage.PSS_PTIST3__PMIN:
            return isSetPmin();
        case CimPackage.PSS_PTIST3__DTF:
            return isSetDtf();
        case CimPackage.PSS_PTIST3__DTC:
            return isSetDtc();
        case CimPackage.PSS_PTIST3__ISW:
            return isSetIsw();
        case CimPackage.PSS_PTIST3__TF:
            return isSetTf();
        case CimPackage.PSS_PTIST3__TP:
            return isSetTp();
        case CimPackage.PSS_PTIST3__T2:
            return isSetT2();
        case CimPackage.PSS_PTIST3__T1:
            return isSetT1();
        case CimPackage.PSS_PTIST3__T6:
            return isSetT6();
        case CimPackage.PSS_PTIST3__T5:
            return isSetT5();
        case CimPackage.PSS_PTIST3__T4:
            return isSetT4();
        case CimPackage.PSS_PTIST3__T3:
            return isSetT3();
        case CimPackage.PSS_PTIST3__DL:
            return isSetDl();
        case CimPackage.PSS_PTIST3__A3:
            return isSetA3();
        case CimPackage.PSS_PTIST3__A2:
            return isSetA2();
        case CimPackage.PSS_PTIST3__A1:
            return isSetA1();
        case CimPackage.PSS_PTIST3__A0:
            return isSetA0();
        case CimPackage.PSS_PTIST3__A5:
            return isSetA5();
        case CimPackage.PSS_PTIST3__A4:
            return isSetA4();
        case CimPackage.PSS_PTIST3__AL:
            return isSetAl();
        case CimPackage.PSS_PTIST3__B0:
            return isSetB0();
        case CimPackage.PSS_PTIST3__B4:
            return isSetB4();
        case CimPackage.PSS_PTIST3__B3:
            return isSetB3();
        case CimPackage.PSS_PTIST3__B2:
            return isSetB2();
        case CimPackage.PSS_PTIST3__B1:
            return isSetB1();
        case CimPackage.PSS_PTIST3__B5:
            return isSetB5();
        case CimPackage.PSS_PTIST3__LTHRES:
            return isSetLthres();
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
        result.append( " (athres: " );
        if( athresESet )
            result.append( athres );
        else
            result.append( "<unset>" );
        result.append( ", dtp: " );
        if( dtpESet )
            result.append( dtp );
        else
            result.append( "<unset>" );
        result.append( ", ncr: " );
        if( ncrESet )
            result.append( ncr );
        else
            result.append( "<unset>" );
        result.append( ", ncl: " );
        if( nclESet )
            result.append( ncl );
        else
            result.append( "<unset>" );
        result.append( ", nav: " );
        if( navESet )
            result.append( nav );
        else
            result.append( "<unset>" );
        result.append( ", k: " );
        if( kESet )
            result.append( k );
        else
            result.append( "<unset>" );
        result.append( ", m: " );
        if( mESet )
            result.append( m );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", dtf: " );
        if( dtfESet )
            result.append( dtf );
        else
            result.append( "<unset>" );
        result.append( ", dtc: " );
        if( dtcESet )
            result.append( dtc );
        else
            result.append( "<unset>" );
        result.append( ", isw: " );
        if( iswESet )
            result.append( isw );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", dl: " );
        if( dlESet )
            result.append( dl );
        else
            result.append( "<unset>" );
        result.append( ", a3: " );
        if( a3ESet )
            result.append( a3 );
        else
            result.append( "<unset>" );
        result.append( ", a2: " );
        if( a2ESet )
            result.append( a2 );
        else
            result.append( "<unset>" );
        result.append( ", a1: " );
        if( a1ESet )
            result.append( a1 );
        else
            result.append( "<unset>" );
        result.append( ", a0: " );
        if( a0ESet )
            result.append( a0 );
        else
            result.append( "<unset>" );
        result.append( ", a5: " );
        if( a5ESet )
            result.append( a5 );
        else
            result.append( "<unset>" );
        result.append( ", a4: " );
        if( a4ESet )
            result.append( a4 );
        else
            result.append( "<unset>" );
        result.append( ", al: " );
        if( alESet )
            result.append( al );
        else
            result.append( "<unset>" );
        result.append( ", b0: " );
        if( b0ESet )
            result.append( b0 );
        else
            result.append( "<unset>" );
        result.append( ", b4: " );
        if( b4ESet )
            result.append( b4 );
        else
            result.append( "<unset>" );
        result.append( ", b3: " );
        if( b3ESet )
            result.append( b3 );
        else
            result.append( "<unset>" );
        result.append( ", b2: " );
        if( b2ESet )
            result.append( b2 );
        else
            result.append( "<unset>" );
        result.append( ", b1: " );
        if( b1ESet )
            result.append( b1 );
        else
            result.append( "<unset>" );
        result.append( ", b5: " );
        if( b5ESet )
            result.append( b5 );
        else
            result.append( "<unset>" );
        result.append( ", lthres: " );
        if( lthresESet )
            result.append( lthres );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssPTIST3Impl
