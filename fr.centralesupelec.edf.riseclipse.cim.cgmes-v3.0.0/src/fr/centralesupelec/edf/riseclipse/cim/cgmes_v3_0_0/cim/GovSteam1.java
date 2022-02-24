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
 * A representation of the model object '<em><b>Gov Steam1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Steam turbine governor, based on the GovSteamIEEE1 (with optional deadband and nonlinear valve gain added).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getValve <em>Valve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb1 <em>Sdb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb2 <em>Sdb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK8 <em>K8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK6 <em>K6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK7 <em>K7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK5 <em>K5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUc <em>Uc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUo <em>Uo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv6 <em>Gv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv6 <em>Pgv6</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1()
 * @model
 * @generated
 */
public interface GovSteam1 extends TurbineGovernorDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Valve</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear valve characteristic.
     * true = nonlinear valve characteristic is used
     * false = nonlinear valve characteristic is not used.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Valve</em>' attribute.
     * @see #isSetValve()
     * @see #unsetValve()
     * @see #setValve(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Valve()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.valve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getValve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getValve <em>Valve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valve</em>' attribute.
     * @see #isSetValve()
     * @see #unsetValve()
     * @see #getValve()
     * @generated
     */
    void setValve( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getValve <em>Valve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValve()
     * @see #getValve()
     * @see #setValve(Boolean)
     * @generated
     */
    void unsetValve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getValve <em>Valve</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valve</em>' attribute is set.
     * @see #unsetValve()
     * @see #getValve()
     * @see #setValve(Boolean)
     * @generated
     */
    boolean isSetValve();

    /**
     * Returns the value of the '<em><b>Db2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unintentional deadband (<i>db2</i>).  Unit = MW.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db2</em>' attribute.
     * @see #isSetDb2()
     * @see #unsetDb2()
     * @see #setDb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Db2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.db2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb2 <em>Db2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    void unsetDb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb2 <em>Db2</em>}' attribute is set.
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
     * Intentional deadband width (<i>db1</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db1</em>' attribute.
     * @see #isSetDb1()
     * @see #unsetDb1()
     * @see #setDb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Db1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.db1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb1 <em>Db1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    void unsetDb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getDb1 <em>Db1</em>}' attribute is set.
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
     * Minimum valve opening (<i>Pmin</i>) (&gt;= 0 and &lt; GovSteam1.pmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmin <em>Pmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmin <em>Pmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening (<i>Pmax</i>) (&gt; GovSteam1.pmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #setPmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmax <em>Pmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    void unsetPmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPmax <em>Pmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Sdb1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intentional deadband indicator.
     * true = intentional deadband is applied
     * false = intentional deadband is not applied.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sdb1</em>' attribute.
     * @see #isSetSdb1()
     * @see #unsetSdb1()
     * @see #setSdb1(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Sdb1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.sdb1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSdb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb1 <em>Sdb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sdb1</em>' attribute.
     * @see #isSetSdb1()
     * @see #unsetSdb1()
     * @see #getSdb1()
     * @generated
     */
    void setSdb1( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb1 <em>Sdb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSdb1()
     * @see #getSdb1()
     * @see #setSdb1(Boolean)
     * @generated
     */
    void unsetSdb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb1 <em>Sdb1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sdb1</em>' attribute is set.
     * @see #unsetSdb1()
     * @see #getSdb1()
     * @see #setSdb1(Boolean)
     * @generated
     */
    boolean isSetSdb1();

    /**
     * Returns the value of the '<em><b>Sdb2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unintentional deadband location.
     * true = intentional deadband is applied before point "A"
     * false = intentional deadband is applied after point "A".
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sdb2</em>' attribute.
     * @see #isSetSdb2()
     * @see #unsetSdb2()
     * @see #setSdb2(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Sdb2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.sdb2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSdb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb2 <em>Sdb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sdb2</em>' attribute.
     * @see #isSetSdb2()
     * @see #unsetSdb2()
     * @see #getSdb2()
     * @generated
     */
    void setSdb2( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb2 <em>Sdb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSdb2()
     * @see #getSdb2()
     * @see #setSdb2(Boolean)
     * @generated
     */
    void unsetSdb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getSdb2 <em>Sdb2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sdb2</em>' attribute is set.
     * @see #unsetSdb2()
     * @see #getSdb2()
     * @see #setSdb2(Boolean)
     * @generated
     */
    boolean isSetSdb2();

    /**
     * Returns the value of the '<em><b>K8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of LP shaft power after fourth boiler pass (<i>K8</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K8</em>' attribute.
     * @see #isSetK8()
     * @see #unsetK8()
     * @see #setK8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK8 <em>K8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K8</em>' attribute.
     * @see #isSetK8()
     * @see #unsetK8()
     * @see #getK8()
     * @generated
     */
    void setK8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK8 <em>K8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK8()
     * @see #getK8()
     * @see #setK8(Double)
     * @generated
     */
    void unsetK8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK8 <em>K8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K8</em>' attribute is set.
     * @see #unsetK8()
     * @see #getK8()
     * @see #setK8(Double)
     * @generated
     */
    boolean isSetK8();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of LP shaft power after first boiler pass (<i>K2</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK2 <em>K2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK2 <em>K2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of HP shaft power after second boiler pass (<i>K3</i>).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #setK3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK3 <em>K3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    void unsetK3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK3 <em>K3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of HP shaft power after first boiler pass (<i>K1</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK1 <em>K1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK1 <em>K1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of LP shaft power after third boiler pass (<i>K6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K6</em>' attribute.
     * @see #isSetK6()
     * @see #unsetK6()
     * @see #setK6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK6 <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K6</em>' attribute.
     * @see #isSetK6()
     * @see #unsetK6()
     * @see #getK6()
     * @generated
     */
    void setK6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK6 <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK6()
     * @see #getK6()
     * @see #setK6(Double)
     * @generated
     */
    void unsetK6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK6 <em>K6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K6</em>' attribute is set.
     * @see #unsetK6()
     * @see #getK6()
     * @see #setK6(Double)
     * @generated
     */
    boolean isSetK6();

    /**
     * Returns the value of the '<em><b>K7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of HP shaft power after fourth boiler pass (<i>K7</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K7</em>' attribute.
     * @see #isSetK7()
     * @see #unsetK7()
     * @see #setK7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK7 <em>K7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K7</em>' attribute.
     * @see #isSetK7()
     * @see #unsetK7()
     * @see #getK7()
     * @generated
     */
    void setK7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK7 <em>K7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK7()
     * @see #getK7()
     * @see #setK7(Double)
     * @generated
     */
    void unsetK7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK7 <em>K7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K7</em>' attribute is set.
     * @see #unsetK7()
     * @see #getK7()
     * @see #setK7(Double)
     * @generated
     */
    boolean isSetK7();

    /**
     * Returns the value of the '<em><b>K4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of LP shaft power after second boiler pass (<i>K4</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K4</em>' attribute.
     * @see #isSetK4()
     * @see #unsetK4()
     * @see #setK4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK4 <em>K4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK4 <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK4()
     * @see #getK4()
     * @see #setK4(Double)
     * @generated
     */
    void unsetK4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK4 <em>K4</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of HP shaft power after third boiler pass (<i>K5</i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K5</em>' attribute.
     * @see #isSetK5()
     * @see #unsetK5()
     * @see #setK5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK5 <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K5</em>' attribute.
     * @see #isSetK5()
     * @see #unsetK5()
     * @see #getK5()
     * @generated
     */
    void setK5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK5 <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK5()
     * @see #getK5()
     * @see #setK5(Double)
     * @generated
     */
    void unsetK5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK5 <em>K5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K5</em>' attribute is set.
     * @see #unsetK5()
     * @see #getK5()
     * @see #setK5(Double)
     * @generated
     */
    boolean isSetK5();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor gain (reciprocal of droop) (<i>K</i>) (&gt; 0).  Typical value = 25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_K()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.k' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK <em>K</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getK <em>K</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Uc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve closing velocity (<i>Uc</i>) (&lt; 0).  Unit = PU / s.  Typical value = -10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uc</em>' attribute.
     * @see #isSetUc()
     * @see #unsetUc()
     * @see #setUc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Uc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.uc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUc <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uc</em>' attribute.
     * @see #isSetUc()
     * @see #unsetUc()
     * @see #getUc()
     * @generated
     */
    void setUc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUc <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUc()
     * @see #getUc()
     * @see #setUc(Double)
     * @generated
     */
    void unsetUc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUc <em>Uc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uc</em>' attribute is set.
     * @see #unsetUc()
     * @see #getUc()
     * @see #setUc(Double)
     * @generated
     */
    boolean isSetUc();

    /**
     * Returns the value of the '<em><b>Uo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening velocity (<i>Uo</i>) (&gt; 0).  Unit = PU / s.  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uo</em>' attribute.
     * @see #isSetUo()
     * @see #unsetUo()
     * @see #setUo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Uo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.uo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUo <em>Uo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uo</em>' attribute.
     * @see #isSetUo()
     * @see #unsetUo()
     * @see #getUo()
     * @generated
     */
    void setUo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUo <em>Uo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUo()
     * @see #getUo()
     * @see #setUo(Double)
     * @generated
     */
    void unsetUo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getUo <em>Uo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uo</em>' attribute is set.
     * @see #unsetUo()
     * @see #getUo()
     * @see #setUo(Double)
     * @generated
     */
    boolean isSetUo();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Valve positioner time constant (<i>T3) </i>(&gt; 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT3 <em>T3</em>}' attribute is set.
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
     * Inlet piping/steam bowl time constant (<i>T4</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT4 <em>T4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT4 <em>T4</em>}' attribute is set.
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
     * Governor lag time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT1 <em>T1</em>}' attribute is set.
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
     * Governor lead time constant (<i>T2</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of fourth boiler pass (<i>T7</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T7</em>' attribute.
     * @see #isSetT7()
     * @see #unsetT7()
     * @see #setT7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT7 <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T7</em>' attribute.
     * @see #isSetT7()
     * @see #unsetT7()
     * @see #getT7()
     * @generated
     */
    void setT7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT7 <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT7()
     * @see #getT7()
     * @see #setT7(Double)
     * @generated
     */
    void unsetT7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT7 <em>T7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T7</em>' attribute is set.
     * @see #unsetT7()
     * @see #getT7()
     * @see #setT7(Double)
     * @generated
     */
    boolean isSetT7();

    /**
     * Returns the value of the '<em><b>T5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of second boiler pass (<i>T5</i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #setT5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #getT5()
     * @generated
     */
    void setT5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    void unsetT5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT5 <em>T5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5</em>' attribute is set.
     * @see #unsetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    boolean isSetT5();

    /**
     * Returns the value of the '<em><b>T6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of third boiler pass (<i>T6</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T6</em>' attribute.
     * @see #isSetT6()
     * @see #unsetT6()
     * @see #setT6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_T6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.t6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT6 <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T6</em>' attribute.
     * @see #isSetT6()
     * @see #unsetT6()
     * @see #getT6()
     * @generated
     */
    void setT6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT6 <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT6()
     * @see #getT6()
     * @see #setT6(Double)
     * @generated
     */
    void unsetT6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getT6 <em>T6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T6</em>' attribute is set.
     * @see #unsetT6()
     * @see #getT6()
     * @see #setT6(Double)
     * @generated
     */
    boolean isSetT6();

    /**
     * Returns the value of the '<em><b>Gv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain valve position point 1 (<i>GV1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #setGv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv1 <em>Gv1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    void unsetGv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv1 <em>Gv1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain valve position point 5 (<i>GV5</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #setGv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv5 <em>Gv5</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    void unsetGv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv5 <em>Gv5</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain valve position point 4 (<i>GV4</i>).  Typical value = 0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #setGv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv4 <em>Gv4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    void unsetGv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv4 <em>Gv4</em>}' attribute is set.
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
     * Nonlinear gain valve position point 3 (<i>GV3</i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #setGv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv3 <em>Gv3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    void unsetGv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv3 <em>Gv3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain valve position point 2 (<i>GV2</i>).  Typical value = 0,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #setGv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv2 <em>Gv2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    void unsetGv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv2 <em>Gv2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain valve position point 6 (<i>GV6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv6</em>' attribute.
     * @see #isSetGv6()
     * @see #unsetGv6()
     * @see #setGv6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Gv6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.gv6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv6 <em>Gv6</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv6 <em>Gv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv6()
     * @see #getGv6()
     * @see #setGv6(Double)
     * @generated
     */
    void unsetGv6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getGv6 <em>Gv6</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Eps()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.eps' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getEps <em>Eps</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getEps <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEps()
     * @see #getEps()
     * @see #setEps(Double)
     * @generated
     */
    void unsetEps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getEps <em>Eps</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain power value point 1 (<i>Pgv1</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #setPgv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv1 <em>Pgv1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    void unsetPgv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv1 <em>Pgv1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain power value point 3 (<i>Pgv3</i>).  Typical value = 0,91.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #setPgv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv3 <em>Pgv3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    void unsetPgv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv3 <em>Pgv3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain power value point 2 (<i>Pgv2</i>).  Typical value = 0,75.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #setPgv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv2 <em>Pgv2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    void unsetPgv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv2 <em>Pgv2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain power value point 5 (<i>Pgv5</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv5</em>' attribute.
     * @see #isSetPgv5()
     * @see #unsetPgv5()
     * @see #setPgv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv5 <em>Pgv5</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv5 <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv5()
     * @see #getPgv5()
     * @see #setPgv5(Double)
     * @generated
     */
    void unsetPgv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv5 <em>Pgv5</em>}' attribute is set.
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
     * Nonlinear gain power value point 4 (<i>Pgv4</i>).  Typical value = 0,98.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv4</em>' attribute.
     * @see #isSetPgv4()
     * @see #unsetPgv4()
     * @see #setPgv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv4 <em>Pgv4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv4 <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv4()
     * @see #getPgv4()
     * @see #setPgv4(Double)
     * @generated
     */
    void unsetPgv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv4 <em>Pgv4</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain power value point 6 (<i>Pgv6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv6</em>' attribute.
     * @see #isSetPgv6()
     * @see #unsetPgv6()
     * @see #setPgv6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteam1_Pgv6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteam1.pgv6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv6 <em>Pgv6</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv6 <em>Pgv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv6()
     * @see #getPgv6()
     * @see #setPgv6(Double)
     * @generated
     */
    void unsetPgv6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam1#getPgv6 <em>Pgv6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv6</em>' attribute is set.
     * @see #unsetPgv6()
     * @see #getPgv6()
     * @see #setPgv6(Double)
     * @generated
     */
    boolean isSetPgv6();

} // GovSteam1
