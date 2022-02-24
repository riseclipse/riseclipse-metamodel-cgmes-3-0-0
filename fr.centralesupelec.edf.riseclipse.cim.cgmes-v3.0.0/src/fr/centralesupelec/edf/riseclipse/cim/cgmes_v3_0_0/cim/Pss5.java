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
 * A representation of the model object '<em><b>Pss5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed Italian PSS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpe <em>Kpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getCtw2 <em>Ctw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl3 <em>Tl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl4 <em>Tl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw1 <em>Tw1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmx <em>Vsmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmn <em>Vsmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpss <em>Kpss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVadat <em>Vadat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getIsfreq <em>Isfreq</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5()
 * @model
 * @generated
 */
public interface Pss5 extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>Kpe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric power input gain (<i>K</i><i><sub>PE</sub></i>).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpe</em>' attribute.
     * @see #isSetKpe()
     * @see #unsetKpe()
     * @see #setKpe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Kpe()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.kpe' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpe <em>Kpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpe</em>' attribute.
     * @see #isSetKpe()
     * @see #unsetKpe()
     * @see #getKpe()
     * @generated
     */
    void setKpe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpe <em>Kpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpe()
     * @see #getKpe()
     * @see #setKpe(Double)
     * @generated
     */
    void unsetKpe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpe <em>Kpe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpe</em>' attribute is set.
     * @see #unsetKpe()
     * @see #getKpe()
     * @see #setKpe(Double)
     * @generated
     */
    boolean isSetKpe();

    /**
     * Returns the value of the '<em><b>Ctw2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector for second washout enabling (<i>C</i><i><sub>TW2</sub></i>).
     * true = second washout filter is bypassed
     * false = second washout filter in use.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ctw2</em>' attribute.
     * @see #isSetCtw2()
     * @see #unsetCtw2()
     * @see #setCtw2(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Ctw2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.ctw2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getCtw2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getCtw2 <em>Ctw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ctw2</em>' attribute.
     * @see #isSetCtw2()
     * @see #unsetCtw2()
     * @see #getCtw2()
     * @generated
     */
    void setCtw2( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getCtw2 <em>Ctw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCtw2()
     * @see #getCtw2()
     * @see #setCtw2(Boolean)
     * @generated
     */
    void unsetCtw2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getCtw2 <em>Ctw2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ctw2</em>' attribute is set.
     * @see #unsetCtw2()
     * @see #getCtw2()
     * @see #setCtw2(Boolean)
     * @generated
     */
    boolean isSetCtw2();

    /**
     * Returns the value of the '<em><b>Tl3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T</i><i><sub>L3</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl3</em>' attribute.
     * @see #isSetTl3()
     * @see #unsetTl3()
     * @see #setTl3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tl3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tl3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl3 <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl3</em>' attribute.
     * @see #isSetTl3()
     * @see #unsetTl3()
     * @see #getTl3()
     * @generated
     */
    void setTl3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl3 <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl3()
     * @see #getTl3()
     * @see #setTl3(Double)
     * @generated
     */
    void unsetTl3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl3 <em>Tl3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl3</em>' attribute is set.
     * @see #unsetTl3()
     * @see #getTl3()
     * @see #setTl3(Double)
     * @generated
     */
    boolean isSetTl3();

    /**
     * Returns the value of the '<em><b>Tl4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (T<sub>L4</sub>) (&gt;= 0).  If = 0, both blocks are bypassed.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl4</em>' attribute.
     * @see #isSetTl4()
     * @see #unsetTl4()
     * @see #setTl4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tl4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tl4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl4 <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl4</em>' attribute.
     * @see #isSetTl4()
     * @see #unsetTl4()
     * @see #getTl4()
     * @generated
     */
    void setTl4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl4 <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl4()
     * @see #getTl4()
     * @see #setTl4(Double)
     * @generated
     */
    void unsetTl4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl4 <em>Tl4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl4</em>' attribute is set.
     * @see #unsetTl4()
     * @see #getTl4()
     * @see #setTl4(Double)
     * @generated
     */
    boolean isSetTl4();

    /**
     * Returns the value of the '<em><b>Tl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T</i><i><sub>L1</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #setTl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #getTl1()
     * @generated
     */
    void setTl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl1()
     * @see #getTl1()
     * @see #setTl1(Double)
     * @generated
     */
    void unsetTl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl1 <em>Tl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl1</em>' attribute is set.
     * @see #unsetTl1()
     * @see #getTl1()
     * @see #setTl1(Double)
     * @generated
     */
    boolean isSetTl1();

    /**
     * Returns the value of the '<em><b>Tl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T</i><i><sub>L2</sub></i>) (&gt;= 0).  If = 0, both blocks are bypassed.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #setTl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #getTl2()
     * @generated
     */
    void setTl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl2()
     * @see #getTl2()
     * @see #setTl2(Double)
     * @generated
     */
    void unsetTl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTl2 <em>Tl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl2</em>' attribute is set.
     * @see #unsetTl2()
     * @see #getTl2()
     * @see #setTl2(Double)
     * @generated
     */
    boolean isSetTl2();

    /**
     * Returns the value of the '<em><b>Tpe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric power filter time constant (<i>T</i><i><sub>PE</sub></i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #setTpe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tpe()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tpe' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #getTpe()
     * @generated
     */
    void setTpe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpe()
     * @see #getTpe()
     * @see #setTpe(Double)
     * @generated
     */
    void unsetTpe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTpe <em>Tpe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpe</em>' attribute is set.
     * @see #unsetTpe()
     * @see #getTpe()
     * @see #setTpe(Double)
     * @generated
     */
    boolean isSetTpe();

    /**
     * Returns the value of the '<em><b>Tw2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second washout (<i>T</i><i><sub>W2</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw2</em>' attribute.
     * @see #isSetTw2()
     * @see #unsetTw2()
     * @see #setTw2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tw2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tw2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw2 <em>Tw2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw2 <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw2()
     * @see #getTw2()
     * @see #setTw2(Double)
     * @generated
     */
    void unsetTw2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw2 <em>Tw2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tw1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First washout (<i>T</i><i><sub>W1</sub></i>) (&gt;= 0).  Typical value = 3,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw1</em>' attribute.
     * @see #isSetTw1()
     * @see #unsetTw1()
     * @see #setTw1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Tw1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.tw1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw1 <em>Tw1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw1 <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw1()
     * @see #getTw1()
     * @see #setTw1(Double)
     * @generated
     */
    void unsetTw1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getTw1 <em>Tw1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency/shaft speed input gain (<i>K</i><i><sub>F</sub></i>).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #setKf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Kf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.kf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #getKf()
     * @generated
     */
    void setKf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf()
     * @see #getKf()
     * @see #setKf(Double)
     * @generated
     */
    void unsetKf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKf <em>Kf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf</em>' attribute is set.
     * @see #unsetKf()
     * @see #getKf()
     * @see #setKf(Double)
     * @generated
     */
    boolean isSetKf();

    /**
     * Returns the value of the '<em><b>Vsmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output minimum limit (<i>V</i><i><sub>SMX</sub></i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsmx</em>' attribute.
     * @see #isSetVsmx()
     * @see #unsetVsmx()
     * @see #setVsmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Vsmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.vsmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmx <em>Vsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmx</em>' attribute.
     * @see #isSetVsmx()
     * @see #unsetVsmx()
     * @see #getVsmx()
     * @generated
     */
    void setVsmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmx <em>Vsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmx()
     * @see #getVsmx()
     * @see #setVsmx(Double)
     * @generated
     */
    void unsetVsmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmx <em>Vsmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmx</em>' attribute is set.
     * @see #unsetVsmx()
     * @see #getVsmx()
     * @see #setVsmx(Double)
     * @generated
     */
    boolean isSetVsmx();

    /**
     * Returns the value of the '<em><b>Vsmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output maximum limit (<i>V</i><i><sub>SMN</sub></i>).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsmn</em>' attribute.
     * @see #isSetVsmn()
     * @see #unsetVsmn()
     * @see #setVsmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Vsmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.vsmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmn <em>Vsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmn</em>' attribute.
     * @see #isSetVsmn()
     * @see #unsetVsmn()
     * @see #getVsmn()
     * @generated
     */
    void setVsmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmn <em>Vsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmn()
     * @see #getVsmn()
     * @see #setVsmn(Double)
     * @generated
     */
    void unsetVsmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVsmn <em>Vsmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmn</em>' attribute is set.
     * @see #unsetVsmn()
     * @see #getVsmn()
     * @see #setVsmn(Double)
     * @generated
     */
    boolean isSetVsmn();

    /**
     * Returns the value of the '<em><b>Deadband</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output deadband (<i>DEADBAND</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deadband</em>' attribute.
     * @see #isSetDeadband()
     * @see #unsetDeadband()
     * @see #setDeadband(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Deadband()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.deadband' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDeadband();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getDeadband <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deadband</em>' attribute.
     * @see #isSetDeadband()
     * @see #unsetDeadband()
     * @see #getDeadband()
     * @generated
     */
    void setDeadband( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getDeadband <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDeadband()
     * @see #getDeadband()
     * @see #setDeadband(Double)
     * @generated
     */
    void unsetDeadband();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getDeadband <em>Deadband</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Deadband</em>' attribute is set.
     * @see #unsetDeadband()
     * @see #getDeadband()
     * @see #setDeadband(Double)
     * @generated
     */
    boolean isSetDeadband();

    /**
     * Returns the value of the '<em><b>Kpss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PSS gain (<i>K</i><i><sub>PSS</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpss</em>' attribute.
     * @see #isSetKpss()
     * @see #unsetKpss()
     * @see #setKpss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Kpss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.kpss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpss <em>Kpss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpss</em>' attribute.
     * @see #isSetKpss()
     * @see #unsetKpss()
     * @see #getKpss()
     * @generated
     */
    void setKpss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpss <em>Kpss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpss()
     * @see #getKpss()
     * @see #setKpss(Double)
     * @generated
     */
    void unsetKpss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getKpss <em>Kpss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpss</em>' attribute is set.
     * @see #unsetKpss()
     * @see #getKpss()
     * @see #setKpss(Double)
     * @generated
     */
    boolean isSetKpss();

    /**
     * Returns the value of the '<em><b>Vadat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Signal selector (<i>V</i><i><sub>adAtt</sub></i>).</font>
     * <font color="#0f0f0f">true = closed (generator power is greater than <i>Pmin</i>)</font>
     * <font color="#0f0f0f">false = open (<i>Pe</i> is smaller than <i>Pmin</i>).</font>
     * <font color="#0f0f0f">Typical value = true.</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vadat</em>' attribute.
     * @see #isSetVadat()
     * @see #unsetVadat()
     * @see #setVadat(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Vadat()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.vadat' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getVadat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVadat <em>Vadat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadat</em>' attribute.
     * @see #isSetVadat()
     * @see #unsetVadat()
     * @see #getVadat()
     * @generated
     */
    void setVadat( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVadat <em>Vadat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadat()
     * @see #getVadat()
     * @see #setVadat(Boolean)
     * @generated
     */
    void unsetVadat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getVadat <em>Vadat</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadat</em>' attribute is set.
     * @see #unsetVadat()
     * @see #getVadat()
     * @see #setVadat(Boolean)
     * @generated
     */
    boolean isSetVadat();

    /**
     * Returns the value of the '<em><b>Pmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum power PSS enabling (<i>Pmin</i>).  Typical value = 0,25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Pmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.pmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #getPmin()
     * @generated
     */
    void setPmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getPmin <em>Pmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmin</em>' attribute is set.
     * @see #unsetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    boolean isSetPmin();

    /**
     * Returns the value of the '<em><b>Isfreq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector for frequency/shaft speed input (<i>isFreq</i>).
     * true = speed (same meaning as InputSignaKind.rotorSpeed)
     * false = frequency (same meaning as InputSignalKind.busFrequency).
     * Typical value = true (same meaning as InputSignalKind.rotorSpeed).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Isfreq</em>' attribute.
     * @see #isSetIsfreq()
     * @see #unsetIsfreq()
     * @see #setIsfreq(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPss5_Isfreq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Pss5.isfreq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIsfreq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getIsfreq <em>Isfreq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Isfreq</em>' attribute.
     * @see #isSetIsfreq()
     * @see #unsetIsfreq()
     * @see #getIsfreq()
     * @generated
     */
    void setIsfreq( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getIsfreq <em>Isfreq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsfreq()
     * @see #getIsfreq()
     * @see #setIsfreq(Boolean)
     * @generated
     */
    void unsetIsfreq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5#getIsfreq <em>Isfreq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Isfreq</em>' attribute is set.
     * @see #unsetIsfreq()
     * @see #getIsfreq()
     * @see #setIsfreq(Boolean)
     * @generated
     */
    boolean isSetIsfreq();

} // Pss5
