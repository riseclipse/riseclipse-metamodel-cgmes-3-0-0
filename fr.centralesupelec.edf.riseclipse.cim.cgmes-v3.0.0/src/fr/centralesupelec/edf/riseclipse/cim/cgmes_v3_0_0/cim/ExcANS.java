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
 * A representation of the model object '<em><b>Exc ANS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Italian excitation system. It represents static field voltage or excitation current feedback excitation system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmx <em>Ifmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmn <em>Ifmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKvfif <em>Kvfif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKce <em>Kce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getBlint <em>Blint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKrvecc <em>Krvecc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmx <em>Vrmx</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS()
 * @model
 * @generated
 */
public interface ExcANS extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Ifmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum exciter current (<i>I</i><i><sub>FMX</sub></i>).  Typical value = 6,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifmx</em>' attribute.
     * @see #isSetIfmx()
     * @see #unsetIfmx()
     * @see #setIfmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Ifmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.ifmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIfmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifmx</em>' attribute.
     * @see #isSetIfmx()
     * @see #unsetIfmx()
     * @see #getIfmx()
     * @generated
     */
    void setIfmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfmx()
     * @see #getIfmx()
     * @see #setIfmx(Double)
     * @generated
     */
    void unsetIfmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmx <em>Ifmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifmx</em>' attribute is set.
     * @see #unsetIfmx()
     * @see #getIfmx()
     * @see #setIfmx(Double)
     * @generated
     */
    boolean isSetIfmx();

    /**
     * Returns the value of the '<em><b>Ifmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum exciter current (<i>I</i><i><sub>FMN</sub></i>).  Typical value = -5,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifmn</em>' attribute.
     * @see #isSetIfmn()
     * @see #unsetIfmn()
     * @see #setIfmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Ifmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.ifmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIfmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifmn</em>' attribute.
     * @see #isSetIfmn()
     * @see #unsetIfmn()
     * @see #getIfmn()
     * @generated
     */
    void setIfmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfmn()
     * @see #getIfmn()
     * @see #setIfmn(Double)
     * @generated
     */
    void unsetIfmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getIfmn <em>Ifmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifmn</em>' attribute is set.
     * @see #unsetIfmn()
     * @see #getIfmn()
     * @see #setIfmn(Double)
     * @generated
     */
    boolean isSetIfmn();

    /**
     * Returns the value of the '<em><b>Kvfif</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate feedback signal flag (<i>K</i><i><sub>VFIF</sub></i>).
     * 0 = output voltage of the exciter
     * 1 = exciter field current.
     * Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kvfif</em>' attribute.
     * @see #isSetKvfif()
     * @see #unsetKvfif()
     * @see #setKvfif(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Kvfif()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.kvfif' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getKvfif();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kvfif</em>' attribute.
     * @see #isSetKvfif()
     * @see #unsetKvfif()
     * @see #getKvfif()
     * @generated
     */
    void setKvfif( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKvfif()
     * @see #getKvfif()
     * @see #setKvfif(BigInteger)
     * @generated
     */
    void unsetKvfif();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKvfif <em>Kvfif</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kvfif</em>' attribute is set.
     * @see #unsetKvfif()
     * @see #getKvfif()
     * @see #setKvfif(BigInteger)
     * @generated
     */
    boolean isSetKvfif();

    /**
     * Returns the value of the '<em><b>Kce</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ceiling factor (<i>K</i><i><sub>CE</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #setKce(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Kce()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.kce' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKce();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #getKce()
     * @generated
     */
    void setKce( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKce()
     * @see #getKce()
     * @see #setKce(Double)
     * @generated
     */
    void unsetKce();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKce <em>Kce</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kce</em>' attribute is set.
     * @see #unsetKce()
     * @see #getKce()
     * @see #setKce(Double)
     * @generated
     */
    boolean isSetKce();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>3</sub></i>) (&gt;= 0).  Typical value = 1,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT3 <em>T3</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>2</sub></i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT2 <em>T2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getT1 <em>T1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Blint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor control flag (<i>BLINT</i>).
     * 0 = lead-lag regulator
     * 1 = proportional integral regulator.
     * Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Blint</em>' attribute.
     * @see #isSetBlint()
     * @see #unsetBlint()
     * @see #setBlint(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Blint()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.blint' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getBlint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getBlint <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blint</em>' attribute.
     * @see #isSetBlint()
     * @see #unsetBlint()
     * @see #getBlint()
     * @generated
     */
    void setBlint( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getBlint <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBlint()
     * @see #getBlint()
     * @see #setBlint(BigInteger)
     * @generated
     */
    void unsetBlint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getBlint <em>Blint</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Blint</em>' attribute is set.
     * @see #unsetBlint()
     * @see #getBlint()
     * @see #setBlint(BigInteger)
     * @generated
     */
    boolean isSetBlint();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 0,04.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    boolean isSetTb();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter gain (<i>K</i><i><sub>2</sub></i>).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #getK2()
     * @generated
     */
    void setK2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK2 <em>K2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K2</em>' attribute is set.
     * @see #unsetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    boolean isSetK2();

    /**
     * Returns the value of the '<em><b>K3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * AVR gain (<i>K</i><i><sub>3</sub></i>).  Typical value = 1000.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #setK3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_K3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.k3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #getK3()
     * @generated
     */
    void setK3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    void unsetK3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getK3 <em>K3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K3</em>' attribute is set.
     * @see #unsetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    boolean isSetK3();

    /**
     * Returns the value of the '<em><b>Krvecc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Feedback enabling (<i>K</i><i><sub>RVECC</sub></i>).
     * 0 = open loop control
     * 1 = closed loop control.
     * Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Krvecc</em>' attribute.
     * @see #isSetKrvecc()
     * @see #unsetKrvecc()
     * @see #setKrvecc(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Krvecc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.krvecc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getKrvecc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Krvecc</em>' attribute.
     * @see #isSetKrvecc()
     * @see #unsetKrvecc()
     * @see #getKrvecc()
     * @generated
     */
    void setKrvecc( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKrvecc()
     * @see #getKrvecc()
     * @see #setKrvecc(BigInteger)
     * @generated
     */
    void unsetKrvecc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getKrvecc <em>Krvecc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Krvecc</em>' attribute is set.
     * @see #unsetKrvecc()
     * @see #getKrvecc()
     * @see #setKrvecc(BigInteger)
     * @generated
     */
    boolean isSetKrvecc();

    /**
     * Returns the value of the '<em><b>Vrmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum AVR output (<i>V</i><i><sub>RMN</sub></i>).  Typical value = -5,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmn</em>' attribute.
     * @see #isSetVrmn()
     * @see #unsetVrmn()
     * @see #setVrmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Vrmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.vrmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmn</em>' attribute.
     * @see #isSetVrmn()
     * @see #unsetVrmn()
     * @see #getVrmn()
     * @generated
     */
    void setVrmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Double)
     * @generated
     */
    void unsetVrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmn <em>Vrmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmn</em>' attribute is set.
     * @see #unsetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Double)
     * @generated
     */
    boolean isSetVrmn();

    /**
     * Returns the value of the '<em><b>Vrmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum AVR output (<i>V</i><i><sub>RMX</sub></i>).  Typical value = 6,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmx</em>' attribute.
     * @see #isSetVrmx()
     * @see #unsetVrmx()
     * @see #setVrmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcANS_Vrmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcANS.vrmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmx</em>' attribute.
     * @see #isSetVrmx()
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @generated
     */
    void setVrmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Double)
     * @generated
     */
    void unsetVrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS#getVrmx <em>Vrmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmx</em>' attribute is set.
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Double)
     * @generated
     */
    boolean isSetVrmx();

} // ExcANS
