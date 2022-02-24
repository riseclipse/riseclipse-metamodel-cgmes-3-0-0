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
 * A representation of the model object '<em><b>Exc IEEEAC6A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type AC6A model. The model represents field-controlled alternator-rectifier excitation systems with system-supplied electronic voltage regulators.  The maximum output of the regulator, <i>V</i><i><sub>R</sub></i>, is a function of terminal voltage, <i>V</i><i><sub>T</sub></i>. The field current limiter included in the original model AC6A remains in the 2005 update.
 * Reference: IEEE 421.5-2005, 6.6.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamax <em>Vamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamin <em>Vamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe2 <em>Ve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe1 <em>Ve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTh <em>Th</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTj <em>Tj</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTk <em>Tk</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKh <em>Kh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVhmax <em>Vhmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve1 <em>Seve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve2 <em>Seve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVfelim <em>Vfelim</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A()
 * @model
 * @generated
 */
public interface ExcIEEEAC6A extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Vamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage regulator output (<i>V</i><i><sub>AMAX</sub></i>) (&gt; 0).  Typical value = 75.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vamax</em>' attribute.
     * @see #isSetVamax()
     * @see #unsetVamax()
     * @see #setVamax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vamax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vamax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamax <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vamax</em>' attribute.
     * @see #isSetVamax()
     * @see #unsetVamax()
     * @see #getVamax()
     * @generated
     */
    void setVamax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamax <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVamax()
     * @see #getVamax()
     * @see #setVamax(Double)
     * @generated
     */
    void unsetVamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamax <em>Vamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vamax</em>' attribute is set.
     * @see #unsetVamax()
     * @see #getVamax()
     * @see #setVamax(Double)
     * @generated
     */
    boolean isSetVamax();

    /**
     * Returns the value of the '<em><b>Vamin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage regulator output (V<sub>AMIN</sub>) (&lt; 0).  Typical value = -75.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vamin</em>' attribute.
     * @see #isSetVamin()
     * @see #unsetVamin()
     * @see #setVamin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vamin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vamin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVamin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamin <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vamin</em>' attribute.
     * @see #isSetVamin()
     * @see #unsetVamin()
     * @see #getVamin()
     * @generated
     */
    void setVamin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamin <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVamin()
     * @see #getVamin()
     * @see #setVamin(Double)
     * @generated
     */
    void unsetVamin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVamin <em>Vamin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vamin</em>' attribute is set.
     * @see #unsetVamin()
     * @see #getVamin()
     * @see #setVamin(Double)
     * @generated
     */
    boolean isSetVamin();

    /**
     * Returns the value of the '<em><b>Ve2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E2</sub></i>) (&gt; 0).  Typical value = 5,55.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ve2</em>' attribute.
     * @see #isSetVe2()
     * @see #unsetVe2()
     * @see #setVe2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Ve2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.ve2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVe2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe2 <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ve2</em>' attribute.
     * @see #isSetVe2()
     * @see #unsetVe2()
     * @see #getVe2()
     * @generated
     */
    void setVe2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe2 <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVe2()
     * @see #getVe2()
     * @see #setVe2(Double)
     * @generated
     */
    void unsetVe2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe2 <em>Ve2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ve2</em>' attribute is set.
     * @see #unsetVe2()
     * @see #getVe2()
     * @see #setVe2(Double)
     * @generated
     */
    boolean isSetVe2();

    /**
     * Returns the value of the '<em><b>Ve1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>V</i><i><sub>E1</sub></i>) (&gt; 0).  Typical value = 7,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ve1</em>' attribute.
     * @see #isSetVe1()
     * @see #unsetVe1()
     * @see #setVe1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Ve1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.ve1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVe1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe1 <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ve1</em>' attribute.
     * @see #isSetVe1()
     * @see #unsetVe1()
     * @see #getVe1()
     * @generated
     */
    void setVe1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe1 <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVe1()
     * @see #getVe1()
     * @see #setVe1(Double)
     * @generated
     */
    void unsetVe1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVe1 <em>Ve1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ve1</em>' attribute is set.
     * @see #unsetVe1()
     * @see #getVe1()
     * @see #setVe1(Double)
     * @generated
     */
    boolean isSetVe1();

    /**
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator time constant (<i>T</i><i><sub>A</sub></i>) (&gt;= 0).  Typical value = 0,086.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #getTa()
     * @generated
     */
    void setTa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTa <em>Ta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ta</em>' attribute is set.
     * @see #unsetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    boolean isSetTa();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTb <em>Tb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator time constant (<i>T</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    boolean isSetTc();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter time constant, integration rate associated with exciter control (<i>T</i><i><sub>E</sub></i>) (&gt; 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    boolean isSetTe();

    /**
     * Returns the value of the '<em><b>Th</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter field current limiter time constant (<i>T</i><i><sub>H</sub></i>) (&gt; 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th</em>' attribute.
     * @see #isSetTh()
     * @see #unsetTh()
     * @see #setTh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Th()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.th' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTh <em>Th</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th</em>' attribute.
     * @see #isSetTh()
     * @see #unsetTh()
     * @see #getTh()
     * @generated
     */
    void setTh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTh <em>Th</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh()
     * @see #getTh()
     * @see #setTh(Double)
     * @generated
     */
    void unsetTh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTh <em>Th</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th</em>' attribute is set.
     * @see #unsetTh()
     * @see #getTh()
     * @see #setTh(Double)
     * @generated
     */
    boolean isSetTh();

    /**
     * Returns the value of the '<em><b>Tj</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter field current limiter time constant (<i>T</i><i><sub>J</sub></i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tj</em>' attribute.
     * @see #isSetTj()
     * @see #unsetTj()
     * @see #setTj(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Tj()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.tj' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTj();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTj <em>Tj</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tj</em>' attribute.
     * @see #isSetTj()
     * @see #unsetTj()
     * @see #getTj()
     * @generated
     */
    void setTj( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTj <em>Tj</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTj()
     * @see #getTj()
     * @see #setTj(Double)
     * @generated
     */
    void unsetTj();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTj <em>Tj</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tj</em>' attribute is set.
     * @see #unsetTj()
     * @see #getTj()
     * @see #setTj(Double)
     * @generated
     */
    boolean isSetTj();

    /**
     * Returns the value of the '<em><b>Tk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator time constant (<i>T</i><i><sub>K</sub></i>) (&gt;= 0).  Typical value = 0,18.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tk</em>' attribute.
     * @see #isSetTk()
     * @see #unsetTk()
     * @see #setTk(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Tk()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.tk' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTk <em>Tk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tk</em>' attribute.
     * @see #isSetTk()
     * @see #unsetTk()
     * @see #getTk()
     * @generated
     */
    void setTk( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTk <em>Tk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTk()
     * @see #getTk()
     * @see #setTk(Double)
     * @generated
     */
    void unsetTk();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getTk <em>Tk</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tk</em>' attribute is set.
     * @see #unsetTk()
     * @see #getTk()
     * @see #setTk(Double)
     * @generated
     */
    boolean isSetTk();

    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -36.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vrmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vrmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @generated
     */
    void setVrmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    boolean isSetVrmin();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator gain (<i>K</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 536.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Kc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rectifier loading factor proportional to commutating reactance (<i>K</i><i><sub>C</sub></i>) (&gt;= 0). Typical value = 0,173.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #setKc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Kc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.kc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #getKc()
     * @generated
     */
    void setKc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKc <em>Kc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kc</em>' attribute is set.
     * @see #unsetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    boolean isSetKc();

    /**
     * Returns the value of the '<em><b>Kd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Demagnetizing factor, a function of exciter alternator reactances (<i>K</i><i><sub>D</sub></i>) (&gt;= 0).  Typical value = 1,91.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #setKd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Kd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.kd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #getKd()
     * @generated
     */
    void setKd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    void unsetKd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKd <em>Kd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kd</em>' attribute is set.
     * @see #unsetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    boolean isSetKd();

    /**
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter constant related to self-excited field (<i>K</i><i><sub>E</sub></i>).  Typical value = 1,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Ke()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.ke' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #getKe()
     * @generated
     */
    void setKe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    boolean isSetKe();

    /**
     * Returns the value of the '<em><b>Kh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter field current limiter gain (<i>K</i><i><sub>H</sub></i>) (&gt;= 0).  Typical value = 92.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #setKh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Kh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.kh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #getKh()
     * @generated
     */
    void setKh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    void unsetKh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getKh <em>Kh</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh</em>' attribute is set.
     * @see #unsetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    boolean isSetKh();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 44.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vrmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vrmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @generated
     */
    void setVrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    boolean isSetVrmax();

    /**
     * Returns the value of the '<em><b>Vhmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum field current limiter signal reference (<i>V</i><i><sub>HMAX</sub></i>) (&gt; 0).  Typical value = 75.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vhmax</em>' attribute.
     * @see #isSetVhmax()
     * @see #unsetVhmax()
     * @see #setVhmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vhmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vhmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVhmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVhmax <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vhmax</em>' attribute.
     * @see #isSetVhmax()
     * @see #unsetVhmax()
     * @see #getVhmax()
     * @generated
     */
    void setVhmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVhmax <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVhmax()
     * @see #getVhmax()
     * @see #setVhmax(Double)
     * @generated
     */
    void unsetVhmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVhmax <em>Vhmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vhmax</em>' attribute is set.
     * @see #unsetVhmax()
     * @see #getVhmax()
     * @see #setVhmax(Double)
     * @generated
     */
    boolean isSetVhmax();

    /**
     * Returns the value of the '<em><b>Seve1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E1</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E1</sub></i><i>])</i> (&gt;= 0).  Typical value = 0,214.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seve1</em>' attribute.
     * @see #isSetSeve1()
     * @see #unsetSeve1()
     * @see #setSeve1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Seve1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.seve1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeve1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve1 <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seve1</em>' attribute.
     * @see #isSetSeve1()
     * @see #unsetSeve1()
     * @see #getSeve1()
     * @generated
     */
    void setSeve1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve1 <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeve1()
     * @see #getSeve1()
     * @see #setSeve1(Double)
     * @generated
     */
    void unsetSeve1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve1 <em>Seve1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seve1</em>' attribute is set.
     * @see #unsetSeve1()
     * @see #getSeve1()
     * @see #setSeve1(Double)
     * @generated
     */
    boolean isSetSeve1();

    /**
     * Returns the value of the '<em><b>Seve2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>V</i><i><sub>E2</sub></i>, back of commutating reactance (<i>S</i><i><sub>E</sub></i><i>[V</i><i><sub>E2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,044.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seve2</em>' attribute.
     * @see #isSetSeve2()
     * @see #unsetSeve2()
     * @see #setSeve2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Seve2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.seve2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeve2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve2 <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seve2</em>' attribute.
     * @see #isSetSeve2()
     * @see #unsetSeve2()
     * @see #getSeve2()
     * @generated
     */
    void setSeve2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve2 <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeve2()
     * @see #getSeve2()
     * @see #setSeve2(Double)
     * @generated
     */
    void unsetSeve2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getSeve2 <em>Seve2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seve2</em>' attribute is set.
     * @see #unsetSeve2()
     * @see #getSeve2()
     * @see #setSeve2(Double)
     * @generated
     */
    boolean isSetSeve2();

    /**
     * Returns the value of the '<em><b>Vfelim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter field current limit reference (<i>V</i><i><sub>FELIM</sub></i>) (&gt; 0).  Typical value = 19.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vfelim</em>' attribute.
     * @see #isSetVfelim()
     * @see #unsetVfelim()
     * @see #setVfelim(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC6A_Vfelim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC6A.vfelim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVfelim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVfelim <em>Vfelim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vfelim</em>' attribute.
     * @see #isSetVfelim()
     * @see #unsetVfelim()
     * @see #getVfelim()
     * @generated
     */
    void setVfelim( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVfelim <em>Vfelim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVfelim()
     * @see #getVfelim()
     * @see #setVfelim(Double)
     * @generated
     */
    void unsetVfelim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC6A#getVfelim <em>Vfelim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vfelim</em>' attribute is set.
     * @see #unsetVfelim()
     * @see #getVfelim()
     * @see #setVfelim(Double)
     * @generated
     */
    boolean isSetVfelim();

} // ExcIEEEAC6A
