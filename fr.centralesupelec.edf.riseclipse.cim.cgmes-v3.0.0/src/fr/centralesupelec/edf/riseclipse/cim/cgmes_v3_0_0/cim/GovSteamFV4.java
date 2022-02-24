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
 * A representation of the model object '<em><b>Gov Steam FV4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed electro-hydraulic governor for steam unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLpi <em>Lpi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLps <em>Lps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmx <em>Cpsmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmn <em>Cpsmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTmp <em>Tmp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmx <em>Ympmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmn <em>Ympmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getThp <em>Thp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPsmn <em>Psmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTrh <em>Trh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTy <em>Ty</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrsmp <em>Srsmp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp1 <em>Kmp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp2 <em>Kmp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmn <em>Yhpmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmx <em>Yhpmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmn <em>Srmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmx <em>Srmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmx <em>Crmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmn <em>Crmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr2 <em>Pr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr1 <em>Pr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmn <em>Rvgmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmx <em>Rvgmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimx <em>Rsmimx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimn <em>Rsmimn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmn <em>Svmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmx <em>Svmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getY <em>Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKic <em>Kic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKit <em>Kit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKhp <em>Khp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKsh <em>Ksh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKrc <em>Krc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTcm <em>Tcm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTdc <em>Tdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTam <em>Tam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpt <em>Kpt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf3 <em>Kf3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf1 <em>Kf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKdc <em>Kdc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4()
 * @model
 * @generated
 */
public interface GovSteamFV4 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Lpi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum negative power error (<i>Lpi</i>).  Typical value = -0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lpi</em>' attribute.
     * @see #isSetLpi()
     * @see #unsetLpi()
     * @see #setLpi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Lpi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.lpi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLpi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLpi <em>Lpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lpi</em>' attribute.
     * @see #isSetLpi()
     * @see #unsetLpi()
     * @see #getLpi()
     * @generated
     */
    void setLpi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLpi <em>Lpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLpi()
     * @see #getLpi()
     * @see #setLpi(Double)
     * @generated
     */
    void unsetLpi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLpi <em>Lpi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lpi</em>' attribute is set.
     * @see #unsetLpi()
     * @see #getLpi()
     * @see #setLpi(Double)
     * @generated
     */
    boolean isSetLpi();

    /**
     * Returns the value of the '<em><b>Lps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum positive power error (<i>Lps</i>).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lps</em>' attribute.
     * @see #isSetLps()
     * @see #unsetLps()
     * @see #setLps(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Lps()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.lps' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLps <em>Lps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lps</em>' attribute.
     * @see #isSetLps()
     * @see #unsetLps()
     * @see #getLps()
     * @generated
     */
    void setLps( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLps <em>Lps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLps()
     * @see #getLps()
     * @see #setLps(Double)
     * @generated
     */
    void unsetLps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getLps <em>Lps</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lps</em>' attribute is set.
     * @see #unsetLps()
     * @see #getLps()
     * @see #setLps(Double)
     * @generated
     */
    boolean isSetLps();

    /**
     * Returns the value of the '<em><b>Cpsmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value of pressure regulator output (<i>Cpsmx</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cpsmx</em>' attribute.
     * @see #isSetCpsmx()
     * @see #unsetCpsmx()
     * @see #setCpsmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Cpsmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.cpsmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCpsmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmx <em>Cpsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cpsmx</em>' attribute.
     * @see #isSetCpsmx()
     * @see #unsetCpsmx()
     * @see #getCpsmx()
     * @generated
     */
    void setCpsmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmx <em>Cpsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCpsmx()
     * @see #getCpsmx()
     * @see #setCpsmx(Double)
     * @generated
     */
    void unsetCpsmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmx <em>Cpsmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cpsmx</em>' attribute is set.
     * @see #unsetCpsmx()
     * @see #getCpsmx()
     * @see #setCpsmx(Double)
     * @generated
     */
    boolean isSetCpsmx();

    /**
     * Returns the value of the '<em><b>Cpsmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value of pressure regulator output (<i>Cpsmn</i>).  Typical value = -1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cpsmn</em>' attribute.
     * @see #isSetCpsmn()
     * @see #unsetCpsmn()
     * @see #setCpsmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Cpsmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.cpsmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCpsmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmn <em>Cpsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cpsmn</em>' attribute.
     * @see #isSetCpsmn()
     * @see #unsetCpsmn()
     * @see #getCpsmn()
     * @generated
     */
    void setCpsmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmn <em>Cpsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCpsmn()
     * @see #getCpsmn()
     * @see #setCpsmn(Double)
     * @generated
     */
    void unsetCpsmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCpsmn <em>Cpsmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cpsmn</em>' attribute is set.
     * @see #unsetCpsmn()
     * @see #getCpsmn()
     * @see #setCpsmn(Double)
     * @generated
     */
    boolean isSetCpsmn();

    /**
     * Returns the value of the '<em><b>Tmp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low pressure (LP) time constant of the turbine (<i>Tmp</i>) (&gt;= 0).  Typical value = 0,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tmp</em>' attribute.
     * @see #isSetTmp()
     * @see #unsetTmp()
     * @see #setTmp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tmp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tmp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTmp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTmp <em>Tmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tmp</em>' attribute.
     * @see #isSetTmp()
     * @see #unsetTmp()
     * @see #getTmp()
     * @generated
     */
    void setTmp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTmp <em>Tmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTmp()
     * @see #getTmp()
     * @see #setTmp(Double)
     * @generated
     */
    void unsetTmp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTmp <em>Tmp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tmp</em>' attribute is set.
     * @see #unsetTmp()
     * @see #getTmp()
     * @see #setTmp(Double)
     * @generated
     */
    boolean isSetTmp();

    /**
     * Returns the value of the '<em><b>Ympmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum intercept valve position (<i>Ympmx</i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ympmx</em>' attribute.
     * @see #isSetYmpmx()
     * @see #unsetYmpmx()
     * @see #setYmpmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Ympmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.ympmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYmpmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmx <em>Ympmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ympmx</em>' attribute.
     * @see #isSetYmpmx()
     * @see #unsetYmpmx()
     * @see #getYmpmx()
     * @generated
     */
    void setYmpmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmx <em>Ympmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYmpmx()
     * @see #getYmpmx()
     * @see #setYmpmx(Double)
     * @generated
     */
    void unsetYmpmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmx <em>Ympmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ympmx</em>' attribute is set.
     * @see #unsetYmpmx()
     * @see #getYmpmx()
     * @see #setYmpmx(Double)
     * @generated
     */
    boolean isSetYmpmx();

    /**
     * Returns the value of the '<em><b>Ympmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum intercept valve position (<i>Ympmn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ympmn</em>' attribute.
     * @see #isSetYmpmn()
     * @see #unsetYmpmn()
     * @see #setYmpmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Ympmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.ympmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYmpmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmn <em>Ympmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ympmn</em>' attribute.
     * @see #isSetYmpmn()
     * @see #unsetYmpmn()
     * @see #getYmpmn()
     * @generated
     */
    void setYmpmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmn <em>Ympmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYmpmn()
     * @see #getYmpmn()
     * @see #setYmpmn(Double)
     * @generated
     */
    void unsetYmpmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYmpmn <em>Ympmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ympmn</em>' attribute is set.
     * @see #unsetYmpmn()
     * @see #getYmpmn()
     * @see #setYmpmn(Double)
     * @generated
     */
    boolean isSetYmpmn();

    /**
     * Returns the value of the '<em><b>Thp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High pressure (HP) time constant of the turbine (<i>Thp</i>) (&gt;= 0).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thp</em>' attribute.
     * @see #isSetThp()
     * @see #unsetThp()
     * @see #setThp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Thp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.thp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getThp <em>Thp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getThp <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThp()
     * @see #getThp()
     * @see #setThp(Double)
     * @generated
     */
    void unsetThp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getThp <em>Thp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Psmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value of pressure set point static characteristic (<i>Psmn</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Psmn</em>' attribute.
     * @see #isSetPsmn()
     * @see #unsetPsmn()
     * @see #setPsmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Psmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.psmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPsmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPsmn <em>Psmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Psmn</em>' attribute.
     * @see #isSetPsmn()
     * @see #unsetPsmn()
     * @see #getPsmn()
     * @generated
     */
    void setPsmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPsmn <em>Psmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPsmn()
     * @see #getPsmn()
     * @see #setPsmn(Double)
     * @generated
     */
    void unsetPsmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPsmn <em>Psmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Psmn</em>' attribute is set.
     * @see #unsetPsmn()
     * @see #getPsmn()
     * @see #setPsmn(Double)
     * @generated
     */
    boolean isSetPsmn();

    /**
     * Returns the value of the '<em><b>Trh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reheater  time constant of the turbine (<i>Trh</i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Trh</em>' attribute.
     * @see #isSetTrh()
     * @see #unsetTrh()
     * @see #setTrh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Trh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.trh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTrh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTrh <em>Trh</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTrh <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrh()
     * @see #getTrh()
     * @see #setTrh(Double)
     * @generated
     */
    void unsetTrh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTrh <em>Trh</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves servo time constant (<i>Ty</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ty</em>' attribute.
     * @see #isSetTy()
     * @see #unsetTy()
     * @see #setTy(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Ty()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.ty' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTy <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ty</em>' attribute.
     * @see #isSetTy()
     * @see #unsetTy()
     * @see #getTy()
     * @generated
     */
    void setTy( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTy <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTy()
     * @see #getTy()
     * @see #setTy(Double)
     * @generated
     */
    void unsetTy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTy <em>Ty</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ty</em>' attribute is set.
     * @see #unsetTy()
     * @see #getTy()
     * @see #setTy(Double)
     * @generated
     */
    boolean isSetTy();

    /**
     * Returns the value of the '<em><b>Tv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Boiler time constant (<i>Tv</i>) (&gt;= 0).  Typical value = 60.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #setTv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #getTv()
     * @generated
     */
    void setTv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTv()
     * @see #getTv()
     * @see #setTv(Double)
     * @generated
     */
    void unsetTv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTv <em>Tv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tv</em>' attribute is set.
     * @see #unsetTv()
     * @see #getTv()
     * @see #setTv(Double)
     * @generated
     */
    boolean isSetTv();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves rate closing time (<i>Tc</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTc <em>Tc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Control valves rate opening time (<i>Ta</i>) (&gt;= 0).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTa <em>Ta</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Srsmp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves characteristic discontinuity point (<i>Srsmp</i>).  Typical value = 0,43.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Srsmp</em>' attribute.
     * @see #isSetSrsmp()
     * @see #unsetSrsmp()
     * @see #setSrsmp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Srsmp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.srsmp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSrsmp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrsmp <em>Srsmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Srsmp</em>' attribute.
     * @see #isSetSrsmp()
     * @see #unsetSrsmp()
     * @see #getSrsmp()
     * @generated
     */
    void setSrsmp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrsmp <em>Srsmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrsmp()
     * @see #getSrsmp()
     * @see #setSrsmp(Double)
     * @generated
     */
    void unsetSrsmp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrsmp <em>Srsmp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Srsmp</em>' attribute is set.
     * @see #unsetSrsmp()
     * @see #getSrsmp()
     * @see #setSrsmp(Double)
     * @generated
     */
    boolean isSetSrsmp();

    /**
     * Returns the value of the '<em><b>Kmp1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First gain coefficient of  intercept valves characteristic (<i>Kmp1</i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kmp1</em>' attribute.
     * @see #isSetKmp1()
     * @see #unsetKmp1()
     * @see #setKmp1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kmp1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kmp1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKmp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp1 <em>Kmp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kmp1</em>' attribute.
     * @see #isSetKmp1()
     * @see #unsetKmp1()
     * @see #getKmp1()
     * @generated
     */
    void setKmp1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp1 <em>Kmp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKmp1()
     * @see #getKmp1()
     * @see #setKmp1(Double)
     * @generated
     */
    void unsetKmp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp1 <em>Kmp1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kmp1</em>' attribute is set.
     * @see #unsetKmp1()
     * @see #getKmp1()
     * @see #setKmp1(Double)
     * @generated
     */
    boolean isSetKmp1();

    /**
     * Returns the value of the '<em><b>Kmp2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second gain coefficient of intercept valves characteristic (<i>Kmp2</i>).  Typical value = 3,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kmp2</em>' attribute.
     * @see #isSetKmp2()
     * @see #unsetKmp2()
     * @see #setKmp2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kmp2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kmp2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKmp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp2 <em>Kmp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kmp2</em>' attribute.
     * @see #isSetKmp2()
     * @see #unsetKmp2()
     * @see #getKmp2()
     * @generated
     */
    void setKmp2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp2 <em>Kmp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKmp2()
     * @see #getKmp2()
     * @see #setKmp2(Double)
     * @generated
     */
    void unsetKmp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKmp2 <em>Kmp2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kmp2</em>' attribute is set.
     * @see #unsetKmp2()
     * @see #getKmp2()
     * @see #setKmp2(Double)
     * @generated
     */
    boolean isSetKmp2();

    /**
     * Returns the value of the '<em><b>Yhpmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum control valve position (<i>Yhpmn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yhpmn</em>' attribute.
     * @see #isSetYhpmn()
     * @see #unsetYhpmn()
     * @see #setYhpmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Yhpmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.yhpmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYhpmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmn <em>Yhpmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yhpmn</em>' attribute.
     * @see #isSetYhpmn()
     * @see #unsetYhpmn()
     * @see #getYhpmn()
     * @generated
     */
    void setYhpmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmn <em>Yhpmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYhpmn()
     * @see #getYhpmn()
     * @see #setYhpmn(Double)
     * @generated
     */
    void unsetYhpmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmn <em>Yhpmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Yhpmn</em>' attribute is set.
     * @see #unsetYhpmn()
     * @see #getYhpmn()
     * @see #setYhpmn(Double)
     * @generated
     */
    boolean isSetYhpmn();

    /**
     * Returns the value of the '<em><b>Yhpmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum control valve position (<i>Yhpmx</i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yhpmx</em>' attribute.
     * @see #isSetYhpmx()
     * @see #unsetYhpmx()
     * @see #setYhpmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Yhpmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.yhpmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYhpmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmx <em>Yhpmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yhpmx</em>' attribute.
     * @see #isSetYhpmx()
     * @see #unsetYhpmx()
     * @see #getYhpmx()
     * @generated
     */
    void setYhpmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmx <em>Yhpmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYhpmx()
     * @see #getYhpmx()
     * @see #setYhpmx(Double)
     * @generated
     */
    void unsetYhpmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getYhpmx <em>Yhpmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Yhpmx</em>' attribute is set.
     * @see #unsetYhpmx()
     * @see #getYhpmx()
     * @see #setYhpmx(Double)
     * @generated
     */
    boolean isSetYhpmx();

    /**
     * Returns the value of the '<em><b>Srmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve opening (<i>Srmn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Srmn</em>' attribute.
     * @see #isSetSrmn()
     * @see #unsetSrmn()
     * @see #setSrmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Srmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.srmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmn <em>Srmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Srmn</em>' attribute.
     * @see #isSetSrmn()
     * @see #unsetSrmn()
     * @see #getSrmn()
     * @generated
     */
    void setSrmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmn <em>Srmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrmn()
     * @see #getSrmn()
     * @see #setSrmn(Double)
     * @generated
     */
    void unsetSrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmn <em>Srmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Srmn</em>' attribute is set.
     * @see #unsetSrmn()
     * @see #getSrmn()
     * @see #setSrmn(Double)
     * @generated
     */
    boolean isSetSrmn();

    /**
     * Returns the value of the '<em><b>Srmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening (<i>Srmx</i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Srmx</em>' attribute.
     * @see #isSetSrmx()
     * @see #unsetSrmx()
     * @see #setSrmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Srmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.srmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmx <em>Srmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Srmx</em>' attribute.
     * @see #isSetSrmx()
     * @see #unsetSrmx()
     * @see #getSrmx()
     * @generated
     */
    void setSrmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmx <em>Srmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSrmx()
     * @see #getSrmx()
     * @see #setSrmx(Double)
     * @generated
     */
    void unsetSrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSrmx <em>Srmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Srmx</em>' attribute is set.
     * @see #unsetSrmx()
     * @see #getSrmx()
     * @see #setSrmx(Double)
     * @generated
     */
    boolean isSetSrmx();

    /**
     * Returns the value of the '<em><b>Crmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value of regulator set-point (<i>Crmx</i>).  Typical value = 1,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Crmx</em>' attribute.
     * @see #isSetCrmx()
     * @see #unsetCrmx()
     * @see #setCrmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Crmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.crmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCrmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmx <em>Crmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crmx</em>' attribute.
     * @see #isSetCrmx()
     * @see #unsetCrmx()
     * @see #getCrmx()
     * @generated
     */
    void setCrmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmx <em>Crmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrmx()
     * @see #getCrmx()
     * @see #setCrmx(Double)
     * @generated
     */
    void unsetCrmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmx <em>Crmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crmx</em>' attribute is set.
     * @see #unsetCrmx()
     * @see #getCrmx()
     * @see #setCrmx(Double)
     * @generated
     */
    boolean isSetCrmx();

    /**
     * Returns the value of the '<em><b>Crmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value of regulator set-point (<i>Crmn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Crmn</em>' attribute.
     * @see #isSetCrmn()
     * @see #unsetCrmn()
     * @see #setCrmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Crmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.crmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCrmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmn <em>Crmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crmn</em>' attribute.
     * @see #isSetCrmn()
     * @see #unsetCrmn()
     * @see #getCrmn()
     * @generated
     */
    void setCrmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmn <em>Crmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrmn()
     * @see #getCrmn()
     * @see #setCrmn(Double)
     * @generated
     */
    void unsetCrmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getCrmn <em>Crmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crmn</em>' attribute is set.
     * @see #unsetCrmn()
     * @see #getCrmn()
     * @see #setCrmn(Double)
     * @generated
     */
    boolean isSetCrmn();

    /**
     * Returns the value of the '<em><b>Pr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second value of pressure set point static characteristic, corresponding to <i>Ps0</i> = 1,0 PU (<i>Pr2</i>).  Typical value = 0,75.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pr2</em>' attribute.
     * @see #isSetPr2()
     * @see #unsetPr2()
     * @see #setPr2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Pr2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.pr2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr2 <em>Pr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pr2</em>' attribute.
     * @see #isSetPr2()
     * @see #unsetPr2()
     * @see #getPr2()
     * @generated
     */
    void setPr2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr2 <em>Pr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPr2()
     * @see #getPr2()
     * @see #setPr2(Double)
     * @generated
     */
    void unsetPr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr2 <em>Pr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pr2</em>' attribute is set.
     * @see #unsetPr2()
     * @see #getPr2()
     * @see #setPr2(Double)
     * @generated
     */
    boolean isSetPr2();

    /**
     * Returns the value of the '<em><b>Pr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First value of pressure set point static characteristic (<i>Pr1</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pr1</em>' attribute.
     * @see #isSetPr1()
     * @see #unsetPr1()
     * @see #setPr1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Pr1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.pr1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr1 <em>Pr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pr1</em>' attribute.
     * @see #isSetPr1()
     * @see #unsetPr1()
     * @see #getPr1()
     * @generated
     */
    void setPr1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr1 <em>Pr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPr1()
     * @see #getPr1()
     * @see #setPr1(Double)
     * @generated
     */
    void unsetPr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getPr1 <em>Pr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pr1</em>' attribute is set.
     * @see #unsetPr1()
     * @see #getPr1()
     * @see #setPr1(Double)
     * @generated
     */
    boolean isSetPr1();

    /**
     * Returns the value of the '<em><b>Rvgmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value of integral regulator (<i>Rvgmn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rvgmn</em>' attribute.
     * @see #isSetRvgmn()
     * @see #unsetRvgmn()
     * @see #setRvgmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Rvgmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.rvgmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRvgmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmn <em>Rvgmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rvgmn</em>' attribute.
     * @see #isSetRvgmn()
     * @see #unsetRvgmn()
     * @see #getRvgmn()
     * @generated
     */
    void setRvgmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmn <em>Rvgmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRvgmn()
     * @see #getRvgmn()
     * @see #setRvgmn(Double)
     * @generated
     */
    void unsetRvgmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmn <em>Rvgmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rvgmn</em>' attribute is set.
     * @see #unsetRvgmn()
     * @see #getRvgmn()
     * @see #setRvgmn(Double)
     * @generated
     */
    boolean isSetRvgmn();

    /**
     * Returns the value of the '<em><b>Rvgmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value of integral regulator (<i>Rvgmx</i>).  Typical value = 1,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rvgmx</em>' attribute.
     * @see #isSetRvgmx()
     * @see #unsetRvgmx()
     * @see #setRvgmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Rvgmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.rvgmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRvgmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmx <em>Rvgmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rvgmx</em>' attribute.
     * @see #isSetRvgmx()
     * @see #unsetRvgmx()
     * @see #getRvgmx()
     * @generated
     */
    void setRvgmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmx <em>Rvgmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRvgmx()
     * @see #getRvgmx()
     * @see #setRvgmx(Double)
     * @generated
     */
    void unsetRvgmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRvgmx <em>Rvgmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rvgmx</em>' attribute is set.
     * @see #unsetRvgmx()
     * @see #getRvgmx()
     * @see #setRvgmx(Double)
     * @generated
     */
    boolean isSetRvgmx();

    /**
     * Returns the value of the '<em><b>Rsmimx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value of integral regulator (<i>Rsmimx</i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rsmimx</em>' attribute.
     * @see #isSetRsmimx()
     * @see #unsetRsmimx()
     * @see #setRsmimx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Rsmimx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.rsmimx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRsmimx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimx <em>Rsmimx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rsmimx</em>' attribute.
     * @see #isSetRsmimx()
     * @see #unsetRsmimx()
     * @see #getRsmimx()
     * @generated
     */
    void setRsmimx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimx <em>Rsmimx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRsmimx()
     * @see #getRsmimx()
     * @see #setRsmimx(Double)
     * @generated
     */
    void unsetRsmimx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimx <em>Rsmimx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rsmimx</em>' attribute is set.
     * @see #unsetRsmimx()
     * @see #getRsmimx()
     * @see #setRsmimx(Double)
     * @generated
     */
    boolean isSetRsmimx();

    /**
     * Returns the value of the '<em><b>Rsmimn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value of integral regulator (<i>Rsmimn</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rsmimn</em>' attribute.
     * @see #isSetRsmimn()
     * @see #unsetRsmimn()
     * @see #setRsmimn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Rsmimn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.rsmimn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRsmimn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimn <em>Rsmimn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rsmimn</em>' attribute.
     * @see #isSetRsmimn()
     * @see #unsetRsmimn()
     * @see #getRsmimn()
     * @generated
     */
    void setRsmimn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimn <em>Rsmimn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRsmimn()
     * @see #getRsmimn()
     * @see #setRsmimn(Double)
     * @generated
     */
    void unsetRsmimn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getRsmimn <em>Rsmimn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rsmimn</em>' attribute is set.
     * @see #unsetRsmimn()
     * @see #getRsmimn()
     * @see #setRsmimn(Double)
     * @generated
     */
    boolean isSetRsmimn();

    /**
     * Returns the value of the '<em><b>Mxef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Upper limit for frequency correction (<i>MX</i><i><sub>EF</sub></i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #setMxef(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Mxef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.mxef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMxef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #getMxef()
     * @generated
     */
    void setMxef( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMxef()
     * @see #getMxef()
     * @see #setMxef(Double)
     * @generated
     */
    void unsetMxef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMxef <em>Mxef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mxef</em>' attribute is set.
     * @see #unsetMxef()
     * @see #getMxef()
     * @see #setMxef(Double)
     * @generated
     */
    boolean isSetMxef();

    /**
     * Returns the value of the '<em><b>Svmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum regulator gate closing velocity (<i>Svmn</i>).  Typical value = -0,0333.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Svmn</em>' attribute.
     * @see #isSetSvmn()
     * @see #unsetSvmn()
     * @see #setSvmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Svmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.svmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSvmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmn <em>Svmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Svmn</em>' attribute.
     * @see #isSetSvmn()
     * @see #unsetSvmn()
     * @see #getSvmn()
     * @generated
     */
    void setSvmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmn <em>Svmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvmn()
     * @see #getSvmn()
     * @see #setSvmn(Double)
     * @generated
     */
    void unsetSvmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmn <em>Svmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Svmn</em>' attribute is set.
     * @see #unsetSvmn()
     * @see #getSvmn()
     * @see #setSvmn(Double)
     * @generated
     */
    boolean isSetSvmn();

    /**
     * Returns the value of the '<em><b>Svmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum regulator gate opening velocity (<i>Svmx</i>).  Typical value = 0,0333.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Svmx</em>' attribute.
     * @see #isSetSvmx()
     * @see #unsetSvmx()
     * @see #setSvmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Svmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.svmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSvmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmx <em>Svmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Svmx</em>' attribute.
     * @see #isSetSvmx()
     * @see #unsetSvmx()
     * @see #getSvmx()
     * @generated
     */
    void setSvmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmx <em>Svmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvmx()
     * @see #getSvmx()
     * @see #setSvmx(Double)
     * @generated
     */
    void unsetSvmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getSvmx <em>Svmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Svmx</em>' attribute is set.
     * @see #unsetSvmx()
     * @see #getSvmx()
     * @see #setSvmx(Double)
     * @generated
     */
    boolean isSetSvmx();

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coefficient of linearized equations of turbine (Stodola formulation) (<i>Y</i>).  Typical value = 0,13.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #isSetY()
     * @see #unsetY()
     * @see #setY(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Y()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.y' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getY();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #isSetY()
     * @see #unsetY()
     * @see #getY()
     * @generated
     */
    void setY( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY()
     * @see #getY()
     * @see #setY(Double)
     * @generated
     */
    void unsetY();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getY <em>Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y</em>' attribute is set.
     * @see #unsetY()
     * @see #getY()
     * @see #setY(Double)
     * @generated
     */
    boolean isSetY();

    /**
     * Returns the value of the '<em><b>Kic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain of pressure regulator (<i>Kic</i>).  Typical value = 0,0033.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #setKic(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kic()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kic' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #getKic()
     * @generated
     */
    void setKic( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKic()
     * @see #getKic()
     * @see #setKic(Double)
     * @generated
     */
    void unsetKic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKic <em>Kic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kic</em>' attribute is set.
     * @see #unsetKic()
     * @see #getKic()
     * @see #setKic(Double)
     * @generated
     */
    boolean isSetKic();

    /**
     * Returns the value of the '<em><b>Kit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain of electro-hydraulic regulator (<i>Kit</i>).  Typical value = 0,04.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kit</em>' attribute.
     * @see #isSetKit()
     * @see #unsetKit()
     * @see #setKit(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kit()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKit <em>Kit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kit</em>' attribute.
     * @see #isSetKit()
     * @see #unsetKit()
     * @see #getKit()
     * @generated
     */
    void setKit( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKit <em>Kit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKit()
     * @see #getKit()
     * @see #setKit(Double)
     * @generated
     */
    void unsetKit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKit <em>Kit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kit</em>' attribute is set.
     * @see #unsetKit()
     * @see #getKit()
     * @see #setKit(Double)
     * @generated
     */
    boolean isSetKit();

    /**
     * Returns the value of the '<em><b>Kip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain of pressure feedback regulator (<i>Kip</i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #setKip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #getKip()
     * @generated
     */
    void setKip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKip()
     * @see #getKip()
     * @see #setKip(Double)
     * @generated
     */
    void unsetKip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKip <em>Kip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kip</em>' attribute is set.
     * @see #unsetKip()
     * @see #getKip()
     * @see #setKip(Double)
     * @generated
     */
    boolean isSetKip();

    /**
     * Returns the value of the '<em><b>Khp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction  of total turbine output generated by HP part (<i>Khp</i>).  Typical value = 0,35.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Khp</em>' attribute.
     * @see #isSetKhp()
     * @see #unsetKhp()
     * @see #setKhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Khp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.khp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKhp <em>Khp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKhp <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKhp()
     * @see #getKhp()
     * @see #setKhp(Double)
     * @generated
     */
    void unsetKhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKhp <em>Khp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of steam chest (<i>Tf2</i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #setTf2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #getTf2()
     * @generated
     */
    void setTf2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    void unsetTf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf2 <em>Tf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf2</em>' attribute is set.
     * @see #unsetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    boolean isSetTf2();

    /**
     * Returns the value of the '<em><b>Ksh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure loss due to flow friction in the boiler tubes (<i>Ksh</i>).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ksh</em>' attribute.
     * @see #isSetKsh()
     * @see #unsetKsh()
     * @see #setKsh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Ksh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.ksh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKsh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKsh <em>Ksh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ksh</em>' attribute.
     * @see #isSetKsh()
     * @see #unsetKsh()
     * @see #getKsh()
     * @generated
     */
    void setKsh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKsh <em>Ksh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKsh()
     * @see #getKsh()
     * @see #setKsh(Double)
     * @generated
     */
    void unsetKsh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKsh <em>Ksh</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ksh</em>' attribute is set.
     * @see #unsetKsh()
     * @see #getKsh()
     * @see #setKsh(Double)
     * @generated
     */
    boolean isSetKsh();

    /**
     * Returns the value of the '<em><b>Tf1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of fuel regulation (<i>Tf1</i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf1</em>' attribute.
     * @see #isSetTf1()
     * @see #unsetTf1()
     * @see #setTf1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tf1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tf1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf1 <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf1</em>' attribute.
     * @see #isSetTf1()
     * @see #unsetTf1()
     * @see #getTf1()
     * @generated
     */
    void setTf1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf1 <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf1()
     * @see #getTf1()
     * @see #setTf1(Double)
     * @generated
     */
    void unsetTf1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTf1 <em>Tf1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf1</em>' attribute is set.
     * @see #unsetTf1()
     * @see #getTf1()
     * @see #setTf1(Double)
     * @generated
     */
    boolean isSetTf1();

    /**
     * Returns the value of the '<em><b>Krc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum variation of fuel flow (<i>Krc</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Krc</em>' attribute.
     * @see #isSetKrc()
     * @see #unsetKrc()
     * @see #setKrc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Krc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.krc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKrc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKrc <em>Krc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Krc</em>' attribute.
     * @see #isSetKrc()
     * @see #unsetKrc()
     * @see #getKrc()
     * @generated
     */
    void setKrc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKrc <em>Krc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKrc()
     * @see #getKrc()
     * @see #setKrc(Double)
     * @generated
     */
    void unsetKrc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKrc <em>Krc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Krc</em>' attribute is set.
     * @see #unsetKrc()
     * @see #getKrc()
     * @see #setKrc(Double)
     * @generated
     */
    boolean isSetKrc();

    /**
     * Returns the value of the '<em><b>Tcm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves rate closing time (<i>Tcm</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #setTcm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tcm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tcm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTcm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #getTcm()
     * @generated
     */
    void setTcm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTcm()
     * @see #getTcm()
     * @see #setTcm(Double)
     * @generated
     */
    void unsetTcm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTcm <em>Tcm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcm</em>' attribute is set.
     * @see #unsetTcm()
     * @see #getTcm()
     * @see #setTcm(Double)
     * @generated
     */
    boolean isSetTcm();

    /**
     * Returns the value of the '<em><b>Tdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative time constant of pressure regulator (<i>Tdc</i>) (&gt;= 0).  Typical value = 90.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdc</em>' attribute.
     * @see #isSetTdc()
     * @see #unsetTdc()
     * @see #setTdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTdc <em>Tdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdc</em>' attribute.
     * @see #isSetTdc()
     * @see #unsetTdc()
     * @see #getTdc()
     * @generated
     */
    void setTdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTdc <em>Tdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdc()
     * @see #getTdc()
     * @see #setTdc(Double)
     * @generated
     */
    void unsetTdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTdc <em>Tdc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdc</em>' attribute is set.
     * @see #unsetTdc()
     * @see #getTdc()
     * @see #setTdc(Double)
     * @generated
     */
    boolean isSetTdc();

    /**
     * Returns the value of the '<em><b>Tam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intercept valves rate opening time (<i>Tam</i>) (&gt;= 0).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tam</em>' attribute.
     * @see #isSetTam()
     * @see #unsetTam()
     * @see #setTam(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Tam()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.tam' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTam();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTam <em>Tam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tam</em>' attribute.
     * @see #isSetTam()
     * @see #unsetTam()
     * @see #getTam()
     * @generated
     */
    void setTam( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTam <em>Tam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTam()
     * @see #getTam()
     * @see #setTam(Double)
     * @generated
     */
    void unsetTam();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getTam <em>Tam</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tam</em>' attribute is set.
     * @see #unsetTam()
     * @see #getTam()
     * @see #setTam(Double)
     * @generated
     */
    boolean isSetTam();

    /**
     * Returns the value of the '<em><b>Kpc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain of pressure regulator (<i>Kpc</i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #setKpc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kpc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kpc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #getKpc()
     * @generated
     */
    void setKpc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpc()
     * @see #getKpc()
     * @see #setKpc(Double)
     * @generated
     */
    void unsetKpc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpc <em>Kpc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpc</em>' attribute is set.
     * @see #unsetKpc()
     * @see #getKpc()
     * @see #setKpc(Double)
     * @generated
     */
    boolean isSetKpc();

    /**
     * Returns the value of the '<em><b>Kpt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain of electro-hydraulic regulator (<i>Kpt</i>).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpt</em>' attribute.
     * @see #isSetKpt()
     * @see #unsetKpt()
     * @see #setKpt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kpt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kpt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpt <em>Kpt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpt</em>' attribute.
     * @see #isSetKpt()
     * @see #unsetKpt()
     * @see #getKpt()
     * @generated
     */
    void setKpt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpt <em>Kpt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpt()
     * @see #getKpt()
     * @see #setKpt(Double)
     * @generated
     */
    void unsetKpt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpt <em>Kpt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpt</em>' attribute is set.
     * @see #unsetKpt()
     * @see #getKpt()
     * @see #setKpt(Double)
     * @generated
     */
    boolean isSetKpt();

    /**
     * Returns the value of the '<em><b>Mnef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lower limit for frequency correction (<i>MN</i><i><sub>EF</sub></i>).  Typical value = -0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #setMnef(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Mnef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.mnef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMnef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #getMnef()
     * @generated
     */
    void setMnef( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMnef()
     * @see #getMnef()
     * @see #setMnef(Double)
     * @generated
     */
    void unsetMnef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getMnef <em>Mnef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mnef</em>' attribute is set.
     * @see #unsetMnef()
     * @see #getMnef()
     * @see #setMnef(Double)
     * @generated
     */
    boolean isSetMnef();

    /**
     * Returns the value of the '<em><b>Kpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain of pressure feedback regulator (<i>Kpp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #setKpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #getKpp()
     * @generated
     */
    void setKpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpp()
     * @see #getKpp()
     * @see #setKpp(Double)
     * @generated
     */
    void unsetKpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKpp <em>Kpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpp</em>' attribute is set.
     * @see #unsetKpp()
     * @see #getKpp()
     * @see #setKpp(Double)
     * @generated
     */
    boolean isSetKpp();

    /**
     * Returns the value of the '<em><b>Kf3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency control (reciprocal of droop) (<i>Kf3</i>).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf3</em>' attribute.
     * @see #isSetKf3()
     * @see #unsetKf3()
     * @see #setKf3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kf3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kf3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf3 <em>Kf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf3</em>' attribute.
     * @see #isSetKf3()
     * @see #unsetKf3()
     * @see #getKf3()
     * @generated
     */
    void setKf3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf3 <em>Kf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf3()
     * @see #getKf3()
     * @see #setKf3(Double)
     * @generated
     */
    void unsetKf3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf3 <em>Kf3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf3</em>' attribute is set.
     * @see #unsetKf3()
     * @see #getKf3()
     * @see #setKf3(Double)
     * @generated
     */
    boolean isSetKf3();

    /**
     * Returns the value of the '<em><b>Kf1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency bias (reciprocal of droop) (<i>Kf1</i>).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf1</em>' attribute.
     * @see #isSetKf1()
     * @see #unsetKf1()
     * @see #setKf1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kf1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kf1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf1 <em>Kf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf1</em>' attribute.
     * @see #isSetKf1()
     * @see #unsetKf1()
     * @see #getKf1()
     * @generated
     */
    void setKf1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf1 <em>Kf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf1()
     * @see #getKf1()
     * @see #setKf1(Double)
     * @generated
     */
    void unsetKf1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKf1 <em>Kf1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf1</em>' attribute is set.
     * @see #unsetKf1()
     * @see #getKf1()
     * @see #setKf1(Double)
     * @generated
     */
    boolean isSetKf1();

    /**
     * Returns the value of the '<em><b>Kdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative gain of pressure regulator (<i>Kdc</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kdc</em>' attribute.
     * @see #isSetKdc()
     * @see #unsetKdc()
     * @see #setKdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamFV4_Kdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamFV4.kdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKdc <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdc</em>' attribute.
     * @see #isSetKdc()
     * @see #unsetKdc()
     * @see #getKdc()
     * @generated
     */
    void setKdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKdc <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdc()
     * @see #getKdc()
     * @see #setKdc(Double)
     * @generated
     */
    void unsetKdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV4#getKdc <em>Kdc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdc</em>' attribute is set.
     * @see #unsetKdc()
     * @see #getKdc()
     * @see #setKdc(Double)
     * @generated
     */
    boolean isSetKdc();

} // GovSteamFV4
