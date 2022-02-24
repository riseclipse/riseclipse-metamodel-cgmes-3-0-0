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
 * A representation of the model object '<em><b>Load Generic Non Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic non-linear dynamic (GNLD) load. This model can be used in mid-term and long-term voltage stability simulations (i.e., to study voltage collapse), as it can replace a more detailed representation of aggregate load, including induction motors, thermostatically controlled and static loads.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBs <em>Bs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBt <em>Bt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTq <em>Tq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLt <em>Lt</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear()
 * @model
 * @generated
 */
public interface LoadGenericNonLinear extends LoadDynamics {
    /**
     * Returns the value of the '<em><b>Generic Non Linear Load Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenericNonLinearLoadModelKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of generic non-linear load model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Generic Non Linear Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenericNonLinearLoadModelKind
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_GenericNonLinearLoadModelType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.genericNonLinearLoadModelType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GenericNonLinearLoadModelKind getGenericNonLinearLoadModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generic Non Linear Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenericNonLinearLoadModelKind
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     */
    void setGenericNonLinearLoadModelType( GenericNonLinearLoadModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @generated
     */
    void unsetGenericNonLinearLoadModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generic Non Linear Load Model Type</em>' attribute is set.
     * @see #unsetGenericNonLinearLoadModelType()
     * @see #getGenericNonLinearLoadModelType()
     * @see #setGenericNonLinearLoadModelType(GenericNonLinearLoadModelKind)
     * @generated
     */
    boolean isSetGenericNonLinearLoadModelType();

    /**
     * Returns the value of the '<em><b>Bs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Steady state voltage index for reactive power (<i>BS</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bs</em>' attribute.
     * @see #isSetBs()
     * @see #unsetBs()
     * @see #setBs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Bs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.bs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bs</em>' attribute.
     * @see #isSetBs()
     * @see #unsetBs()
     * @see #getBs()
     * @generated
     */
    void setBs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBs()
     * @see #getBs()
     * @see #setBs(Double)
     * @generated
     */
    void unsetBs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBs <em>Bs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bs</em>' attribute is set.
     * @see #unsetBs()
     * @see #getBs()
     * @see #setBs(Double)
     * @generated
     */
    boolean isSetBs();

    /**
     * Returns the value of the '<em><b>Bt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient voltage index for reactive power (<i>BT</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bt</em>' attribute.
     * @see #isSetBt()
     * @see #unsetBt()
     * @see #setBt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Bt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.bt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bt</em>' attribute.
     * @see #isSetBt()
     * @see #unsetBt()
     * @see #getBt()
     * @generated
     */
    void setBt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBt()
     * @see #getBt()
     * @see #setBt(Double)
     * @generated
     */
    void unsetBt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getBt <em>Bt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bt</em>' attribute is set.
     * @see #unsetBt()
     * @see #getBt()
     * @see #setBt(Double)
     * @generated
     */
    boolean isSetBt();

    /**
     * Returns the value of the '<em><b>Tq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of lag function of reactive power (<i>T</i><i><sub>Q</sub></i>) (&gt; 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tq</em>' attribute.
     * @see #isSetTq()
     * @see #unsetTq()
     * @see #setTq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Tq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.tq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tq</em>' attribute.
     * @see #isSetTq()
     * @see #unsetTq()
     * @see #getTq()
     * @generated
     */
    void setTq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTq()
     * @see #getTq()
     * @see #setTq(Double)
     * @generated
     */
    void unsetTq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTq <em>Tq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tq</em>' attribute is set.
     * @see #unsetTq()
     * @see #getTq()
     * @see #setTq(Double)
     * @generated
     */
    boolean isSetTq();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of lag function of active power (<i>T</i><i><sub>P</sub></i>) (&gt; 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getTp <em>Tp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ls</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Steady state voltage index for active power (<i>LS</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #setLs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Ls()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.ls' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #getLs()
     * @generated
     */
    void setLs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLs()
     * @see #getLs()
     * @see #setLs(Double)
     * @generated
     */
    void unsetLs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLs <em>Ls</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ls</em>' attribute is set.
     * @see #unsetLs()
     * @see #getLs()
     * @see #setLs(Double)
     * @generated
     */
    boolean isSetLs();

    /**
     * Returns the value of the '<em><b>Lt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient voltage index for active power (<i>LT</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lt</em>' attribute.
     * @see #isSetLt()
     * @see #unsetLt()
     * @see #setLt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGenericNonLinear_Lt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadGenericNonLinear.lt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lt</em>' attribute.
     * @see #isSetLt()
     * @see #unsetLt()
     * @see #getLt()
     * @generated
     */
    void setLt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLt()
     * @see #getLt()
     * @see #setLt(Double)
     * @generated
     */
    void unsetLt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear#getLt <em>Lt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lt</em>' attribute is set.
     * @see #unsetLt()
     * @see #getLt()
     * @see #setLt(Double)
     * @generated
     */
    boolean isSetLt();

} // LoadGenericNonLinear
