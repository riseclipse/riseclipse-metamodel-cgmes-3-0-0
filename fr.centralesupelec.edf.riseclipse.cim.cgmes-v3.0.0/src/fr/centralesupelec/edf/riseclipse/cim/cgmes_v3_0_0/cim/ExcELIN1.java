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
 * A representation of the model object '<em><b>Exc ELIN1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Static PI transformer fed excitation system ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getSmax <em>Smax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTfi <em>Tfi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTnu <em>Tnu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs1 <em>Ts1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs2 <em>Ts2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTsw <em>Tsw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getDpnf <em>Dpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getXe <em>Xe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmin <em>Efmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpnf <em>Vpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmax <em>Efmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpu <em>Vpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpi <em>Vpi</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1()
 * @model
 * @generated
 */
public interface ExcELIN1 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Smax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer limit output (<i>smax</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Smax</em>' attribute.
     * @see #isSetSmax()
     * @see #unsetSmax()
     * @see #setSmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Smax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.smax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smax</em>' attribute.
     * @see #isSetSmax()
     * @see #unsetSmax()
     * @see #getSmax()
     * @generated
     */
    void setSmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmax()
     * @see #getSmax()
     * @see #setSmax(Double)
     * @generated
     */
    void unsetSmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smax</em>' attribute is set.
     * @see #unsetSmax()
     * @see #getSmax()
     * @see #setSmax(Double)
     * @generated
     */
    boolean isSetSmax();

    /**
     * Returns the value of the '<em><b>Tfi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current transducer time constant (<i>Tfi</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfi</em>' attribute.
     * @see #isSetTfi()
     * @see #unsetTfi()
     * @see #setTfi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Tfi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.tfi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfi</em>' attribute.
     * @see #isSetTfi()
     * @see #unsetTfi()
     * @see #getTfi()
     * @generated
     */
    void setTfi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfi()
     * @see #getTfi()
     * @see #setTfi(Double)
     * @generated
     */
    void unsetTfi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfi</em>' attribute is set.
     * @see #unsetTfi()
     * @see #getTfi()
     * @see #setTfi(Double)
     * @generated
     */
    boolean isSetTfi();

    /**
     * Returns the value of the '<em><b>Tnu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller reset time constant (<i>Tnu</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tnu</em>' attribute.
     * @see #isSetTnu()
     * @see #unsetTnu()
     * @see #setTnu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Tnu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.tnu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTnu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tnu</em>' attribute.
     * @see #isSetTnu()
     * @see #unsetTnu()
     * @see #getTnu()
     * @generated
     */
    void setTnu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTnu()
     * @see #getTnu()
     * @see #setTnu(Double)
     * @generated
     */
    void unsetTnu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tnu</em>' attribute is set.
     * @see #unsetTnu()
     * @see #getTnu()
     * @see #setTnu(Double)
     * @generated
     */
    boolean isSetTnu();

    /**
     * Returns the value of the '<em><b>Ts1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer phase lag time constant (<i>Ts1</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #setTs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Ts1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.ts1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #getTs1()
     * @generated
     */
    void setTs1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs1()
     * @see #getTs1()
     * @see #setTs1(Double)
     * @generated
     */
    void unsetTs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts1</em>' attribute is set.
     * @see #unsetTs1()
     * @see #getTs1()
     * @see #setTs1(Double)
     * @generated
     */
    boolean isSetTs1();

    /**
     * Returns the value of the '<em><b>Ts2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer filter time constant (<i>Ts2</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #setTs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Ts2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.ts2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #getTs2()
     * @generated
     */
    void setTs2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs2()
     * @see #getTs2()
     * @see #setTs2(Double)
     * @generated
     */
    void unsetTs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts2</em>' attribute is set.
     * @see #unsetTs2()
     * @see #getTs2()
     * @see #setTs2(Double)
     * @generated
     */
    boolean isSetTs2();

    /**
     * Returns the value of the '<em><b>Tsw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer parameters (<i>Tsw</i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsw</em>' attribute.
     * @see #isSetTsw()
     * @see #unsetTsw()
     * @see #setTsw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Tsw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.tsw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tsw</em>' attribute.
     * @see #isSetTsw()
     * @see #unsetTsw()
     * @see #getTsw()
     * @generated
     */
    void setTsw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsw()
     * @see #getTsw()
     * @see #setTsw(Double)
     * @generated
     */
    void unsetTsw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsw</em>' attribute is set.
     * @see #unsetTsw()
     * @see #getTsw()
     * @see #setTsw(Double)
     * @generated
     */
    boolean isSetTsw();

    /**
     * Returns the value of the '<em><b>Ks1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer gain 1 (<i>Ks1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #setKs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Ks1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.ks1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    void unsetKs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks1</em>' attribute is set.
     * @see #unsetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    boolean isSetKs1();

    /**
     * Returns the value of the '<em><b>Ks2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer gain 2 (<i>Ks2</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #setKs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Ks2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.ks2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    void unsetKs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dpnf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller follow up deadband (<i>Dpnf</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpnf</em>' attribute.
     * @see #isSetDpnf()
     * @see #unsetDpnf()
     * @see #setDpnf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Dpnf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.dpnf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpnf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpnf</em>' attribute.
     * @see #isSetDpnf()
     * @see #unsetDpnf()
     * @see #getDpnf()
     * @generated
     */
    void setDpnf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpnf()
     * @see #getDpnf()
     * @see #setDpnf(Double)
     * @generated
     */
    void unsetDpnf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpnf</em>' attribute is set.
     * @see #unsetDpnf()
     * @see #getDpnf()
     * @see #setDpnf(Double)
     * @generated
     */
    boolean isSetDpnf();

    /**
     * Returns the value of the '<em><b>Xe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation transformer effective reactance (<i>Xe</i>) (&gt;= 0).  <i>Xe</i> represents the regulation of the transformer/rectifier unit.  Typical value = 0,06.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #setXe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Xe()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.xe' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #getXe()
     * @generated
     */
    void setXe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXe()
     * @see #getXe()
     * @see #setXe(Double)
     * @generated
     */
    void unsetXe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getXe <em>Xe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xe</em>' attribute is set.
     * @see #unsetXe()
     * @see #getXe()
     * @see #setXe(Double)
     * @generated
     */
    boolean isSetXe();

    /**
     * Returns the value of the '<em><b>Efmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum open circuit excitation voltage (<i>Efmin</i>) (&lt; ExcELIN1.efmax).  Typical value = -5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efmin</em>' attribute.
     * @see #isSetEfmin()
     * @see #unsetEfmin()
     * @see #setEfmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Efmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.efmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efmin</em>' attribute.
     * @see #isSetEfmin()
     * @see #unsetEfmin()
     * @see #getEfmin()
     * @generated
     */
    void setEfmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfmin()
     * @see #getEfmin()
     * @see #setEfmin(Double)
     * @generated
     */
    void unsetEfmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efmin</em>' attribute is set.
     * @see #unsetEfmin()
     * @see #getEfmin()
     * @see #setEfmin(Double)
     * @generated
     */
    boolean isSetEfmin();

    /**
     * Returns the value of the '<em><b>Vpnf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller follow up gain (<i>Vpnf</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpnf</em>' attribute.
     * @see #isSetVpnf()
     * @see #unsetVpnf()
     * @see #setVpnf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Vpnf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.vpnf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpnf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpnf</em>' attribute.
     * @see #isSetVpnf()
     * @see #unsetVpnf()
     * @see #getVpnf()
     * @generated
     */
    void setVpnf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpnf()
     * @see #getVpnf()
     * @see #setVpnf(Double)
     * @generated
     */
    void unsetVpnf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpnf</em>' attribute is set.
     * @see #unsetVpnf()
     * @see #getVpnf()
     * @see #setVpnf(Double)
     * @generated
     */
    boolean isSetVpnf();

    /**
     * Returns the value of the '<em><b>Efmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum open circuit excitation voltage (<i>Efmax</i>) (&gt; ExcELIN1.efmin).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efmax</em>' attribute.
     * @see #isSetEfmax()
     * @see #unsetEfmax()
     * @see #setEfmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Efmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.efmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efmax</em>' attribute.
     * @see #isSetEfmax()
     * @see #unsetEfmax()
     * @see #getEfmax()
     * @generated
     */
    void setEfmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfmax()
     * @see #getEfmax()
     * @see #setEfmax(Double)
     * @generated
     */
    void unsetEfmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efmax</em>' attribute is set.
     * @see #unsetEfmax()
     * @see #getEfmax()
     * @see #setEfmax(Double)
     * @generated
     */
    boolean isSetEfmax();

    /**
     * Returns the value of the '<em><b>Vpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage controller proportional gain (<i>Vpu</i>).  Typical value = 34,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpu</em>' attribute.
     * @see #isSetVpu()
     * @see #unsetVpu()
     * @see #setVpu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Vpu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.vpu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpu</em>' attribute.
     * @see #isSetVpu()
     * @see #unsetVpu()
     * @see #getVpu()
     * @generated
     */
    void setVpu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpu()
     * @see #getVpu()
     * @see #setVpu(Double)
     * @generated
     */
    void unsetVpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpu</em>' attribute is set.
     * @see #unsetVpu()
     * @see #getVpu()
     * @see #setVpu(Double)
     * @generated
     */
    boolean isSetVpu();

    /**
     * Returns the value of the '<em><b>Vpi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current controller gain (<i>Vpi</i>).  Typical value = 12,45.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpi</em>' attribute.
     * @see #isSetVpi()
     * @see #unsetVpi()
     * @see #setVpi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN1_Vpi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN1.vpi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpi</em>' attribute.
     * @see #isSetVpi()
     * @see #unsetVpi()
     * @see #getVpi()
     * @generated
     */
    void setVpi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpi()
     * @see #getVpi()
     * @see #setVpi(Double)
     * @generated
     */
    void unsetVpi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpi</em>' attribute is set.
     * @see #unsetVpi()
     * @see #getVpi()
     * @see #setVpi(Double)
     * @generated
     */
    boolean isSetVpi();

} // ExcELIN1
