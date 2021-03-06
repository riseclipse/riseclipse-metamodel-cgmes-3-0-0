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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGASTWD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov GASTWD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getKdroop <em>Kdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getC <em>C</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getA <em>A</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getEcr <em>Ecr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getEtd <em>Etd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getK5 <em>K5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getK6 <em>K6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTcd <em>Tcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getCf2 <em>Cf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTrate <em>Trate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getT <em>T</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getAf2 <em>Af2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getAf1 <em>Af1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTmax <em>Tmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getBf2 <em>Bf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getBf1 <em>Bf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGASTWDImpl#getTmin <em>Tmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovGASTWDImpl extends TurbineGovernorDynamicsImpl implements GovGASTWD {
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
     * The default value of the '{@link #getKdroop() <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdroop()
     * @generated
     * @ordered
     */
    protected static final Double KDROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdroop() <em>Kdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdroop()
     * @generated
     * @ordered
     */
    protected Double kdroop = KDROOP_EDEFAULT;

    /**
     * This is true if the Kdroop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdroopESet;

    /**
     * The default value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected static final Double C_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected Double c = C_EDEFAULT;

    /**
     * This is true if the C attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cESet;

    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Double B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Double b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

    /**
     * The default value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected static final Double A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected Double a = A_EDEFAULT;

    /**
     * This is true if the A attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aESet;

    /**
     * The default value of the '{@link #getEcr() <em>Ecr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEcr()
     * @generated
     * @ordered
     */
    protected static final Double ECR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEcr() <em>Ecr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEcr()
     * @generated
     * @ordered
     */
    protected Double ecr = ECR_EDEFAULT;

    /**
     * This is true if the Ecr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ecrESet;

    /**
     * The default value of the '{@link #getEtd() <em>Etd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtd()
     * @generated
     * @ordered
     */
    protected static final Double ETD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEtd() <em>Etd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtd()
     * @generated
     * @ordered
     */
    protected Double etd = ETD_EDEFAULT;

    /**
     * This is true if the Etd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean etdESet;

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
     * The default value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected static final Double TT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected Double tt = TT_EDEFAULT;

    /**
     * This is true if the Tt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ttESet;

    /**
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Double TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Double tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

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
     * The default value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected static final Double KD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected Double kd = KD_EDEFAULT;

    /**
     * This is true if the Kd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdESet;

    /**
     * The default value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected static final Double KF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected Double kf = KF_EDEFAULT;

    /**
     * This is true if the Kf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfESet;

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
     * The default value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected static final Double K5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected Double k5 = K5_EDEFAULT;

    /**
     * This is true if the K5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k5ESet;

    /**
     * The default value of the '{@link #getK6() <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK6()
     * @generated
     * @ordered
     */
    protected static final Double K6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK6() <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK6()
     * @generated
     * @ordered
     */
    protected Double k6 = K6_EDEFAULT;

    /**
     * This is true if the K6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k6ESet;

    /**
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Double KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Double kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Double KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Double ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

    /**
     * The default value of the '{@link #getTcd() <em>Tcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcd()
     * @generated
     * @ordered
     */
    protected static final Double TCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTcd() <em>Tcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcd()
     * @generated
     * @ordered
     */
    protected Double tcd = TCD_EDEFAULT;

    /**
     * This is true if the Tcd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcdESet;

    /**
     * The default value of the '{@link #getCf2() <em>Cf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCf2()
     * @generated
     * @ordered
     */
    protected static final Double CF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCf2() <em>Cf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCf2()
     * @generated
     * @ordered
     */
    protected Double cf2 = CF2_EDEFAULT;

    /**
     * This is true if the Cf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cf2ESet;

    /**
     * The default value of the '{@link #getTrate() <em>Trate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrate()
     * @generated
     * @ordered
     */
    protected static final Double TRATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrate() <em>Trate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrate()
     * @generated
     * @ordered
     */
    protected Double trate = TRATE_EDEFAULT;

    /**
     * This is true if the Trate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trateESet;

    /**
     * The default value of the '{@link #getT() <em>T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT()
     * @generated
     * @ordered
     */
    protected static final Double T_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT() <em>T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT()
     * @generated
     * @ordered
     */
    protected Double t = T_EDEFAULT;

    /**
     * This is true if the T attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tESet;

    /**
     * The default value of the '{@link #getAf2() <em>Af2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf2()
     * @generated
     * @ordered
     */
    protected static final Double AF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAf2() <em>Af2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf2()
     * @generated
     * @ordered
     */
    protected Double af2 = AF2_EDEFAULT;

    /**
     * This is true if the Af2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean af2ESet;

    /**
     * The default value of the '{@link #getAf1() <em>Af1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf1()
     * @generated
     * @ordered
     */
    protected static final Double AF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAf1() <em>Af1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf1()
     * @generated
     * @ordered
     */
    protected Double af1 = AF1_EDEFAULT;

    /**
     * This is true if the Af1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean af1ESet;

    /**
     * The default value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmax()
     * @generated
     * @ordered
     */
    protected static final Double TMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmax()
     * @generated
     * @ordered
     */
    protected Double tmax = TMAX_EDEFAULT;

    /**
     * This is true if the Tmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmaxESet;

    /**
     * The default value of the '{@link #getBf2() <em>Bf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf2()
     * @generated
     * @ordered
     */
    protected static final Double BF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBf2() <em>Bf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf2()
     * @generated
     * @ordered
     */
    protected Double bf2 = BF2_EDEFAULT;

    /**
     * This is true if the Bf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bf2ESet;

    /**
     * The default value of the '{@link #getBf1() <em>Bf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf1()
     * @generated
     * @ordered
     */
    protected static final Double BF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBf1() <em>Bf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf1()
     * @generated
     * @ordered
     */
    protected Double bf1 = BF1_EDEFAULT;

    /**
     * This is true if the Bf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bf1ESet;

    /**
     * The default value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmin()
     * @generated
     * @ordered
     */
    protected static final Double TMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmin()
     * @generated
     * @ordered
     */
    protected Double tmin = TMIN_EDEFAULT;

    /**
     * This is true if the Tmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovGASTWDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovGASTWD();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__MWBASE, oldMwbase, mwbase,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__MWBASE, oldMwbase,
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
    public Double getKdroop() {
        return kdroop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdroop( Double newKdroop ) {
        Double oldKdroop = kdroop;
        kdroop = newKdroop;
        boolean oldKdroopESet = kdroopESet;
        kdroopESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__KDROOP, oldKdroop, kdroop,
                    !oldKdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdroop() {
        Double oldKdroop = kdroop;
        boolean oldKdroopESet = kdroopESet;
        kdroop = KDROOP_EDEFAULT;
        kdroopESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__KDROOP, oldKdroop,
                    KDROOP_EDEFAULT, oldKdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdroop() {
        return kdroopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getC() {
        return c;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC( Double newC ) {
        Double oldC = c;
        c = newC;
        boolean oldCESet = cESet;
        cESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__C, oldC, c, !oldCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC() {
        Double oldC = c;
        boolean oldCESet = cESet;
        c = C_EDEFAULT;
        cESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__C, oldC, C_EDEFAULT,
                    oldCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC() {
        return cESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Double newB ) {
        Double oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__B, oldB, b, !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Double oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__B, oldB, B_EDEFAULT,
                    oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA() {
        return a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA( Double newA ) {
        Double oldA = a;
        a = newA;
        boolean oldAESet = aESet;
        aESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__A, oldA, a, !oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA() {
        Double oldA = a;
        boolean oldAESet = aESet;
        a = A_EDEFAULT;
        aESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__A, oldA, A_EDEFAULT,
                    oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA() {
        return aESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEcr() {
        return ecr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEcr( Double newEcr ) {
        Double oldEcr = ecr;
        ecr = newEcr;
        boolean oldEcrESet = ecrESet;
        ecrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__ECR, oldEcr, ecr,
                    !oldEcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEcr() {
        Double oldEcr = ecr;
        boolean oldEcrESet = ecrESet;
        ecr = ECR_EDEFAULT;
        ecrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__ECR, oldEcr, ECR_EDEFAULT,
                    oldEcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEcr() {
        return ecrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEtd() {
        return etd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEtd( Double newEtd ) {
        Double oldEtd = etd;
        etd = newEtd;
        boolean oldEtdESet = etdESet;
        etdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__ETD, oldEtd, etd,
                    !oldEtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEtd() {
        Double oldEtd = etd;
        boolean oldEtdESet = etdESet;
        etd = ETD_EDEFAULT;
        etdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__ETD, oldEtd, ETD_EDEFAULT,
                    oldEtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEtd() {
        return etdESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__T4, oldT4, t4,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__T4, oldT4, T4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__T5, oldT5, t5,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__T5, oldT5, T5_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__T3, oldT3, t3,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__T3, oldT3, T3_EDEFAULT,
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
    public Double getTt() {
        return tt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTt( Double newTt ) {
        Double oldTt = tt;
        tt = newTt;
        boolean oldTtESet = ttESet;
        ttESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TT, oldTt, tt,
                    !oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTt() {
        Double oldTt = tt;
        boolean oldTtESet = ttESet;
        tt = TT_EDEFAULT;
        ttESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TT, oldTt, TT_EDEFAULT,
                    oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTt() {
        return ttESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Double newTr ) {
        Double oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TR, oldTr, tr,
                    !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Double oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TR, oldTr, TR_EDEFAULT,
                    oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TD, oldTd, td,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TD, oldTd, TD_EDEFAULT,
                    oldTdESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TF, oldTf, tf,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TF, oldTf, TF_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TC, oldTc, tc,
                    !oldTcESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TC, oldTc, TC_EDEFAULT,
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
    public Double getKd() {
        return kd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd( Double newKd ) {
        Double oldKd = kd;
        kd = newKd;
        boolean oldKdESet = kdESet;
        kdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__KD, oldKd, kd,
                    !oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd() {
        Double oldKd = kd;
        boolean oldKdESet = kdESet;
        kd = KD_EDEFAULT;
        kdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__KD, oldKd, KD_EDEFAULT,
                    oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd() {
        return kdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKf() {
        return kf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf( Double newKf ) {
        Double oldKf = kf;
        kf = newKf;
        boolean oldKfESet = kfESet;
        kfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__KF, oldKf, kf,
                    !oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf() {
        Double oldKf = kf;
        boolean oldKfESet = kfESet;
        kf = KF_EDEFAULT;
        kfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__KF, oldKf, KF_EDEFAULT,
                    oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf() {
        return kfESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__K3, oldK3, k3,
                    !oldK3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__K3, oldK3, K3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__K4, oldK4, k4,
                    !oldK4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__K4, oldK4, K4_EDEFAULT,
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
    public Double getK5() {
        return k5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK5( Double newK5 ) {
        Double oldK5 = k5;
        k5 = newK5;
        boolean oldK5ESet = k5ESet;
        k5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__K5, oldK5, k5,
                    !oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK5() {
        Double oldK5 = k5;
        boolean oldK5ESet = k5ESet;
        k5 = K5_EDEFAULT;
        k5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__K5, oldK5, K5_EDEFAULT,
                    oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK5() {
        return k5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK6() {
        return k6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK6( Double newK6 ) {
        Double oldK6 = k6;
        k6 = newK6;
        boolean oldK6ESet = k6ESet;
        k6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__K6, oldK6, k6,
                    !oldK6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK6() {
        Double oldK6 = k6;
        boolean oldK6ESet = k6ESet;
        k6 = K6_EDEFAULT;
        k6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__K6, oldK6, K6_EDEFAULT,
                    oldK6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK6() {
        return k6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Double newKp ) {
        Double oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__KP, oldKp, kp,
                    !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Double oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__KP, oldKp, KP_EDEFAULT,
                    oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Double newKi ) {
        Double oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__KI, oldKi, ki,
                    !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Double oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__KI, oldKi, KI_EDEFAULT,
                    oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTcd() {
        return tcd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTcd( Double newTcd ) {
        Double oldTcd = tcd;
        tcd = newTcd;
        boolean oldTcdESet = tcdESet;
        tcdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TCD, oldTcd, tcd,
                    !oldTcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTcd() {
        Double oldTcd = tcd;
        boolean oldTcdESet = tcdESet;
        tcd = TCD_EDEFAULT;
        tcdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TCD, oldTcd, TCD_EDEFAULT,
                    oldTcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTcd() {
        return tcdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCf2() {
        return cf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCf2( Double newCf2 ) {
        Double oldCf2 = cf2;
        cf2 = newCf2;
        boolean oldCf2ESet = cf2ESet;
        cf2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__CF2, oldCf2, cf2,
                    !oldCf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCf2() {
        Double oldCf2 = cf2;
        boolean oldCf2ESet = cf2ESet;
        cf2 = CF2_EDEFAULT;
        cf2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__CF2, oldCf2, CF2_EDEFAULT,
                    oldCf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCf2() {
        return cf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTrate() {
        return trate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrate( Double newTrate ) {
        Double oldTrate = trate;
        trate = newTrate;
        boolean oldTrateESet = trateESet;
        trateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TRATE, oldTrate, trate,
                    !oldTrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrate() {
        Double oldTrate = trate;
        boolean oldTrateESet = trateESet;
        trate = TRATE_EDEFAULT;
        trateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TRATE, oldTrate,
                    TRATE_EDEFAULT, oldTrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrate() {
        return trateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT() {
        return t;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT( Double newT ) {
        Double oldT = t;
        t = newT;
        boolean oldTESet = tESet;
        tESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__T, oldT, t, !oldTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT() {
        Double oldT = t;
        boolean oldTESet = tESet;
        t = T_EDEFAULT;
        tESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__T, oldT, T_EDEFAULT,
                    oldTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT() {
        return tESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAf2() {
        return af2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAf2( Double newAf2 ) {
        Double oldAf2 = af2;
        af2 = newAf2;
        boolean oldAf2ESet = af2ESet;
        af2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__AF2, oldAf2, af2,
                    !oldAf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAf2() {
        Double oldAf2 = af2;
        boolean oldAf2ESet = af2ESet;
        af2 = AF2_EDEFAULT;
        af2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__AF2, oldAf2, AF2_EDEFAULT,
                    oldAf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAf2() {
        return af2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAf1() {
        return af1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAf1( Double newAf1 ) {
        Double oldAf1 = af1;
        af1 = newAf1;
        boolean oldAf1ESet = af1ESet;
        af1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__AF1, oldAf1, af1,
                    !oldAf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAf1() {
        Double oldAf1 = af1;
        boolean oldAf1ESet = af1ESet;
        af1 = AF1_EDEFAULT;
        af1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__AF1, oldAf1, AF1_EDEFAULT,
                    oldAf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAf1() {
        return af1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTmax() {
        return tmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTmax( Double newTmax ) {
        Double oldTmax = tmax;
        tmax = newTmax;
        boolean oldTmaxESet = tmaxESet;
        tmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TMAX, oldTmax, tmax,
                    !oldTmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTmax() {
        Double oldTmax = tmax;
        boolean oldTmaxESet = tmaxESet;
        tmax = TMAX_EDEFAULT;
        tmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TMAX, oldTmax,
                    TMAX_EDEFAULT, oldTmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTmax() {
        return tmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBf2() {
        return bf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBf2( Double newBf2 ) {
        Double oldBf2 = bf2;
        bf2 = newBf2;
        boolean oldBf2ESet = bf2ESet;
        bf2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__BF2, oldBf2, bf2,
                    !oldBf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBf2() {
        Double oldBf2 = bf2;
        boolean oldBf2ESet = bf2ESet;
        bf2 = BF2_EDEFAULT;
        bf2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__BF2, oldBf2, BF2_EDEFAULT,
                    oldBf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBf2() {
        return bf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBf1() {
        return bf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBf1( Double newBf1 ) {
        Double oldBf1 = bf1;
        bf1 = newBf1;
        boolean oldBf1ESet = bf1ESet;
        bf1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__BF1, oldBf1, bf1,
                    !oldBf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBf1() {
        Double oldBf1 = bf1;
        boolean oldBf1ESet = bf1ESet;
        bf1 = BF1_EDEFAULT;
        bf1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__BF1, oldBf1, BF1_EDEFAULT,
                    oldBf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBf1() {
        return bf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTmin() {
        return tmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTmin( Double newTmin ) {
        Double oldTmin = tmin;
        tmin = newTmin;
        boolean oldTminESet = tminESet;
        tminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GASTWD__TMIN, oldTmin, tmin,
                    !oldTminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTmin() {
        Double oldTmin = tmin;
        boolean oldTminESet = tminESet;
        tmin = TMIN_EDEFAULT;
        tminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GASTWD__TMIN, oldTmin,
                    TMIN_EDEFAULT, oldTminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTmin() {
        return tminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_GASTWD__MWBASE:
            return getMwbase();
        case CimPackage.GOV_GASTWD__KDROOP:
            return getKdroop();
        case CimPackage.GOV_GASTWD__C:
            return getC();
        case CimPackage.GOV_GASTWD__B:
            return getB();
        case CimPackage.GOV_GASTWD__A:
            return getA();
        case CimPackage.GOV_GASTWD__ECR:
            return getEcr();
        case CimPackage.GOV_GASTWD__ETD:
            return getEtd();
        case CimPackage.GOV_GASTWD__T4:
            return getT4();
        case CimPackage.GOV_GASTWD__T5:
            return getT5();
        case CimPackage.GOV_GASTWD__T3:
            return getT3();
        case CimPackage.GOV_GASTWD__TT:
            return getTt();
        case CimPackage.GOV_GASTWD__TR:
            return getTr();
        case CimPackage.GOV_GASTWD__TD:
            return getTd();
        case CimPackage.GOV_GASTWD__TF:
            return getTf();
        case CimPackage.GOV_GASTWD__TC:
            return getTc();
        case CimPackage.GOV_GASTWD__KD:
            return getKd();
        case CimPackage.GOV_GASTWD__KF:
            return getKf();
        case CimPackage.GOV_GASTWD__K3:
            return getK3();
        case CimPackage.GOV_GASTWD__K4:
            return getK4();
        case CimPackage.GOV_GASTWD__K5:
            return getK5();
        case CimPackage.GOV_GASTWD__K6:
            return getK6();
        case CimPackage.GOV_GASTWD__KP:
            return getKp();
        case CimPackage.GOV_GASTWD__KI:
            return getKi();
        case CimPackage.GOV_GASTWD__TCD:
            return getTcd();
        case CimPackage.GOV_GASTWD__CF2:
            return getCf2();
        case CimPackage.GOV_GASTWD__TRATE:
            return getTrate();
        case CimPackage.GOV_GASTWD__T:
            return getT();
        case CimPackage.GOV_GASTWD__AF2:
            return getAf2();
        case CimPackage.GOV_GASTWD__AF1:
            return getAf1();
        case CimPackage.GOV_GASTWD__TMAX:
            return getTmax();
        case CimPackage.GOV_GASTWD__BF2:
            return getBf2();
        case CimPackage.GOV_GASTWD__BF1:
            return getBf1();
        case CimPackage.GOV_GASTWD__TMIN:
            return getTmin();
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
        case CimPackage.GOV_GASTWD__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__KDROOP:
            setKdroop( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__C:
            setC( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__B:
            setB( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__A:
            setA( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__ECR:
            setEcr( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__ETD:
            setEtd( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__T5:
            setT5( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TT:
            setTt( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TR:
            setTr( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TD:
            setTd( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TC:
            setTc( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__KD:
            setKd( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__KF:
            setKf( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__K3:
            setK3( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__K4:
            setK4( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__K5:
            setK5( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__K6:
            setK6( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TCD:
            setTcd( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__CF2:
            setCf2( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TRATE:
            setTrate( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__T:
            setT( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__AF2:
            setAf2( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__AF1:
            setAf1( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TMAX:
            setTmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__BF2:
            setBf2( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__BF1:
            setBf1( ( Double ) newValue );
            return;
        case CimPackage.GOV_GASTWD__TMIN:
            setTmin( ( Double ) newValue );
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
        case CimPackage.GOV_GASTWD__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_GASTWD__KDROOP:
            unsetKdroop();
            return;
        case CimPackage.GOV_GASTWD__C:
            unsetC();
            return;
        case CimPackage.GOV_GASTWD__B:
            unsetB();
            return;
        case CimPackage.GOV_GASTWD__A:
            unsetA();
            return;
        case CimPackage.GOV_GASTWD__ECR:
            unsetEcr();
            return;
        case CimPackage.GOV_GASTWD__ETD:
            unsetEtd();
            return;
        case CimPackage.GOV_GASTWD__T4:
            unsetT4();
            return;
        case CimPackage.GOV_GASTWD__T5:
            unsetT5();
            return;
        case CimPackage.GOV_GASTWD__T3:
            unsetT3();
            return;
        case CimPackage.GOV_GASTWD__TT:
            unsetTt();
            return;
        case CimPackage.GOV_GASTWD__TR:
            unsetTr();
            return;
        case CimPackage.GOV_GASTWD__TD:
            unsetTd();
            return;
        case CimPackage.GOV_GASTWD__TF:
            unsetTf();
            return;
        case CimPackage.GOV_GASTWD__TC:
            unsetTc();
            return;
        case CimPackage.GOV_GASTWD__KD:
            unsetKd();
            return;
        case CimPackage.GOV_GASTWD__KF:
            unsetKf();
            return;
        case CimPackage.GOV_GASTWD__K3:
            unsetK3();
            return;
        case CimPackage.GOV_GASTWD__K4:
            unsetK4();
            return;
        case CimPackage.GOV_GASTWD__K5:
            unsetK5();
            return;
        case CimPackage.GOV_GASTWD__K6:
            unsetK6();
            return;
        case CimPackage.GOV_GASTWD__KP:
            unsetKp();
            return;
        case CimPackage.GOV_GASTWD__KI:
            unsetKi();
            return;
        case CimPackage.GOV_GASTWD__TCD:
            unsetTcd();
            return;
        case CimPackage.GOV_GASTWD__CF2:
            unsetCf2();
            return;
        case CimPackage.GOV_GASTWD__TRATE:
            unsetTrate();
            return;
        case CimPackage.GOV_GASTWD__T:
            unsetT();
            return;
        case CimPackage.GOV_GASTWD__AF2:
            unsetAf2();
            return;
        case CimPackage.GOV_GASTWD__AF1:
            unsetAf1();
            return;
        case CimPackage.GOV_GASTWD__TMAX:
            unsetTmax();
            return;
        case CimPackage.GOV_GASTWD__BF2:
            unsetBf2();
            return;
        case CimPackage.GOV_GASTWD__BF1:
            unsetBf1();
            return;
        case CimPackage.GOV_GASTWD__TMIN:
            unsetTmin();
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
        case CimPackage.GOV_GASTWD__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_GASTWD__KDROOP:
            return isSetKdroop();
        case CimPackage.GOV_GASTWD__C:
            return isSetC();
        case CimPackage.GOV_GASTWD__B:
            return isSetB();
        case CimPackage.GOV_GASTWD__A:
            return isSetA();
        case CimPackage.GOV_GASTWD__ECR:
            return isSetEcr();
        case CimPackage.GOV_GASTWD__ETD:
            return isSetEtd();
        case CimPackage.GOV_GASTWD__T4:
            return isSetT4();
        case CimPackage.GOV_GASTWD__T5:
            return isSetT5();
        case CimPackage.GOV_GASTWD__T3:
            return isSetT3();
        case CimPackage.GOV_GASTWD__TT:
            return isSetTt();
        case CimPackage.GOV_GASTWD__TR:
            return isSetTr();
        case CimPackage.GOV_GASTWD__TD:
            return isSetTd();
        case CimPackage.GOV_GASTWD__TF:
            return isSetTf();
        case CimPackage.GOV_GASTWD__TC:
            return isSetTc();
        case CimPackage.GOV_GASTWD__KD:
            return isSetKd();
        case CimPackage.GOV_GASTWD__KF:
            return isSetKf();
        case CimPackage.GOV_GASTWD__K3:
            return isSetK3();
        case CimPackage.GOV_GASTWD__K4:
            return isSetK4();
        case CimPackage.GOV_GASTWD__K5:
            return isSetK5();
        case CimPackage.GOV_GASTWD__K6:
            return isSetK6();
        case CimPackage.GOV_GASTWD__KP:
            return isSetKp();
        case CimPackage.GOV_GASTWD__KI:
            return isSetKi();
        case CimPackage.GOV_GASTWD__TCD:
            return isSetTcd();
        case CimPackage.GOV_GASTWD__CF2:
            return isSetCf2();
        case CimPackage.GOV_GASTWD__TRATE:
            return isSetTrate();
        case CimPackage.GOV_GASTWD__T:
            return isSetT();
        case CimPackage.GOV_GASTWD__AF2:
            return isSetAf2();
        case CimPackage.GOV_GASTWD__AF1:
            return isSetAf1();
        case CimPackage.GOV_GASTWD__TMAX:
            return isSetTmax();
        case CimPackage.GOV_GASTWD__BF2:
            return isSetBf2();
        case CimPackage.GOV_GASTWD__BF1:
            return isSetBf1();
        case CimPackage.GOV_GASTWD__TMIN:
            return isSetTmin();
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
        result.append( " (mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", kdroop: " );
        if( kdroopESet )
            result.append( kdroop );
        else
            result.append( "<unset>" );
        result.append( ", c: " );
        if( cESet )
            result.append( c );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", a: " );
        if( aESet )
            result.append( a );
        else
            result.append( "<unset>" );
        result.append( ", ecr: " );
        if( ecrESet )
            result.append( ecr );
        else
            result.append( "<unset>" );
        result.append( ", etd: " );
        if( etdESet )
            result.append( etd );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", tt: " );
        if( ttESet )
            result.append( tt );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
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
        result.append( ", k5: " );
        if( k5ESet )
            result.append( k5 );
        else
            result.append( "<unset>" );
        result.append( ", k6: " );
        if( k6ESet )
            result.append( k6 );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", tcd: " );
        if( tcdESet )
            result.append( tcd );
        else
            result.append( "<unset>" );
        result.append( ", cf2: " );
        if( cf2ESet )
            result.append( cf2 );
        else
            result.append( "<unset>" );
        result.append( ", trate: " );
        if( trateESet )
            result.append( trate );
        else
            result.append( "<unset>" );
        result.append( ", t: " );
        if( tESet )
            result.append( t );
        else
            result.append( "<unset>" );
        result.append( ", af2: " );
        if( af2ESet )
            result.append( af2 );
        else
            result.append( "<unset>" );
        result.append( ", af1: " );
        if( af1ESet )
            result.append( af1 );
        else
            result.append( "<unset>" );
        result.append( ", tmax: " );
        if( tmaxESet )
            result.append( tmax );
        else
            result.append( "<unset>" );
        result.append( ", bf2: " );
        if( bf2ESet )
            result.append( bf2 );
        else
            result.append( "<unset>" );
        result.append( ", bf1: " );
        if( bf1ESet )
            result.append( bf1 );
        else
            result.append( "<unset>" );
        result.append( ", tmin: " );
        if( tminESet )
            result.append( tmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovGASTWDImpl
