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
 * A representation of the model object '<em><b>Load Static</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General static load. This model represents the sensitivity of the real and reactive power consumed by the load to the amplitude and frequency of the bus voltage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp3 <em>Ep3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp1 <em>Ep1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp2 <em>Ep2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq2 <em>Eq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq3 <em>Eq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq1 <em>Eq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp1 <em>Kp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp2 <em>Kp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq4 <em>Kq4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKpf <em>Kpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp3 <em>Kp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp4 <em>Kp4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq2 <em>Kq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq3 <em>Kq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq1 <em>Kq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKqf <em>Kqf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic()
 * @model
 * @generated
 */
public interface LoadStatic extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Ep3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Third term voltage exponent for active power (<i>Ep3</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ep3</em>' attribute.
     * @see #isSetEp3()
     * @see #unsetEp3()
     * @see #setEp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Ep3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.ep3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep3</em>' attribute.
     * @see #isSetEp3()
     * @see #unsetEp3()
     * @see #getEp3()
     * @generated
     */
    void setEp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp3()
     * @see #getEp3()
     * @see #setEp3(Double)
     * @generated
     */
    void unsetEp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp3 <em>Ep3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep3</em>' attribute is set.
     * @see #unsetEp3()
     * @see #getEp3()
     * @see #setEp3(Double)
     * @generated
     */
    boolean isSetEp3();

    /**
     * Returns the value of the '<em><b>Ep1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First term voltage exponent for active power (<i>Ep1</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ep1</em>' attribute.
     * @see #isSetEp1()
     * @see #unsetEp1()
     * @see #setEp1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Ep1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.ep1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep1</em>' attribute.
     * @see #isSetEp1()
     * @see #unsetEp1()
     * @see #getEp1()
     * @generated
     */
    void setEp1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp1()
     * @see #getEp1()
     * @see #setEp1(Double)
     * @generated
     */
    void unsetEp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp1 <em>Ep1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep1</em>' attribute is set.
     * @see #unsetEp1()
     * @see #getEp1()
     * @see #setEp1(Double)
     * @generated
     */
    boolean isSetEp1();

    /**
     * Returns the value of the '<em><b>Ep2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second term voltage exponent for active power (<i>Ep2</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ep2</em>' attribute.
     * @see #isSetEp2()
     * @see #unsetEp2()
     * @see #setEp2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Ep2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.ep2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ep2</em>' attribute.
     * @see #isSetEp2()
     * @see #unsetEp2()
     * @see #getEp2()
     * @generated
     */
    void setEp2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEp2()
     * @see #getEp2()
     * @see #setEp2(Double)
     * @generated
     */
    void unsetEp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEp2 <em>Ep2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ep2</em>' attribute is set.
     * @see #unsetEp2()
     * @see #getEp2()
     * @see #setEp2(Double)
     * @generated
     */
    boolean isSetEp2();

    /**
     * Returns the value of the '<em><b>Eq2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second term voltage exponent for reactive power (<i>Eq2</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eq2</em>' attribute.
     * @see #isSetEq2()
     * @see #unsetEq2()
     * @see #setEq2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Eq2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.eq2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEq2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq2</em>' attribute.
     * @see #isSetEq2()
     * @see #unsetEq2()
     * @see #getEq2()
     * @generated
     */
    void setEq2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq2()
     * @see #getEq2()
     * @see #setEq2(Double)
     * @generated
     */
    void unsetEq2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq2 <em>Eq2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq2</em>' attribute is set.
     * @see #unsetEq2()
     * @see #getEq2()
     * @see #setEq2(Double)
     * @generated
     */
    boolean isSetEq2();

    /**
     * Returns the value of the '<em><b>Eq3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Third term voltage exponent for reactive power (<i>Eq3</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eq3</em>' attribute.
     * @see #isSetEq3()
     * @see #unsetEq3()
     * @see #setEq3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Eq3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.eq3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEq3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq3</em>' attribute.
     * @see #isSetEq3()
     * @see #unsetEq3()
     * @see #getEq3()
     * @generated
     */
    void setEq3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq3()
     * @see #getEq3()
     * @see #setEq3(Double)
     * @generated
     */
    void unsetEq3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq3 <em>Eq3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq3</em>' attribute is set.
     * @see #unsetEq3()
     * @see #getEq3()
     * @see #setEq3(Double)
     * @generated
     */
    boolean isSetEq3();

    /**
     * Returns the value of the '<em><b>Eq1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First term voltage exponent for reactive power (<i>Eq1</i>).  Used only when .staticLoadModelType = exponential.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eq1</em>' attribute.
     * @see #isSetEq1()
     * @see #unsetEq1()
     * @see #setEq1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Eq1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.eq1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEq1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eq1</em>' attribute.
     * @see #isSetEq1()
     * @see #unsetEq1()
     * @see #getEq1()
     * @generated
     */
    void setEq1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEq1()
     * @see #getEq1()
     * @see #setEq1(Double)
     * @generated
     */
    void unsetEq1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getEq1 <em>Eq1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eq1</em>' attribute is set.
     * @see #unsetEq1()
     * @see #getEq1()
     * @see #setEq1(Double)
     * @generated
     */
    boolean isSetEq1();

    /**
     * Returns the value of the '<em><b>Kp1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First term voltage coefficient for active power (<i>K</i><i><sub>p1</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp1</em>' attribute.
     * @see #isSetKp1()
     * @see #unsetKp1()
     * @see #setKp1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kp1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kp1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp1</em>' attribute.
     * @see #isSetKp1()
     * @see #unsetKp1()
     * @see #getKp1()
     * @generated
     */
    void setKp1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp1()
     * @see #getKp1()
     * @see #setKp1(Double)
     * @generated
     */
    void unsetKp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp1 <em>Kp1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp1</em>' attribute is set.
     * @see #unsetKp1()
     * @see #getKp1()
     * @see #setKp1(Double)
     * @generated
     */
    boolean isSetKp1();

    /**
     * Returns the value of the '<em><b>Kp2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second term voltage coefficient for active power (<i>K</i><i><sub>p2</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp2</em>' attribute.
     * @see #isSetKp2()
     * @see #unsetKp2()
     * @see #setKp2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kp2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kp2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp2</em>' attribute.
     * @see #isSetKp2()
     * @see #unsetKp2()
     * @see #getKp2()
     * @generated
     */
    void setKp2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp2()
     * @see #getKp2()
     * @see #setKp2(Double)
     * @generated
     */
    void unsetKp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp2 <em>Kp2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp2</em>' attribute is set.
     * @see #unsetKp2()
     * @see #getKp2()
     * @see #setKp2(Double)
     * @generated
     */
    boolean isSetKp2();

    /**
     * Returns the value of the '<em><b>Kq4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency coefficient for reactive power (<i>K</i><i><sub>q4</sub></i>)  (not = 0 when .staticLoadModelType = zIP2).  Used only when .staticLoadModelType - zIP2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kq4</em>' attribute.
     * @see #isSetKq4()
     * @see #unsetKq4()
     * @see #setKq4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kq4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kq4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKq4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq4</em>' attribute.
     * @see #isSetKq4()
     * @see #unsetKq4()
     * @see #getKq4()
     * @generated
     */
    void setKq4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq4()
     * @see #getKq4()
     * @see #setKq4(Double)
     * @generated
     */
    void unsetKq4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq4 <em>Kq4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq4</em>' attribute is set.
     * @see #unsetKq4()
     * @see #getKq4()
     * @see #setKq4(Double)
     * @generated
     */
    boolean isSetKq4();

    /**
     * Returns the value of the '<em><b>Kpf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency deviation coefficient for active power (<i>K</i><i><sub>pf</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpf</em>' attribute.
     * @see #isSetKpf()
     * @see #unsetKpf()
     * @see #setKpf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kpf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kpf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpf</em>' attribute.
     * @see #isSetKpf()
     * @see #unsetKpf()
     * @see #getKpf()
     * @generated
     */
    void setKpf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpf()
     * @see #getKpf()
     * @see #setKpf(Double)
     * @generated
     */
    void unsetKpf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKpf <em>Kpf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpf</em>' attribute is set.
     * @see #unsetKpf()
     * @see #getKpf()
     * @see #setKpf(Double)
     * @generated
     */
    boolean isSetKpf();

    /**
     * Returns the value of the '<em><b>Kp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Third term voltage coefficient for active power (<i>K</i><i><sub>p3</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp3</em>' attribute.
     * @see #isSetKp3()
     * @see #unsetKp3()
     * @see #setKp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kp3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kp3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp3</em>' attribute.
     * @see #isSetKp3()
     * @see #unsetKp3()
     * @see #getKp3()
     * @generated
     */
    void setKp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp3()
     * @see #getKp3()
     * @see #setKp3(Double)
     * @generated
     */
    void unsetKp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp3 <em>Kp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp3</em>' attribute is set.
     * @see #unsetKp3()
     * @see #getKp3()
     * @see #setKp3(Double)
     * @generated
     */
    boolean isSetKp3();

    /**
     * Returns the value of the '<em><b>Kp4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency coefficient for active power (<i>K</i><i><sub>p4</sub></i>)  (not = 0 if .staticLoadModelType = zIP2).  Used only when .staticLoadModelType = zIP2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp4</em>' attribute.
     * @see #isSetKp4()
     * @see #unsetKp4()
     * @see #setKp4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kp4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kp4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp4</em>' attribute.
     * @see #isSetKp4()
     * @see #unsetKp4()
     * @see #getKp4()
     * @generated
     */
    void setKp4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp4()
     * @see #getKp4()
     * @see #setKp4(Double)
     * @generated
     */
    void unsetKp4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKp4 <em>Kp4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp4</em>' attribute is set.
     * @see #unsetKp4()
     * @see #getKp4()
     * @see #setKp4(Double)
     * @generated
     */
    boolean isSetKp4();

    /**
     * Returns the value of the '<em><b>Kq2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Second term voltage coefficient for reactive power (<i>K</i><i><sub>q2</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kq2</em>' attribute.
     * @see #isSetKq2()
     * @see #unsetKq2()
     * @see #setKq2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kq2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kq2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKq2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq2</em>' attribute.
     * @see #isSetKq2()
     * @see #unsetKq2()
     * @see #getKq2()
     * @generated
     */
    void setKq2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq2()
     * @see #getKq2()
     * @see #setKq2(Double)
     * @generated
     */
    void unsetKq2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq2 <em>Kq2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq2</em>' attribute is set.
     * @see #unsetKq2()
     * @see #getKq2()
     * @see #setKq2(Double)
     * @generated
     */
    boolean isSetKq2();

    /**
     * Returns the value of the '<em><b>Kq3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Third term voltage coefficient for reactive power (<i>K</i><i><sub>q3</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kq3</em>' attribute.
     * @see #isSetKq3()
     * @see #unsetKq3()
     * @see #setKq3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kq3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kq3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKq3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq3</em>' attribute.
     * @see #isSetKq3()
     * @see #unsetKq3()
     * @see #getKq3()
     * @generated
     */
    void setKq3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq3()
     * @see #getKq3()
     * @see #setKq3(Double)
     * @generated
     */
    void unsetKq3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq3 <em>Kq3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq3</em>' attribute is set.
     * @see #unsetKq3()
     * @see #getKq3()
     * @see #setKq3(Double)
     * @generated
     */
    boolean isSetKq3();

    /**
     * Returns the value of the '<em><b>Kq1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First term voltage coefficient for reactive power (<i>K</i><i><sub>q1</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kq1</em>' attribute.
     * @see #isSetKq1()
     * @see #unsetKq1()
     * @see #setKq1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kq1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kq1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKq1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kq1</em>' attribute.
     * @see #isSetKq1()
     * @see #unsetKq1()
     * @see #getKq1()
     * @generated
     */
    void setKq1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKq1()
     * @see #getKq1()
     * @see #setKq1(Double)
     * @generated
     */
    void unsetKq1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKq1 <em>Kq1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kq1</em>' attribute is set.
     * @see #unsetKq1()
     * @see #getKq1()
     * @see #setKq1(Double)
     * @generated
     */
    boolean isSetKq1();

    /**
     * Returns the value of the '<em><b>Kqf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency deviation coefficient for reactive power (<i>K</i><i><sub>qf</sub></i>).  Not used when .staticLoadModelType = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kqf</em>' attribute.
     * @see #isSetKqf()
     * @see #unsetKqf()
     * @see #setKqf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_Kqf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.kqf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKqf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqf</em>' attribute.
     * @see #isSetKqf()
     * @see #unsetKqf()
     * @see #getKqf()
     * @generated
     */
    void setKqf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqf()
     * @see #getKqf()
     * @see #setKqf(Double)
     * @generated
     */
    void unsetKqf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getKqf <em>Kqf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqf</em>' attribute is set.
     * @see #unsetKqf()
     * @see #getKqf()
     * @see #setKqf(Double)
     * @generated
     */
    boolean isSetKqf();

    /**
     * Returns the value of the '<em><b>Load Aggregate</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate#getLoadStatic <em>Load Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Aggregate load to which this aggregate static load belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_LoadAggregate()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate#getLoadStatic
     * @model opposite="LoadStatic" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.LoadAggregate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    LoadAggregate getLoadAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @generated
     */
    void setLoadAggregate( LoadAggregate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    void unsetLoadAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getLoadAggregate <em>Load Aggregate</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Aggregate</em>' reference is set.
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    boolean isSetLoadAggregate();

    /**
     * Returns the value of the '<em><b>Static Load Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticLoadModelKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of static load model.  Typical value = constantZ.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Static Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticLoadModelKind
     * @see #isSetStaticLoadModelType()
     * @see #unsetStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadStatic_StaticLoadModelType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='LoadStatic.staticLoadModelType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StaticLoadModelKind getStaticLoadModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Load Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticLoadModelKind
     * @see #isSetStaticLoadModelType()
     * @see #unsetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @generated
     */
    void setStaticLoadModelType( StaticLoadModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @generated
     */
    void unsetStaticLoadModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic#getStaticLoadModelType <em>Static Load Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static Load Model Type</em>' attribute is set.
     * @see #unsetStaticLoadModelType()
     * @see #getStaticLoadModelType()
     * @see #setStaticLoadModelType(StaticLoadModelKind)
     * @generated
     */
    boolean isSetStaticLoadModelType();

} // LoadStatic
