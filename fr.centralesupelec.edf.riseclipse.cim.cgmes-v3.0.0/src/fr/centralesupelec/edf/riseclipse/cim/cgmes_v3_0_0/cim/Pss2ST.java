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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pss2 ST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PTI microprocessor-based stabilizer type 1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmin <em>Lsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT9 <em>T9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT8 <em>T8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcl <em>Vcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcu <em>Vcu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal2Type <em>Input Signal2 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal1Type <em>Input Signal1 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT10 <em>T10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmax <em>Lsmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST()
 * @model
 * @generated
 */
public interface Pss2ST extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>Lsmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>L</i><i><sub>SMIN</sub></i>) (&lt; Pss2ST.lsmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lsmin</em>' attribute.
     * @see #isSetLsmin()
     * @see #unsetLsmin()
     * @see #setLsmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_Lsmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.lsmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLsmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmin <em>Lsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lsmin</em>' attribute.
     * @see #isSetLsmin()
     * @see #unsetLsmin()
     * @see #getLsmin()
     * @generated
     */
    void setLsmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmin <em>Lsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLsmin()
     * @see #getLsmin()
     * @see #setLsmin(Double)
     * @generated
     */
    void unsetLsmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmin <em>Lsmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lsmin</em>' attribute is set.
     * @see #unsetLsmin()
     * @see #getLsmin()
     * @see #setLsmin(Double)
     * @generated
     */
    boolean isSetLsmin();

    /**
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>4</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT4 <em>T4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT4 <em>T4</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>3</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT3 <em>T3</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>2</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT2 <em>T2</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT1 <em>T1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>9</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T9</em>' attribute.
     * @see #isSetT9()
     * @see #unsetT9()
     * @see #setT9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT9 <em>T9</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT9 <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT9()
     * @see #getT9()
     * @see #setT9(Double)
     * @generated
     */
    void unsetT9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT9 <em>T9</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>8</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T8</em>' attribute.
     * @see #isSetT8()
     * @see #unsetT8()
     * @see #setT8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT8 <em>T8</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT8 <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT8()
     * @see #getT8()
     * @see #setT8(Double)
     * @generated
     */
    void unsetT8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT8 <em>T8</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>7</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T7</em>' attribute.
     * @see #isSetT7()
     * @see #unsetT7()
     * @see #setT7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT7 <em>T7</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT7 <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT7()
     * @see #getT7()
     * @see #setT7(Double)
     * @generated
     */
    void unsetT7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT7 <em>T7</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>6</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T6</em>' attribute.
     * @see #isSetT6()
     * @see #unsetT6()
     * @see #setT6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT6 <em>T6</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT6 <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT6()
     * @see #getT6()
     * @see #setT6(Double)
     * @generated
     */
    void unsetT6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT6 <em>T6</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>5</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #setT5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #getT5()
     * @generated
     */
    void setT5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    void unsetT5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT5 <em>T5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5</em>' attribute is set.
     * @see #unsetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    boolean isSetT5();

    /**
     * Returns the value of the '<em><b>Vcl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cutoff limiter (<i>V</i><i><sub>CL</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vcl</em>' attribute.
     * @see #isSetVcl()
     * @see #unsetVcl()
     * @see #setVcl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_Vcl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.vcl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVcl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcl <em>Vcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vcl</em>' attribute.
     * @see #isSetVcl()
     * @see #unsetVcl()
     * @see #getVcl()
     * @generated
     */
    void setVcl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcl <em>Vcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVcl()
     * @see #getVcl()
     * @see #setVcl(Double)
     * @generated
     */
    void unsetVcl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcl <em>Vcl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vcl</em>' attribute is set.
     * @see #unsetVcl()
     * @see #getVcl()
     * @see #setVcl(Double)
     * @generated
     */
    boolean isSetVcl();

    /**
     * Returns the value of the '<em><b>Vcu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cutoff limiter (<i>V</i><i><sub>CU</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vcu</em>' attribute.
     * @see #isSetVcu()
     * @see #unsetVcu()
     * @see #setVcu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_Vcu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.vcu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVcu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcu <em>Vcu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vcu</em>' attribute.
     * @see #isSetVcu()
     * @see #unsetVcu()
     * @see #getVcu()
     * @generated
     */
    void setVcu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcu <em>Vcu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVcu()
     * @see #getVcu()
     * @see #setVcu(Double)
     * @generated
     */
    void unsetVcu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getVcu <em>Vcu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vcu</em>' attribute is set.
     * @see #unsetVcu()
     * @see #getVcu()
     * @see #setVcu(Double)
     * @generated
     */
    boolean isSetVcu();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i><i><sub>2</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK2 <em>K2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK2 <em>K2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i><i><sub>1</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #getK1()
     * @generated
     */
    void setK1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getK1 <em>K1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K1</em>' attribute is set.
     * @see #unsetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    boolean isSetK1();

    /**
     * Returns the value of the '<em><b>Input Signal2 Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of input signal #2 (rotorAngularFrequencyDeviation, busFrequencyDeviation, generatorElectricalPower, generatorAcceleratingPower, busVoltage, or busVoltageDerivative - shall be different than Pss2ST.inputSignal1Type).  Typical value = busVoltageDerivative.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Signal2 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal2Type()
     * @see #unsetInputSignal2Type()
     * @see #setInputSignal2Type(InputSignalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_InputSignal2Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.inputSignal2Type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    InputSignalKind getInputSignal2Type();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputSignal2Type()
     * @see #getInputSignal2Type()
     * @see #setInputSignal2Type(InputSignalKind)
     * @generated
     */
    void unsetInputSignal2Type();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal2Type <em>Input Signal2 Type</em>}' attribute is set.
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
     * Type of input signal #1 (rotorAngularFrequencyDeviation, busFrequencyDeviation, generatorElectricalPower, generatorAcceleratingPower, busVoltage, or busVoltageDerivative - shall be different than Pss2ST.inputSignal2Type).  Typical value = rotorAngularFrequencyDeviation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Signal1 Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind
     * @see #isSetInputSignal1Type()
     * @see #unsetInputSignal1Type()
     * @see #setInputSignal1Type(InputSignalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_InputSignal1Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.inputSignal1Type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    InputSignalKind getInputSignal1Type();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputSignal1Type()
     * @see #getInputSignal1Type()
     * @see #setInputSignal1Type(InputSignalKind)
     * @generated
     */
    void unsetInputSignal1Type();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getInputSignal1Type <em>Input Signal1 Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>10</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>T10</em>' attribute.
     * @see #isSetT10()
     * @see #unsetT10()
     * @see #setT10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_T10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.t10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT10 <em>T10</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT10 <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT10()
     * @see #getT10()
     * @see #setT10(Double)
     * @generated
     */
    void unsetT10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getT10 <em>T10</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Lsmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>L</i><i><sub>SMAX</sub></i>) (&gt; Pss2ST.lsmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lsmax</em>' attribute.
     * @see #isSetLsmax()
     * @see #unsetLsmax()
     * @see #setLsmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss2ST_Lsmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss2ST.lsmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLsmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmax <em>Lsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lsmax</em>' attribute.
     * @see #isSetLsmax()
     * @see #unsetLsmax()
     * @see #getLsmax()
     * @generated
     */
    void setLsmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmax <em>Lsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLsmax()
     * @see #getLsmax()
     * @see #setLsmax(Double)
     * @generated
     */
    void unsetLsmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss2ST#getLsmax <em>Lsmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lsmax</em>' attribute is set.
     * @see #unsetLsmax()
     * @see #getLsmax()
     * @see #setLsmax(Double)
     * @generated
     */
    boolean isSetLsmax();

} // Pss2ST
