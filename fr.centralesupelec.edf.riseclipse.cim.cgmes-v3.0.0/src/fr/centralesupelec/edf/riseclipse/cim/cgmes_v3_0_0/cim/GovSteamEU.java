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
 * A representation of the model object '<em><b>Gov Steam EU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simplified boiler and steam turbine with PID governor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTrh <em>Trh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTdp <em>Tdp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTfp <em>Tfp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTen <em>Ten</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getThp <em>Thp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCio <em>Cio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCic <em>Cic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCho <em>Cho</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTip <em>Tip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getChc <em>Chc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTlp <em>Tlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax1 <em>Wmax1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax2 <em>Wmax2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPrhmax <em>Prhmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKhp <em>Khp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKlp <em>Klp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getHhpmax <em>Hhpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKomegacor <em>Komegacor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmin <em>Wwmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmax <em>Wwmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvhp <em>Tvhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvip <em>Tvip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getSimx <em>Simx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKfcor <em>Kfcor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmin <em>Wfmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmax <em>Wfmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKe <em>Ke</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU()
 * @model
 * @generated
 */
public interface GovSteamEU extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Trh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reheater  time constant of the turbine (<i>Trh</i>) (&gt;= 0).  Typical value = 8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Trh</em>' attribute.
     * @see #isSetTrh()
     * @see #unsetTrh()
     * @see #setTrh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Trh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.trh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTrh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTrh <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trh</em>' attribute.
     * @see #isSetTrh()
     * @see #unsetTrh()
     * @see #getTrh()
     * @generated
     */
    void setTrh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTrh <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrh()
     * @see #getTrh()
     * @see #setTrh(Double)
     * @generated
     */
    void unsetTrh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTrh <em>Trh</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trh</em>' attribute is set.
     * @see #unsetTrh()
     * @see #getTrh()
     * @see #setTrh(Double)
     * @generated
     */
    boolean isSetTrh();

    /**
     * Returns the value of the '<em><b>Db1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deadband of the frequency corrector (<i>db1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db1</em>' attribute.
     * @see #isSetDb1()
     * @see #unsetDb1()
     * @see #setDb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Db1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.db1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Db1</em>' attribute.
     * @see #isSetDb1()
     * @see #unsetDb1()
     * @see #getDb1()
     * @generated
     */
    void setDb1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    void unsetDb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb1 <em>Db1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Db1</em>' attribute is set.
     * @see #unsetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    boolean isSetDb1();

    /**
     * Returns the value of the '<em><b>Db2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deadband of the speed governor (<i>db2</i>).  Typical value = 0,0004.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db2</em>' attribute.
     * @see #isSetDb2()
     * @see #unsetDb2()
     * @see #setDb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Db2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.db2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Db2</em>' attribute.
     * @see #isSetDb2()
     * @see #unsetDb2()
     * @see #getDb2()
     * @generated
     */
    void setDb2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    void unsetDb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getDb2 <em>Db2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Db2</em>' attribute is set.
     * @see #unsetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    boolean isSetDb2();

    /**
     * Returns the value of the '<em><b>Tdp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative time constant of the power controller (<i>Tdp</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdp</em>' attribute.
     * @see #isSetTdp()
     * @see #unsetTdp()
     * @see #setTdp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tdp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tdp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTdp <em>Tdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdp</em>' attribute.
     * @see #isSetTdp()
     * @see #unsetTdp()
     * @see #getTdp()
     * @generated
     */
    void setTdp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTdp <em>Tdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdp()
     * @see #getTdp()
     * @see #setTdp(Double)
     * @generated
     */
    void unsetTdp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTdp <em>Tdp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdp</em>' attribute is set.
     * @see #unsetTdp()
     * @see #getTdp()
     * @see #setTdp(Double)
     * @generated
     */
    boolean isSetTdp();

    /**
     * Returns the value of the '<em><b>Tfp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of the power controller (<i>Tfp</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfp</em>' attribute.
     * @see #isSetTfp()
     * @see #unsetTfp()
     * @see #setTfp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tfp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tfp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTfp <em>Tfp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfp</em>' attribute.
     * @see #isSetTfp()
     * @see #unsetTfp()
     * @see #getTfp()
     * @generated
     */
    void setTfp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTfp <em>Tfp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfp()
     * @see #getTfp()
     * @see #setTfp(Double)
     * @generated
     */
    void unsetTfp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTfp <em>Tfp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfp</em>' attribute is set.
     * @see #unsetTfp()
     * @see #getTfp()
     * @see #setTfp(Double)
     * @generated
     */
    boolean isSetTfp();

    /**
     * Returns the value of the '<em><b>Ten</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electro hydraulic transducer (<i>Ten</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ten</em>' attribute.
     * @see #isSetTen()
     * @see #unsetTen()
     * @see #setTen(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Ten()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.ten' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTen <em>Ten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ten</em>' attribute.
     * @see #isSetTen()
     * @see #unsetTen()
     * @see #getTen()
     * @generated
     */
    void setTen( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTen <em>Ten</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTen()
     * @see #getTen()
     * @see #setTen(Double)
     * @generated
     */
    void unsetTen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTen <em>Ten</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ten</em>' attribute is set.
     * @see #unsetTen()
     * @see #getTen()
     * @see #setTen(Double)
     * @generated
     */
    boolean isSetTen();

    /**
     * Returns the value of the '<em><b>Thp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High pressure (HP) time constant of the turbine (<i>Thp</i>) (&gt;= 0).  Typical value = 0,31.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thp</em>' attribute.
     * @see #isSetThp()
     * @see #unsetThp()
     * @see #setThp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Thp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.thp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getThp <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thp</em>' attribute.
     * @see #isSetThp()
     * @see #unsetThp()
     * @see #getThp()
     * @generated
     */
    void setThp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getThp <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThp()
     * @see #getThp()
     * @see #setThp(Double)
     * @generated
     */
    void unsetThp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getThp <em>Thp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thp</em>' attribute is set.
     * @see #unsetThp()
     * @see #getThp()
     * @see #setThp(Double)
     * @generated
     */
    boolean isSetThp();

    /**
     * Returns the value of the '<em><b>Cio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves rate opening limit (<i>Cio</i>).  Typical value = 0,123.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cio</em>' attribute.
     * @see #isSetCio()
     * @see #unsetCio()
     * @see #setCio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Cio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.cio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCio <em>Cio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cio</em>' attribute.
     * @see #isSetCio()
     * @see #unsetCio()
     * @see #getCio()
     * @generated
     */
    void setCio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCio <em>Cio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCio()
     * @see #getCio()
     * @see #setCio(Double)
     * @generated
     */
    void unsetCio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCio <em>Cio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cio</em>' attribute is set.
     * @see #unsetCio()
     * @see #getCio()
     * @see #setCio(Double)
     * @generated
     */
    boolean isSetCio();

    /**
     * Returns the value of the '<em><b>Cic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves rate closing limit (<i>Cic</i>).  Typical value = -2,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cic</em>' attribute.
     * @see #isSetCic()
     * @see #unsetCic()
     * @see #setCic(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Cic()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.cic' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCic <em>Cic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cic</em>' attribute.
     * @see #isSetCic()
     * @see #unsetCic()
     * @see #getCic()
     * @generated
     */
    void setCic( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCic <em>Cic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCic()
     * @see #getCic()
     * @see #setCic(Double)
     * @generated
     */
    void unsetCic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCic <em>Cic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cic</em>' attribute is set.
     * @see #unsetCic()
     * @see #getCic()
     * @see #setCic(Double)
     * @generated
     */
    boolean isSetCic();

    /**
     * Returns the value of the '<em><b>Cho</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves rate opening limit (<i>Cho</i>).  Unit = PU / s.  Typical value = 0,17.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cho</em>' attribute.
     * @see #isSetCho()
     * @see #unsetCho()
     * @see #setCho(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Cho()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.cho' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCho();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCho <em>Cho</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cho</em>' attribute.
     * @see #isSetCho()
     * @see #unsetCho()
     * @see #getCho()
     * @generated
     */
    void setCho( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCho <em>Cho</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCho()
     * @see #getCho()
     * @see #setCho(Double)
     * @generated
     */
    void unsetCho();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getCho <em>Cho</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cho</em>' attribute is set.
     * @see #unsetCho()
     * @see #getCho()
     * @see #setCho(Double)
     * @generated
     */
    boolean isSetCho();

    /**
     * Returns the value of the '<em><b>Tip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral time constant of the power controller (<i>Tip</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tip</em>' attribute.
     * @see #isSetTip()
     * @see #unsetTip()
     * @see #setTip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTip <em>Tip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tip</em>' attribute.
     * @see #isSetTip()
     * @see #unsetTip()
     * @see #getTip()
     * @generated
     */
    void setTip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTip <em>Tip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTip()
     * @see #getTip()
     * @see #setTip(Double)
     * @generated
     */
    void unsetTip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTip <em>Tip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tip</em>' attribute is set.
     * @see #unsetTip()
     * @see #getTip()
     * @see #setTip(Double)
     * @generated
     */
    boolean isSetTip();

    /**
     * Returns the value of the '<em><b>Chc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves rate closing limit (<i>Chc</i>).  Unit = PU / s.  Typical value = -3,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Chc</em>' attribute.
     * @see #isSetChc()
     * @see #unsetChc()
     * @see #setChc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Chc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.chc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getChc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getChc <em>Chc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chc</em>' attribute.
     * @see #isSetChc()
     * @see #unsetChc()
     * @see #getChc()
     * @generated
     */
    void setChc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getChc <em>Chc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChc()
     * @see #getChc()
     * @see #setChc(Double)
     * @generated
     */
    void unsetChc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getChc <em>Chc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Chc</em>' attribute is set.
     * @see #unsetChc()
     * @see #getChc()
     * @see #setChc(Double)
     * @generated
     */
    boolean isSetChc();

    /**
     * Returns the value of the '<em><b>Tlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low pressure (LP) time constant of the turbine (<i>Tlp</i>) (&gt;= 0).  Typical value = 0,45.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tlp</em>' attribute.
     * @see #isSetTlp()
     * @see #unsetTlp()
     * @see #setTlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tlp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tlp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTlp <em>Tlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tlp</em>' attribute.
     * @see #isSetTlp()
     * @see #unsetTlp()
     * @see #getTlp()
     * @generated
     */
    void setTlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTlp <em>Tlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTlp()
     * @see #getTlp()
     * @see #setTlp(Double)
     * @generated
     */
    void unsetTlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTlp <em>Tlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tlp</em>' attribute is set.
     * @see #unsetTlp()
     * @see #getTlp()
     * @see #setTlp(Double)
     * @generated
     */
    boolean isSetTlp();

    /**
     * Returns the value of the '<em><b>Wmax1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Emergency speed control lower limit (<i>wmax1</i>).  Typical value = 1,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wmax1</em>' attribute.
     * @see #isSetWmax1()
     * @see #unsetWmax1()
     * @see #setWmax1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wmax1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wmax1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWmax1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax1 <em>Wmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wmax1</em>' attribute.
     * @see #isSetWmax1()
     * @see #unsetWmax1()
     * @see #getWmax1()
     * @generated
     */
    void setWmax1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax1 <em>Wmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWmax1()
     * @see #getWmax1()
     * @see #setWmax1(Double)
     * @generated
     */
    void unsetWmax1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax1 <em>Wmax1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wmax1</em>' attribute is set.
     * @see #unsetWmax1()
     * @see #getWmax1()
     * @see #setWmax1(Double)
     * @generated
     */
    boolean isSetWmax1();

    /**
     * Returns the value of the '<em><b>Wmax2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Emergency speed control upper limit (<i>wmax2</i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wmax2</em>' attribute.
     * @see #isSetWmax2()
     * @see #unsetWmax2()
     * @see #setWmax2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wmax2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wmax2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWmax2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax2 <em>Wmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wmax2</em>' attribute.
     * @see #isSetWmax2()
     * @see #unsetWmax2()
     * @see #getWmax2()
     * @generated
     */
    void setWmax2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax2 <em>Wmax2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWmax2()
     * @see #getWmax2()
     * @see #setWmax2(Double)
     * @generated
     */
    void unsetWmax2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWmax2 <em>Wmax2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wmax2</em>' attribute is set.
     * @see #unsetWmax2()
     * @see #getWmax2()
     * @see #setWmax2(Double)
     * @generated
     */
    boolean isSetWmax2();

    /**
     * Returns the value of the '<em><b>Pmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximal active power of the turbine (<i>Pmax</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #setPmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Pmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.pmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #getPmax()
     * @generated
     */
    void setPmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    void unsetPmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPmax <em>Pmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmax</em>' attribute is set.
     * @see #unsetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    boolean isSetPmax();

    /**
     * Returns the value of the '<em><b>Prhmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum low pressure limit (<i>Prhmax</i>).  Typical value = 1,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Prhmax</em>' attribute.
     * @see #isSetPrhmax()
     * @see #unsetPrhmax()
     * @see #setPrhmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Prhmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.prhmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPrhmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPrhmax <em>Prhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prhmax</em>' attribute.
     * @see #isSetPrhmax()
     * @see #unsetPrhmax()
     * @see #getPrhmax()
     * @generated
     */
    void setPrhmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPrhmax <em>Prhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrhmax()
     * @see #getPrhmax()
     * @see #setPrhmax(Double)
     * @generated
     */
    void unsetPrhmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getPrhmax <em>Prhmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prhmax</em>' attribute is set.
     * @see #unsetPrhmax()
     * @see #getPrhmax()
     * @see #setPrhmax(Double)
     * @generated
     */
    boolean isSetPrhmax();

    /**
     * Returns the value of the '<em><b>Khp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of total turbine output generated by HP part (<i>Khp</i>).  Typical value = 0,277.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Khp</em>' attribute.
     * @see #isSetKhp()
     * @see #unsetKhp()
     * @see #setKhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Khp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.khp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKhp <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Khp</em>' attribute.
     * @see #isSetKhp()
     * @see #unsetKhp()
     * @see #getKhp()
     * @generated
     */
    void setKhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKhp <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKhp()
     * @see #getKhp()
     * @see #setKhp(Double)
     * @generated
     */
    void unsetKhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKhp <em>Khp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Khp</em>' attribute is set.
     * @see #unsetKhp()
     * @see #getKhp()
     * @see #setKhp(Double)
     * @generated
     */
    boolean isSetKhp();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base for power values (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @generated
     */
    void setMwbase( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    boolean isSetMwbase();

    /**
     * Returns the value of the '<em><b>Klp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of total turbine output generated by HP part (<i>Klp</i>).  Typical value = 0,723.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Klp</em>' attribute.
     * @see #isSetKlp()
     * @see #unsetKlp()
     * @see #setKlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Klp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.klp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKlp <em>Klp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Klp</em>' attribute.
     * @see #isSetKlp()
     * @see #unsetKlp()
     * @see #getKlp()
     * @generated
     */
    void setKlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKlp <em>Klp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKlp()
     * @see #getKlp()
     * @see #setKlp(Double)
     * @generated
     */
    void unsetKlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKlp <em>Klp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Klp</em>' attribute is set.
     * @see #unsetKlp()
     * @see #getKlp()
     * @see #setKlp(Double)
     * @generated
     */
    boolean isSetKlp();

    /**
     * Returns the value of the '<em><b>Hhpmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum control valve position (<i>Hhpmax</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hhpmax</em>' attribute.
     * @see #isSetHhpmax()
     * @see #unsetHhpmax()
     * @see #setHhpmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Hhpmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.hhpmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHhpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getHhpmax <em>Hhpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hhpmax</em>' attribute.
     * @see #isSetHhpmax()
     * @see #unsetHhpmax()
     * @see #getHhpmax()
     * @generated
     */
    void setHhpmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getHhpmax <em>Hhpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHhpmax()
     * @see #getHhpmax()
     * @see #setHhpmax(Double)
     * @generated
     */
    void unsetHhpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getHhpmax <em>Hhpmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hhpmax</em>' attribute is set.
     * @see #unsetHhpmax()
     * @see #getHhpmax()
     * @see #setHhpmax(Double)
     * @generated
     */
    boolean isSetHhpmax();

    /**
     * Returns the value of the '<em><b>Komegacor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain of the speed governor (<i>Kwcor</i>).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Komegacor</em>' attribute.
     * @see #isSetKomegacor()
     * @see #unsetKomegacor()
     * @see #setKomegacor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Komegacor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.komegacor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKomegacor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKomegacor <em>Komegacor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Komegacor</em>' attribute.
     * @see #isSetKomegacor()
     * @see #unsetKomegacor()
     * @see #getKomegacor()
     * @generated
     */
    void setKomegacor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKomegacor <em>Komegacor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKomegacor()
     * @see #getKomegacor()
     * @see #setKomegacor(Double)
     * @generated
     */
    void unsetKomegacor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKomegacor <em>Komegacor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Komegacor</em>' attribute is set.
     * @see #unsetKomegacor()
     * @see #getKomegacor()
     * @see #setKomegacor(Double)
     * @generated
     */
    boolean isSetKomegacor();

    /**
     * Returns the value of the '<em><b>Wwmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lower limit for the speed governor frequency correction (<i>Wwmin</i>) (&lt; GovSteamEU.wwmax).  Typical value = -1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wwmin</em>' attribute.
     * @see #isSetWwmin()
     * @see #unsetWwmin()
     * @see #setWwmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wwmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wwmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWwmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmin <em>Wwmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wwmin</em>' attribute.
     * @see #isSetWwmin()
     * @see #unsetWwmin()
     * @see #getWwmin()
     * @generated
     */
    void setWwmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmin <em>Wwmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWwmin()
     * @see #getWwmin()
     * @see #setWwmin(Double)
     * @generated
     */
    void unsetWwmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmin <em>Wwmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wwmin</em>' attribute is set.
     * @see #unsetWwmin()
     * @see #getWwmin()
     * @see #setWwmin(Double)
     * @generated
     */
    boolean isSetWwmin();

    /**
     * Returns the value of the '<em><b>Wwmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Upper limit for the speed governor (<i>Wwmax</i>) (&gt; GovSteamEU.wwmin).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wwmax</em>' attribute.
     * @see #isSetWwmax()
     * @see #unsetWwmax()
     * @see #setWwmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wwmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wwmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWwmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmax <em>Wwmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wwmax</em>' attribute.
     * @see #isSetWwmax()
     * @see #unsetWwmax()
     * @see #getWwmax()
     * @generated
     */
    void setWwmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmax <em>Wwmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWwmax()
     * @see #getWwmax()
     * @see #setWwmax(Double)
     * @generated
     */
    void unsetWwmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWwmax <em>Wwmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wwmax</em>' attribute is set.
     * @see #unsetWwmax()
     * @see #getWwmax()
     * @see #setWwmax(Double)
     * @generated
     */
    boolean isSetWwmax();

    /**
     * Returns the value of the '<em><b>Tw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed transducer time constant (<i>Tw</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #setTw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #getTw()
     * @generated
     */
    void setTw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    void unsetTw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTw <em>Tw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw</em>' attribute is set.
     * @see #unsetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    boolean isSetTw();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power transducer time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,07.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTp <em>Tp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTp <em>Tp</em>}' attribute is set.
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
     * Frequency transducer time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTf <em>Tf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTf <em>Tf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tvhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves servo time constant (<i>Tvhp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tvhp</em>' attribute.
     * @see #isSetTvhp()
     * @see #unsetTvhp()
     * @see #setTvhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tvhp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tvhp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTvhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvhp <em>Tvhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tvhp</em>' attribute.
     * @see #isSetTvhp()
     * @see #unsetTvhp()
     * @see #getTvhp()
     * @generated
     */
    void setTvhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvhp <em>Tvhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTvhp()
     * @see #getTvhp()
     * @see #setTvhp(Double)
     * @generated
     */
    void unsetTvhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvhp <em>Tvhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tvhp</em>' attribute is set.
     * @see #unsetTvhp()
     * @see #getTvhp()
     * @see #setTvhp(Double)
     * @generated
     */
    boolean isSetTvhp();

    /**
     * Returns the value of the '<em><b>Tvip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves servo time constant (<i>Tvip</i>) (&gt;= 0).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tvip</em>' attribute.
     * @see #isSetTvip()
     * @see #unsetTvip()
     * @see #setTvip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tvip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tvip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTvip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvip <em>Tvip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tvip</em>' attribute.
     * @see #isSetTvip()
     * @see #unsetTvip()
     * @see #getTvip()
     * @generated
     */
    void setTvip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvip <em>Tvip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTvip()
     * @see #getTvip()
     * @see #setTvip(Double)
     * @generated
     */
    void unsetTvip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTvip <em>Tvip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tvip</em>' attribute is set.
     * @see #unsetTvip()
     * @see #getTvip()
     * @see #setTvip(Double)
     * @generated
     */
    boolean isSetTvip();

    /**
     * Returns the value of the '<em><b>Simx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves transfer limit (<i>Simx</i>).  Typical value = 0,425.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Simx</em>' attribute.
     * @see #isSetSimx()
     * @see #unsetSimx()
     * @see #setSimx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Simx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.simx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSimx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getSimx <em>Simx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simx</em>' attribute.
     * @see #isSetSimx()
     * @see #unsetSimx()
     * @see #getSimx()
     * @generated
     */
    void setSimx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getSimx <em>Simx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSimx()
     * @see #getSimx()
     * @see #setSimx(Double)
     * @generated
     */
    void unsetSimx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getSimx <em>Simx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Simx</em>' attribute is set.
     * @see #unsetSimx()
     * @see #getSimx()
     * @see #setSimx(Double)
     * @generated
     */
    boolean isSetSimx();

    /**
     * Returns the value of the '<em><b>Kfcor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain of the frequency corrector (<i>Kfcor</i>).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kfcor</em>' attribute.
     * @see #isSetKfcor()
     * @see #unsetKfcor()
     * @see #setKfcor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Kfcor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.kfcor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKfcor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKfcor <em>Kfcor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kfcor</em>' attribute.
     * @see #isSetKfcor()
     * @see #unsetKfcor()
     * @see #getKfcor()
     * @generated
     */
    void setKfcor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKfcor <em>Kfcor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKfcor()
     * @see #getKfcor()
     * @see #setKfcor(Double)
     * @generated
     */
    void unsetKfcor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKfcor <em>Kfcor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kfcor</em>' attribute is set.
     * @see #unsetKfcor()
     * @see #getKfcor()
     * @see #setKfcor(Double)
     * @generated
     */
    boolean isSetKfcor();

    /**
     * Returns the value of the '<em><b>Wfmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lower limit for frequency correction (<i>Wfmin</i>) (&lt; GovSteamEU.wfmax).  Typical value = -0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfmin</em>' attribute.
     * @see #isSetWfmin()
     * @see #unsetWfmin()
     * @see #setWfmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wfmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wfmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWfmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmin <em>Wfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wfmin</em>' attribute.
     * @see #isSetWfmin()
     * @see #unsetWfmin()
     * @see #getWfmin()
     * @generated
     */
    void setWfmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmin <em>Wfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfmin()
     * @see #getWfmin()
     * @see #setWfmin(Double)
     * @generated
     */
    void unsetWfmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmin <em>Wfmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wfmin</em>' attribute is set.
     * @see #unsetWfmin()
     * @see #getWfmin()
     * @see #setWfmin(Double)
     * @generated
     */
    boolean isSetWfmin();

    /**
     * Returns the value of the '<em><b>Wfmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Upper limit for frequency correction (<i>Wfmax</i>) (&gt; GovSteamEU.wfmin).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfmax</em>' attribute.
     * @see #isSetWfmax()
     * @see #unsetWfmax()
     * @see #setWfmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Wfmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.wfmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWfmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmax <em>Wfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wfmax</em>' attribute.
     * @see #isSetWfmax()
     * @see #unsetWfmax()
     * @see #getWfmax()
     * @generated
     */
    void setWfmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmax <em>Wfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfmax()
     * @see #getWfmax()
     * @see #setWfmax(Double)
     * @generated
     */
    void unsetWfmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getWfmax <em>Wfmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wfmax</em>' attribute is set.
     * @see #unsetWfmax()
     * @see #getWfmax()
     * @see #setWfmax(Double)
     * @generated
     */
    boolean isSetWfmax();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Boiler time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 100.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getTb <em>Tb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain of the power controller (<i>Ke</i>).  Typical value = 0,65.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamEU_Ke()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamEU.ke' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKe <em>Ke</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamEU#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    boolean isSetKe();

} // GovSteamEU
