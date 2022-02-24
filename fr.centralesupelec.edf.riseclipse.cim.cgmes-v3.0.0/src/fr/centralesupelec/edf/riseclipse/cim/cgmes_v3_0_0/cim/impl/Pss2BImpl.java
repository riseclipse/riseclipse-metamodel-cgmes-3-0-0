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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss2 B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVstmin <em>Vstmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getA <em>A</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getN <em>N</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVsi2min <em>Vsi2min</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVsi2max <em>Vsi2max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTw1 <em>Tw1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTw3 <em>Tw3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTw4 <em>Tw4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVsi1max <em>Vsi1max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT11 <em>T11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getKs4 <em>Ks4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getKs3 <em>Ks3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT9 <em>T9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss2BImpl#getVsi1min <em>Vsi1min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pss2BImpl extends PowerSystemStabilizerDynamicsImpl implements Pss2B {
    /**
     * The default value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected static final Double VSTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected Double vstmin = VSTMIN_EDEFAULT;

    /**
     * This is true if the Vstmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstminESet;

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
     * The default value of the '{@link #getN() <em>N</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getN()
     * @generated
     * @ordered
     */
    protected static final BigInteger N_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getN() <em>N</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getN()
     * @generated
     * @ordered
     */
    protected BigInteger n = N_EDEFAULT;

    /**
     * This is true if the N attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nESet;

    /**
     * The default value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected static final BigInteger M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected BigInteger m = M_EDEFAULT;

    /**
     * This is true if the M attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mESet;

    /**
     * The default value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected static final Double VSTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected Double vstmax = VSTMAX_EDEFAULT;

    /**
     * This is true if the Vstmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstmaxESet;

    /**
     * The default value of the '{@link #getVsi2min() <em>Vsi2min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi2min()
     * @generated
     * @ordered
     */
    protected static final Double VSI2MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsi2min() <em>Vsi2min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi2min()
     * @generated
     * @ordered
     */
    protected Double vsi2min = VSI2MIN_EDEFAULT;

    /**
     * This is true if the Vsi2min attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsi2minESet;

    /**
     * The default value of the '{@link #getVsi2max() <em>Vsi2max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi2max()
     * @generated
     * @ordered
     */
    protected static final Double VSI2MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsi2max() <em>Vsi2max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi2max()
     * @generated
     * @ordered
     */
    protected Double vsi2max = VSI2MAX_EDEFAULT;

    /**
     * This is true if the Vsi2max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsi2maxESet;

    /**
     * The default value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected static final Double TW1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected Double tw1 = TW1_EDEFAULT;

    /**
     * This is true if the Tw1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw1ESet;

    /**
     * The default value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected static final Double TW2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected Double tw2 = TW2_EDEFAULT;

    /**
     * This is true if the Tw2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw2ESet;

    /**
     * The default value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected static final Double TW3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected Double tw3 = TW3_EDEFAULT;

    /**
     * This is true if the Tw3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw3ESet;

    /**
     * The default value of the '{@link #getTw4() <em>Tw4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw4()
     * @generated
     * @ordered
     */
    protected static final Double TW4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw4() <em>Tw4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw4()
     * @generated
     * @ordered
     */
    protected Double tw4 = TW4_EDEFAULT;

    /**
     * This is true if the Tw4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw4ESet;

    /**
     * The default value of the '{@link #getVsi1max() <em>Vsi1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi1max()
     * @generated
     * @ordered
     */
    protected static final Double VSI1MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsi1max() <em>Vsi1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi1max()
     * @generated
     * @ordered
     */
    protected Double vsi1max = VSI1MAX_EDEFAULT;

    /**
     * This is true if the Vsi1max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsi1maxESet;

    /**
     * The default value of the '{@link #getT10() <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT10()
     * @generated
     * @ordered
     */
    protected static final Double T10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT10() <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT10()
     * @generated
     * @ordered
     */
    protected Double t10 = T10_EDEFAULT;

    /**
     * This is true if the T10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t10ESet;

    /**
     * The default value of the '{@link #getT11() <em>T11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT11()
     * @generated
     * @ordered
     */
    protected static final Double T11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT11() <em>T11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT11()
     * @generated
     * @ordered
     */
    protected Double t11 = T11_EDEFAULT;

    /**
     * This is true if the T11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t11ESet;

    /**
     * The default value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected static final Double KS1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected Double ks1 = KS1_EDEFAULT;

    /**
     * This is true if the Ks1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks1ESet;

    /**
     * The default value of the '{@link #getKs4() <em>Ks4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs4()
     * @generated
     * @ordered
     */
    protected static final Double KS4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs4() <em>Ks4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs4()
     * @generated
     * @ordered
     */
    protected Double ks4 = KS4_EDEFAULT;

    /**
     * This is true if the Ks4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks4ESet;

    /**
     * The default value of the '{@link #getKs3() <em>Ks3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs3()
     * @generated
     * @ordered
     */
    protected static final Double KS3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs3() <em>Ks3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs3()
     * @generated
     * @ordered
     */
    protected Double ks3 = KS3_EDEFAULT;

    /**
     * This is true if the Ks3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks3ESet;

    /**
     * The default value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected static final Double KS2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected Double ks2 = KS2_EDEFAULT;

    /**
     * This is true if the Ks2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks2ESet;

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
     * The default value of the '{@link #getT7() <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT7()
     * @generated
     * @ordered
     */
    protected static final Double T7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT7() <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT7()
     * @generated
     * @ordered
     */
    protected Double t7 = T7_EDEFAULT;

    /**
     * This is true if the T7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t7ESet;

    /**
     * The default value of the '{@link #getT8() <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT8()
     * @generated
     * @ordered
     */
    protected static final Double T8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT8() <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT8()
     * @generated
     * @ordered
     */
    protected Double t8 = T8_EDEFAULT;

    /**
     * This is true if the T8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t8ESet;

    /**
     * The default value of the '{@link #getT9() <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT9()
     * @generated
     * @ordered
     */
    protected static final Double T9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT9() <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT9()
     * @generated
     * @ordered
     */
    protected Double t9 = T9_EDEFAULT;

    /**
     * This is true if the T9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t9ESet;

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
     * The default value of the '{@link #getVsi1min() <em>Vsi1min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi1min()
     * @generated
     * @ordered
     */
    protected static final Double VSI1MIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsi1min() <em>Vsi1min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsi1min()
     * @generated
     * @ordered
     */
    protected Double vsi1min = VSI1MIN_EDEFAULT;

    /**
     * This is true if the Vsi1min attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsi1minESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Pss2BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPss2B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVstmin() {
        return vstmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmin( Double newVstmin ) {
        Double oldVstmin = vstmin;
        vstmin = newVstmin;
        boolean oldVstminESet = vstminESet;
        vstminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSTMIN, oldVstmin, vstmin,
                    !oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmin() {
        Double oldVstmin = vstmin;
        boolean oldVstminESet = vstminESet;
        vstmin = VSTMIN_EDEFAULT;
        vstminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSTMIN, oldVstmin,
                    VSTMIN_EDEFAULT, oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmin() {
        return vstminESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__A, oldA, a, !oldAESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__A, oldA, A_EDEFAULT,
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
    public BigInteger getN() {
        return n;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setN( BigInteger newN ) {
        BigInteger oldN = n;
        n = newN;
        boolean oldNESet = nESet;
        nESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__N, oldN, n, !oldNESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetN() {
        BigInteger oldN = n;
        boolean oldNESet = nESet;
        n = N_EDEFAULT;
        nESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__N, oldN, N_EDEFAULT,
                    oldNESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetN() {
        return nESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getM() {
        return m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setM( BigInteger newM ) {
        BigInteger oldM = m;
        m = newM;
        boolean oldMESet = mESet;
        mESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__M, oldM, m, !oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetM() {
        BigInteger oldM = m;
        boolean oldMESet = mESet;
        m = M_EDEFAULT;
        mESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__M, oldM, M_EDEFAULT,
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
    public Double getVstmax() {
        return vstmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmax( Double newVstmax ) {
        Double oldVstmax = vstmax;
        vstmax = newVstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSTMAX, oldVstmax, vstmax,
                    !oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmax() {
        Double oldVstmax = vstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmax = VSTMAX_EDEFAULT;
        vstmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSTMAX, oldVstmax,
                    VSTMAX_EDEFAULT, oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmax() {
        return vstmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsi2min() {
        return vsi2min;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsi2min( Double newVsi2min ) {
        Double oldVsi2min = vsi2min;
        vsi2min = newVsi2min;
        boolean oldVsi2minESet = vsi2minESet;
        vsi2minESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSI2MIN, oldVsi2min, vsi2min,
                    !oldVsi2minESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsi2min() {
        Double oldVsi2min = vsi2min;
        boolean oldVsi2minESet = vsi2minESet;
        vsi2min = VSI2MIN_EDEFAULT;
        vsi2minESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSI2MIN, oldVsi2min,
                    VSI2MIN_EDEFAULT, oldVsi2minESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsi2min() {
        return vsi2minESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsi2max() {
        return vsi2max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsi2max( Double newVsi2max ) {
        Double oldVsi2max = vsi2max;
        vsi2max = newVsi2max;
        boolean oldVsi2maxESet = vsi2maxESet;
        vsi2maxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSI2MAX, oldVsi2max, vsi2max,
                    !oldVsi2maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsi2max() {
        Double oldVsi2max = vsi2max;
        boolean oldVsi2maxESet = vsi2maxESet;
        vsi2max = VSI2MAX_EDEFAULT;
        vsi2maxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSI2MAX, oldVsi2max,
                    VSI2MAX_EDEFAULT, oldVsi2maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsi2max() {
        return vsi2maxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw1() {
        return tw1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw1( Double newTw1 ) {
        Double oldTw1 = tw1;
        tw1 = newTw1;
        boolean oldTw1ESet = tw1ESet;
        tw1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TW1, oldTw1, tw1,
                    !oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw1() {
        Double oldTw1 = tw1;
        boolean oldTw1ESet = tw1ESet;
        tw1 = TW1_EDEFAULT;
        tw1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TW1, oldTw1, TW1_EDEFAULT,
                    oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw1() {
        return tw1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw2() {
        return tw2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw2( Double newTw2 ) {
        Double oldTw2 = tw2;
        tw2 = newTw2;
        boolean oldTw2ESet = tw2ESet;
        tw2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TW2, oldTw2, tw2,
                    !oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw2() {
        Double oldTw2 = tw2;
        boolean oldTw2ESet = tw2ESet;
        tw2 = TW2_EDEFAULT;
        tw2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TW2, oldTw2, TW2_EDEFAULT,
                    oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw2() {
        return tw2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw3() {
        return tw3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw3( Double newTw3 ) {
        Double oldTw3 = tw3;
        tw3 = newTw3;
        boolean oldTw3ESet = tw3ESet;
        tw3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TW3, oldTw3, tw3,
                    !oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw3() {
        Double oldTw3 = tw3;
        boolean oldTw3ESet = tw3ESet;
        tw3 = TW3_EDEFAULT;
        tw3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TW3, oldTw3, TW3_EDEFAULT,
                    oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw3() {
        return tw3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw4() {
        return tw4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw4( Double newTw4 ) {
        Double oldTw4 = tw4;
        tw4 = newTw4;
        boolean oldTw4ESet = tw4ESet;
        tw4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TW4, oldTw4, tw4,
                    !oldTw4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw4() {
        Double oldTw4 = tw4;
        boolean oldTw4ESet = tw4ESet;
        tw4 = TW4_EDEFAULT;
        tw4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TW4, oldTw4, TW4_EDEFAULT,
                    oldTw4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw4() {
        return tw4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsi1max() {
        return vsi1max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsi1max( Double newVsi1max ) {
        Double oldVsi1max = vsi1max;
        vsi1max = newVsi1max;
        boolean oldVsi1maxESet = vsi1maxESet;
        vsi1maxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSI1MAX, oldVsi1max, vsi1max,
                    !oldVsi1maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsi1max() {
        Double oldVsi1max = vsi1max;
        boolean oldVsi1maxESet = vsi1maxESet;
        vsi1max = VSI1MAX_EDEFAULT;
        vsi1maxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSI1MAX, oldVsi1max,
                    VSI1MAX_EDEFAULT, oldVsi1maxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsi1max() {
        return vsi1maxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT10() {
        return t10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT10( Double newT10 ) {
        Double oldT10 = t10;
        t10 = newT10;
        boolean oldT10ESet = t10ESet;
        t10ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T10, oldT10, t10,
                    !oldT10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT10() {
        Double oldT10 = t10;
        boolean oldT10ESet = t10ESet;
        t10 = T10_EDEFAULT;
        t10ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T10, oldT10, T10_EDEFAULT,
                    oldT10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT10() {
        return t10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT11() {
        return t11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT11( Double newT11 ) {
        Double oldT11 = t11;
        t11 = newT11;
        boolean oldT11ESet = t11ESet;
        t11ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T11, oldT11, t11,
                    !oldT11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT11() {
        Double oldT11 = t11;
        boolean oldT11ESet = t11ESet;
        t11 = T11_EDEFAULT;
        t11ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T11, oldT11, T11_EDEFAULT,
                    oldT11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT11() {
        return t11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs1() {
        return ks1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs1( Double newKs1 ) {
        Double oldKs1 = ks1;
        ks1 = newKs1;
        boolean oldKs1ESet = ks1ESet;
        ks1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__KS1, oldKs1, ks1,
                    !oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs1() {
        Double oldKs1 = ks1;
        boolean oldKs1ESet = ks1ESet;
        ks1 = KS1_EDEFAULT;
        ks1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__KS1, oldKs1, KS1_EDEFAULT,
                    oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs1() {
        return ks1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs4() {
        return ks4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs4( Double newKs4 ) {
        Double oldKs4 = ks4;
        ks4 = newKs4;
        boolean oldKs4ESet = ks4ESet;
        ks4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__KS4, oldKs4, ks4,
                    !oldKs4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs4() {
        Double oldKs4 = ks4;
        boolean oldKs4ESet = ks4ESet;
        ks4 = KS4_EDEFAULT;
        ks4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__KS4, oldKs4, KS4_EDEFAULT,
                    oldKs4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs4() {
        return ks4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs3() {
        return ks3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs3( Double newKs3 ) {
        Double oldKs3 = ks3;
        ks3 = newKs3;
        boolean oldKs3ESet = ks3ESet;
        ks3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__KS3, oldKs3, ks3,
                    !oldKs3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs3() {
        Double oldKs3 = ks3;
        boolean oldKs3ESet = ks3ESet;
        ks3 = KS3_EDEFAULT;
        ks3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__KS3, oldKs3, KS3_EDEFAULT,
                    oldKs3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs3() {
        return ks3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs2() {
        return ks2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs2( Double newKs2 ) {
        Double oldKs2 = ks2;
        ks2 = newKs2;
        boolean oldKs2ESet = ks2ESet;
        ks2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__KS2, oldKs2, ks2,
                    !oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs2() {
        Double oldKs2 = ks2;
        boolean oldKs2ESet = ks2ESet;
        ks2 = KS2_EDEFAULT;
        ks2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__KS2, oldKs2, KS2_EDEFAULT,
                    oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs2() {
        return ks2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T6, oldT6, t6, !oldT6ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T6, oldT6, T6_EDEFAULT,
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
    public Double getT7() {
        return t7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT7( Double newT7 ) {
        Double oldT7 = t7;
        t7 = newT7;
        boolean oldT7ESet = t7ESet;
        t7ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T7, oldT7, t7, !oldT7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT7() {
        Double oldT7 = t7;
        boolean oldT7ESet = t7ESet;
        t7 = T7_EDEFAULT;
        t7ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T7, oldT7, T7_EDEFAULT,
                    oldT7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT7() {
        return t7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT8() {
        return t8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT8( Double newT8 ) {
        Double oldT8 = t8;
        t8 = newT8;
        boolean oldT8ESet = t8ESet;
        t8ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T8, oldT8, t8, !oldT8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT8() {
        Double oldT8 = t8;
        boolean oldT8ESet = t8ESet;
        t8 = T8_EDEFAULT;
        t8ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T8, oldT8, T8_EDEFAULT,
                    oldT8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT8() {
        return t8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT9() {
        return t9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT9( Double newT9 ) {
        Double oldT9 = t9;
        t9 = newT9;
        boolean oldT9ESet = t9ESet;
        t9ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T9, oldT9, t9, !oldT9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT9() {
        Double oldT9 = t9;
        boolean oldT9ESet = t9ESet;
        t9 = T9_EDEFAULT;
        t9ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T9, oldT9, T9_EDEFAULT,
                    oldT9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT9() {
        return t9ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T2, oldT2, t2, !oldT2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T3, oldT3, t3, !oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T3, oldT3, T3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T4, oldT4, t4, !oldT4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T4, oldT4, T4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__T1, oldT1, t1, !oldT1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__T1, oldT1, T1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TB, oldTb, tb, !oldTbESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TB, oldTb, TB_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__TA, oldTa, ta, !oldTaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__TA, oldTa, TA_EDEFAULT,
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
    public Double getVsi1min() {
        return vsi1min;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsi1min( Double newVsi1min ) {
        Double oldVsi1min = vsi1min;
        vsi1min = newVsi1min;
        boolean oldVsi1minESet = vsi1minESet;
        vsi1minESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_B__VSI1MIN, oldVsi1min, vsi1min,
                    !oldVsi1minESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsi1min() {
        Double oldVsi1min = vsi1min;
        boolean oldVsi1minESet = vsi1minESet;
        vsi1min = VSI1MIN_EDEFAULT;
        vsi1minESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_B__VSI1MIN, oldVsi1min,
                    VSI1MIN_EDEFAULT, oldVsi1minESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsi1min() {
        return vsi1minESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS2_B__VSTMIN:
            return getVstmin();
        case CimPackage.PSS2_B__A:
            return getA();
        case CimPackage.PSS2_B__N:
            return getN();
        case CimPackage.PSS2_B__M:
            return getM();
        case CimPackage.PSS2_B__VSTMAX:
            return getVstmax();
        case CimPackage.PSS2_B__VSI2MIN:
            return getVsi2min();
        case CimPackage.PSS2_B__VSI2MAX:
            return getVsi2max();
        case CimPackage.PSS2_B__TW1:
            return getTw1();
        case CimPackage.PSS2_B__TW2:
            return getTw2();
        case CimPackage.PSS2_B__TW3:
            return getTw3();
        case CimPackage.PSS2_B__TW4:
            return getTw4();
        case CimPackage.PSS2_B__VSI1MAX:
            return getVsi1max();
        case CimPackage.PSS2_B__T10:
            return getT10();
        case CimPackage.PSS2_B__T11:
            return getT11();
        case CimPackage.PSS2_B__KS1:
            return getKs1();
        case CimPackage.PSS2_B__KS4:
            return getKs4();
        case CimPackage.PSS2_B__KS3:
            return getKs3();
        case CimPackage.PSS2_B__KS2:
            return getKs2();
        case CimPackage.PSS2_B__T6:
            return getT6();
        case CimPackage.PSS2_B__T7:
            return getT7();
        case CimPackage.PSS2_B__T8:
            return getT8();
        case CimPackage.PSS2_B__T9:
            return getT9();
        case CimPackage.PSS2_B__T2:
            return getT2();
        case CimPackage.PSS2_B__T3:
            return getT3();
        case CimPackage.PSS2_B__T4:
            return getT4();
        case CimPackage.PSS2_B__T1:
            return getT1();
        case CimPackage.PSS2_B__TB:
            return getTb();
        case CimPackage.PSS2_B__TA:
            return getTa();
        case CimPackage.PSS2_B__VSI1MIN:
            return getVsi1min();
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
        case CimPackage.PSS2_B__VSTMIN:
            setVstmin( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__A:
            setA( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__N:
            setN( ( BigInteger ) newValue );
            return;
        case CimPackage.PSS2_B__M:
            setM( ( BigInteger ) newValue );
            return;
        case CimPackage.PSS2_B__VSTMAX:
            setVstmax( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__VSI2MIN:
            setVsi2min( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__VSI2MAX:
            setVsi2max( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TW1:
            setTw1( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TW2:
            setTw2( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TW3:
            setTw3( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TW4:
            setTw4( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__VSI1MAX:
            setVsi1max( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T10:
            setT10( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T11:
            setT11( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__KS1:
            setKs1( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__KS4:
            setKs4( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__KS3:
            setKs3( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__KS2:
            setKs2( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T6:
            setT6( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T7:
            setT7( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T8:
            setT8( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T9:
            setT9( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.PSS2_B__VSI1MIN:
            setVsi1min( ( Double ) newValue );
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
        case CimPackage.PSS2_B__VSTMIN:
            unsetVstmin();
            return;
        case CimPackage.PSS2_B__A:
            unsetA();
            return;
        case CimPackage.PSS2_B__N:
            unsetN();
            return;
        case CimPackage.PSS2_B__M:
            unsetM();
            return;
        case CimPackage.PSS2_B__VSTMAX:
            unsetVstmax();
            return;
        case CimPackage.PSS2_B__VSI2MIN:
            unsetVsi2min();
            return;
        case CimPackage.PSS2_B__VSI2MAX:
            unsetVsi2max();
            return;
        case CimPackage.PSS2_B__TW1:
            unsetTw1();
            return;
        case CimPackage.PSS2_B__TW2:
            unsetTw2();
            return;
        case CimPackage.PSS2_B__TW3:
            unsetTw3();
            return;
        case CimPackage.PSS2_B__TW4:
            unsetTw4();
            return;
        case CimPackage.PSS2_B__VSI1MAX:
            unsetVsi1max();
            return;
        case CimPackage.PSS2_B__T10:
            unsetT10();
            return;
        case CimPackage.PSS2_B__T11:
            unsetT11();
            return;
        case CimPackage.PSS2_B__KS1:
            unsetKs1();
            return;
        case CimPackage.PSS2_B__KS4:
            unsetKs4();
            return;
        case CimPackage.PSS2_B__KS3:
            unsetKs3();
            return;
        case CimPackage.PSS2_B__KS2:
            unsetKs2();
            return;
        case CimPackage.PSS2_B__T6:
            unsetT6();
            return;
        case CimPackage.PSS2_B__T7:
            unsetT7();
            return;
        case CimPackage.PSS2_B__T8:
            unsetT8();
            return;
        case CimPackage.PSS2_B__T9:
            unsetT9();
            return;
        case CimPackage.PSS2_B__T2:
            unsetT2();
            return;
        case CimPackage.PSS2_B__T3:
            unsetT3();
            return;
        case CimPackage.PSS2_B__T4:
            unsetT4();
            return;
        case CimPackage.PSS2_B__T1:
            unsetT1();
            return;
        case CimPackage.PSS2_B__TB:
            unsetTb();
            return;
        case CimPackage.PSS2_B__TA:
            unsetTa();
            return;
        case CimPackage.PSS2_B__VSI1MIN:
            unsetVsi1min();
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
        case CimPackage.PSS2_B__VSTMIN:
            return isSetVstmin();
        case CimPackage.PSS2_B__A:
            return isSetA();
        case CimPackage.PSS2_B__N:
            return isSetN();
        case CimPackage.PSS2_B__M:
            return isSetM();
        case CimPackage.PSS2_B__VSTMAX:
            return isSetVstmax();
        case CimPackage.PSS2_B__VSI2MIN:
            return isSetVsi2min();
        case CimPackage.PSS2_B__VSI2MAX:
            return isSetVsi2max();
        case CimPackage.PSS2_B__TW1:
            return isSetTw1();
        case CimPackage.PSS2_B__TW2:
            return isSetTw2();
        case CimPackage.PSS2_B__TW3:
            return isSetTw3();
        case CimPackage.PSS2_B__TW4:
            return isSetTw4();
        case CimPackage.PSS2_B__VSI1MAX:
            return isSetVsi1max();
        case CimPackage.PSS2_B__T10:
            return isSetT10();
        case CimPackage.PSS2_B__T11:
            return isSetT11();
        case CimPackage.PSS2_B__KS1:
            return isSetKs1();
        case CimPackage.PSS2_B__KS4:
            return isSetKs4();
        case CimPackage.PSS2_B__KS3:
            return isSetKs3();
        case CimPackage.PSS2_B__KS2:
            return isSetKs2();
        case CimPackage.PSS2_B__T6:
            return isSetT6();
        case CimPackage.PSS2_B__T7:
            return isSetT7();
        case CimPackage.PSS2_B__T8:
            return isSetT8();
        case CimPackage.PSS2_B__T9:
            return isSetT9();
        case CimPackage.PSS2_B__T2:
            return isSetT2();
        case CimPackage.PSS2_B__T3:
            return isSetT3();
        case CimPackage.PSS2_B__T4:
            return isSetT4();
        case CimPackage.PSS2_B__T1:
            return isSetT1();
        case CimPackage.PSS2_B__TB:
            return isSetTb();
        case CimPackage.PSS2_B__TA:
            return isSetTa();
        case CimPackage.PSS2_B__VSI1MIN:
            return isSetVsi1min();
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
        result.append( " (vstmin: " );
        if( vstminESet )
            result.append( vstmin );
        else
            result.append( "<unset>" );
        result.append( ", a: " );
        if( aESet )
            result.append( a );
        else
            result.append( "<unset>" );
        result.append( ", n: " );
        if( nESet )
            result.append( n );
        else
            result.append( "<unset>" );
        result.append( ", m: " );
        if( mESet )
            result.append( m );
        else
            result.append( "<unset>" );
        result.append( ", vstmax: " );
        if( vstmaxESet )
            result.append( vstmax );
        else
            result.append( "<unset>" );
        result.append( ", vsi2min: " );
        if( vsi2minESet )
            result.append( vsi2min );
        else
            result.append( "<unset>" );
        result.append( ", vsi2max: " );
        if( vsi2maxESet )
            result.append( vsi2max );
        else
            result.append( "<unset>" );
        result.append( ", tw1: " );
        if( tw1ESet )
            result.append( tw1 );
        else
            result.append( "<unset>" );
        result.append( ", tw2: " );
        if( tw2ESet )
            result.append( tw2 );
        else
            result.append( "<unset>" );
        result.append( ", tw3: " );
        if( tw3ESet )
            result.append( tw3 );
        else
            result.append( "<unset>" );
        result.append( ", tw4: " );
        if( tw4ESet )
            result.append( tw4 );
        else
            result.append( "<unset>" );
        result.append( ", vsi1max: " );
        if( vsi1maxESet )
            result.append( vsi1max );
        else
            result.append( "<unset>" );
        result.append( ", t10: " );
        if( t10ESet )
            result.append( t10 );
        else
            result.append( "<unset>" );
        result.append( ", t11: " );
        if( t11ESet )
            result.append( t11 );
        else
            result.append( "<unset>" );
        result.append( ", ks1: " );
        if( ks1ESet )
            result.append( ks1 );
        else
            result.append( "<unset>" );
        result.append( ", ks4: " );
        if( ks4ESet )
            result.append( ks4 );
        else
            result.append( "<unset>" );
        result.append( ", ks3: " );
        if( ks3ESet )
            result.append( ks3 );
        else
            result.append( "<unset>" );
        result.append( ", ks2: " );
        if( ks2ESet )
            result.append( ks2 );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t7: " );
        if( t7ESet )
            result.append( t7 );
        else
            result.append( "<unset>" );
        result.append( ", t8: " );
        if( t8ESet )
            result.append( t8 );
        else
            result.append( "<unset>" );
        result.append( ", t9: " );
        if( t9ESet )
            result.append( t9 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", vsi1min: " );
        if( vsi1minESet )
            result.append( vsi1min );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //Pss2BImpl
