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
 * A representation of the model object '<em><b>Exc AVR1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Italian excitation system corresponding to IEEE (1968) type 1 model. It represents an exciter dynamo and electromechanical regulator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe2 <em>Se2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe1 <em>Se1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmx <em>Vrmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE1 <em>E1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE2 <em>E2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1()
 * @model
 * @generated
 */
public interface ExcAVR1 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Se2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturation factor at <i>E</i><i><sub>2</sub></i> (<i>S[E</i><i><sub>2</sub></i><i>]</i>).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Se2</em>' attribute.
     * @see #isSetSe2()
     * @see #unsetSe2()
     * @see #setSe2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Se2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.se2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSe2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe2 <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Se2</em>' attribute.
     * @see #isSetSe2()
     * @see #unsetSe2()
     * @see #getSe2()
     * @generated
     */
    void setSe2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe2 <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSe2()
     * @see #getSe2()
     * @see #setSe2(Double)
     * @generated
     */
    void unsetSe2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe2 <em>Se2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Se2</em>' attribute is set.
     * @see #unsetSe2()
     * @see #getSe2()
     * @see #setSe2(Double)
     * @generated
     */
    boolean isSetSe2();

    /**
     * Returns the value of the '<em><b>Se1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturation factor at <i>E</i><i><sub>1</sub></i> (<i>S[E</i><i><sub>1</sub></i><i>]</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Se1</em>' attribute.
     * @see #isSetSe1()
     * @see #unsetSe1()
     * @see #setSe1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Se1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.se1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSe1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe1 <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Se1</em>' attribute.
     * @see #isSetSe1()
     * @see #unsetSe1()
     * @see #getSe1()
     * @generated
     */
    void setSe1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe1 <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSe1()
     * @see #getSe1()
     * @see #setSe1(Double)
     * @generated
     */
    void unsetSe1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getSe1 <em>Se1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Se1</em>' attribute is set.
     * @see #unsetSe1()
     * @see #getSe1()
     * @see #setSe1(Double)
     * @generated
     */
    boolean isSetSe1();

    /**
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * AVR time constant (<i>T</i><i><sub>A</sub></i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTa <em>Ta</em>}' attribute is set.
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
     * AVR time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTb <em>Tb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter time constant (<i>T</i><i><sub>E</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTe <em>Te</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTe <em>Te</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate feedback time constant (<i>T</i><i><sub>F</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #getTf()
     * @generated
     */
    void setTf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getTf <em>Tf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf</em>' attribute is set.
     * @see #unsetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    boolean isSetTf();

    /**
     * Returns the value of the '<em><b>Vrmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum AVR output (<i>V</i><i><sub>RMN</sub></i>).  Typical value = -6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmn</em>' attribute.
     * @see #isSetVrmn()
     * @see #unsetVrmn()
     * @see #setVrmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Vrmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.vrmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmn <em>Vrmn</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmn <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmn()
     * @see #getVrmn()
     * @see #setVrmn(Double)
     * @generated
     */
    void unsetVrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmn <em>Vrmn</em>}' attribute is set.
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
     * Maximum AVR output (<i>V</i><i><sub>RMX</sub></i>).  Typical value = 7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmx</em>' attribute.
     * @see #isSetVrmx()
     * @see #unsetVrmx()
     * @see #setVrmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Vrmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.vrmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmx <em>Vrmx</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmx <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Double)
     * @generated
     */
    void unsetVrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getVrmx <em>Vrmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmx</em>' attribute is set.
     * @see #unsetVrmx()
     * @see #getVrmx()
     * @see #setVrmx(Double)
     * @generated
     */
    boolean isSetVrmx();

    /**
     * Returns the value of the '<em><b>Kf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate feedback gain (<i>K</i><i><sub>F</sub></i>).  Typical value = 0,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #setKf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Kf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.kf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKf <em>Kf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf()
     * @see #getKf()
     * @see #setKf(Double)
     * @generated
     */
    void unsetKf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKf <em>Kf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * AVR gain (<i>K</i><i><sub>A</sub></i>).  Typical value = 500.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKa <em>Ka</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getKa <em>Ka</em>}' attribute is set.
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
     * Returns the value of the '<em><b>E1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage value 1 (<i>E</i><i><sub>1</sub></i>).  Typical value = 4.18.
     * <!-- end-model-doc -->
     * @return the value of the '<em>E1</em>' attribute.
     * @see #isSetE1()
     * @see #unsetE1()
     * @see #setE1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_E1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.e1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getE1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE1 <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>E1</em>' attribute.
     * @see #isSetE1()
     * @see #unsetE1()
     * @see #getE1()
     * @generated
     */
    void setE1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE1 <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetE1()
     * @see #getE1()
     * @see #setE1(Double)
     * @generated
     */
    void unsetE1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE1 <em>E1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>E1</em>' attribute is set.
     * @see #unsetE1()
     * @see #getE1()
     * @see #setE1(Double)
     * @generated
     */
    boolean isSetE1();

    /**
     * Returns the value of the '<em><b>E2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage value 2 (<i>E</i><i><sub>2</sub></i>).  Typical value = 3,14.
     * <!-- end-model-doc -->
     * @return the value of the '<em>E2</em>' attribute.
     * @see #isSetE2()
     * @see #unsetE2()
     * @see #setE2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcAVR1_E2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcAVR1.e2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getE2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE2 <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>E2</em>' attribute.
     * @see #isSetE2()
     * @see #unsetE2()
     * @see #getE2()
     * @generated
     */
    void setE2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE2 <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetE2()
     * @see #getE2()
     * @see #setE2(Double)
     * @generated
     */
    void unsetE2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR1#getE2 <em>E2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>E2</em>' attribute is set.
     * @see #unsetE2()
     * @see #getE2()
     * @see #setE2(Double)
     * @generated
     */
    boolean isSetE2();

} // ExcAVR1
