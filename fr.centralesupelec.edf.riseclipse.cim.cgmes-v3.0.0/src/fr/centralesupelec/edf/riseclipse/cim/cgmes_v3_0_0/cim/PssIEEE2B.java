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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pss IEEE2B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type PSS2B power system stabilizer model. This stabilizer model is designed to represent a variety of dual-input stabilizers, which normally use combinations of power and speed or frequency to derive the stabilizing signal.
 * Reference: IEEE 2B 421.5-2005, 8.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT11 <em>T11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT10 <em>T10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getN <em>N</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT9 <em>T9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT8 <em>T8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1max <em>Vsi1max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1min <em>Vsi1min</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal2Type <em>Input Signal2 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal1Type <em>Input Signal1 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2max <em>Vsi2max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmin <em>Vstmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2min <em>Vsi2min</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw3 <em>Tw3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw4 <em>Tw4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw1 <em>Tw1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs3 <em>Ks3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs1 <em>Ks1</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B()
 * @model
 * @generated
 */
public interface PssIEEE2B extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>T11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T11</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T11</em>' attribute.
     * @see #isSetT11()
     * @see #unsetT11()
     * @see #setT11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT11 <em>T11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T11</em>' attribute.
     * @see #isSetT11()
     * @see #unsetT11()
     * @see #getT11()
     * @generated
     */
    void setT11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT11 <em>T11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT11()
     * @see #getT11()
     * @see #setT11(Double)
     * @generated
     */
    void unsetT11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT11 <em>T11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T11</em>' attribute is set.
     * @see #unsetT11()
     * @see #getT11()
     * @see #setT11(Double)
     * @generated
     */
    boolean isSetT11();

    /**
     * Returns the value of the '<em><b>T10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T10</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T10</em>' attribute.
     * @see #isSetT10()
     * @see #unsetT10()
     * @see #setT10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT10 <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T10</em>' attribute.
     * @see #isSetT10()
     * @see #unsetT10()
     * @see #getT10()
     * @generated
     */
    void setT10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT10 <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT10()
     * @see #getT10()
     * @see #setT10(Double)
     * @generated
     */
    void unsetT10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT10 <em>T10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T10</em>' attribute is set.
     * @see #unsetT10()
     * @see #getT10()
     * @see #setT10(Double)
     * @generated
     */
    boolean isSetT10();

    /**
     * Returns the value of the '<em><b>M</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Denominator order of ramp tracking filter (<i>M</i>).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #setM(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_M()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.m' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getM();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #getM()
     * @generated
     */
    void setM( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetM()
     * @see #getM()
     * @see #setM(BigInteger)
     * @generated
     */
    void unsetM();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getM <em>M</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>M</em>' attribute is set.
     * @see #unsetM()
     * @see #getM()
     * @see #setM(BigInteger)
     * @generated
     */
    boolean isSetM();

    /**
     * Returns the value of the '<em><b>N</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Order of ramp tracking filter (<i>N</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>N</em>' attribute.
     * @see #isSetN()
     * @see #unsetN()
     * @see #setN(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_N()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.n' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getN <em>N</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>N</em>' attribute.
     * @see #isSetN()
     * @see #unsetN()
     * @see #getN()
     * @generated
     */
    void setN( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getN <em>N</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetN()
     * @see #getN()
     * @see #setN(BigInteger)
     * @generated
     */
    void unsetN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getN <em>N</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>N</em>' attribute is set.
     * @see #unsetN()
     * @see #getN()
     * @see #setN(BigInteger)
     * @generated
     */
    boolean isSetN();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T3</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T2</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #getT4()
     * @generated
     */
    void setT4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT4 <em>T4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4</em>' attribute is set.
     * @see #unsetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    boolean isSetT4();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>T7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant on signal #2 (<i>T7</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T7</em>' attribute.
     * @see #isSetT7()
     * @see #unsetT7()
     * @see #setT7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT7 <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T7</em>' attribute.
     * @see #isSetT7()
     * @see #unsetT7()
     * @see #getT7()
     * @generated
     */
    void setT7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT7 <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT7()
     * @see #getT7()
     * @see #setT7(Double)
     * @generated
     */
    void unsetT7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT7 <em>T7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T7</em>' attribute is set.
     * @see #unsetT7()
     * @see #getT7()
     * @see #setT7(Double)
     * @generated
     */
    boolean isSetT7();

    /**
     * Returns the value of the '<em><b>T6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant on signal #1 (<i>T6</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T6</em>' attribute.
     * @see #isSetT6()
     * @see #unsetT6()
     * @see #setT6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT6 <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T6</em>' attribute.
     * @see #isSetT6()
     * @see #unsetT6()
     * @see #getT6()
     * @generated
     */
    void setT6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT6 <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT6()
     * @see #getT6()
     * @see #setT6(Double)
     * @generated
     */
    void unsetT6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT6 <em>T6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T6</em>' attribute is set.
     * @see #unsetT6()
     * @see #getT6()
     * @see #setT6(Double)
     * @generated
     */
    boolean isSetT6();

    /**
     * Returns the value of the '<em><b>T9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lag of ramp tracking filter (<i>T9</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T9</em>' attribute.
     * @see #isSetT9()
     * @see #unsetT9()
     * @see #setT9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT9 <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T9</em>' attribute.
     * @see #isSetT9()
     * @see #unsetT9()
     * @see #getT9()
     * @generated
     */
    void setT9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT9 <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT9()
     * @see #getT9()
     * @see #setT9(Double)
     * @generated
     */
    void unsetT9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT9 <em>T9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T9</em>' attribute is set.
     * @see #unsetT9()
     * @see #getT9()
     * @see #setT9(Double)
     * @generated
     */
    boolean isSetT9();

    /**
     * Returns the value of the '<em><b>T8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead of ramp tracking filter (<i>T8</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T8</em>' attribute.
     * @see #isSetT8()
     * @see #unsetT8()
     * @see #setT8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_T8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.t8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT8 <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T8</em>' attribute.
     * @see #isSetT8()
     * @see #unsetT8()
     * @see #getT8()
     * @generated
     */
    void setT8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT8 <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT8()
     * @see #getT8()
     * @see #setT8(Double)
     * @generated
     */
    void unsetT8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getT8 <em>T8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T8</em>' attribute is set.
     * @see #unsetT8()
     * @see #getT8()
     * @see #setT8(Double)
     * @generated
     */
    boolean isSetT8();

    /**
     * Returns the value of the '<em><b>Vsi1max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal #1 maximum limit (<i>Vsi1max</i>) (&gt; PssIEEE2B.vsi1min).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsi1max</em>' attribute.
     * @see #isSetVsi1max()
     * @see #unsetVsi1max()
     * @see #setVsi1max(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vsi1max()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vsi1max' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsi1max();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1max <em>Vsi1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsi1max</em>' attribute.
     * @see #isSetVsi1max()
     * @see #unsetVsi1max()
     * @see #getVsi1max()
     * @generated
     */
    void setVsi1max( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1max <em>Vsi1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsi1max()
     * @see #getVsi1max()
     * @see #setVsi1max(Double)
     * @generated
     */
    void unsetVsi1max();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1max <em>Vsi1max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsi1max</em>' attribute is set.
     * @see #unsetVsi1max()
     * @see #getVsi1max()
     * @see #setVsi1max(Double)
     * @generated
     */
    boolean isSetVsi1max();

    /**
     * Returns the value of the '<em><b>Vsi1min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal #1 minimum limit (<i>Vsi1min</i>) (&lt; PssIEEE2B.vsi1max).  Typical value = -2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsi1min</em>' attribute.
     * @see #isSetVsi1min()
     * @see #unsetVsi1min()
     * @see #setVsi1min(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vsi1min()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vsi1min' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsi1min();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1min <em>Vsi1min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsi1min</em>' attribute.
     * @see #isSetVsi1min()
     * @see #unsetVsi1min()
     * @see #getVsi1min()
     * @generated
     */
    void setVsi1min( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1min <em>Vsi1min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsi1min()
     * @see #getVsi1min()
     * @see #setVsi1min(Double)
     * @generated
     */
    void unsetVsi1min();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi1min <em>Vsi1min</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsi1min</em>' attribute is set.
     * @see #unsetVsi1min()
     * @see #getVsi1min()
     * @see #setVsi1min(Double)
     * @generated
     */
    boolean isSetVsi1min();

    /**
     * Returns the value of the '<em><b>Input Signal2 Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of input signal #2 (generatorElectricalPower).  Typical value = generatorElectricalPower.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Signal2 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal2Type()
     * @see #unsetInputSignal2Type()
     * @see #setInputSignal2Type(InputSignalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_InputSignal2Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.inputSignal2Type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    InputSignalKind getInputSignal2Type();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Signal2 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal2Type()
     * @see #unsetInputSignal2Type()
     * @see #getInputSignal2Type()
     * @generated
     */
    void setInputSignal2Type( InputSignalKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputSignal2Type()
     * @see #getInputSignal2Type()
     * @see #setInputSignal2Type(InputSignalKind)
     * @generated
     */
    void unsetInputSignal2Type();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Signal2 Type</em>' attribute is set.
     * @see #unsetInputSignal2Type()
     * @see #getInputSignal2Type()
     * @see #setInputSignal2Type(InputSignalKind)
     * @generated
     */
    boolean isSetInputSignal2Type();

    /**
     * Returns the value of the '<em><b>Input Signal1 Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of input signal #1 (rotorAngularFrequencyDeviation, busFrequencyDeviation).  Typical value = rotorAngularFrequencyDeviation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Signal1 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal1Type()
     * @see #unsetInputSignal1Type()
     * @see #setInputSignal1Type(InputSignalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_InputSignal1Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.inputSignal1Type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    InputSignalKind getInputSignal1Type();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Signal1 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal1Type()
     * @see #unsetInputSignal1Type()
     * @see #getInputSignal1Type()
     * @generated
     */
    void setInputSignal1Type( InputSignalKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputSignal1Type()
     * @see #getInputSignal1Type()
     * @see #setInputSignal1Type(InputSignalKind)
     * @generated
     */
    void unsetInputSignal1Type();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Signal1 Type</em>' attribute is set.
     * @see #unsetInputSignal1Type()
     * @see #getInputSignal1Type()
     * @see #setInputSignal1Type(InputSignalKind)
     * @generated
     */
    boolean isSetInputSignal1Type();

    /**
     * Returns the value of the '<em><b>Vstmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output maximum limit (<i>Vstmax</i>) (&gt; PssIEEE2B.vstmin).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmax</em>' attribute.
     * @see #isSetVstmax()
     * @see #unsetVstmax()
     * @see #setVstmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vstmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vstmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmax <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vstmax</em>' attribute.
     * @see #isSetVstmax()
     * @see #unsetVstmax()
     * @see #getVstmax()
     * @generated
     */
    void setVstmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmax <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    void unsetVstmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmax <em>Vstmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vstmax</em>' attribute is set.
     * @see #unsetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    boolean isSetVstmax();

    /**
     * Returns the value of the '<em><b>Vsi2max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal #2 maximum limit (<i>Vsi2max</i>) (&gt; PssIEEE2B.vsi2min).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsi2max</em>' attribute.
     * @see #isSetVsi2max()
     * @see #unsetVsi2max()
     * @see #setVsi2max(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vsi2max()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vsi2max' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsi2max();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2max <em>Vsi2max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsi2max</em>' attribute.
     * @see #isSetVsi2max()
     * @see #unsetVsi2max()
     * @see #getVsi2max()
     * @generated
     */
    void setVsi2max( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2max <em>Vsi2max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsi2max()
     * @see #getVsi2max()
     * @see #setVsi2max(Double)
     * @generated
     */
    void unsetVsi2max();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2max <em>Vsi2max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsi2max</em>' attribute is set.
     * @see #unsetVsi2max()
     * @see #getVsi2max()
     * @see #setVsi2max(Double)
     * @generated
     */
    boolean isSetVsi2max();

    /**
     * Returns the value of the '<em><b>Vstmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output minimum limit (<i>Vstmin</i>) (&lt; PssIEEE2B.vstmax).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmin</em>' attribute.
     * @see #isSetVstmin()
     * @see #unsetVstmin()
     * @see #setVstmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vstmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vstmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmin <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vstmin</em>' attribute.
     * @see #isSetVstmin()
     * @see #unsetVstmin()
     * @see #getVstmin()
     * @generated
     */
    void setVstmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmin <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmin()
     * @see #getVstmin()
     * @see #setVstmin(Double)
     * @generated
     */
    void unsetVstmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVstmin <em>Vstmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vstmin</em>' attribute is set.
     * @see #unsetVstmin()
     * @see #getVstmin()
     * @see #setVstmin(Double)
     * @generated
     */
    boolean isSetVstmin();

    /**
     * Returns the value of the '<em><b>Vsi2min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal #2 minimum limit (<i>Vsi2min</i>) (&lt; PssIEEE2B.vsi2max).  Typical value = -2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsi2min</em>' attribute.
     * @see #isSetVsi2min()
     * @see #unsetVsi2min()
     * @see #setVsi2min(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Vsi2min()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.vsi2min' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsi2min();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2min <em>Vsi2min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsi2min</em>' attribute.
     * @see #isSetVsi2min()
     * @see #unsetVsi2min()
     * @see #getVsi2min()
     * @generated
     */
    void setVsi2min( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2min <em>Vsi2min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsi2min()
     * @see #getVsi2min()
     * @see #setVsi2min(Double)
     * @generated
     */
    void unsetVsi2min();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getVsi2min <em>Vsi2min</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsi2min</em>' attribute is set.
     * @see #unsetVsi2min()
     * @see #getVsi2min()
     * @see #setVsi2min(Double)
     * @generated
     */
    boolean isSetVsi2min();

    /**
     * Returns the value of the '<em><b>Tw3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First washout on signal #2 (<i>Tw3</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw3</em>' attribute.
     * @see #isSetTw3()
     * @see #unsetTw3()
     * @see #setTw3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Tw3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.tw3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw3 <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw3</em>' attribute.
     * @see #isSetTw3()
     * @see #unsetTw3()
     * @see #getTw3()
     * @generated
     */
    void setTw3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw3 <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw3()
     * @see #getTw3()
     * @see #setTw3(Double)
     * @generated
     */
    void unsetTw3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw3 <em>Tw3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw3</em>' attribute is set.
     * @see #unsetTw3()
     * @see #getTw3()
     * @see #setTw3(Double)
     * @generated
     */
    boolean isSetTw3();

    /**
     * Returns the value of the '<em><b>Tw4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second washout on signal #2 (<i>Tw4</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw4</em>' attribute.
     * @see #isSetTw4()
     * @see #unsetTw4()
     * @see #setTw4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Tw4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.tw4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw4 <em>Tw4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw4</em>' attribute.
     * @see #isSetTw4()
     * @see #unsetTw4()
     * @see #getTw4()
     * @generated
     */
    void setTw4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw4 <em>Tw4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw4()
     * @see #getTw4()
     * @see #setTw4(Double)
     * @generated
     */
    void unsetTw4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw4 <em>Tw4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw4</em>' attribute is set.
     * @see #unsetTw4()
     * @see #getTw4()
     * @see #setTw4(Double)
     * @generated
     */
    boolean isSetTw4();

    /**
     * Returns the value of the '<em><b>Tw1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First washout on signal #1 (<i>Tw1</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw1</em>' attribute.
     * @see #isSetTw1()
     * @see #unsetTw1()
     * @see #setTw1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Tw1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.tw1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw1 <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw1</em>' attribute.
     * @see #isSetTw1()
     * @see #unsetTw1()
     * @see #getTw1()
     * @generated
     */
    void setTw1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw1 <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw1()
     * @see #getTw1()
     * @see #setTw1(Double)
     * @generated
     */
    void unsetTw1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw1 <em>Tw1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw1</em>' attribute is set.
     * @see #unsetTw1()
     * @see #getTw1()
     * @see #setTw1(Double)
     * @generated
     */
    boolean isSetTw1();

    /**
     * Returns the value of the '<em><b>Tw2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second washout on signal #1 (<i>Tw2</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw2</em>' attribute.
     * @see #isSetTw2()
     * @see #unsetTw2()
     * @see #setTw2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Tw2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.tw2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw2 <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw2</em>' attribute.
     * @see #isSetTw2()
     * @see #unsetTw2()
     * @see #getTw2()
     * @generated
     */
    void setTw2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw2 <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw2()
     * @see #getTw2()
     * @see #setTw2(Double)
     * @generated
     */
    void unsetTw2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getTw2 <em>Tw2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw2</em>' attribute is set.
     * @see #unsetTw2()
     * @see #getTw2()
     * @see #setTw2(Double)
     * @generated
     */
    boolean isSetTw2();

    /**
     * Returns the value of the '<em><b>Ks2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain on signal #2 (<i>Ks2</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #setKs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Ks2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.ks2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #getKs2()
     * @generated
     */
    void setKs2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    void unsetKs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs2 <em>Ks2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks2</em>' attribute is set.
     * @see #unsetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    boolean isSetKs2();

    /**
     * Returns the value of the '<em><b>Ks3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain on signal #2 input before ramp-tracking filter (<i>Ks3</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks3</em>' attribute.
     * @see #isSetKs3()
     * @see #unsetKs3()
     * @see #setKs3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Ks3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.ks3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs3 <em>Ks3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks3</em>' attribute.
     * @see #isSetKs3()
     * @see #unsetKs3()
     * @see #getKs3()
     * @generated
     */
    void setKs3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs3 <em>Ks3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs3()
     * @see #getKs3()
     * @see #setKs3(Double)
     * @generated
     */
    void unsetKs3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs3 <em>Ks3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks3</em>' attribute is set.
     * @see #unsetKs3()
     * @see #getKs3()
     * @see #setKs3(Double)
     * @generated
     */
    boolean isSetKs3();

    /**
     * Returns the value of the '<em><b>Ks1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer gain (<i>Ks1</i>).  Typical value = 12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #setKs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE2B_Ks1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE2B.ks1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #getKs1()
     * @generated
     */
    void setKs1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    void unsetKs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B#getKs1 <em>Ks1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks1</em>' attribute is set.
     * @see #unsetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    boolean isSetKs1();

} // PssIEEE2B
