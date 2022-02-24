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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ELIN2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getEfdbas <em>Efdbas</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getVe1 <em>Ve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getVe2 <em>Ve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getKetb <em>Ketb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getKd1 <em>Kd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getKe2 <em>Ke2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getSeve2 <em>Seve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getSeve1 <em>Seve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getPid1max <em>Pid1max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTr4 <em>Tr4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTe2 <em>Te2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTi3 <em>Ti3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTi4 <em>Ti4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getTi1 <em>Ti1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getK1ec <em>K1ec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getUpmin <em>Upmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getUpmax <em>Upmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getIefmax <em>Iefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getIefmin <em>Iefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN2Impl#getIefmax2 <em>Iefmax2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcELIN2Impl extends ExcitationSystemDynamicsImpl implements ExcELIN2 {
    /**
     * The default value of the '{@link #getEfdbas() <em>Efdbas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdbas()
     * @generated
     * @ordered
     */
    protected static final Double EFDBAS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdbas() <em>Efdbas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdbas()
     * @generated
     * @ordered
     */
    protected Double efdbas = EFDBAS_EDEFAULT;

    /**
     * This is true if the Efdbas attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdbasESet;

    /**
     * The default value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected static final Double VE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected Double ve1 = VE1_EDEFAULT;

    /**
     * This is true if the Ve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve1ESet;

    /**
     * The default value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected static final Double VE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected Double ve2 = VE2_EDEFAULT;

    /**
     * This is true if the Ve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve2ESet;

    /**
     * The default value of the '{@link #getKetb() <em>Ketb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetb()
     * @generated
     * @ordered
     */
    protected static final Double KETB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKetb() <em>Ketb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetb()
     * @generated
     * @ordered
     */
    protected Double ketb = KETB_EDEFAULT;

    /**
     * This is true if the Ketb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ketbESet;

    /**
     * The default value of the '{@link #getKd1() <em>Kd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd1()
     * @generated
     * @ordered
     */
    protected static final Double KD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd1() <em>Kd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd1()
     * @generated
     * @ordered
     */
    protected Double kd1 = KD1_EDEFAULT;

    /**
     * This is true if the Kd1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kd1ESet;

    /**
     * The default value of the '{@link #getKe2() <em>Ke2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe2()
     * @generated
     * @ordered
     */
    protected static final Double KE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe2() <em>Ke2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe2()
     * @generated
     * @ordered
     */
    protected Double ke2 = KE2_EDEFAULT;

    /**
     * This is true if the Ke2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ke2ESet;

    /**
     * The default value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected static final Double SEVE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected Double seve2 = SEVE2_EDEFAULT;

    /**
     * This is true if the Seve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve2ESet;

    /**
     * The default value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected static final Double SEVE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected Double seve1 = SEVE1_EDEFAULT;

    /**
     * This is true if the Seve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve1ESet;

    /**
     * The default value of the '{@link #getPid1max() <em>Pid1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPid1max()
     * @generated
     * @ordered
     */
    protected static final Double PID1MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPid1max() <em>Pid1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPid1max()
     * @generated
     * @ordered
     */
    protected Double pid1max = PID1MAX_EDEFAULT;

    /**
     * This is true if the Pid1max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pid1maxESet;

    /**
     * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected static final Double XP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected Double xp = XP_EDEFAULT;

    /**
     * This is true if the Xp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xpESet;

    /**
     * The default value of the '{@link #getTr4() <em>Tr4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr4()
     * @generated
     * @ordered
     */
    protected static final Double TR4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr4() <em>Tr4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr4()
     * @generated
     * @ordered
     */
    protected Double tr4 = TR4_EDEFAULT;

    /**
     * This is true if the Tr4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tr4ESet;

    /**
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Double TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Double te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

    /**
     * The default value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected static final Double TB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected Double tb1 = TB1_EDEFAULT;

    /**
     * This is true if the Tb1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tb1ESet;

    /**
     * The default value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected static final Double K3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected Double k3 = K3_EDEFAULT;

    /**
     * This is true if the K3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k3ESet;

    /**
     * The default value of the '{@link #getK4() <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK4()
     * @generated
     * @ordered
     */
    protected static final Double K4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK4() <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK4()
     * @generated
     * @ordered
     */
    protected Double k4 = K4_EDEFAULT;

    /**
     * This is true if the K4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k4ESet;

    /**
     * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected static final Double K1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected Double k1 = K1_EDEFAULT;

    /**
     * This is true if the K1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ESet;

    /**
     * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected static final Double K2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected Double k2 = K2_EDEFAULT;

    /**
     * This is true if the K2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k2ESet;

    /**
     * The default value of the '{@link #getTe2() <em>Te2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe2()
     * @generated
     * @ordered
     */
    protected static final Double TE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe2() <em>Te2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe2()
     * @generated
     * @ordered
     */
    protected Double te2 = TE2_EDEFAULT;

    /**
     * This is true if the Te2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean te2ESet;

    /**
     * The default value of the '{@link #getTi3() <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi3()
     * @generated
     * @ordered
     */
    protected static final Double TI3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi3() <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi3()
     * @generated
     * @ordered
     */
    protected Double ti3 = TI3_EDEFAULT;

    /**
     * This is true if the Ti3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti3ESet;

    /**
     * The default value of the '{@link #getTi4() <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi4()
     * @generated
     * @ordered
     */
    protected static final Double TI4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi4() <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi4()
     * @generated
     * @ordered
     */
    protected Double ti4 = TI4_EDEFAULT;

    /**
     * This is true if the Ti4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti4ESet;

    /**
     * The default value of the '{@link #getTi1() <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi1()
     * @generated
     * @ordered
     */
    protected static final Double TI1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi1() <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi1()
     * @generated
     * @ordered
     */
    protected Double ti1 = TI1_EDEFAULT;

    /**
     * This is true if the Ti1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti1ESet;

    /**
     * The default value of the '{@link #getK1ec() <em>K1ec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1ec()
     * @generated
     * @ordered
     */
    protected static final Double K1EC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1ec() <em>K1ec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1ec()
     * @generated
     * @ordered
     */
    protected Double k1ec = K1EC_EDEFAULT;

    /**
     * This is true if the K1ec attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ecESet;

    /**
     * The default value of the '{@link #getUpmin() <em>Upmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpmin()
     * @generated
     * @ordered
     */
    protected static final Double UPMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpmin() <em>Upmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpmin()
     * @generated
     * @ordered
     */
    protected Double upmin = UPMIN_EDEFAULT;

    /**
     * This is true if the Upmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean upminESet;

    /**
     * The default value of the '{@link #getUpmax() <em>Upmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpmax()
     * @generated
     * @ordered
     */
    protected static final Double UPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpmax() <em>Upmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpmax()
     * @generated
     * @ordered
     */
    protected Double upmax = UPMAX_EDEFAULT;

    /**
     * This is true if the Upmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean upmaxESet;

    /**
     * The default value of the '{@link #getIefmax() <em>Iefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmax()
     * @generated
     * @ordered
     */
    protected static final Double IEFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIefmax() <em>Iefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmax()
     * @generated
     * @ordered
     */
    protected Double iefmax = IEFMAX_EDEFAULT;

    /**
     * This is true if the Iefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iefmaxESet;

    /**
     * The default value of the '{@link #getIefmin() <em>Iefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmin()
     * @generated
     * @ordered
     */
    protected static final Double IEFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIefmin() <em>Iefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmin()
     * @generated
     * @ordered
     */
    protected Double iefmin = IEFMIN_EDEFAULT;

    /**
     * This is true if the Iefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iefminESet;

    /**
     * The default value of the '{@link #getIefmax2() <em>Iefmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmax2()
     * @generated
     * @ordered
     */
    protected static final Double IEFMAX2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIefmax2() <em>Iefmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIefmax2()
     * @generated
     * @ordered
     */
    protected Double iefmax2 = IEFMAX2_EDEFAULT;

    /**
     * This is true if the Iefmax2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iefmax2ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcELIN2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcELIN2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfdbas() {
        return efdbas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdbas( Double newEfdbas ) {
        Double oldEfdbas = efdbas;
        efdbas = newEfdbas;
        boolean oldEfdbasESet = efdbasESet;
        efdbasESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__EFDBAS, oldEfdbas, efdbas,
                    !oldEfdbasESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdbas() {
        Double oldEfdbas = efdbas;
        boolean oldEfdbasESet = efdbasESet;
        efdbas = EFDBAS_EDEFAULT;
        efdbasESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__EFDBAS, oldEfdbas,
                    EFDBAS_EDEFAULT, oldEfdbasESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdbas() {
        return efdbasESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVe1() {
        return ve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe1( Double newVe1 ) {
        Double oldVe1 = ve1;
        ve1 = newVe1;
        boolean oldVe1ESet = ve1ESet;
        ve1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__VE1, oldVe1, ve1,
                    !oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe1() {
        Double oldVe1 = ve1;
        boolean oldVe1ESet = ve1ESet;
        ve1 = VE1_EDEFAULT;
        ve1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__VE1, oldVe1, VE1_EDEFAULT,
                    oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe1() {
        return ve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVe2() {
        return ve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe2( Double newVe2 ) {
        Double oldVe2 = ve2;
        ve2 = newVe2;
        boolean oldVe2ESet = ve2ESet;
        ve2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__VE2, oldVe2, ve2,
                    !oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe2() {
        Double oldVe2 = ve2;
        boolean oldVe2ESet = ve2ESet;
        ve2 = VE2_EDEFAULT;
        ve2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__VE2, oldVe2, VE2_EDEFAULT,
                    oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe2() {
        return ve2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKetb() {
        return ketb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKetb( Double newKetb ) {
        Double oldKetb = ketb;
        ketb = newKetb;
        boolean oldKetbESet = ketbESet;
        ketbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__KETB, oldKetb, ketb,
                    !oldKetbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKetb() {
        Double oldKetb = ketb;
        boolean oldKetbESet = ketbESet;
        ketb = KETB_EDEFAULT;
        ketbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__KETB, oldKetb,
                    KETB_EDEFAULT, oldKetbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKetb() {
        return ketbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKd1() {
        return kd1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd1( Double newKd1 ) {
        Double oldKd1 = kd1;
        kd1 = newKd1;
        boolean oldKd1ESet = kd1ESet;
        kd1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__KD1, oldKd1, kd1,
                    !oldKd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd1() {
        Double oldKd1 = kd1;
        boolean oldKd1ESet = kd1ESet;
        kd1 = KD1_EDEFAULT;
        kd1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__KD1, oldKd1, KD1_EDEFAULT,
                    oldKd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd1() {
        return kd1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKe2() {
        return ke2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe2( Double newKe2 ) {
        Double oldKe2 = ke2;
        ke2 = newKe2;
        boolean oldKe2ESet = ke2ESet;
        ke2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__KE2, oldKe2, ke2,
                    !oldKe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe2() {
        Double oldKe2 = ke2;
        boolean oldKe2ESet = ke2ESet;
        ke2 = KE2_EDEFAULT;
        ke2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__KE2, oldKe2, KE2_EDEFAULT,
                    oldKe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe2() {
        return ke2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSeve2() {
        return seve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve2( Double newSeve2 ) {
        Double oldSeve2 = seve2;
        seve2 = newSeve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__SEVE2, oldSeve2, seve2,
                    !oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve2() {
        Double oldSeve2 = seve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2 = SEVE2_EDEFAULT;
        seve2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__SEVE2, oldSeve2,
                    SEVE2_EDEFAULT, oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve2() {
        return seve2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSeve1() {
        return seve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve1( Double newSeve1 ) {
        Double oldSeve1 = seve1;
        seve1 = newSeve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__SEVE1, oldSeve1, seve1,
                    !oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve1() {
        Double oldSeve1 = seve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1 = SEVE1_EDEFAULT;
        seve1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__SEVE1, oldSeve1,
                    SEVE1_EDEFAULT, oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve1() {
        return seve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPid1max() {
        return pid1max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPid1max( Double newPid1max ) {
        Double oldPid1max = pid1max;
        pid1max = newPid1max;
        boolean oldPid1maxESet = pid1maxESet;
        pid1maxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__PID1MAX, oldPid1max, pid1max,
                    !oldPid1maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPid1max() {
        Double oldPid1max = pid1max;
        boolean oldPid1maxESet = pid1maxESet;
        pid1max = PID1MAX_EDEFAULT;
        pid1maxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__PID1MAX, oldPid1max,
                    PID1MAX_EDEFAULT, oldPid1maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPid1max() {
        return pid1maxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXp() {
        return xp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXp( Double newXp ) {
        Double oldXp = xp;
        xp = newXp;
        boolean oldXpESet = xpESet;
        xpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__XP, oldXp, xp, !oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXp() {
        Double oldXp = xp;
        boolean oldXpESet = xpESet;
        xp = XP_EDEFAULT;
        xpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__XP, oldXp, XP_EDEFAULT,
                    oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXp() {
        return xpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTr4() {
        return tr4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr4( Double newTr4 ) {
        Double oldTr4 = tr4;
        tr4 = newTr4;
        boolean oldTr4ESet = tr4ESet;
        tr4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TR4, oldTr4, tr4,
                    !oldTr4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr4() {
        Double oldTr4 = tr4;
        boolean oldTr4ESet = tr4ESet;
        tr4 = TR4_EDEFAULT;
        tr4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TR4, oldTr4, TR4_EDEFAULT,
                    oldTr4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr4() {
        return tr4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Double newTe ) {
        Double oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Double oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TE, oldTe, TE_EDEFAULT,
                    oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb1() {
        return tb1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb1( Double newTb1 ) {
        Double oldTb1 = tb1;
        tb1 = newTb1;
        boolean oldTb1ESet = tb1ESet;
        tb1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TB1, oldTb1, tb1,
                    !oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb1() {
        Double oldTb1 = tb1;
        boolean oldTb1ESet = tb1ESet;
        tb1 = TB1_EDEFAULT;
        tb1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TB1, oldTb1, TB1_EDEFAULT,
                    oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb1() {
        return tb1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK3() {
        return k3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK3( Double newK3 ) {
        Double oldK3 = k3;
        k3 = newK3;
        boolean oldK3ESet = k3ESet;
        k3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__K3, oldK3, k3, !oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK3() {
        Double oldK3 = k3;
        boolean oldK3ESet = k3ESet;
        k3 = K3_EDEFAULT;
        k3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__K3, oldK3, K3_EDEFAULT,
                    oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK3() {
        return k3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK4() {
        return k4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK4( Double newK4 ) {
        Double oldK4 = k4;
        k4 = newK4;
        boolean oldK4ESet = k4ESet;
        k4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__K4, oldK4, k4, !oldK4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK4() {
        Double oldK4 = k4;
        boolean oldK4ESet = k4ESet;
        k4 = K4_EDEFAULT;
        k4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__K4, oldK4, K4_EDEFAULT,
                    oldK4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK4() {
        return k4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK1() {
        return k1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1( Double newK1 ) {
        Double oldK1 = k1;
        k1 = newK1;
        boolean oldK1ESet = k1ESet;
        k1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__K1, oldK1, k1, !oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1() {
        Double oldK1 = k1;
        boolean oldK1ESet = k1ESet;
        k1 = K1_EDEFAULT;
        k1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__K1, oldK1, K1_EDEFAULT,
                    oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK1() {
        return k1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK2() {
        return k2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK2( Double newK2 ) {
        Double oldK2 = k2;
        k2 = newK2;
        boolean oldK2ESet = k2ESet;
        k2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__K2, oldK2, k2, !oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK2() {
        Double oldK2 = k2;
        boolean oldK2ESet = k2ESet;
        k2 = K2_EDEFAULT;
        k2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__K2, oldK2, K2_EDEFAULT,
                    oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK2() {
        return k2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTe2() {
        return te2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe2( Double newTe2 ) {
        Double oldTe2 = te2;
        te2 = newTe2;
        boolean oldTe2ESet = te2ESet;
        te2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TE2, oldTe2, te2,
                    !oldTe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe2() {
        Double oldTe2 = te2;
        boolean oldTe2ESet = te2ESet;
        te2 = TE2_EDEFAULT;
        te2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TE2, oldTe2, TE2_EDEFAULT,
                    oldTe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe2() {
        return te2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTi3() {
        return ti3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi3( Double newTi3 ) {
        Double oldTi3 = ti3;
        ti3 = newTi3;
        boolean oldTi3ESet = ti3ESet;
        ti3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TI3, oldTi3, ti3,
                    !oldTi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi3() {
        Double oldTi3 = ti3;
        boolean oldTi3ESet = ti3ESet;
        ti3 = TI3_EDEFAULT;
        ti3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TI3, oldTi3, TI3_EDEFAULT,
                    oldTi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi3() {
        return ti3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTi4() {
        return ti4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi4( Double newTi4 ) {
        Double oldTi4 = ti4;
        ti4 = newTi4;
        boolean oldTi4ESet = ti4ESet;
        ti4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TI4, oldTi4, ti4,
                    !oldTi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi4() {
        Double oldTi4 = ti4;
        boolean oldTi4ESet = ti4ESet;
        ti4 = TI4_EDEFAULT;
        ti4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TI4, oldTi4, TI4_EDEFAULT,
                    oldTi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi4() {
        return ti4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTi1() {
        return ti1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi1( Double newTi1 ) {
        Double oldTi1 = ti1;
        ti1 = newTi1;
        boolean oldTi1ESet = ti1ESet;
        ti1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__TI1, oldTi1, ti1,
                    !oldTi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi1() {
        Double oldTi1 = ti1;
        boolean oldTi1ESet = ti1ESet;
        ti1 = TI1_EDEFAULT;
        ti1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__TI1, oldTi1, TI1_EDEFAULT,
                    oldTi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi1() {
        return ti1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK1ec() {
        return k1ec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1ec( Double newK1ec ) {
        Double oldK1ec = k1ec;
        k1ec = newK1ec;
        boolean oldK1ecESet = k1ecESet;
        k1ecESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__K1EC, oldK1ec, k1ec,
                    !oldK1ecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1ec() {
        Double oldK1ec = k1ec;
        boolean oldK1ecESet = k1ecESet;
        k1ec = K1EC_EDEFAULT;
        k1ecESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__K1EC, oldK1ec,
                    K1EC_EDEFAULT, oldK1ecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK1ec() {
        return k1ecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUpmin() {
        return upmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpmin( Double newUpmin ) {
        Double oldUpmin = upmin;
        upmin = newUpmin;
        boolean oldUpminESet = upminESet;
        upminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__UPMIN, oldUpmin, upmin,
                    !oldUpminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpmin() {
        Double oldUpmin = upmin;
        boolean oldUpminESet = upminESet;
        upmin = UPMIN_EDEFAULT;
        upminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__UPMIN, oldUpmin,
                    UPMIN_EDEFAULT, oldUpminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpmin() {
        return upminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUpmax() {
        return upmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpmax( Double newUpmax ) {
        Double oldUpmax = upmax;
        upmax = newUpmax;
        boolean oldUpmaxESet = upmaxESet;
        upmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__UPMAX, oldUpmax, upmax,
                    !oldUpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpmax() {
        Double oldUpmax = upmax;
        boolean oldUpmaxESet = upmaxESet;
        upmax = UPMAX_EDEFAULT;
        upmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__UPMAX, oldUpmax,
                    UPMAX_EDEFAULT, oldUpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpmax() {
        return upmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIefmax() {
        return iefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIefmax( Double newIefmax ) {
        Double oldIefmax = iefmax;
        iefmax = newIefmax;
        boolean oldIefmaxESet = iefmaxESet;
        iefmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__IEFMAX, oldIefmax, iefmax,
                    !oldIefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIefmax() {
        Double oldIefmax = iefmax;
        boolean oldIefmaxESet = iefmaxESet;
        iefmax = IEFMAX_EDEFAULT;
        iefmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__IEFMAX, oldIefmax,
                    IEFMAX_EDEFAULT, oldIefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIefmax() {
        return iefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIefmin() {
        return iefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIefmin( Double newIefmin ) {
        Double oldIefmin = iefmin;
        iefmin = newIefmin;
        boolean oldIefminESet = iefminESet;
        iefminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__IEFMIN, oldIefmin, iefmin,
                    !oldIefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIefmin() {
        Double oldIefmin = iefmin;
        boolean oldIefminESet = iefminESet;
        iefmin = IEFMIN_EDEFAULT;
        iefminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__IEFMIN, oldIefmin,
                    IEFMIN_EDEFAULT, oldIefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIefmin() {
        return iefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIefmax2() {
        return iefmax2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIefmax2( Double newIefmax2 ) {
        Double oldIefmax2 = iefmax2;
        iefmax2 = newIefmax2;
        boolean oldIefmax2ESet = iefmax2ESet;
        iefmax2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN2__IEFMAX2, oldIefmax2, iefmax2,
                    !oldIefmax2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIefmax2() {
        Double oldIefmax2 = iefmax2;
        boolean oldIefmax2ESet = iefmax2ESet;
        iefmax2 = IEFMAX2_EDEFAULT;
        iefmax2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN2__IEFMAX2, oldIefmax2,
                    IEFMAX2_EDEFAULT, oldIefmax2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIefmax2() {
        return iefmax2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_ELIN2__EFDBAS:
            return getEfdbas();
        case CimPackage.EXC_ELIN2__VE1:
            return getVe1();
        case CimPackage.EXC_ELIN2__VE2:
            return getVe2();
        case CimPackage.EXC_ELIN2__KETB:
            return getKetb();
        case CimPackage.EXC_ELIN2__KD1:
            return getKd1();
        case CimPackage.EXC_ELIN2__KE2:
            return getKe2();
        case CimPackage.EXC_ELIN2__SEVE2:
            return getSeve2();
        case CimPackage.EXC_ELIN2__SEVE1:
            return getSeve1();
        case CimPackage.EXC_ELIN2__PID1MAX:
            return getPid1max();
        case CimPackage.EXC_ELIN2__XP:
            return getXp();
        case CimPackage.EXC_ELIN2__TR4:
            return getTr4();
        case CimPackage.EXC_ELIN2__TE:
            return getTe();
        case CimPackage.EXC_ELIN2__TB1:
            return getTb1();
        case CimPackage.EXC_ELIN2__K3:
            return getK3();
        case CimPackage.EXC_ELIN2__K4:
            return getK4();
        case CimPackage.EXC_ELIN2__K1:
            return getK1();
        case CimPackage.EXC_ELIN2__K2:
            return getK2();
        case CimPackage.EXC_ELIN2__TE2:
            return getTe2();
        case CimPackage.EXC_ELIN2__TI3:
            return getTi3();
        case CimPackage.EXC_ELIN2__TI4:
            return getTi4();
        case CimPackage.EXC_ELIN2__TI1:
            return getTi1();
        case CimPackage.EXC_ELIN2__K1EC:
            return getK1ec();
        case CimPackage.EXC_ELIN2__UPMIN:
            return getUpmin();
        case CimPackage.EXC_ELIN2__UPMAX:
            return getUpmax();
        case CimPackage.EXC_ELIN2__IEFMAX:
            return getIefmax();
        case CimPackage.EXC_ELIN2__IEFMIN:
            return getIefmin();
        case CimPackage.EXC_ELIN2__IEFMAX2:
            return getIefmax2();
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
        case CimPackage.EXC_ELIN2__EFDBAS:
            setEfdbas( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__VE1:
            setVe1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__VE2:
            setVe2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__KETB:
            setKetb( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__KD1:
            setKd1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__KE2:
            setKe2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__SEVE2:
            setSeve2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__SEVE1:
            setSeve1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__PID1MAX:
            setPid1max( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__XP:
            setXp( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TR4:
            setTr4( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TB1:
            setTb1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__K3:
            setK3( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__K4:
            setK4( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__K1:
            setK1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__K2:
            setK2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TE2:
            setTe2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TI3:
            setTi3( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TI4:
            setTi4( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__TI1:
            setTi1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__K1EC:
            setK1ec( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__UPMIN:
            setUpmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__UPMAX:
            setUpmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__IEFMAX:
            setIefmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__IEFMIN:
            setIefmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN2__IEFMAX2:
            setIefmax2( ( Double ) newValue );
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
        case CimPackage.EXC_ELIN2__EFDBAS:
            unsetEfdbas();
            return;
        case CimPackage.EXC_ELIN2__VE1:
            unsetVe1();
            return;
        case CimPackage.EXC_ELIN2__VE2:
            unsetVe2();
            return;
        case CimPackage.EXC_ELIN2__KETB:
            unsetKetb();
            return;
        case CimPackage.EXC_ELIN2__KD1:
            unsetKd1();
            return;
        case CimPackage.EXC_ELIN2__KE2:
            unsetKe2();
            return;
        case CimPackage.EXC_ELIN2__SEVE2:
            unsetSeve2();
            return;
        case CimPackage.EXC_ELIN2__SEVE1:
            unsetSeve1();
            return;
        case CimPackage.EXC_ELIN2__PID1MAX:
            unsetPid1max();
            return;
        case CimPackage.EXC_ELIN2__XP:
            unsetXp();
            return;
        case CimPackage.EXC_ELIN2__TR4:
            unsetTr4();
            return;
        case CimPackage.EXC_ELIN2__TE:
            unsetTe();
            return;
        case CimPackage.EXC_ELIN2__TB1:
            unsetTb1();
            return;
        case CimPackage.EXC_ELIN2__K3:
            unsetK3();
            return;
        case CimPackage.EXC_ELIN2__K4:
            unsetK4();
            return;
        case CimPackage.EXC_ELIN2__K1:
            unsetK1();
            return;
        case CimPackage.EXC_ELIN2__K2:
            unsetK2();
            return;
        case CimPackage.EXC_ELIN2__TE2:
            unsetTe2();
            return;
        case CimPackage.EXC_ELIN2__TI3:
            unsetTi3();
            return;
        case CimPackage.EXC_ELIN2__TI4:
            unsetTi4();
            return;
        case CimPackage.EXC_ELIN2__TI1:
            unsetTi1();
            return;
        case CimPackage.EXC_ELIN2__K1EC:
            unsetK1ec();
            return;
        case CimPackage.EXC_ELIN2__UPMIN:
            unsetUpmin();
            return;
        case CimPackage.EXC_ELIN2__UPMAX:
            unsetUpmax();
            return;
        case CimPackage.EXC_ELIN2__IEFMAX:
            unsetIefmax();
            return;
        case CimPackage.EXC_ELIN2__IEFMIN:
            unsetIefmin();
            return;
        case CimPackage.EXC_ELIN2__IEFMAX2:
            unsetIefmax2();
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
        case CimPackage.EXC_ELIN2__EFDBAS:
            return isSetEfdbas();
        case CimPackage.EXC_ELIN2__VE1:
            return isSetVe1();
        case CimPackage.EXC_ELIN2__VE2:
            return isSetVe2();
        case CimPackage.EXC_ELIN2__KETB:
            return isSetKetb();
        case CimPackage.EXC_ELIN2__KD1:
            return isSetKd1();
        case CimPackage.EXC_ELIN2__KE2:
            return isSetKe2();
        case CimPackage.EXC_ELIN2__SEVE2:
            return isSetSeve2();
        case CimPackage.EXC_ELIN2__SEVE1:
            return isSetSeve1();
        case CimPackage.EXC_ELIN2__PID1MAX:
            return isSetPid1max();
        case CimPackage.EXC_ELIN2__XP:
            return isSetXp();
        case CimPackage.EXC_ELIN2__TR4:
            return isSetTr4();
        case CimPackage.EXC_ELIN2__TE:
            return isSetTe();
        case CimPackage.EXC_ELIN2__TB1:
            return isSetTb1();
        case CimPackage.EXC_ELIN2__K3:
            return isSetK3();
        case CimPackage.EXC_ELIN2__K4:
            return isSetK4();
        case CimPackage.EXC_ELIN2__K1:
            return isSetK1();
        case CimPackage.EXC_ELIN2__K2:
            return isSetK2();
        case CimPackage.EXC_ELIN2__TE2:
            return isSetTe2();
        case CimPackage.EXC_ELIN2__TI3:
            return isSetTi3();
        case CimPackage.EXC_ELIN2__TI4:
            return isSetTi4();
        case CimPackage.EXC_ELIN2__TI1:
            return isSetTi1();
        case CimPackage.EXC_ELIN2__K1EC:
            return isSetK1ec();
        case CimPackage.EXC_ELIN2__UPMIN:
            return isSetUpmin();
        case CimPackage.EXC_ELIN2__UPMAX:
            return isSetUpmax();
        case CimPackage.EXC_ELIN2__IEFMAX:
            return isSetIefmax();
        case CimPackage.EXC_ELIN2__IEFMIN:
            return isSetIefmin();
        case CimPackage.EXC_ELIN2__IEFMAX2:
            return isSetIefmax2();
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
        result.append( " (efdbas: " );
        if( efdbasESet )
            result.append( efdbas );
        else
            result.append( "<unset>" );
        result.append( ", ve1: " );
        if( ve1ESet )
            result.append( ve1 );
        else
            result.append( "<unset>" );
        result.append( ", ve2: " );
        if( ve2ESet )
            result.append( ve2 );
        else
            result.append( "<unset>" );
        result.append( ", ketb: " );
        if( ketbESet )
            result.append( ketb );
        else
            result.append( "<unset>" );
        result.append( ", kd1: " );
        if( kd1ESet )
            result.append( kd1 );
        else
            result.append( "<unset>" );
        result.append( ", ke2: " );
        if( ke2ESet )
            result.append( ke2 );
        else
            result.append( "<unset>" );
        result.append( ", seve2: " );
        if( seve2ESet )
            result.append( seve2 );
        else
            result.append( "<unset>" );
        result.append( ", seve1: " );
        if( seve1ESet )
            result.append( seve1 );
        else
            result.append( "<unset>" );
        result.append( ", pid1max: " );
        if( pid1maxESet )
            result.append( pid1max );
        else
            result.append( "<unset>" );
        result.append( ", xp: " );
        if( xpESet )
            result.append( xp );
        else
            result.append( "<unset>" );
        result.append( ", tr4: " );
        if( tr4ESet )
            result.append( tr4 );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tb1: " );
        if( tb1ESet )
            result.append( tb1 );
        else
            result.append( "<unset>" );
        result.append( ", k3: " );
        if( k3ESet )
            result.append( k3 );
        else
            result.append( "<unset>" );
        result.append( ", k4: " );
        if( k4ESet )
            result.append( k4 );
        else
            result.append( "<unset>" );
        result.append( ", k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", te2: " );
        if( te2ESet )
            result.append( te2 );
        else
            result.append( "<unset>" );
        result.append( ", ti3: " );
        if( ti3ESet )
            result.append( ti3 );
        else
            result.append( "<unset>" );
        result.append( ", ti4: " );
        if( ti4ESet )
            result.append( ti4 );
        else
            result.append( "<unset>" );
        result.append( ", ti1: " );
        if( ti1ESet )
            result.append( ti1 );
        else
            result.append( "<unset>" );
        result.append( ", k1ec: " );
        if( k1ecESet )
            result.append( k1ec );
        else
            result.append( "<unset>" );
        result.append( ", upmin: " );
        if( upminESet )
            result.append( upmin );
        else
            result.append( "<unset>" );
        result.append( ", upmax: " );
        if( upmaxESet )
            result.append( upmax );
        else
            result.append( "<unset>" );
        result.append( ", iefmax: " );
        if( iefmaxESet )
            result.append( iefmax );
        else
            result.append( "<unset>" );
        result.append( ", iefmin: " );
        if( iefminESet )
            result.append( iefmin );
        else
            result.append( "<unset>" );
        result.append( ", iefmax2: " );
        if( iefmax2ESet )
            result.append( iefmax2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcELIN2Impl
