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
 * A representation of the model object '<em><b>Exc ELIN2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed excitation system ELIN (VATECH).  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  Power system stabilizer models used in conjunction with this excitation system model: PssELIN2, PssIEEE2B, Pss2B.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getEfdbas <em>Efdbas</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe1 <em>Ve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe2 <em>Ve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKetb <em>Ketb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKd1 <em>Kd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKe2 <em>Ke2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve2 <em>Seve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve1 <em>Seve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getPid1max <em>Pid1max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTr4 <em>Tr4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe2 <em>Te2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi3 <em>Ti3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi4 <em>Ti4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi1 <em>Ti1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1ec <em>K1ec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmin <em>Upmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmax <em>Upmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax <em>Iefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmin <em>Iefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax2 <em>Iefmax2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2()
 * @model
 * @generated
 */
public interface ExcELIN2 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Efdbas</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>Efdbas</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdbas</em>' attribute.
     * @see #isSetEfdbas()
     * @see #unsetEfdbas()
     * @see #setEfdbas(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Efdbas()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.efdbas' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdbas();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getEfdbas <em>Efdbas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdbas</em>' attribute.
     * @see #isSetEfdbas()
     * @see #unsetEfdbas()
     * @see #getEfdbas()
     * @generated
     */
    void setEfdbas( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getEfdbas <em>Efdbas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdbas()
     * @see #getEfdbas()
     * @see #setEfdbas(Double)
     * @generated
     */
    void unsetEfdbas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getEfdbas <em>Efdbas</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdbas</em>' attribute is set.
     * @see #unsetEfdbas()
     * @see #getEfdbas()
     * @see #setEfdbas(Double)
     * @generated
     */
    boolean isSetEfdbas();

    /**
     * Returns the value of the '<em><b>Ve1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>1</sub></i>) (&gt; 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ve1</em>' attribute.
     * @see #isSetVe1()
     * @see #unsetVe1()
     * @see #setVe1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ve1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ve1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVe1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe1 <em>Ve1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe1 <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVe1()
     * @see #getVe1()
     * @see #setVe1(Double)
     * @generated
     */
    void unsetVe1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe1 <em>Ve1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ve2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (<i>Ve</i><i><sub>2</sub></i>) (&gt; 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ve2</em>' attribute.
     * @see #isSetVe2()
     * @see #unsetVe2()
     * @see #setVe2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ve2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ve2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVe2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe2 <em>Ve2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe2 <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVe2()
     * @see #getVe2()
     * @see #setVe2(Double)
     * @generated
     */
    void unsetVe2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getVe2 <em>Ve2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ketb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>Ketb</i>).  Typical value = 0,06.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ketb</em>' attribute.
     * @see #isSetKetb()
     * @see #unsetKetb()
     * @see #setKetb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ketb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ketb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKetb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKetb <em>Ketb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ketb</em>' attribute.
     * @see #isSetKetb()
     * @see #unsetKetb()
     * @see #getKetb()
     * @generated
     */
    void setKetb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKetb <em>Ketb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKetb()
     * @see #getKetb()
     * @see #setKetb(Double)
     * @generated
     */
    void unsetKetb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKetb <em>Ketb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ketb</em>' attribute is set.
     * @see #unsetKetb()
     * @see #getKetb()
     * @see #setKetb(Double)
     * @generated
     */
    boolean isSetKetb();

    /**
     * Returns the value of the '<em><b>Kd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage controller derivative gain (<i>Kd1</i>).  Typical value = 34,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kd1</em>' attribute.
     * @see #isSetKd1()
     * @see #unsetKd1()
     * @see #setKd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Kd1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.kd1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKd1 <em>Kd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kd1</em>' attribute.
     * @see #isSetKd1()
     * @see #unsetKd1()
     * @see #getKd1()
     * @generated
     */
    void setKd1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKd1 <em>Kd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKd1()
     * @see #getKd1()
     * @see #setKd1(Double)
     * @generated
     */
    void unsetKd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKd1 <em>Kd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kd1</em>' attribute is set.
     * @see #unsetKd1()
     * @see #getKd1()
     * @see #setKd1(Double)
     * @generated
     */
    boolean isSetKd1();

    /**
     * Returns the value of the '<em><b>Ke2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>Ke2</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ke2</em>' attribute.
     * @see #isSetKe2()
     * @see #unsetKe2()
     * @see #setKe2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ke2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ke2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKe2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKe2 <em>Ke2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke2</em>' attribute.
     * @see #isSetKe2()
     * @see #unsetKe2()
     * @see #getKe2()
     * @generated
     */
    void setKe2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKe2 <em>Ke2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe2()
     * @see #getKe2()
     * @see #setKe2(Double)
     * @generated
     */
    void unsetKe2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getKe2 <em>Ke2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke2</em>' attribute is set.
     * @see #unsetKe2()
     * @see #getKe2()
     * @see #setKe2(Double)
     * @generated
     */
    boolean isSetKe2();

    /**
     * Returns the value of the '<em><b>Seve2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>2</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seve2</em>' attribute.
     * @see #isSetSeve2()
     * @see #unsetSeve2()
     * @see #setSeve2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Seve2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.seve2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeve2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve2 <em>Seve2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve2 <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeve2()
     * @see #getSeve2()
     * @see #setSeve2(Double)
     * @generated
     */
    void unsetSeve2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve2 <em>Seve2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Seve1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>Ve</i><i><sub>1</sub></i>, back of commutating reactance (<i>Se[Ve</i><i><sub>1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seve1</em>' attribute.
     * @see #isSetSeve1()
     * @see #unsetSeve1()
     * @see #setSeve1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Seve1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.seve1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeve1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve1 <em>Seve1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve1 <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeve1()
     * @see #getSeve1()
     * @see #setSeve1(Double)
     * @generated
     */
    void unsetSeve1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getSeve1 <em>Seve1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pid1max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller follow up gain (<i>PID1max</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pid1max</em>' attribute.
     * @see #isSetPid1max()
     * @see #unsetPid1max()
     * @see #setPid1max(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Pid1max()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.pid1max' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPid1max();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getPid1max <em>Pid1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pid1max</em>' attribute.
     * @see #isSetPid1max()
     * @see #unsetPid1max()
     * @see #getPid1max()
     * @generated
     */
    void setPid1max( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getPid1max <em>Pid1max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPid1max()
     * @see #getPid1max()
     * @see #setPid1max(Double)
     * @generated
     */
    void unsetPid1max();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getPid1max <em>Pid1max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pid1max</em>' attribute is set.
     * @see #unsetPid1max()
     * @see #getPid1max()
     * @see #setPid1max(Double)
     * @generated
     */
    boolean isSetPid1max();

    /**
     * Returns the value of the '<em><b>Xp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation transformer effective reactance (<i>Xp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #setXp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Xp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.xp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #getXp()
     * @generated
     */
    void setXp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXp()
     * @see #getXp()
     * @see #setXp(Double)
     * @generated
     */
    void unsetXp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getXp <em>Xp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xp</em>' attribute is set.
     * @see #unsetXp()
     * @see #getXp()
     * @see #setXp(Double)
     * @generated
     */
    boolean isSetXp();

    /**
     * Returns the value of the '<em><b>Tr4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>r4</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr4</em>' attribute.
     * @see #isSetTr4()
     * @see #unsetTr4()
     * @see #setTr4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Tr4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.tr4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTr4 <em>Tr4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr4</em>' attribute.
     * @see #isSetTr4()
     * @see #unsetTr4()
     * @see #getTr4()
     * @generated
     */
    void setTr4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTr4 <em>Tr4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr4()
     * @see #getTr4()
     * @see #setTr4(Double)
     * @generated
     */
    void unsetTr4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTr4 <em>Tr4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr4</em>' attribute is set.
     * @see #unsetTr4()
     * @see #getTr4()
     * @see #setTr4(Double)
     * @generated
     */
    boolean isSetTr4();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Te</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe <em>Te</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe <em>Te</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tb1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage controller derivative washout time constant (<i>Tb1</i>) (&gt;= 0).  Typical value = 12,45.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb1</em>' attribute.
     * @see #isSetTb1()
     * @see #unsetTb1()
     * @see #setTb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Tb1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.tb1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTb1 <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb1</em>' attribute.
     * @see #isSetTb1()
     * @see #unsetTb1()
     * @see #getTb1()
     * @generated
     */
    void setTb1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTb1 <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb1()
     * @see #getTb1()
     * @see #setTb1(Double)
     * @generated
     */
    void unsetTb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTb1 <em>Tb1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb1</em>' attribute is set.
     * @see #unsetTb1()
     * @see #getTb1()
     * @see #setTb1(Double)
     * @generated
     */
    boolean isSetTb1();

    /**
     * Returns the value of the '<em><b>K3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K3</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #setK3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_K3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.k3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK3 <em>K3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    void unsetK3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK3 <em>K3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K4</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K4</em>' attribute.
     * @see #isSetK4()
     * @see #unsetK4()
     * @see #setK4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_K4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.k4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK4 <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K4</em>' attribute.
     * @see #isSetK4()
     * @see #unsetK4()
     * @see #getK4()
     * @generated
     */
    void setK4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK4 <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK4()
     * @see #getK4()
     * @see #setK4(Double)
     * @generated
     */
    void unsetK4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK4 <em>K4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K4</em>' attribute is set.
     * @see #unsetK4()
     * @see #getK4()
     * @see #setK4(Double)
     * @generated
     */
    boolean isSetK4();

    /**
     * Returns the value of the '<em><b>K1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator input gain (<i>K1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1 <em>K1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1 <em>K1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K2</i>).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK2 <em>K2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK2 <em>K2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Te2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time Constant (<i>T</i><i><sub>e2</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te2</em>' attribute.
     * @see #isSetTe2()
     * @see #unsetTe2()
     * @see #setTe2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Te2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.te2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe2 <em>Te2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te2</em>' attribute.
     * @see #isSetTe2()
     * @see #unsetTe2()
     * @see #getTe2()
     * @generated
     */
    void setTe2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe2 <em>Te2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe2()
     * @see #getTe2()
     * @see #setTe2(Double)
     * @generated
     */
    void unsetTe2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTe2 <em>Te2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te2</em>' attribute is set.
     * @see #unsetTe2()
     * @see #getTe2()
     * @see #setTe2(Double)
     * @generated
     */
    boolean isSetTe2();

    /**
     * Returns the value of the '<em><b>Ti3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>i3</sub></i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti3</em>' attribute.
     * @see #isSetTi3()
     * @see #unsetTi3()
     * @see #setTi3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ti3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ti3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi3 <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti3</em>' attribute.
     * @see #isSetTi3()
     * @see #unsetTi3()
     * @see #getTi3()
     * @generated
     */
    void setTi3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi3 <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi3()
     * @see #getTi3()
     * @see #setTi3(Double)
     * @generated
     */
    void unsetTi3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi3 <em>Ti3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti3</em>' attribute is set.
     * @see #unsetTi3()
     * @see #getTi3()
     * @see #setTi3(Double)
     * @generated
     */
    boolean isSetTi3();

    /**
     * Returns the value of the '<em><b>Ti4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>i4</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti4</em>' attribute.
     * @see #isSetTi4()
     * @see #unsetTi4()
     * @see #setTi4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ti4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ti4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi4 <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti4</em>' attribute.
     * @see #isSetTi4()
     * @see #unsetTi4()
     * @see #getTi4()
     * @generated
     */
    void setTi4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi4 <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi4()
     * @see #getTi4()
     * @see #setTi4(Double)
     * @generated
     */
    void unsetTi4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi4 <em>Ti4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti4</em>' attribute is set.
     * @see #unsetTi4()
     * @see #getTi4()
     * @see #setTi4(Double)
     * @generated
     */
    boolean isSetTi4();

    /**
     * Returns the value of the '<em><b>Ti1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller follow up deadband (<i>Ti1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti1</em>' attribute.
     * @see #isSetTi1()
     * @see #unsetTi1()
     * @see #setTi1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Ti1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.ti1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi1 <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti1</em>' attribute.
     * @see #isSetTi1()
     * @see #unsetTi1()
     * @see #getTi1()
     * @generated
     */
    void setTi1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi1 <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi1()
     * @see #getTi1()
     * @see #setTi1(Double)
     * @generated
     */
    void unsetTi1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getTi1 <em>Ti1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti1</em>' attribute is set.
     * @see #unsetTi1()
     * @see #getTi1()
     * @see #setTi1(Double)
     * @generated
     */
    boolean isSetTi1();

    /**
     * Returns the value of the '<em><b>K1ec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator input limit (<i>K1ec</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1ec</em>' attribute.
     * @see #isSetK1ec()
     * @see #unsetK1ec()
     * @see #setK1ec(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_K1ec()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.k1ec' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1ec();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1ec <em>K1ec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K1ec</em>' attribute.
     * @see #isSetK1ec()
     * @see #unsetK1ec()
     * @see #getK1ec()
     * @generated
     */
    void setK1ec( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1ec <em>K1ec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1ec()
     * @see #getK1ec()
     * @see #setK1ec(Double)
     * @generated
     */
    void unsetK1ec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getK1ec <em>K1ec</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K1ec</em>' attribute is set.
     * @see #unsetK1ec()
     * @see #getK1ec()
     * @see #setK1ec(Double)
     * @generated
     */
    boolean isSetK1ec();

    /**
     * Returns the value of the '<em><b>Upmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>Upmin</i>) (&lt; ExcELIN2.upmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upmin</em>' attribute.
     * @see #isSetUpmin()
     * @see #unsetUpmin()
     * @see #setUpmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Upmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.upmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmin <em>Upmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upmin</em>' attribute.
     * @see #isSetUpmin()
     * @see #unsetUpmin()
     * @see #getUpmin()
     * @generated
     */
    void setUpmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmin <em>Upmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpmin()
     * @see #getUpmin()
     * @see #setUpmin(Double)
     * @generated
     */
    void unsetUpmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmin <em>Upmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upmin</em>' attribute is set.
     * @see #unsetUpmin()
     * @see #getUpmin()
     * @see #setUpmin(Double)
     * @generated
     */
    boolean isSetUpmin();

    /**
     * Returns the value of the '<em><b>Upmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>Upmax</i>) (&gt; ExcELIN2.upmin).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upmax</em>' attribute.
     * @see #isSetUpmax()
     * @see #unsetUpmax()
     * @see #setUpmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Upmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.upmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmax <em>Upmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upmax</em>' attribute.
     * @see #isSetUpmax()
     * @see #unsetUpmax()
     * @see #getUpmax()
     * @generated
     */
    void setUpmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmax <em>Upmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpmax()
     * @see #getUpmax()
     * @see #setUpmax(Double)
     * @generated
     */
    void unsetUpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getUpmax <em>Upmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upmax</em>' attribute is set.
     * @see #unsetUpmax()
     * @see #getUpmax()
     * @see #setUpmax(Double)
     * @generated
     */
    boolean isSetUpmax();

    /**
     * Returns the value of the '<em><b>Iefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>I</i><i><sub>efmax</sub></i>) (&gt; ExcELIN2.iefmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iefmax</em>' attribute.
     * @see #isSetIefmax()
     * @see #unsetIefmax()
     * @see #setIefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Iefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.iefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax <em>Iefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iefmax</em>' attribute.
     * @see #isSetIefmax()
     * @see #unsetIefmax()
     * @see #getIefmax()
     * @generated
     */
    void setIefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax <em>Iefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIefmax()
     * @see #getIefmax()
     * @see #setIefmax(Double)
     * @generated
     */
    void unsetIefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax <em>Iefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iefmax</em>' attribute is set.
     * @see #unsetIefmax()
     * @see #getIefmax()
     * @see #setIefmax(Double)
     * @generated
     */
    boolean isSetIefmax();

    /**
     * Returns the value of the '<em><b>Iefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>I</i><i><sub>efmin</sub></i>) (&lt; ExcELIN2.iefmax).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iefmin</em>' attribute.
     * @see #isSetIefmin()
     * @see #unsetIefmin()
     * @see #setIefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Iefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.iefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmin <em>Iefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iefmin</em>' attribute.
     * @see #isSetIefmin()
     * @see #unsetIefmin()
     * @see #getIefmin()
     * @generated
     */
    void setIefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmin <em>Iefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIefmin()
     * @see #getIefmin()
     * @see #setIefmin(Double)
     * @generated
     */
    void unsetIefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmin <em>Iefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iefmin</em>' attribute is set.
     * @see #unsetIefmin()
     * @see #getIefmin()
     * @see #setIefmin(Double)
     * @generated
     */
    boolean isSetIefmin();

    /**
     * Returns the value of the '<em><b>Iefmax2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum open circuit excitation voltage (<i>I</i><i><sub>efmax2</sub></i>).  Typical value = -5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iefmax2</em>' attribute.
     * @see #isSetIefmax2()
     * @see #unsetIefmax2()
     * @see #setIefmax2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcELIN2_Iefmax2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcELIN2.iefmax2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIefmax2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax2 <em>Iefmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iefmax2</em>' attribute.
     * @see #isSetIefmax2()
     * @see #unsetIefmax2()
     * @see #getIefmax2()
     * @generated
     */
    void setIefmax2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax2 <em>Iefmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIefmax2()
     * @see #getIefmax2()
     * @see #setIefmax2(Double)
     * @generated
     */
    void unsetIefmax2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN2#getIefmax2 <em>Iefmax2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iefmax2</em>' attribute is set.
     * @see #unsetIefmax2()
     * @see #getIefmax2()
     * @see #setIefmax2(Double)
     * @generated
     */
    boolean isSetIefmax2();

} // ExcELIN2
