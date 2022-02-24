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
 * A representation of the model object '<em><b>Pss PTIST1</b></em>'.
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtp <em>Dtp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtf <em>Dtf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtc <em>Dtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT2 <em>T2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1()
 * @model
 * @generated
 */
public interface PssPTIST1 extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>M</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (<i>M</i>).  <i>M </i>= 2 x <i>H</i>.  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #setM(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_M()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.m' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getM();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #getM()
     * @generated
     */
    void setM( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetM()
     * @see #getM()
     * @see #setM(Double)
     * @generated
     */
    void unsetM();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getM <em>M</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>M</em>' attribute is set.
     * @see #unsetM()
     * @see #getM()
     * @see #setM(Double)
     * @generated
     */
    boolean isSetM();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i>).  Typical value = 9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_K()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.k' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #getK()
     * @generated
     */
    void setK( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getK <em>K</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K</em>' attribute is set.
     * @see #unsetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    boolean isSetK();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #getTp()
     * @generated
     */
    void setTp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTp <em>Tp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tp</em>' attribute is set.
     * @see #unsetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    boolean isSetTp();

    /**
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTf <em>Tf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getTf <em>Tf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dtp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time step active power calculation (<i>deltatp</i>) (&gt;= 0).  Typical value = 0,0125.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dtp</em>' attribute.
     * @see #isSetDtp()
     * @see #unsetDtp()
     * @see #setDtp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_Dtp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.dtp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDtp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtp <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dtp</em>' attribute.
     * @see #isSetDtp()
     * @see #unsetDtp()
     * @see #getDtp()
     * @generated
     */
    void setDtp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtp <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDtp()
     * @see #getDtp()
     * @see #setDtp(Double)
     * @generated
     */
    void unsetDtp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtp <em>Dtp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dtp</em>' attribute is set.
     * @see #unsetDtp()
     * @see #getDtp()
     * @see #setDtp(Double)
     * @generated
     */
    boolean isSetDtp();

    /**
     * Returns the value of the '<em><b>Dtf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time step frequency calculation (<i>deltatf</i>) (&gt;= 0).  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dtf</em>' attribute.
     * @see #isSetDtf()
     * @see #unsetDtf()
     * @see #setDtf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_Dtf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.dtf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDtf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtf <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dtf</em>' attribute.
     * @see #isSetDtf()
     * @see #unsetDtf()
     * @see #getDtf()
     * @generated
     */
    void setDtf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtf <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDtf()
     * @see #getDtf()
     * @see #setDtf(Double)
     * @generated
     */
    void unsetDtf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtf <em>Dtf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dtf</em>' attribute is set.
     * @see #unsetDtf()
     * @see #getDtf()
     * @see #setDtf(Double)
     * @generated
     */
    boolean isSetDtf();

    /**
     * Returns the value of the '<em><b>Dtc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time step related to activation of controls (<i>deltatc</i>) (&gt;= 0).  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dtc</em>' attribute.
     * @see #isSetDtc()
     * @see #unsetDtc()
     * @see #setDtc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_Dtc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.dtc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDtc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtc <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dtc</em>' attribute.
     * @see #isSetDtc()
     * @see #unsetDtc()
     * @see #getDtc()
     * @generated
     */
    void setDtc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtc <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDtc()
     * @see #getDtc()
     * @see #setDtc(Double)
     * @generated
     */
    void unsetDtc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getDtc <em>Dtc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dtc</em>' attribute is set.
     * @see #unsetDtc()
     * @see #getDtc()
     * @see #setDtc(Double)
     * @generated
     */
    boolean isSetDtc();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T3</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT3 <em>T3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_T4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.t4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT4 <em>T4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT4 <em>T4</em>}' attribute is set.
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
     * Time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT1 <em>T1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T2</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssPTIST1_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssPTIST1.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

} // PssPTIST1
