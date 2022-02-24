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
 * A representation of the model object '<em><b>Gov Hydro DD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Double derivative hydro governor and turbine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getInputSignal <em>Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getAturb <em>Aturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTturb <em>Tturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv6 <em>Gv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelop <em>Velop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelcl <em>Velcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv6 <em>Pgv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getBturb <em>Bturb</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD()
 * @model
 * @generated
 */
public interface GovHydroDD extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Steady state droop (<i>R</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base for power values (<i>MWbase</i>) (&gt;0).  Unit = MW.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate servo time constant (<i>Tp</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,35.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTp <em>Tp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTp <em>Tp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Td</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input filter time constant (<i>Td</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #setTd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Td()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.td' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTd <em>Td</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    void unsetTd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTd <em>Td</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Washout time constant (<i>Tf</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTf <em>Tf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTf <em>Tf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power feedback time constant (<i>Tt</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tt</em>' attribute.
     * @see #isSetTt()
     * @see #unsetTt()
     * @see #setTt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Tt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.tt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTt <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tt</em>' attribute.
     * @see #isSetTt()
     * @see #unsetTt()
     * @see #getTt()
     * @generated
     */
    void setTt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTt <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTt()
     * @see #getTt()
     * @see #setTt(Double)
     * @generated
     */
    void unsetTt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTt <em>Tt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tt</em>' attribute is set.
     * @see #unsetTt()
     * @see #getTt()
     * @see #setTt(Double)
     * @generated
     */
    boolean isSetTt();

    /**
     * Returns the value of the '<em><b>Input Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input signal switch (<i>Flag</i>).
     * true = <i>Pe</i> input is used
     * false = feedback is received from <i>CV</i>.
     * <i>Flag</i> is normally dependent on <i>Tt</i>.  If <i>Tt</i> is zero, <i>Flag</i> is set to false. If <i>Tt</i> is not zero, <i>Flag</i> is set to true.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Signal</em>' attribute.
     * @see #isSetInputSignal()
     * @see #unsetInputSignal()
     * @see #setInputSignal(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_InputSignal()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.inputSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getInputSignal <em>Input Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Signal</em>' attribute.
     * @see #isSetInputSignal()
     * @see #unsetInputSignal()
     * @see #getInputSignal()
     * @generated
     */
    void setInputSignal( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getInputSignal <em>Input Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputSignal()
     * @see #getInputSignal()
     * @see #setInputSignal(Boolean)
     * @generated
     */
    void unsetInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getInputSignal <em>Input Signal</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Signal</em>' attribute is set.
     * @see #unsetInputSignal()
     * @see #getInputSignal()
     * @see #setInputSignal(Boolean)
     * @generated
     */
    boolean isSetInputSignal();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Double derivative gain (<i>K2</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK2 <em>K2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK2 <em>K2</em>}' attribute is set.
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
     * Single derivative gain (<i>K1</i>).  Typical value = 3,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK1 <em>K1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getK1 <em>K1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate servo gain (<i>Kg</i>).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kg</em>' attribute.
     * @see #isSetKg()
     * @see #unsetKg()
     * @see #setKg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Kg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.kg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKg <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kg</em>' attribute.
     * @see #isSetKg()
     * @see #unsetKg()
     * @see #getKg()
     * @generated
     */
    void setKg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKg <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKg()
     * @see #getKg()
     * @see #setKg(Double)
     * @generated
     */
    void unsetKg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKg <em>Kg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kg</em>' attribute is set.
     * @see #unsetKg()
     * @see #getKg()
     * @see #setKg(Double)
     * @generated
     */
    boolean isSetKg();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain (<i>Ki</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #getKi()
     * @generated
     */
    void setKi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getKi <em>Ki</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki</em>' attribute is set.
     * @see #unsetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    boolean isSetKi();

    /**
     * Returns the value of the '<em><b>Db2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unintentional dead-band (<i>db2</i>).  Unit = MW.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db2</em>' attribute.
     * @see #isSetDb2()
     * @see #unsetDb2()
     * @see #setDb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Db2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.db2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb2 <em>Db2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    void unsetDb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb2 <em>Db2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Db1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intentional dead-band width (<i>db1</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db1</em>' attribute.
     * @see #isSetDb1()
     * @see #unsetDb1()
     * @see #setDb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Db1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.db1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb1 <em>Db1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    void unsetDb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getDb1 <em>Db1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum gate opening, PU of <i>MWbase</i> (<i>Pmin</i>) (&gt; GovHydroDD.pmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmin <em>Pmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmin <em>Pmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Eps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intentional db hysteresis (<i>eps</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eps</em>' attribute.
     * @see #isSetEps()
     * @see #unsetEps()
     * @see #setEps(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Eps()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.eps' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getEps <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eps</em>' attribute.
     * @see #isSetEps()
     * @see #unsetEps()
     * @see #getEps()
     * @generated
     */
    void setEps( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getEps <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEps()
     * @see #getEps()
     * @see #setEps(Double)
     * @generated
     */
    void unsetEps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getEps <em>Eps</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eps</em>' attribute is set.
     * @see #unsetEps()
     * @see #getEps()
     * @see #setEps(Double)
     * @generated
     */
    boolean isSetEps();

    /**
     * Returns the value of the '<em><b>Pmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening, PU of <i>MWbase</i> (<i>Pmax</i>) (&gt; GovHydroDD.pmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #setPmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmax <em>Pmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    void unsetPmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPmax <em>Pmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Aturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine numerator multiplier (<i>Aturb</i>) (see parameter detail 3).  Typical value = -1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Aturb</em>' attribute.
     * @see #isSetAturb()
     * @see #unsetAturb()
     * @see #setAturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Aturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.aturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getAturb <em>Aturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aturb</em>' attribute.
     * @see #isSetAturb()
     * @see #unsetAturb()
     * @see #getAturb()
     * @generated
     */
    void setAturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getAturb <em>Aturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAturb()
     * @see #getAturb()
     * @see #setAturb(Double)
     * @generated
     */
    void unsetAturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getAturb <em>Aturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aturb</em>' attribute is set.
     * @see #unsetAturb()
     * @see #getAturb()
     * @see #setAturb(Double)
     * @generated
     */
    boolean isSetAturb();

    /**
     * Returns the value of the '<em><b>Tturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine time constant (<i>Tturb</i>)  (&gt;= 0).  See parameter detail 3.  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tturb</em>' attribute.
     * @see #isSetTturb()
     * @see #unsetTturb()
     * @see #setTturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Tturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.tturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTturb <em>Tturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tturb</em>' attribute.
     * @see #isSetTturb()
     * @see #unsetTturb()
     * @see #getTturb()
     * @generated
     */
    void setTturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTturb <em>Tturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTturb()
     * @see #getTturb()
     * @see #setTturb(Double)
     * @generated
     */
    void unsetTturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getTturb <em>Tturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tturb</em>' attribute is set.
     * @see #unsetTturb()
     * @see #getTturb()
     * @see #setTturb(Double)
     * @generated
     */
    boolean isSetTturb();

    /**
     * Returns the value of the '<em><b>Gmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum gate opening (<i>Gmin</i>) (&lt; GovHydroDD.gmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #setGmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #getGmin()
     * @generated
     */
    void setGmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmin()
     * @see #getGmin()
     * @see #setGmin(Double)
     * @generated
     */
    void unsetGmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmin <em>Gmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmin</em>' attribute is set.
     * @see #unsetGmin()
     * @see #getGmin()
     * @see #setGmin(Double)
     * @generated
     */
    boolean isSetGmin();

    /**
     * Returns the value of the '<em><b>Gv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 4, PU gv (<i>Gv4</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #setGv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #getGv4()
     * @generated
     */
    void setGv4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    void unsetGv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv4 <em>Gv4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv4</em>' attribute is set.
     * @see #unsetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    boolean isSetGv4();

    /**
     * Returns the value of the '<em><b>Gv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 3, PU gv (<i>Gv3</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #setGv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #getGv3()
     * @generated
     */
    void setGv3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    void unsetGv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv3 <em>Gv3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv3</em>' attribute is set.
     * @see #unsetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    boolean isSetGv3();

    /**
     * Returns the value of the '<em><b>Gv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 6, PU gv (<i>Gv6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv6</em>' attribute.
     * @see #isSetGv6()
     * @see #unsetGv6()
     * @see #setGv6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv6 <em>Gv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv6</em>' attribute.
     * @see #isSetGv6()
     * @see #unsetGv6()
     * @see #getGv6()
     * @generated
     */
    void setGv6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv6 <em>Gv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv6()
     * @see #getGv6()
     * @see #setGv6(Double)
     * @generated
     */
    void unsetGv6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv6 <em>Gv6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv6</em>' attribute is set.
     * @see #unsetGv6()
     * @see #getGv6()
     * @see #setGv6(Double)
     * @generated
     */
    boolean isSetGv6();

    /**
     * Returns the value of the '<em><b>Gv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 5, PU gv (<i>Gv5</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #setGv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #getGv5()
     * @generated
     */
    void setGv5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    void unsetGv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv5 <em>Gv5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv5</em>' attribute is set.
     * @see #unsetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    boolean isSetGv5();

    /**
     * Returns the value of the '<em><b>Gv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 2, PU gv (<i>Gv2</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #setGv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #getGv2()
     * @generated
     */
    void setGv2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    void unsetGv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv2 <em>Gv2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv2</em>' attribute is set.
     * @see #unsetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    boolean isSetGv2();

    /**
     * Returns the value of the '<em><b>Gv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 1, PU gv (<i>Gv1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #setGv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #getGv1()
     * @generated
     */
    void setGv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    void unsetGv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGv1 <em>Gv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv1</em>' attribute is set.
     * @see #unsetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    boolean isSetGv1();

    /**
     * Returns the value of the '<em><b>Gmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening (<i>Gmax</i>) (&gt; GovHydroDD.gmin).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #setGmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Gmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.gmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #getGmax()
     * @generated
     */
    void setGmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmax()
     * @see #getGmax()
     * @see #setGmax(Double)
     * @generated
     */
    void unsetGmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getGmax <em>Gmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmax</em>' attribute is set.
     * @see #unsetGmax()
     * @see #getGmax()
     * @see #setGmax(Double)
     * @generated
     */
    boolean isSetGmax();

    /**
     * Returns the value of the '<em><b>Velop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening velocity (<i>Velop</i>).  Unit = PU / s.  Typical value = 0,09.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Velop</em>' attribute.
     * @see #isSetVelop()
     * @see #unsetVelop()
     * @see #setVelop(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Velop()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.velop' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVelop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelop <em>Velop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Velop</em>' attribute.
     * @see #isSetVelop()
     * @see #unsetVelop()
     * @see #getVelop()
     * @generated
     */
    void setVelop( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelop <em>Velop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVelop()
     * @see #getVelop()
     * @see #setVelop(Double)
     * @generated
     */
    void unsetVelop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelop <em>Velop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Velop</em>' attribute is set.
     * @see #unsetVelop()
     * @see #getVelop()
     * @see #setVelop(Double)
     * @generated
     */
    boolean isSetVelop();

    /**
     * Returns the value of the '<em><b>Velcl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate closing velocity (<i>Velcl</i>).  Unit = PU / s.  Typical value = -0,14.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Velcl</em>' attribute.
     * @see #isSetVelcl()
     * @see #unsetVelcl()
     * @see #setVelcl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Velcl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.velcl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVelcl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelcl <em>Velcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Velcl</em>' attribute.
     * @see #isSetVelcl()
     * @see #unsetVelcl()
     * @see #getVelcl()
     * @generated
     */
    void setVelcl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelcl <em>Velcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVelcl()
     * @see #getVelcl()
     * @see #setVelcl(Double)
     * @generated
     */
    void unsetVelcl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getVelcl <em>Velcl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Velcl</em>' attribute is set.
     * @see #unsetVelcl()
     * @see #getVelcl()
     * @see #setVelcl(Double)
     * @generated
     */
    boolean isSetVelcl();

    /**
     * Returns the value of the '<em><b>Pgv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 2, PU power (<i>Pgv2</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #setPgv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #getPgv2()
     * @generated
     */
    void setPgv2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    void unsetPgv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv2 <em>Pgv2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv2</em>' attribute is set.
     * @see #unsetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    boolean isSetPgv2();

    /**
     * Returns the value of the '<em><b>Pgv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 1, PU power (<i>Pgv1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #setPgv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #getPgv1()
     * @generated
     */
    void setPgv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    void unsetPgv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv1 <em>Pgv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv1</em>' attribute is set.
     * @see #unsetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    boolean isSetPgv1();

    /**
     * Returns the value of the '<em><b>Pgv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 6, PU power (<i>Pgv6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv6</em>' attribute.
     * @see #isSetPgv6()
     * @see #unsetPgv6()
     * @see #setPgv6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv6 <em>Pgv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv6</em>' attribute.
     * @see #isSetPgv6()
     * @see #unsetPgv6()
     * @see #getPgv6()
     * @generated
     */
    void setPgv6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv6 <em>Pgv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv6()
     * @see #getPgv6()
     * @see #setPgv6(Double)
     * @generated
     */
    void unsetPgv6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv6 <em>Pgv6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv6</em>' attribute is set.
     * @see #unsetPgv6()
     * @see #getPgv6()
     * @see #setPgv6(Double)
     * @generated
     */
    boolean isSetPgv6();

    /**
     * Returns the value of the '<em><b>Pgv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 5, PU power (<i>Pgv5</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv5</em>' attribute.
     * @see #isSetPgv5()
     * @see #unsetPgv5()
     * @see #setPgv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv5 <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv5</em>' attribute.
     * @see #isSetPgv5()
     * @see #unsetPgv5()
     * @see #getPgv5()
     * @generated
     */
    void setPgv5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv5 <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv5()
     * @see #getPgv5()
     * @see #setPgv5(Double)
     * @generated
     */
    void unsetPgv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv5 <em>Pgv5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv5</em>' attribute is set.
     * @see #unsetPgv5()
     * @see #getPgv5()
     * @see #setPgv5(Double)
     * @generated
     */
    boolean isSetPgv5();

    /**
     * Returns the value of the '<em><b>Pgv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 4, PU power (<i>Pgv4</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv4</em>' attribute.
     * @see #isSetPgv4()
     * @see #unsetPgv4()
     * @see #setPgv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv4 <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv4</em>' attribute.
     * @see #isSetPgv4()
     * @see #unsetPgv4()
     * @see #getPgv4()
     * @generated
     */
    void setPgv4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv4 <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv4()
     * @see #getPgv4()
     * @see #setPgv4(Double)
     * @generated
     */
    void unsetPgv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv4 <em>Pgv4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv4</em>' attribute is set.
     * @see #unsetPgv4()
     * @see #getPgv4()
     * @see #setPgv4(Double)
     * @generated
     */
    boolean isSetPgv4();

    /**
     * Returns the value of the '<em><b>Pgv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 3, PU power (<i>Pgv3</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #setPgv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Pgv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.pgv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #getPgv3()
     * @generated
     */
    void setPgv3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    void unsetPgv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getPgv3 <em>Pgv3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv3</em>' attribute is set.
     * @see #unsetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    boolean isSetPgv3();

    /**
     * Returns the value of the '<em><b>Bturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine denominator multiplier (<i>Bturb</i>) (see parameter detail 3).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bturb</em>' attribute.
     * @see #isSetBturb()
     * @see #unsetBturb()
     * @see #setBturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroDD_Bturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroDD.bturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getBturb <em>Bturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bturb</em>' attribute.
     * @see #isSetBturb()
     * @see #unsetBturb()
     * @see #getBturb()
     * @generated
     */
    void setBturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getBturb <em>Bturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBturb()
     * @see #getBturb()
     * @see #setBturb(Double)
     * @generated
     */
    void unsetBturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroDD#getBturb <em>Bturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bturb</em>' attribute is set.
     * @see #unsetBturb()
     * @see #getBturb()
     * @see #setBturb(Double)
     * @generated
     */
    boolean isSetBturb();

} // GovHydroDD
