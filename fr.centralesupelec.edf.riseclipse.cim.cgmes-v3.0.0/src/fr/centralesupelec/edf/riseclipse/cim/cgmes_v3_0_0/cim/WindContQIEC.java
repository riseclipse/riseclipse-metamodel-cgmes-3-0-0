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
 * A representation of the model object '<em><b>Wind Cont QIEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Q control model.
 * Reference: IEC 61400-27-1:2015, 5.6.5.7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiu <em>Kiu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiq <em>Kiq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUref0 <em>Uref0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKqv <em>Kqv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpu <em>Kpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpq <em>Kpq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqpost <em>Iqpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpost <em>Tpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTqord <em>Tqord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmax <em>Iqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmin <em>Umin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmax <em>Umax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getXdroop <em>Xdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb1 <em>Udb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb2 <em>Udb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindUVRTQcontrolModesType <em>Wind UVRT Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUqdip <em>Uqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTufiltq <em>Tufiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpfiltq <em>Tpfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getRdroop <em>Rdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmin <em>Iqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC()
 * @model
 * @generated
 */
public interface WindContQIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kiu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage PI controller integration gain (<i>K</i><i><sub>I,u</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiu</em>' attribute.
     * @see #isSetKiu()
     * @see #unsetKiu()
     * @see #setKiu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Kiu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.kiu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiu</em>' attribute.
     * @see #isSetKiu()
     * @see #unsetKiu()
     * @see #getKiu()
     * @generated
     */
    void setKiu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiu()
     * @see #getKiu()
     * @see #setKiu(Double)
     * @generated
     */
    void unsetKiu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiu <em>Kiu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiu</em>' attribute is set.
     * @see #unsetKiu()
     * @see #getKiu()
     * @see #setKiu(Double)
     * @generated
     */
    boolean isSetKiu();

    /**
     * Returns the value of the '<em><b>Kiq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power PI controller integration gain (<i>K</i><i><sub>I,q</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiq</em>' attribute.
     * @see #isSetKiq()
     * @see #unsetKiq()
     * @see #setKiq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Kiq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.kiq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiq</em>' attribute.
     * @see #isSetKiq()
     * @see #unsetKiq()
     * @see #getKiq()
     * @generated
     */
    void setKiq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiq()
     * @see #getKiq()
     * @see #setKiq(Double)
     * @generated
     */
    void unsetKiq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKiq <em>Kiq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiq</em>' attribute is set.
     * @see #unsetKiq()
     * @see #getKiq()
     * @see #setKiq(Double)
     * @generated
     */
    boolean isSetKiq();

    /**
     * Returns the value of the '<em><b>Uref0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * User-defined bias in voltage reference (<i>u</i><i><sub>ref0</sub></i>). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uref0</em>' attribute.
     * @see #isSetUref0()
     * @see #unsetUref0()
     * @see #setUref0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Uref0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.uref0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUref0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uref0</em>' attribute.
     * @see #isSetUref0()
     * @see #unsetUref0()
     * @see #getUref0()
     * @generated
     */
    void setUref0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUref0()
     * @see #getUref0()
     * @see #setUref0(Double)
     * @generated
     */
    void unsetUref0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUref0 <em>Uref0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uref0</em>' attribute is set.
     * @see #unsetUref0()
     * @see #getUref0()
     * @see #setUref0(Double)
     * @generated
     */
    boolean isSetUref0();

    /**
     * Returns the value of the '<em><b>Kqv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage scaling factor for UVRT current (<i>K</i><i><sub>qv</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kqv</em>' attribute.
     * @see #isSetKqv()
     * @see #unsetKqv()
     * @see #setKqv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Kqv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.kqv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKqv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqv</em>' attribute.
     * @see #isSetKqv()
     * @see #unsetKqv()
     * @see #getKqv()
     * @generated
     */
    void setKqv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqv()
     * @see #getKqv()
     * @see #setKqv(Double)
     * @generated
     */
    void unsetKqv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKqv <em>Kqv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqv</em>' attribute is set.
     * @see #unsetKqv()
     * @see #getKqv()
     * @see #setKqv(Double)
     * @generated
     */
    boolean isSetKqv();

    /**
     * Returns the value of the '<em><b>Kpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage PI controller proportional gain (<i>K</i><i><sub>P,u</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpu</em>' attribute.
     * @see #isSetKpu()
     * @see #unsetKpu()
     * @see #setKpu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Kpu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.kpu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpu</em>' attribute.
     * @see #isSetKpu()
     * @see #unsetKpu()
     * @see #getKpu()
     * @generated
     */
    void setKpu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpu()
     * @see #getKpu()
     * @see #setKpu(Double)
     * @generated
     */
    void unsetKpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpu <em>Kpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpu</em>' attribute is set.
     * @see #unsetKpu()
     * @see #getKpu()
     * @see #setKpu(Double)
     * @generated
     */
    boolean isSetKpu();

    /**
     * Returns the value of the '<em><b>Kpq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power PI controller proportional gain (<i>K</i><i><sub>P,q</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpq</em>' attribute.
     * @see #isSetKpq()
     * @see #unsetKpq()
     * @see #setKpq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Kpq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.kpq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpq</em>' attribute.
     * @see #isSetKpq()
     * @see #unsetKpq()
     * @see #getKpq()
     * @generated
     */
    void setKpq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpq()
     * @see #getKpq()
     * @see #setKpq(Double)
     * @generated
     */
    void unsetKpq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getKpq <em>Kpq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpq</em>' attribute is set.
     * @see #unsetKpq()
     * @see #getKpq()
     * @see #setKpq(Double)
     * @generated
     */
    boolean isSetKpq();

    /**
     * Returns the value of the '<em><b>Iqpost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Post fault reactive current injection (<i>i</i><i><sub>qpost</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iqpost</em>' attribute.
     * @see #isSetIqpost()
     * @see #unsetIqpost()
     * @see #setIqpost(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Iqpost()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.iqpost' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIqpost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqpost</em>' attribute.
     * @see #isSetIqpost()
     * @see #unsetIqpost()
     * @see #getIqpost()
     * @generated
     */
    void setIqpost( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqpost()
     * @see #getIqpost()
     * @see #setIqpost(Double)
     * @generated
     */
    void unsetIqpost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqpost <em>Iqpost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqpost</em>' attribute is set.
     * @see #unsetIqpost()
     * @see #getIqpost()
     * @see #setIqpost(Double)
     * @generated
     */
    boolean isSetIqpost();

    /**
     * Returns the value of the '<em><b>Tpost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Length of time period where post fault reactive power is injected (<i>T</i><i><sub>post</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpost</em>' attribute.
     * @see #isSetTpost()
     * @see #unsetTpost()
     * @see #setTpost(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Tpost()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.tpost' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpost</em>' attribute.
     * @see #isSetTpost()
     * @see #unsetTpost()
     * @see #getTpost()
     * @generated
     */
    void setTpost( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpost()
     * @see #getTpost()
     * @see #setTpost(Double)
     * @generated
     */
    void unsetTpost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpost <em>Tpost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpost</em>' attribute is set.
     * @see #unsetTpost()
     * @see #getTpost()
     * @see #setTpost(Double)
     * @generated
     */
    boolean isSetTpost();

    /**
     * Returns the value of the '<em><b>Wind Qcontrol Modes Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindQcontrolModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Types of general wind turbine Q control modes (<i>M</i><i><sub>qG</sub></i>).  It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindQcontrolModeKind
     * @see #isSetWindQcontrolModesType()
     * @see #unsetWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_WindQcontrolModesType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.windQcontrolModesType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindQcontrolModeKind getWindQcontrolModesType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindQcontrolModeKind
     * @see #isSetWindQcontrolModesType()
     * @see #unsetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @generated
     */
    void setWindQcontrolModesType( WindQcontrolModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModeKind)
     * @generated
     */
    void unsetWindQcontrolModesType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Qcontrol Modes Type</em>' attribute is set.
     * @see #unsetWindQcontrolModesType()
     * @see #getWindQcontrolModesType()
     * @see #setWindQcontrolModesType(WindQcontrolModeKind)
     * @generated
     */
    boolean isSetWindQcontrolModesType();

    /**
     * Returns the value of the '<em><b>Tqord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in reactive power order lag (<i>T</i><i><sub>qord</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tqord</em>' attribute.
     * @see #isSetTqord()
     * @see #unsetTqord()
     * @see #setTqord(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Tqord()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.tqord' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTqord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tqord</em>' attribute.
     * @see #isSetTqord()
     * @see #unsetTqord()
     * @see #getTqord()
     * @generated
     */
    void setTqord( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTqord()
     * @see #getTqord()
     * @see #setTqord(Double)
     * @generated
     */
    void unsetTqord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTqord <em>Tqord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tqord</em>' attribute is set.
     * @see #unsetTqord()
     * @see #getTqord()
     * @see #setTqord(Double)
     * @generated
     */
    boolean isSetTqord();

    /**
     * Returns the value of the '<em><b>Iqmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive current injection (<i>i</i><i><sub>qmax</sub></i>) (&gt; WindContQIEC.iqmin). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iqmax</em>' attribute.
     * @see #isSetIqmax()
     * @see #unsetIqmax()
     * @see #setIqmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Iqmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.iqmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIqmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqmax</em>' attribute.
     * @see #isSetIqmax()
     * @see #unsetIqmax()
     * @see #getIqmax()
     * @generated
     */
    void setIqmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqmax()
     * @see #getIqmax()
     * @see #setIqmax(Double)
     * @generated
     */
    void unsetIqmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmax <em>Iqmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqmax</em>' attribute is set.
     * @see #unsetIqmax()
     * @see #getIqmax()
     * @see #setIqmax(Double)
     * @generated
     */
    boolean isSetIqmax();

    /**
     * Returns the value of the '<em><b>Iqh1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive current injection during dip (<i>i</i><i><sub>qh1</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iqh1</em>' attribute.
     * @see #isSetIqh1()
     * @see #unsetIqh1()
     * @see #setIqh1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Iqh1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.iqh1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIqh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqh1</em>' attribute.
     * @see #isSetIqh1()
     * @see #unsetIqh1()
     * @see #getIqh1()
     * @generated
     */
    void setIqh1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqh1()
     * @see #getIqh1()
     * @see #setIqh1(Double)
     * @generated
     */
    void unsetIqh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqh1 <em>Iqh1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqh1</em>' attribute is set.
     * @see #unsetIqh1()
     * @see #getIqh1()
     * @see #setIqh1(Double)
     * @generated
     */
    boolean isSetIqh1();

    /**
     * Returns the value of the '<em><b>Umin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage in voltage PI controller integral term (<i>u</i><i><sub>min</sub></i>) (&lt; WindContQIEC.umax). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Umin</em>' attribute.
     * @see #isSetUmin()
     * @see #unsetUmin()
     * @see #setUmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Umin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.umin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Umin</em>' attribute.
     * @see #isSetUmin()
     * @see #unsetUmin()
     * @see #getUmin()
     * @generated
     */
    void setUmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmin()
     * @see #getUmin()
     * @see #setUmin(Double)
     * @generated
     */
    void unsetUmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmin <em>Umin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Umin</em>' attribute is set.
     * @see #unsetUmin()
     * @see #getUmin()
     * @see #setUmin(Double)
     * @generated
     */
    boolean isSetUmin();

    /**
     * Returns the value of the '<em><b>Umax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage in voltage PI controller integral term (<i>u</i><i><sub>max</sub></i>) (&gt; WindContQIEC.umin). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Umax</em>' attribute.
     * @see #isSetUmax()
     * @see #unsetUmax()
     * @see #setUmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Umax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.umax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Umax</em>' attribute.
     * @see #isSetUmax()
     * @see #unsetUmax()
     * @see #getUmax()
     * @generated
     */
    void setUmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUmax()
     * @see #getUmax()
     * @see #setUmax(Double)
     * @generated
     */
    void unsetUmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUmax <em>Umax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Umax</em>' attribute is set.
     * @see #unsetUmax()
     * @see #getUmax()
     * @see #setUmax(Double)
     * @generated
     */
    boolean isSetUmax();

    /**
     * Returns the value of the '<em><b>Xdroop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inductive component of voltage drop impedance (<i>x</i><i><sub>droop</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xdroop</em>' attribute.
     * @see #isSetXdroop()
     * @see #unsetXdroop()
     * @see #setXdroop(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Xdroop()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.xdroop' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXdroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xdroop</em>' attribute.
     * @see #isSetXdroop()
     * @see #unsetXdroop()
     * @see #getXdroop()
     * @generated
     */
    void setXdroop( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXdroop()
     * @see #getXdroop()
     * @see #setXdroop(Double)
     * @generated
     */
    void unsetXdroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getXdroop <em>Xdroop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xdroop</em>' attribute is set.
     * @see #unsetXdroop()
     * @see #getXdroop()
     * @see #setXdroop(Double)
     * @generated
     */
    boolean isSetXdroop();

    /**
     * Returns the value of the '<em><b>Udb1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage deadband lower limit (<i>u</i><i><sub>db1</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Udb1</em>' attribute.
     * @see #isSetUdb1()
     * @see #unsetUdb1()
     * @see #setUdb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Udb1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.udb1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUdb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udb1</em>' attribute.
     * @see #isSetUdb1()
     * @see #unsetUdb1()
     * @see #getUdb1()
     * @generated
     */
    void setUdb1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdb1()
     * @see #getUdb1()
     * @see #setUdb1(Double)
     * @generated
     */
    void unsetUdb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb1 <em>Udb1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udb1</em>' attribute is set.
     * @see #unsetUdb1()
     * @see #getUdb1()
     * @see #setUdb1(Double)
     * @generated
     */
    boolean isSetUdb1();

    /**
     * Returns the value of the '<em><b>Udb2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage deadband upper limit (<i>u</i><i><sub>db2</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Udb2</em>' attribute.
     * @see #isSetUdb2()
     * @see #unsetUdb2()
     * @see #setUdb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Udb2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.udb2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUdb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udb2</em>' attribute.
     * @see #isSetUdb2()
     * @see #unsetUdb2()
     * @see #getUdb2()
     * @generated
     */
    void setUdb2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdb2()
     * @see #getUdb2()
     * @see #setUdb2(Double)
     * @generated
     */
    void unsetUdb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUdb2 <em>Udb2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udb2</em>' attribute is set.
     * @see #unsetUdb2()
     * @see #getUdb2()
     * @see #setUdb2(Double)
     * @generated
     */
    boolean isSetUdb2();

    /**
     * Returns the value of the '<em><b>Wind UVRT Qcontrol Modes Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindUVRTQcontrolModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Types of UVRT Q control modes (<i>M</i><i><sub>qUVRT</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind UVRT Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindUVRTQcontrolModeKind
     * @see #isSetWindUVRTQcontrolModesType()
     * @see #unsetWindUVRTQcontrolModesType()
     * @see #setWindUVRTQcontrolModesType(WindUVRTQcontrolModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_WindUVRTQcontrolModesType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.windUVRTQcontrolModesType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindUVRTQcontrolModeKind getWindUVRTQcontrolModesType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindUVRTQcontrolModesType <em>Wind UVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind UVRT Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindUVRTQcontrolModeKind
     * @see #isSetWindUVRTQcontrolModesType()
     * @see #unsetWindUVRTQcontrolModesType()
     * @see #getWindUVRTQcontrolModesType()
     * @generated
     */
    void setWindUVRTQcontrolModesType( WindUVRTQcontrolModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindUVRTQcontrolModesType <em>Wind UVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindUVRTQcontrolModesType()
     * @see #getWindUVRTQcontrolModesType()
     * @see #setWindUVRTQcontrolModesType(WindUVRTQcontrolModeKind)
     * @generated
     */
    void unsetWindUVRTQcontrolModesType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindUVRTQcontrolModesType <em>Wind UVRT Qcontrol Modes Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind UVRT Qcontrol Modes Type</em>' attribute is set.
     * @see #unsetWindUVRTQcontrolModesType()
     * @see #getWindUVRTQcontrolModesType()
     * @see #setWindUVRTQcontrolModesType(WindUVRTQcontrolModeKind)
     * @generated
     */
    boolean isSetWindUVRTQcontrolModesType();

    /**
     * Returns the value of the '<em><b>Uqdip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage threshold for UVRT detection in Q control (<i>u</i><i><sub>qdip</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uqdip</em>' attribute.
     * @see #isSetUqdip()
     * @see #unsetUqdip()
     * @see #setUqdip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Uqdip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.uqdip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUqdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uqdip</em>' attribute.
     * @see #isSetUqdip()
     * @see #unsetUqdip()
     * @see #getUqdip()
     * @generated
     */
    void setUqdip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUqdip()
     * @see #getUqdip()
     * @see #setUqdip(Double)
     * @generated
     */
    void unsetUqdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getUqdip <em>Uqdip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uqdip</em>' attribute is set.
     * @see #unsetUqdip()
     * @see #getUqdip()
     * @see #setUqdip(Double)
     * @generated
     */
    boolean isSetUqdip();

    /**
     * Returns the value of the '<em><b>Tufiltq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage measurement filter time constant (<i>T</i><i><sub>ufiltq</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tufiltq</em>' attribute.
     * @see #isSetTufiltq()
     * @see #unsetTufiltq()
     * @see #setTufiltq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Tufiltq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.tufiltq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTufiltq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTufiltq <em>Tufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltq</em>' attribute.
     * @see #isSetTufiltq()
     * @see #unsetTufiltq()
     * @see #getTufiltq()
     * @generated
     */
    void setTufiltq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTufiltq <em>Tufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltq()
     * @see #getTufiltq()
     * @see #setTufiltq(Double)
     * @generated
     */
    void unsetTufiltq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTufiltq <em>Tufiltq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltq</em>' attribute is set.
     * @see #unsetTufiltq()
     * @see #getTufiltq()
     * @see #setTufiltq(Double)
     * @generated
     */
    boolean isSetTufiltq();

    /**
     * Returns the value of the '<em><b>Tpfiltq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power measurement filter time constant (<i>T</i><i><sub>pfiltq</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpfiltq</em>' attribute.
     * @see #isSetTpfiltq()
     * @see #unsetTpfiltq()
     * @see #setTpfiltq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Tpfiltq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.tpfiltq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpfiltq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpfiltq <em>Tpfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfiltq</em>' attribute.
     * @see #isSetTpfiltq()
     * @see #unsetTpfiltq()
     * @see #getTpfiltq()
     * @generated
     */
    void setTpfiltq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpfiltq <em>Tpfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfiltq()
     * @see #getTpfiltq()
     * @see #setTpfiltq(Double)
     * @generated
     */
    void unsetTpfiltq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getTpfiltq <em>Tpfiltq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfiltq</em>' attribute is set.
     * @see #unsetTpfiltq()
     * @see #getTpfiltq()
     * @see #setTpfiltq(Double)
     * @generated
     */
    boolean isSetTpfiltq();

    /**
     * Returns the value of the '<em><b>Rdroop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistive component of voltage drop impedance (<i>r</i><i><sub>droop</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rdroop</em>' attribute.
     * @see #isSetRdroop()
     * @see #unsetRdroop()
     * @see #setRdroop(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Rdroop()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.rdroop' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRdroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rdroop</em>' attribute.
     * @see #isSetRdroop()
     * @see #unsetRdroop()
     * @see #getRdroop()
     * @generated
     */
    void setRdroop( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRdroop()
     * @see #getRdroop()
     * @see #setRdroop(Double)
     * @generated
     */
    void unsetRdroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getRdroop <em>Rdroop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rdroop</em>' attribute is set.
     * @see #unsetRdroop()
     * @see #getRdroop()
     * @see #setRdroop(Double)
     * @generated
     */
    boolean isSetRdroop();

    /**
     * Returns the value of the '<em><b>Iqmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive current injection (<i>i</i><i><sub>qmin</sub></i>) (&lt; WindContQIEC.iqmax). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Iqmin</em>' attribute.
     * @see #isSetIqmin()
     * @see #unsetIqmin()
     * @see #setIqmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_Iqmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.iqmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIqmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Iqmin</em>' attribute.
     * @see #isSetIqmin()
     * @see #unsetIqmin()
     * @see #getIqmin()
     * @generated
     */
    void setIqmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIqmin()
     * @see #getIqmin()
     * @see #setIqmin(Double)
     * @generated
     */
    void unsetIqmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getIqmin <em>Iqmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Iqmin</em>' attribute is set.
     * @see #unsetIqmin()
     * @see #getIqmin()
     * @see #setIqmin(Double)
     * @generated
     */
    boolean isSetIqmin();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 or type 4 model with which this reactive control model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContQIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWIndContQIEC
     * @model opposite="WIndContQIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContQIEC.WindTurbineType3or4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @generated
     */
    void setWindTurbineType3or4IEC( WindTurbineType3or4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    boolean isSetWindTurbineType3or4IEC();

} // WindContQIEC
