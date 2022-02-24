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
 * A representation of the model object '<em><b>Gov Hydro4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hydro turbine and governor. Represents plants with straight-forward penstock configurations and hydraulic governors of the traditional 'dashpot' type.  This model can be used to represent simple, Francis/Pelton or Kaplan turbines.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRtemp <em>Rtemp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getModel <em>Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBmax <em>Bmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getQnl <em>Qnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv2 <em>Bgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv1 <em>Bgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv4 <em>Bgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv3 <em>Bgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv5 <em>Bgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv0 <em>Bgv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv0 <em>Pgv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTblade <em>Tblade</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv0 <em>Gv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRperm <em>Rperm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUc <em>Uc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUo <em>Uo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getHdam <em>Hdam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getMwbase <em>Mwbase</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4()
 * @model
 * @generated
 */
public interface GovHydro4 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Rtemp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temporary droop (<i>Rtemp</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rtemp</em>' attribute.
     * @see #isSetRtemp()
     * @see #unsetRtemp()
     * @see #setRtemp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Rtemp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.rtemp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRtemp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRtemp <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rtemp</em>' attribute.
     * @see #isSetRtemp()
     * @see #unsetRtemp()
     * @see #getRtemp()
     * @generated
     */
    void setRtemp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRtemp <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRtemp()
     * @see #getRtemp()
     * @see #setRtemp(Double)
     * @generated
     */
    void unsetRtemp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRtemp <em>Rtemp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rtemp</em>' attribute is set.
     * @see #unsetRtemp()
     * @see #getRtemp()
     * @see #setRtemp(Double)
     * @generated
     */
    boolean isSetRtemp();

    /**
     * Returns the value of the '<em><b>Model</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4ModelKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The kind of model being represented (simple, Francis/Pelton or Kaplan).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4ModelKind
     * @see #isSetModel()
     * @see #unsetModel()
     * @see #setModel(GovHydro4ModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Model()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.model' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GovHydro4ModelKind getModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getModel <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4ModelKind
     * @see #isSetModel()
     * @see #unsetModel()
     * @see #getModel()
     * @generated
     */
    void setModel( GovHydro4ModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getModel <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModel()
     * @see #getModel()
     * @see #setModel(GovHydro4ModelKind)
     * @generated
     */
    void unsetModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getModel <em>Model</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model</em>' attribute is set.
     * @see #unsetModel()
     * @see #getModel()
     * @see #setModel(GovHydro4ModelKind)
     * @generated
     */
    boolean isSetModel();

    /**
     * Returns the value of the '<em><b>Bmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum blade adjustment factor (<i>Bmax</i>)  (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1,1276.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bmax</em>' attribute.
     * @see #isSetBmax()
     * @see #unsetBmax()
     * @see #setBmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBmax <em>Bmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bmax</em>' attribute.
     * @see #isSetBmax()
     * @see #unsetBmax()
     * @see #getBmax()
     * @generated
     */
    void setBmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBmax <em>Bmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBmax()
     * @see #getBmax()
     * @see #setBmax(Double)
     * @generated
     */
    void unsetBmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBmax <em>Bmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bmax</em>' attribute is set.
     * @see #unsetBmax()
     * @see #getBmax()
     * @see #setBmax(Double)
     * @generated
     */
    boolean isSetBmax();

    /**
     * Returns the value of the '<em><b>Qnl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No-load flow at nominal head (<i>Qnl</i>).
     * Typical value for simple = 0,08, Francis/Pelton = 0, Kaplan = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qnl</em>' attribute.
     * @see #isSetQnl()
     * @see #unsetQnl()
     * @see #setQnl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Qnl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.qnl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQnl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getQnl <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qnl</em>' attribute.
     * @see #isSetQnl()
     * @see #unsetQnl()
     * @see #getQnl()
     * @generated
     */
    void setQnl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getQnl <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQnl()
     * @see #getQnl()
     * @see #setQnl(Double)
     * @generated
     */
    void unsetQnl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getQnl <em>Qnl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qnl</em>' attribute is set.
     * @see #unsetQnl()
     * @see #getQnl()
     * @see #setQnl(Double)
     * @generated
     */
    boolean isSetQnl();

    /**
     * Returns the value of the '<em><b>Bgv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 2 (<i>Bgv2</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv2</em>' attribute.
     * @see #isSetBgv2()
     * @see #unsetBgv2()
     * @see #setBgv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv2 <em>Bgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv2</em>' attribute.
     * @see #isSetBgv2()
     * @see #unsetBgv2()
     * @see #getBgv2()
     * @generated
     */
    void setBgv2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv2 <em>Bgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv2()
     * @see #getBgv2()
     * @see #setBgv2(Double)
     * @generated
     */
    void unsetBgv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv2 <em>Bgv2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv2</em>' attribute is set.
     * @see #unsetBgv2()
     * @see #getBgv2()
     * @see #setBgv2(Double)
     * @generated
     */
    boolean isSetBgv2();

    /**
     * Returns the value of the '<em><b>Bgv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 1 (<i>Bgv1</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv1</em>' attribute.
     * @see #isSetBgv1()
     * @see #unsetBgv1()
     * @see #setBgv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv1 <em>Bgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv1</em>' attribute.
     * @see #isSetBgv1()
     * @see #unsetBgv1()
     * @see #getBgv1()
     * @generated
     */
    void setBgv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv1 <em>Bgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv1()
     * @see #getBgv1()
     * @see #setBgv1(Double)
     * @generated
     */
    void unsetBgv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv1 <em>Bgv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv1</em>' attribute is set.
     * @see #unsetBgv1()
     * @see #getBgv1()
     * @see #setBgv1(Double)
     * @generated
     */
    boolean isSetBgv1();

    /**
     * Returns the value of the '<em><b>Bgv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 4 (<i>Bgv4</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv4</em>' attribute.
     * @see #isSetBgv4()
     * @see #unsetBgv4()
     * @see #setBgv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv4 <em>Bgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv4</em>' attribute.
     * @see #isSetBgv4()
     * @see #unsetBgv4()
     * @see #getBgv4()
     * @generated
     */
    void setBgv4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv4 <em>Bgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv4()
     * @see #getBgv4()
     * @see #setBgv4(Double)
     * @generated
     */
    void unsetBgv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv4 <em>Bgv4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv4</em>' attribute is set.
     * @see #unsetBgv4()
     * @see #getBgv4()
     * @see #setBgv4(Double)
     * @generated
     */
    boolean isSetBgv4();

    /**
     * Returns the value of the '<em><b>Bgv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 3 (<i>Bgv3</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,667.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv3</em>' attribute.
     * @see #isSetBgv3()
     * @see #unsetBgv3()
     * @see #setBgv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv3 <em>Bgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv3</em>' attribute.
     * @see #isSetBgv3()
     * @see #unsetBgv3()
     * @see #getBgv3()
     * @generated
     */
    void setBgv3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv3 <em>Bgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv3()
     * @see #getBgv3()
     * @see #setBgv3(Double)
     * @generated
     */
    void unsetBgv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv3 <em>Bgv3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv3</em>' attribute is set.
     * @see #unsetBgv3()
     * @see #getBgv3()
     * @see #setBgv3(Double)
     * @generated
     */
    boolean isSetBgv3();

    /**
     * Returns the value of the '<em><b>Bgv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 5 (<i>Bgv5</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv5</em>' attribute.
     * @see #isSetBgv5()
     * @see #unsetBgv5()
     * @see #setBgv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv5 <em>Bgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv5</em>' attribute.
     * @see #isSetBgv5()
     * @see #unsetBgv5()
     * @see #getBgv5()
     * @generated
     */
    void setBgv5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv5 <em>Bgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv5()
     * @see #getBgv5()
     * @see #setBgv5(Double)
     * @generated
     */
    void unsetBgv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv5 <em>Bgv5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv5</em>' attribute is set.
     * @see #unsetBgv5()
     * @see #getBgv5()
     * @see #setBgv5(Double)
     * @generated
     */
    boolean isSetBgv5();

    /**
     * Returns the value of the '<em><b>Bgv0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kaplan blade servo point 0 (<i>Bgv0</i>) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bgv0</em>' attribute.
     * @see #isSetBgv0()
     * @see #unsetBgv0()
     * @see #setBgv0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Bgv0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.bgv0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBgv0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv0 <em>Bgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bgv0</em>' attribute.
     * @see #isSetBgv0()
     * @see #unsetBgv0()
     * @see #getBgv0()
     * @generated
     */
    void setBgv0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv0 <em>Bgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBgv0()
     * @see #getBgv0()
     * @see #setBgv0(Double)
     * @generated
     */
    void unsetBgv0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getBgv0 <em>Bgv0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bgv0</em>' attribute is set.
     * @see #unsetBgv0()
     * @see #getBgv0()
     * @see #setBgv0(Double)
     * @generated
     */
    boolean isSetBgv0();

    /**
     * Returns the value of the '<em><b>Pgv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 5, PU power (<i>Pgv5</i>) (= 0 for simple).
     * Typical value for Francis/Pelton = 0,97, Kaplan = 0,99.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv5</em>' attribute.
     * @see #isSetPgv5()
     * @see #unsetPgv5()
     * @see #setPgv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv5 <em>Pgv5</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv5 <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv5()
     * @see #getPgv5()
     * @see #setPgv5(Double)
     * @generated
     */
    void unsetPgv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv5 <em>Pgv5</em>}' attribute is set.
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
     * Nonlinear gain point 4, PU power (<i>Pgv4</i>) (= 0 for simple).
     * Typical value for Francis/Pelton = 0,9, Kaplan = 0,917.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv4</em>' attribute.
     * @see #isSetPgv4()
     * @see #unsetPgv4()
     * @see #setPgv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv4 <em>Pgv4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv4 <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv4()
     * @see #getPgv4()
     * @see #setPgv4(Double)
     * @generated
     */
    void unsetPgv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv4 <em>Pgv4</em>}' attribute is set.
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
     * Nonlinear gain point 3, PU power (<i>Pgv3</i>) (= 0 for simple).
     * Typical value for Francis/Pelton = 0,8, Kaplan = 0,796.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #setPgv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv3 <em>Pgv3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    void unsetPgv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv3 <em>Pgv3</em>}' attribute is set.
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
     * Nonlinear gain point 2, PU power (<i>Pgv2</i>) (= 0 for simple).
     * Typical value for Francis/Pelton = 0,56, Kaplan = 0,468.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #setPgv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv2 <em>Pgv2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    void unsetPgv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv2 <em>Pgv2</em>}' attribute is set.
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
     * Nonlinear gain point 1, PU power (<i>Pgv1</i>) (= 0 for simple).
     * Typical value for Francis/Pelton = 0,42, Kaplan = 0,35.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #setPgv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv1 <em>Pgv1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    void unsetPgv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv1 <em>Pgv1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pgv0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 0, PU power (<i>Pgv0</i>) (= 0 for simple).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv0</em>' attribute.
     * @see #isSetPgv0()
     * @see #unsetPgv0()
     * @see #setPgv0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Pgv0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.pgv0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv0 <em>Pgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv0</em>' attribute.
     * @see #isSetPgv0()
     * @see #unsetPgv0()
     * @see #getPgv0()
     * @generated
     */
    void setPgv0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv0 <em>Pgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv0()
     * @see #getPgv0()
     * @see #setPgv0(Double)
     * @generated
     */
    void unsetPgv0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getPgv0 <em>Pgv0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv0</em>' attribute is set.
     * @see #unsetPgv0()
     * @see #getPgv0()
     * @see #setPgv0(Double)
     * @generated
     */
    boolean isSetPgv0();

    /**
     * Returns the value of the '<em><b>Tblade</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Blade servo time constant (<i>Tblade</i>) (&gt;= 0).  Typical value = 100.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tblade</em>' attribute.
     * @see #isSetTblade()
     * @see #unsetTblade()
     * @see #setTblade(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Tblade()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.tblade' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTblade();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTblade <em>Tblade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tblade</em>' attribute.
     * @see #isSetTblade()
     * @see #unsetTblade()
     * @see #getTblade()
     * @generated
     */
    void setTblade( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTblade <em>Tblade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTblade()
     * @see #getTblade()
     * @see #setTblade(Double)
     * @generated
     */
    void unsetTblade();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTblade <em>Tblade</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tblade</em>' attribute is set.
     * @see #unsetTblade()
     * @see #getTblade()
     * @see #setTblade(Double)
     * @generated
     */
    boolean isSetTblade();

    /**
     * Returns the value of the '<em><b>Gv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 5, PU gv (<i>Gv5</i>)  (= 0 for simple, &lt; 1 and &gt; GovHydro4.gv4 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,9, Kaplan = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #setGv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv5 <em>Gv5</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    void unsetGv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv5 <em>Gv5</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 3, PU gv (<i>Gv3</i>)  (= 0 for simple, &gt; GovHydro4.gv2 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,7, Kaplan = 0,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #setGv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv3 <em>Gv3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    void unsetGv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv3 <em>Gv3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 4, PU gv (<i>Gv4</i>)  (= 0 for simple, &gt; GovHydro4.gv3 for Francis/Pelton and Kaplan). Typical value for  Francis/Pelton = 0,8, Kaplan = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #setGv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv4 <em>Gv4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    void unsetGv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv4 <em>Gv4</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 1, PU gv (<i>Gv1</i>) (= 0 for simple, &gt; GovHydro4.gv0 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,4, Kaplan = 0,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #setGv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv1 <em>Gv1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    void unsetGv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv1 <em>Gv1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 2, PU gv (<i>Gv2</i>) (= 0 for simple, &gt; GovHydro4.gv1 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,5, Kaplan = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #setGv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv2 <em>Gv2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    void unsetGv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv2 <em>Gv2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nonlinear gain point 0, PU gv (<i>Gv0</i>) (= 0 for simple).  Typical for Francis/Pelton = 0,1, Kaplan = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv0</em>' attribute.
     * @see #isSetGv0()
     * @see #unsetGv0()
     * @see #setGv0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gv0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gv0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv0 <em>Gv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv0</em>' attribute.
     * @see #isSetGv0()
     * @see #unsetGv0()
     * @see #getGv0()
     * @generated
     */
    void setGv0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv0 <em>Gv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv0()
     * @see #getGv0()
     * @see #setGv0(Double)
     * @generated
     */
    void unsetGv0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGv0 <em>Gv0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv0</em>' attribute is set.
     * @see #unsetGv0()
     * @see #getGv0()
     * @see #setGv0(Double)
     * @generated
     */
    boolean isSetGv0();

    /**
     * Returns the value of the '<em><b>Gmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum gate opening, PU of <i>MWbase</i> (<i>Gmin</i>) (&lt; GovHydro4.gmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #setGmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmin <em>Gmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmin()
     * @see #getGmin()
     * @see #setGmin(Double)
     * @generated
     */
    void unsetGmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmin <em>Gmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>At</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine gain (<i>At</i>).  Typical value = 1,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #setAt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_At()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.at' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>At</em>' attribute.
     * @see #isSetAt()
     * @see #unsetAt()
     * @see #getAt()
     * @generated
     */
    void setAt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getAt <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAt()
     * @see #getAt()
     * @see #setAt(Double)
     * @generated
     */
    void unsetAt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getAt <em>At</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>At</em>' attribute is set.
     * @see #unsetAt()
     * @see #getAt()
     * @see #setAt(Double)
     * @generated
     */
    boolean isSetAt();

    /**
     * Returns the value of the '<em><b>Gmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening, PU of <i>MWbase</i> (<i>Gmax</i>) (&gt; GovHydro4.gmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #setGmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Gmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.gmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmax <em>Gmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmax()
     * @see #getGmax()
     * @see #setGmax(Double)
     * @generated
     */
    void unsetGmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getGmax <em>Gmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Rperm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent droop (<i>Rperm</i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rperm</em>' attribute.
     * @see #isSetRperm()
     * @see #unsetRperm()
     * @see #setRperm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Rperm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.rperm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRperm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRperm <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rperm</em>' attribute.
     * @see #isSetRperm()
     * @see #unsetRperm()
     * @see #getRperm()
     * @generated
     */
    void setRperm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRperm <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRperm()
     * @see #getRperm()
     * @see #setRperm(Double)
     * @generated
     */
    void unsetRperm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getRperm <em>Rperm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rperm</em>' attribute is set.
     * @see #unsetRperm()
     * @see #getRperm()
     * @see #setRperm(Double)
     * @generated
     */
    boolean isSetRperm();

    /**
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate servo time constant (<i>Tg</i>) (&gt; 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Tg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.tg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #getTg()
     * @generated
     */
    void setTg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTg <em>Tg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tg</em>' attribute is set.
     * @see #unsetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    boolean isSetTg();

    /**
     * Returns the value of the '<em><b>Tw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water inertia time constant (<i>Tw</i>) (&gt; 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #setTw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Tw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.tw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTw <em>Tw</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    void unsetTw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTw <em>Tw</em>}' attribute is set.
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
     * Pilot servo time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTp <em>Tp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTp <em>Tp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dashpot time constant (<i>Tr</i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Uc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Max gate closing velocity (<i>Uc</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uc</em>' attribute.
     * @see #isSetUc()
     * @see #unsetUc()
     * @see #setUc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Uc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.uc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUc <em>Uc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUc <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUc()
     * @see #getUc()
     * @see #setUc(Double)
     * @generated
     */
    void unsetUc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUc <em>Uc</em>}' attribute is set.
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
     * Max gate opening velocity (<i>Uo</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uo</em>' attribute.
     * @see #isSetUo()
     * @see #unsetUo()
     * @see #setUo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Uo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.uo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUo <em>Uo</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUo <em>Uo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUo()
     * @see #getUo()
     * @see #setUo(Double)
     * @generated
     */
    void unsetUo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getUo <em>Uo</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Eps()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.eps' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEps();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getEps <em>Eps</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getEps <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEps()
     * @see #getEps()
     * @see #setEps(Double)
     * @generated
     */
    void unsetEps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getEps <em>Eps</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Db2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.db2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb2 <em>Db2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb2 <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb2()
     * @see #getDb2()
     * @see #setDb2(Double)
     * @generated
     */
    void unsetDb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb2 <em>Db2</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Db1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.db1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb1 <em>Db1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb1 <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb1()
     * @see #getDb1()
     * @see #setDb1(Double)
     * @generated
     */
    void unsetDb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDb1 <em>Db1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine damping factor (<i>Dturb</i>).  Unit = delta P (PU of <i>MWbase</i>) / delta speed (PU).  Typical value for simple = 0,5, Francis/Pelton = 1,1, Kaplan = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #setDturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Dturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.dturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #getDturb()
     * @generated
     */
    void setDturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDturb()
     * @see #getDturb()
     * @see #setDturb(Double)
     * @generated
     */
    void unsetDturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getDturb <em>Dturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dturb</em>' attribute is set.
     * @see #unsetDturb()
     * @see #getDturb()
     * @see #setDturb(Double)
     * @generated
     */
    boolean isSetDturb();

    /**
     * Returns the value of the '<em><b>Hdam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Head available at dam (<i>hdam</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hdam</em>' attribute.
     * @see #isSetHdam()
     * @see #unsetHdam()
     * @see #setHdam(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Hdam()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.hdam' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHdam();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getHdam <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hdam</em>' attribute.
     * @see #isSetHdam()
     * @see #unsetHdam()
     * @see #getHdam()
     * @generated
     */
    void setHdam( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getHdam <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHdam()
     * @see #getHdam()
     * @see #setHdam(Double)
     * @generated
     */
    void unsetHdam();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getHdam <em>Hdam</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hdam</em>' attribute is set.
     * @see #unsetHdam()
     * @see #getHdam()
     * @see #setHdam(Double)
     * @generated
     */
    boolean isSetHdam();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydro4_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydro4.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro4#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    boolean isSetMwbase();

} // GovHydro4
