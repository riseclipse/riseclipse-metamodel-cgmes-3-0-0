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
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC1A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE type DEC1A discontinuous excitation control model that boosts generator excitation to a level higher than that demanded by the voltage regulator and stabilizer immediately following a system fault.
 * Reference: IEEE 421.5-2005, 12.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC1A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Tan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous controller time constant (<i>T</i><i><sub>AN</sub></i>) (&gt;= 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tan</em>' attribute.
     * @see #isSetTan()
     * @see #unsetTan()
     * @see #setTan(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Tan()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.tan' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tan</em>' attribute.
     * @see #isSetTan()
     * @see #unsetTan()
     * @see #getTan()
     * @generated
     */
    void setTan( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTan()
     * @see #getTan()
     * @see #setTan(Double)
     * @generated
     */
    void unsetTan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTan <em>Tan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tan</em>' attribute is set.
     * @see #unsetTan()
     * @see #getTan()
     * @see #setTan(Double)
     * @generated
     */
    boolean isSetTan();

    /**
     * Returns the value of the '<em><b>Vomin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>OMIN</sub></i>) (&lt; DiscExcContIEEEDEC1A.vomax).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vomin</em>' attribute.
     * @see #isSetVomin()
     * @see #unsetVomin()
     * @see #setVomin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vomin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vomin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVomin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vomin</em>' attribute.
     * @see #isSetVomin()
     * @see #unsetVomin()
     * @see #getVomin()
     * @generated
     */
    void setVomin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVomin()
     * @see #getVomin()
     * @see #setVomin(Double)
     * @generated
     */
    void unsetVomin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomin <em>Vomin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vomin</em>' attribute is set.
     * @see #unsetVomin()
     * @see #getVomin()
     * @see #setVomin(Double)
     * @generated
     */
    boolean isSetVomin();

    /**
     * Returns the value of the '<em><b>Tw5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DEC washout time constant (<i>T</i><i><sub>W</sub></i><sub>5</sub>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw5</em>' attribute.
     * @see #isSetTw5()
     * @see #unsetTw5()
     * @see #setTw5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Tw5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.tw5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw5</em>' attribute.
     * @see #isSetTw5()
     * @see #unsetTw5()
     * @see #getTw5()
     * @generated
     */
    void setTw5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw5()
     * @see #getTw5()
     * @see #setTw5(Double)
     * @generated
     */
    void unsetTw5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTw5 <em>Tw5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw5</em>' attribute is set.
     * @see #unsetTw5()
     * @see #getTw5()
     * @see #setTw5(Double)
     * @generated
     */
    boolean isSetTw5();

    /**
     * Returns the value of the '<em><b>Vtlmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage reference (<i>V</i><i><sub>TLMT</sub></i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtlmt</em>' attribute.
     * @see #isSetVtlmt()
     * @see #unsetVtlmt()
     * @see #setVtlmt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtlmt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vtlmt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtlmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtlmt</em>' attribute.
     * @see #isSetVtlmt()
     * @see #unsetVtlmt()
     * @see #getVtlmt()
     * @generated
     */
    void setVtlmt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtlmt()
     * @see #getVtlmt()
     * @see #setVtlmt(Double)
     * @generated
     */
    void unsetVtlmt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtlmt <em>Vtlmt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtlmt</em>' attribute is set.
     * @see #unsetVtlmt()
     * @see #getVtlmt()
     * @see #setVtlmt(Double)
     * @generated
     */
    boolean isSetVtlmt();

    /**
     * Returns the value of the '<em><b>Tl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>L</sub></i><sub>1</sub>) (&gt;= 0).  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #setTl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Tl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.tl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl1()
     * @see #getTl1()
     * @see #setTl1(Double)
     * @generated
     */
    void unsetTl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl1 <em>Tl1</em>}' attribute is set.
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
     * Time constant (<i>T</i><i><sub>L</sub></i><sub>2</sub>) (&gt;= 0).  Typical value = 1,25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #setTl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Tl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.tl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl2()
     * @see #getTl2()
     * @see #setTl2(Double)
     * @generated
     */
    void unsetTl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTl2 <em>Tl2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ketl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Terminal voltage limiter gain (<i>K</i><i><sub>ETL</sub></i>).  Typical value = 47.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ketl</em>' attribute.
     * @see #isSetKetl()
     * @see #unsetKetl()
     * @see #setKetl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Ketl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.ketl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKetl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ketl</em>' attribute.
     * @see #isSetKetl()
     * @see #unsetKetl()
     * @see #getKetl()
     * @generated
     */
    void setKetl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKetl()
     * @see #getKetl()
     * @see #setKetl(Double)
     * @generated
     */
    void unsetKetl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKetl <em>Ketl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ketl</em>' attribute is set.
     * @see #unsetKetl()
     * @see #getKetl()
     * @see #setKetl(Double)
     * @generated
     */
    boolean isSetKetl();

    /**
     * Returns the value of the '<em><b>Kan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous controller gain (<i>K</i><i><sub>AN</sub></i>).  Typical value = 400.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kan</em>' attribute.
     * @see #isSetKan()
     * @see #unsetKan()
     * @see #setKan(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Kan()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.kan' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kan</em>' attribute.
     * @see #isSetKan()
     * @see #unsetKan()
     * @see #getKan()
     * @generated
     */
    void setKan( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKan()
     * @see #getKan()
     * @see #setKan(Double)
     * @generated
     */
    void unsetKan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getKan <em>Kan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kan</em>' attribute is set.
     * @see #unsetKan()
     * @see #getKan()
     * @see #setKan(Double)
     * @generated
     */
    boolean isSetKan();

    /**
     * Returns the value of the '<em><b>Vomax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>OMAX</sub></i>) (&gt; DiscExcContIEEEDEC1A.vomin).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vomax</em>' attribute.
     * @see #isSetVomax()
     * @see #unsetVomax()
     * @see #setVomax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vomax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vomax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVomax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vomax</em>' attribute.
     * @see #isSetVomax()
     * @see #unsetVomax()
     * @see #getVomax()
     * @generated
     */
    void setVomax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVomax()
     * @see #getVomax()
     * @see #setVomax(Double)
     * @generated
     */
    void unsetVomax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVomax <em>Vomax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vomax</em>' attribute is set.
     * @see #unsetVomax()
     * @see #getVomax()
     * @see #setVomax(Double)
     * @generated
     */
    boolean isSetVomax();

    /**
     * Returns the value of the '<em><b>Vsmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>SMIN</sub></i>) (&lt; DiscExcContIEEEDEC1A.vsmax).  Typical value = -0,066.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsmin</em>' attribute.
     * @see #isSetVsmin()
     * @see #unsetVsmin()
     * @see #setVsmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vsmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vsmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmin</em>' attribute.
     * @see #isSetVsmin()
     * @see #unsetVsmin()
     * @see #getVsmin()
     * @generated
     */
    void setVsmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmin()
     * @see #getVsmin()
     * @see #setVsmin(Double)
     * @generated
     */
    void unsetVsmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmin <em>Vsmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmin</em>' attribute is set.
     * @see #unsetVsmin()
     * @see #getVsmin()
     * @see #setVsmin(Double)
     * @generated
     */
    boolean isSetVsmin();

    /**
     * Returns the value of the '<em><b>Vanmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter for Van (<i>V</i><i><sub>ANMAX</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vanmax</em>' attribute.
     * @see #isSetVanmax()
     * @see #unsetVanmax()
     * @see #setVanmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vanmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vanmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVanmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vanmax</em>' attribute.
     * @see #isSetVanmax()
     * @see #unsetVanmax()
     * @see #getVanmax()
     * @generated
     */
    void setVanmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVanmax()
     * @see #getVanmax()
     * @see #setVanmax(Double)
     * @generated
     */
    void unsetVanmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVanmax <em>Vanmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vanmax</em>' attribute is set.
     * @see #unsetVanmax()
     * @see #getVanmax()
     * @see #setVanmax(Double)
     * @generated
     */
    boolean isSetVanmax();

    /**
     * Returns the value of the '<em><b>Td</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>D</sub></i>) (&gt;= 0).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #setTd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Td()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.td' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #getTd()
     * @generated
     */
    void setTd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    void unsetTd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getTd <em>Td</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td</em>' attribute is set.
     * @see #unsetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    boolean isSetTd();

    /**
     * Returns the value of the '<em><b>Vsmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>SMAX</sub></i>)(&gt; DiscExcContIEEEDEC1A.vsmin).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vsmax</em>' attribute.
     * @see #isSetVsmax()
     * @see #unsetVsmax()
     * @see #setVsmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vsmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vsmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVsmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vsmax</em>' attribute.
     * @see #isSetVsmax()
     * @see #unsetVsmax()
     * @see #getVsmax()
     * @generated
     */
    void setVsmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsmax()
     * @see #getVsmax()
     * @see #setVsmax(Double)
     * @generated
     */
    void unsetVsmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVsmax <em>Vsmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vsmax</em>' attribute is set.
     * @see #unsetVsmax()
     * @see #getVsmax()
     * @see #setVsmax(Double)
     * @generated
     */
    boolean isSetVsmax();

    /**
     * Returns the value of the '<em><b>Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator voltage reference (<i>V</i><i><sub>AL</sub></i>).  Typical value = 5,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Val</em>' attribute.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see #setVal(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Val()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.val' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val</em>' attribute.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see #getVal()
     * @generated
     */
    void setVal( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVal()
     * @see #getVal()
     * @see #setVal(Double)
     * @generated
     */
    void unsetVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVal <em>Val</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val</em>' attribute is set.
     * @see #unsetVal()
     * @see #getVal()
     * @see #setVal(Double)
     * @generated
     */
    boolean isSetVal();

    /**
     * Returns the value of the '<em><b>Vtm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage limits (<i>V</i><i><sub>TM</sub></i>).  Typical value = 1,13.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtm</em>' attribute.
     * @see #isSetVtm()
     * @see #unsetVtm()
     * @see #setVtm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vtm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtm</em>' attribute.
     * @see #isSetVtm()
     * @see #unsetVtm()
     * @see #getVtm()
     * @generated
     */
    void setVtm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtm()
     * @see #getVtm()
     * @see #setVtm(Double)
     * @generated
     */
    void unsetVtm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtm <em>Vtm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtm</em>' attribute is set.
     * @see #unsetVtm()
     * @see #getVtm()
     * @see #setVtm(Double)
     * @generated
     */
    boolean isSetVtm();

    /**
     * Returns the value of the '<em><b>Vtn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage limits (<i>V</i><i><sub>TN</sub></i>).  Typical value = 1,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtn</em>' attribute.
     * @see #isSetVtn()
     * @see #unsetVtn()
     * @see #setVtn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vtn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtn</em>' attribute.
     * @see #isSetVtn()
     * @see #unsetVtn()
     * @see #getVtn()
     * @generated
     */
    void setVtn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtn()
     * @see #getVtn()
     * @see #setVtn(Double)
     * @generated
     */
    void unsetVtn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtn <em>Vtn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtn</em>' attribute is set.
     * @see #unsetVtn()
     * @see #getVtn()
     * @see #setVtn(Double)
     * @generated
     */
    boolean isSetVtn();

    /**
     * Returns the value of the '<em><b>Esc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed change reference (<i>E</i><i><sub>SC</sub></i>).  Typical value = 0,0015.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Esc</em>' attribute.
     * @see #isSetEsc()
     * @see #unsetEsc()
     * @see #setEsc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Esc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.esc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEsc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Esc</em>' attribute.
     * @see #isSetEsc()
     * @see #unsetEsc()
     * @see #getEsc()
     * @generated
     */
    void setEsc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEsc()
     * @see #getEsc()
     * @see #setEsc(Double)
     * @generated
     */
    void unsetEsc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getEsc <em>Esc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Esc</em>' attribute is set.
     * @see #unsetEsc()
     * @see #getEsc()
     * @see #setEsc(Double)
     * @generated
     */
    boolean isSetEsc();

    /**
     * Returns the value of the '<em><b>Vtc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Terminal voltage level reference (<i>V</i><i><sub>TC</sub></i>).  Typical value = 0,95.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtc</em>' attribute.
     * @see #isSetVtc()
     * @see #unsetVtc()
     * @see #setVtc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC1A_Vtc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC1A.vtc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtc</em>' attribute.
     * @see #isSetVtc()
     * @see #unsetVtc()
     * @see #getVtc()
     * @generated
     */
    void setVtc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtc()
     * @see #getVtc()
     * @see #setVtc(Double)
     * @generated
     */
    void unsetVtc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A#getVtc <em>Vtc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtc</em>' attribute is set.
     * @see #unsetVtc()
     * @see #getVtc()
     * @see #setVtc(Double)
     * @generated
     */
    boolean isSetVtc();

} // DiscExcContIEEEDEC1A
