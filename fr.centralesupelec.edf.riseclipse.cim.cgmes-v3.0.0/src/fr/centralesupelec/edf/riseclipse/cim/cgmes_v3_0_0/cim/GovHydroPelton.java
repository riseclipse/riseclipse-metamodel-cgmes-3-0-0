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
 * A representation of the model object '<em><b>Gov Hydro Pelton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed hydro unit - Pelton model.  This model can be used to represent the dynamic related to water tunnel and surge chamber.
 * The DetailedHydroModelHydraulicSystem diagram, located under the GovHydroFrancis class, provides a schematic of the hydraulic system of detailed hydro unit models, such as Francis and Pelton.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwng <em>Twng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwnc <em>Twnc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVav <em>Vav</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVcv <em>Vcv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getZsfc <em>Zsfc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getWaterTunnelSurgeChamberSimulation <em>Water Tunnel Surge Chamber Simulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getStaticCompensating <em>Static Compensating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getSimplifiedPelton <em>Simplified Pelton</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmax <em>Valvmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getHn <em>Hn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVa <em>Va</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmin <em>Valvmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVc <em>Vc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTs <em>Ts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTx <em>Tx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQn <em>Qn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv0 <em>Av0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv1 <em>Av1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQc0 <em>Qc0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH2 <em>H2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH1 <em>H1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getBp <em>Bp</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton()
 * @model
 * @generated
 */
public interface GovHydroPelton extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Twng</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water tunnel and surge chamber inertia time constant (<i>Twng</i>) (&gt;= 0). Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twng</em>' attribute.
     * @see #isSetTwng()
     * @see #unsetTwng()
     * @see #setTwng(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Twng()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.twng' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwng();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwng <em>Twng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twng</em>' attribute.
     * @see #isSetTwng()
     * @see #unsetTwng()
     * @see #getTwng()
     * @generated
     */
    void setTwng( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwng <em>Twng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwng()
     * @see #getTwng()
     * @see #setTwng(Double)
     * @generated
     */
    void unsetTwng();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwng <em>Twng</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twng</em>' attribute is set.
     * @see #unsetTwng()
     * @see #getTwng()
     * @see #setTwng(Double)
     * @generated
     */
    boolean isSetTwng();

    /**
     * Returns the value of the '<em><b>Twnc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water inertia time constant (<i>Twnc</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twnc</em>' attribute.
     * @see #isSetTwnc()
     * @see #unsetTwnc()
     * @see #setTwnc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Twnc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.twnc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwnc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwnc <em>Twnc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twnc</em>' attribute.
     * @see #isSetTwnc()
     * @see #unsetTwnc()
     * @see #getTwnc()
     * @generated
     */
    void setTwnc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwnc <em>Twnc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwnc()
     * @see #getTwnc()
     * @see #setTwnc(Double)
     * @generated
     */
    void unsetTwnc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTwnc <em>Twnc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twnc</em>' attribute is set.
     * @see #unsetTwnc()
     * @see #getTwnc()
     * @see #setTwnc(Double)
     * @generated
     */
    boolean isSetTwnc();

    /**
     * Returns the value of the '<em><b>Vav</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum servomotor valve opening velocity (<i>Vav</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vav</em>' attribute.
     * @see #isSetVav()
     * @see #unsetVav()
     * @see #setVav(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Vav()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.vav' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVav();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVav <em>Vav</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vav</em>' attribute.
     * @see #isSetVav()
     * @see #unsetVav()
     * @see #getVav()
     * @generated
     */
    void setVav( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVav <em>Vav</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVav()
     * @see #getVav()
     * @see #setVav(Double)
     * @generated
     */
    void unsetVav();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVav <em>Vav</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vav</em>' attribute is set.
     * @see #unsetVav()
     * @see #getVav()
     * @see #setVav(Double)
     * @generated
     */
    boolean isSetVav();

    /**
     * Returns the value of the '<em><b>Vcv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum servomotor valve closing velocity (<i>Vcv</i>).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vcv</em>' attribute.
     * @see #isSetVcv()
     * @see #unsetVcv()
     * @see #setVcv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Vcv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.vcv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVcv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVcv <em>Vcv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vcv</em>' attribute.
     * @see #isSetVcv()
     * @see #unsetVcv()
     * @see #getVcv()
     * @generated
     */
    void setVcv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVcv <em>Vcv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVcv()
     * @see #getVcv()
     * @see #setVcv(Double)
     * @generated
     */
    void unsetVcv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVcv <em>Vcv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vcv</em>' attribute is set.
     * @see #unsetVcv()
     * @see #getVcv()
     * @see #setVcv(Double)
     * @generated
     */
    boolean isSetVcv();

    /**
     * Returns the value of the '<em><b>Zsfc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Head of upper water level with respect to the level of penstock (<i>Zsfc</i>).  Unit = km.  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zsfc</em>' attribute.
     * @see #isSetZsfc()
     * @see #unsetZsfc()
     * @see #setZsfc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Zsfc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.zsfc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZsfc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getZsfc <em>Zsfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zsfc</em>' attribute.
     * @see #isSetZsfc()
     * @see #unsetZsfc()
     * @see #getZsfc()
     * @generated
     */
    void setZsfc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getZsfc <em>Zsfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZsfc()
     * @see #getZsfc()
     * @see #setZsfc(Double)
     * @generated
     */
    void unsetZsfc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getZsfc <em>Zsfc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zsfc</em>' attribute is set.
     * @see #unsetZsfc()
     * @see #getZsfc()
     * @see #setZsfc(Double)
     * @generated
     */
    boolean isSetZsfc();

    /**
     * Returns the value of the '<em><b>Db2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intentional dead-band width of valve opening error (<i>DB2</i>). Unit = Hz.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db2</em>' attribute.
     * @see #isSetDb2()
     * @see #unsetDb2()
     * @see #setDb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Db2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.db2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb2 <em>Db2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    void unsetDb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb2 <em>Db2</em>}' attribute is set.
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
     * Intentional dead-band width (<i>DB1</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db1</em>' attribute.
     * @see #isSetDb1()
     * @see #unsetDb1()
     * @see #setDb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Db1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.db1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb1 <em>Db1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    void unsetDb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getDb1 <em>Db1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Water Tunnel Surge Chamber Simulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water tunnel and surge chamber simulation (<i>Tflag</i>).
     * true = enable of water tunnel and surge chamber simulation
     * false = inhibit of water tunnel and surge chamber simulation.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Water Tunnel Surge Chamber Simulation</em>' attribute.
     * @see #isSetWaterTunnelSurgeChamberSimulation()
     * @see #unsetWaterTunnelSurgeChamberSimulation()
     * @see #setWaterTunnelSurgeChamberSimulation(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_WaterTunnelSurgeChamberSimulation()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.waterTunnelSurgeChamberSimulation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getWaterTunnelSurgeChamberSimulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getWaterTunnelSurgeChamberSimulation <em>Water Tunnel Surge Chamber Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Water Tunnel Surge Chamber Simulation</em>' attribute.
     * @see #isSetWaterTunnelSurgeChamberSimulation()
     * @see #unsetWaterTunnelSurgeChamberSimulation()
     * @see #getWaterTunnelSurgeChamberSimulation()
     * @generated
     */
    void setWaterTunnelSurgeChamberSimulation( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getWaterTunnelSurgeChamberSimulation <em>Water Tunnel Surge Chamber Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWaterTunnelSurgeChamberSimulation()
     * @see #getWaterTunnelSurgeChamberSimulation()
     * @see #setWaterTunnelSurgeChamberSimulation(Boolean)
     * @generated
     */
    void unsetWaterTunnelSurgeChamberSimulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getWaterTunnelSurgeChamberSimulation <em>Water Tunnel Surge Chamber Simulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Water Tunnel Surge Chamber Simulation</em>' attribute is set.
     * @see #unsetWaterTunnelSurgeChamberSimulation()
     * @see #getWaterTunnelSurgeChamberSimulation()
     * @see #setWaterTunnelSurgeChamberSimulation(Boolean)
     * @generated
     */
    boolean isSetWaterTunnelSurgeChamberSimulation();

    /**
     * Returns the value of the '<em><b>Static Compensating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Static compensating characteristic (<i>Cflag</i>). It should be true if simplifiedPelton = false.
     * true = enable of static compensating characteristic
     * false = inhibit of static compensating characteristic.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Static Compensating</em>' attribute.
     * @see #isSetStaticCompensating()
     * @see #unsetStaticCompensating()
     * @see #setStaticCompensating(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_StaticCompensating()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.staticCompensating' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getStaticCompensating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getStaticCompensating <em>Static Compensating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Compensating</em>' attribute.
     * @see #isSetStaticCompensating()
     * @see #unsetStaticCompensating()
     * @see #getStaticCompensating()
     * @generated
     */
    void setStaticCompensating( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getStaticCompensating <em>Static Compensating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStaticCompensating()
     * @see #getStaticCompensating()
     * @see #setStaticCompensating(Boolean)
     * @generated
     */
    void unsetStaticCompensating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getStaticCompensating <em>Static Compensating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static Compensating</em>' attribute is set.
     * @see #unsetStaticCompensating()
     * @see #getStaticCompensating()
     * @see #setStaticCompensating(Boolean)
     * @generated
     */
    boolean isSetStaticCompensating();

    /**
     * Returns the value of the '<em><b>Simplified Pelton</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Simplified Pelton model simulation (<i>Sflag</i>).
     * true = enable of simplified Pelton model simulation
     * false = enable of complete Pelton model simulation (non-linear gain).
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Simplified Pelton</em>' attribute.
     * @see #isSetSimplifiedPelton()
     * @see #unsetSimplifiedPelton()
     * @see #setSimplifiedPelton(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_SimplifiedPelton()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.simplifiedPelton' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSimplifiedPelton();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getSimplifiedPelton <em>Simplified Pelton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simplified Pelton</em>' attribute.
     * @see #isSetSimplifiedPelton()
     * @see #unsetSimplifiedPelton()
     * @see #getSimplifiedPelton()
     * @generated
     */
    void setSimplifiedPelton( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getSimplifiedPelton <em>Simplified Pelton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSimplifiedPelton()
     * @see #getSimplifiedPelton()
     * @see #setSimplifiedPelton(Boolean)
     * @generated
     */
    void unsetSimplifiedPelton();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getSimplifiedPelton <em>Simplified Pelton</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Simplified Pelton</em>' attribute is set.
     * @see #unsetSimplifiedPelton()
     * @see #getSimplifiedPelton()
     * @see #setSimplifiedPelton(Boolean)
     * @generated
     */
    boolean isSetSimplifiedPelton();

    /**
     * Returns the value of the '<em><b>Valvmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening (<i>ValvMax</i>) (&gt; GovHydroPelton.valvmin).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Valvmax</em>' attribute.
     * @see #isSetValvmax()
     * @see #unsetValvmax()
     * @see #setValvmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Valvmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.valvmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValvmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmax <em>Valvmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valvmax</em>' attribute.
     * @see #isSetValvmax()
     * @see #unsetValvmax()
     * @see #getValvmax()
     * @generated
     */
    void setValvmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmax <em>Valvmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValvmax()
     * @see #getValvmax()
     * @see #setValvmax(Double)
     * @generated
     */
    void unsetValvmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmax <em>Valvmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valvmax</em>' attribute is set.
     * @see #unsetValvmax()
     * @see #getValvmax()
     * @see #setValvmax(Double)
     * @generated
     */
    boolean isSetValvmax();

    /**
     * Returns the value of the '<em><b>Kg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water tunnel and surge chamber loss coefficient (due to friction) (<i>Kg</i>).  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kg</em>' attribute.
     * @see #isSetKg()
     * @see #unsetKg()
     * @see #setKg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Kg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.kg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKg <em>Kg</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKg <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKg()
     * @see #getKg()
     * @see #setKg(Double)
     * @generated
     */
    void unsetKg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKg <em>Kg</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Penstock loss coefficient (due to friction) (<i>Kc</i>).  Typical value = 0,025.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #setKc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Kc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.kc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKc <em>Kc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getKc <em>Kc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Hn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated hydraulic head (<i>H</i><i><sub>n</sub></i>).  Unit = km.  Typical value = 0,250.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hn</em>' attribute.
     * @see #isSetHn()
     * @see #unsetHn()
     * @see #setHn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Hn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.hn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getHn <em>Hn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hn</em>' attribute.
     * @see #isSetHn()
     * @see #unsetHn()
     * @see #getHn()
     * @generated
     */
    void setHn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getHn <em>Hn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHn()
     * @see #getHn()
     * @see #setHn(Double)
     * @generated
     */
    void unsetHn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getHn <em>Hn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hn</em>' attribute is set.
     * @see #unsetHn()
     * @see #getHn()
     * @see #setHn(Double)
     * @generated
     */
    boolean isSetHn();

    /**
     * Returns the value of the '<em><b>Va</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening velocity (<i>Va</i>).  Unit = PU / s.  Typical value = 0,06.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Va</em>' attribute.
     * @see #isSetVa()
     * @see #unsetVa()
     * @see #setVa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Va()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.va' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVa <em>Va</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Va</em>' attribute.
     * @see #isSetVa()
     * @see #unsetVa()
     * @see #getVa()
     * @generated
     */
    void setVa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVa <em>Va</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVa()
     * @see #getVa()
     * @see #setVa(Double)
     * @generated
     */
    void unsetVa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVa <em>Va</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Va</em>' attribute is set.
     * @see #unsetVa()
     * @see #getVa()
     * @see #setVa(Double)
     * @generated
     */
    boolean isSetVa();

    /**
     * Returns the value of the '<em><b>Valvmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum gate opening (<i>ValvMin</i>) (&lt; GovHydroPelton.valvmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Valvmin</em>' attribute.
     * @see #isSetValvmin()
     * @see #unsetValvmin()
     * @see #setValvmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Valvmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.valvmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValvmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmin <em>Valvmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valvmin</em>' attribute.
     * @see #isSetValvmin()
     * @see #unsetValvmin()
     * @see #getValvmin()
     * @generated
     */
    void setValvmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmin <em>Valvmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValvmin()
     * @see #getValvmin()
     * @see #setValvmin(Double)
     * @generated
     */
    void unsetValvmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getValvmin <em>Valvmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Valvmin</em>' attribute is set.
     * @see #unsetValvmin()
     * @see #getValvmin()
     * @see #setValvmin(Double)
     * @generated
     */
    boolean isSetValvmin();

    /**
     * Returns the value of the '<em><b>Vc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate closing velocity (<i>Vc</i>).  Unit = PU / s.  Typical value = -0,06.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vc</em>' attribute.
     * @see #isSetVc()
     * @see #unsetVc()
     * @see #setVc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Vc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.vc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVc <em>Vc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vc</em>' attribute.
     * @see #isSetVc()
     * @see #unsetVc()
     * @see #getVc()
     * @generated
     */
    void setVc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVc <em>Vc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVc()
     * @see #getVc()
     * @see #setVc(Double)
     * @generated
     */
    void unsetVc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getVc <em>Vc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vc</em>' attribute is set.
     * @see #unsetVc()
     * @see #getVc()
     * @see #setVc(Double)
     * @generated
     */
    boolean isSetVc();

    /**
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative gain (accelerometer time constant) (<i>Ta</i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTa <em>Ta</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Servomotor integrator time constant (<i>Tv</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #setTv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Tv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.tv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTv <em>Tv</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTv()
     * @see #getTv()
     * @see #setTv(Double)
     * @generated
     */
    void unsetTv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTv <em>Tv</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ts</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate servo time constant (<i>Ts</i>) (&gt;= 0).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts</em>' attribute.
     * @see #isSetTs()
     * @see #unsetTs()
     * @see #setTs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Ts()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.ts' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTs <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts</em>' attribute.
     * @see #isSetTs()
     * @see #unsetTs()
     * @see #getTs()
     * @generated
     */
    void setTs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTs <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs()
     * @see #getTs()
     * @see #setTs(Double)
     * @generated
     */
    void unsetTs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTs <em>Ts</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts</em>' attribute is set.
     * @see #unsetTs()
     * @see #getTs()
     * @see #setTs(Double)
     * @generated
     */
    boolean isSetTs();

    /**
     * Returns the value of the '<em><b>Tx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electronic integrator time constant (<i>Tx</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tx</em>' attribute.
     * @see #isSetTx()
     * @see #unsetTx()
     * @see #setTx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Tx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.tx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTx <em>Tx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx</em>' attribute.
     * @see #isSetTx()
     * @see #unsetTx()
     * @see #getTx()
     * @generated
     */
    void setTx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTx <em>Tx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTx()
     * @see #getTx()
     * @see #setTx(Double)
     * @generated
     */
    void unsetTx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getTx <em>Tx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tx</em>' attribute is set.
     * @see #unsetTx()
     * @see #getTx()
     * @see #setTx(Double)
     * @generated
     */
    boolean isSetTx();

    /**
     * Returns the value of the '<em><b>Qn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated flow (<i>Q</i><i><sub>n</sub></i>). Unit = m<sup>3</sup>/s. Typical value = 250.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qn</em>' attribute.
     * @see #isSetQn()
     * @see #unsetQn()
     * @see #setQn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Qn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VolumeFlowRate" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.qn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQn <em>Qn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qn</em>' attribute.
     * @see #isSetQn()
     * @see #unsetQn()
     * @see #getQn()
     * @generated
     */
    void setQn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQn <em>Qn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQn()
     * @see #getQn()
     * @see #setQn(Double)
     * @generated
     */
    void unsetQn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQn <em>Qn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qn</em>' attribute is set.
     * @see #unsetQn()
     * @see #getQn()
     * @see #setQn(Double)
     * @generated
     */
    boolean isSetQn();

    /**
     * Returns the value of the '<em><b>Av0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area of the surge tank (<i>A</i><i><sub>V0</sub></i>). Unit = m<sup>2</sup>. Typical value = 30.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Av0</em>' attribute.
     * @see #isSetAv0()
     * @see #unsetAv0()
     * @see #setAv0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Av0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Area" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.av0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAv0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv0 <em>Av0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Av0</em>' attribute.
     * @see #isSetAv0()
     * @see #unsetAv0()
     * @see #getAv0()
     * @generated
     */
    void setAv0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv0 <em>Av0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAv0()
     * @see #getAv0()
     * @see #setAv0(Double)
     * @generated
     */
    void unsetAv0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv0 <em>Av0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Av0</em>' attribute is set.
     * @see #unsetAv0()
     * @see #getAv0()
     * @see #setAv0(Double)
     * @generated
     */
    boolean isSetAv0();

    /**
     * Returns the value of the '<em><b>Av1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area of the compensation tank (<i>A</i><i><sub>V1</sub></i>). Unit = m<sup>2</sup>. Typical value = 700.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Av1</em>' attribute.
     * @see #isSetAv1()
     * @see #unsetAv1()
     * @see #setAv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Av1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Area" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.av1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv1 <em>Av1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Av1</em>' attribute.
     * @see #isSetAv1()
     * @see #unsetAv1()
     * @see #getAv1()
     * @generated
     */
    void setAv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv1 <em>Av1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAv1()
     * @see #getAv1()
     * @see #setAv1(Double)
     * @generated
     */
    void unsetAv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getAv1 <em>Av1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Av1</em>' attribute is set.
     * @see #unsetAv1()
     * @see #getAv1()
     * @see #setAv1(Double)
     * @generated
     */
    boolean isSetAv1();

    /**
     * Returns the value of the '<em><b>Qc0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No-load turbine flow at nominal head (<i>Qc0</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qc0</em>' attribute.
     * @see #isSetQc0()
     * @see #unsetQc0()
     * @see #setQc0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Qc0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.qc0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQc0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQc0 <em>Qc0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qc0</em>' attribute.
     * @see #isSetQc0()
     * @see #unsetQc0()
     * @see #getQc0()
     * @generated
     */
    void setQc0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQc0 <em>Qc0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQc0()
     * @see #getQc0()
     * @see #setQc0(Double)
     * @generated
     */
    void unsetQc0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getQc0 <em>Qc0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qc0</em>' attribute is set.
     * @see #unsetQc0()
     * @see #getQc0()
     * @see #setQc0(Double)
     * @generated
     */
    boolean isSetQc0();

    /**
     * Returns the value of the '<em><b>H2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Head of surge tank water level with respect to the level of penstock (<i>H</i><i><sub>2</sub></i>).  Unit = km.  Typical value = 0,040.
     * <!-- end-model-doc -->
     * @return the value of the '<em>H2</em>' attribute.
     * @see #isSetH2()
     * @see #unsetH2()
     * @see #setH2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_H2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.h2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getH2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH2 <em>H2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>H2</em>' attribute.
     * @see #isSetH2()
     * @see #unsetH2()
     * @see #getH2()
     * @generated
     */
    void setH2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH2 <em>H2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH2()
     * @see #getH2()
     * @see #setH2(Double)
     * @generated
     */
    void unsetH2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH2 <em>H2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H2</em>' attribute is set.
     * @see #unsetH2()
     * @see #getH2()
     * @see #setH2(Double)
     * @generated
     */
    boolean isSetH2();

    /**
     * Returns the value of the '<em><b>H1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Head of compensation chamber water level with respect to the level of penstock (<i>H</i><i><sub>1</sub></i>).  Unit = km.  Typical value = 0,004.
     * <!-- end-model-doc -->
     * @return the value of the '<em>H1</em>' attribute.
     * @see #isSetH1()
     * @see #unsetH1()
     * @see #setH1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_H1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.h1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getH1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH1 <em>H1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>H1</em>' attribute.
     * @see #isSetH1()
     * @see #unsetH1()
     * @see #getH1()
     * @generated
     */
    void setH1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH1 <em>H1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH1()
     * @see #getH1()
     * @see #setH1(Double)
     * @generated
     */
    void unsetH1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getH1 <em>H1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H1</em>' attribute is set.
     * @see #unsetH1()
     * @see #getH1()
     * @see #setH1(Double)
     * @generated
     */
    boolean isSetH1();

    /**
     * Returns the value of the '<em><b>Bp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Droop (<i>bp</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #setBp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroPelton_Bp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroPelton.bp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #getBp()
     * @generated
     */
    void setBp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBp()
     * @see #getBp()
     * @see #setBp(Double)
     * @generated
     */
    void unsetBp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroPelton#getBp <em>Bp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bp</em>' attribute is set.
     * @see #unsetBp()
     * @see #getBp()
     * @see #setBp(Double)
     * @generated
     */
    boolean isSetBp();

} // GovHydroPelton
