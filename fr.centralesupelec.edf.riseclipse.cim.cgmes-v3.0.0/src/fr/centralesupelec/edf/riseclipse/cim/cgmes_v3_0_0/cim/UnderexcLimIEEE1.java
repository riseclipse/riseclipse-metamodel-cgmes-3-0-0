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
 * A representation of the model object '<em><b>Underexc Lim IEEE1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type UEL1 model which has a circular limit boundary when plotted in terms of machine reactive power vs. real power output.
 * Reference: IEEE UEL1 421.5-2005, 10.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1()
 * @model
 * @generated
 */
public interface UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Vurmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL maximum limit for radius phasor magnitude (<i>V</i><i><sub>URMAX</sub></i>).  Typical value = 5,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vurmax</em>' attribute.
     * @see #isSetVurmax()
     * @see #unsetVurmax()
     * @see #setVurmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vurmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vurmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVurmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vurmax</em>' attribute.
     * @see #isSetVurmax()
     * @see #unsetVurmax()
     * @see #getVurmax()
     * @generated
     */
    void setVurmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVurmax()
     * @see #getVurmax()
     * @see #setVurmax(Double)
     * @generated
     */
    void unsetVurmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vurmax</em>' attribute is set.
     * @see #unsetVurmax()
     * @see #getVurmax()
     * @see #setVurmax(Double)
     * @generated
     */
    boolean isSetVurmax();

    /**
     * Returns the value of the '<em><b>Tu1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lead time constant (<i>T</i><i><sub>U1</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tu1</em>' attribute.
     * @see #isSetTu1()
     * @see #unsetTu1()
     * @see #setTu1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Tu1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.tu1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu1</em>' attribute.
     * @see #isSetTu1()
     * @see #unsetTu1()
     * @see #getTu1()
     * @generated
     */
    void setTu1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu1()
     * @see #getTu1()
     * @see #setTu1(Double)
     * @generated
     */
    void unsetTu1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu1</em>' attribute is set.
     * @see #unsetTu1()
     * @see #getTu1()
     * @see #setTu1(Double)
     * @generated
     */
    boolean isSetTu1();

    /**
     * Returns the value of the '<em><b>Tu3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lead time constant (<i>T</i><i><sub>U3</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tu3</em>' attribute.
     * @see #isSetTu3()
     * @see #unsetTu3()
     * @see #setTu3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Tu3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.tu3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu3</em>' attribute.
     * @see #isSetTu3()
     * @see #unsetTu3()
     * @see #getTu3()
     * @generated
     */
    void setTu3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu3()
     * @see #getTu3()
     * @see #setTu3(Double)
     * @generated
     */
    void unsetTu3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu3</em>' attribute is set.
     * @see #unsetTu3()
     * @see #getTu3()
     * @see #setTu3(Double)
     * @generated
     */
    boolean isSetTu3();

    /**
     * Returns the value of the '<em><b>Tu2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lag time constant (<i>T</i><i><sub>U2</sub></i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tu2</em>' attribute.
     * @see #isSetTu2()
     * @see #unsetTu2()
     * @see #setTu2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Tu2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.tu2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu2</em>' attribute.
     * @see #isSetTu2()
     * @see #unsetTu2()
     * @see #getTu2()
     * @generated
     */
    void setTu2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu2()
     * @see #getTu2()
     * @see #setTu2(Double)
     * @generated
     */
    void unsetTu2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu2</em>' attribute is set.
     * @see #unsetTu2()
     * @see #getTu2()
     * @see #setTu2(Double)
     * @generated
     */
    boolean isSetTu2();

    /**
     * Returns the value of the '<em><b>Tu4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lag time constant (<i>T</i><i><sub>U4</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tu4</em>' attribute.
     * @see #isSetTu4()
     * @see #unsetTu4()
     * @see #setTu4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Tu4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.tu4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu4</em>' attribute.
     * @see #isSetTu4()
     * @see #unsetTu4()
     * @see #getTu4()
     * @generated
     */
    void setTu4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu4()
     * @see #getTu4()
     * @see #setTu4(Double)
     * @generated
     */
    void unsetTu4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu4</em>' attribute is set.
     * @see #unsetTu4()
     * @see #getTu4()
     * @see #setTu4(Double)
     * @generated
     */
    boolean isSetTu4();

    /**
     * Returns the value of the '<em><b>Vucmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL maximum limit for operating point phasor magnitude (<i>V</i><i><sub>UCMAX</sub></i>).  Typical value = 5,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vucmax</em>' attribute.
     * @see #isSetVucmax()
     * @see #unsetVucmax()
     * @see #setVucmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vucmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vucmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVucmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vucmax</em>' attribute.
     * @see #isSetVucmax()
     * @see #unsetVucmax()
     * @see #getVucmax()
     * @generated
     */
    void setVucmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVucmax()
     * @see #getVucmax()
     * @see #setVucmax(Double)
     * @generated
     */
    void unsetVucmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vucmax</em>' attribute is set.
     * @see #unsetVucmax()
     * @see #getVucmax()
     * @see #setVucmax(Double)
     * @generated
     */
    boolean isSetVucmax();

    /**
     * Returns the value of the '<em><b>Kur</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL radius setting (<i>K</i><i><sub>UR</sub></i>).  Typical value = 1,95.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kur</em>' attribute.
     * @see #isSetKur()
     * @see #unsetKur()
     * @see #setKur(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Kur()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.kur' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKur();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kur</em>' attribute.
     * @see #isSetKur()
     * @see #unsetKur()
     * @see #getKur()
     * @generated
     */
    void setKur( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKur()
     * @see #getKur()
     * @see #setKur(Double)
     * @generated
     */
    void unsetKur();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kur</em>' attribute is set.
     * @see #unsetKur()
     * @see #getKur()
     * @see #setKur(Double)
     * @generated
     */
    boolean isSetKur();

    /**
     * Returns the value of the '<em><b>Kuc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL centre setting (<i>K</i><i><sub>UC</sub></i>).  Typical value = 1,38.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kuc</em>' attribute.
     * @see #isSetKuc()
     * @see #unsetKuc()
     * @see #setKuc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Kuc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.kuc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKuc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kuc</em>' attribute.
     * @see #isSetKuc()
     * @see #unsetKuc()
     * @see #getKuc()
     * @generated
     */
    void setKuc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKuc()
     * @see #getKuc()
     * @see #setKuc(Double)
     * @generated
     */
    void unsetKuc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kuc</em>' attribute is set.
     * @see #unsetKuc()
     * @see #getKuc()
     * @see #setKuc(Double)
     * @generated
     */
    boolean isSetKuc();

    /**
     * Returns the value of the '<em><b>Kuf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL excitation system stabilizer gain (<i>K</i><i><sub>UF</sub></i>).  Typical value = 3,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kuf</em>' attribute.
     * @see #isSetKuf()
     * @see #unsetKuf()
     * @see #setKuf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Kuf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.kuf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKuf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kuf</em>' attribute.
     * @see #isSetKuf()
     * @see #unsetKuf()
     * @see #getKuf()
     * @generated
     */
    void setKuf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKuf()
     * @see #getKuf()
     * @see #setKuf(Double)
     * @generated
     */
    void unsetKuf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kuf</em>' attribute is set.
     * @see #unsetKuf()
     * @see #getKuf()
     * @see #setKuf(Double)
     * @generated
     */
    boolean isSetKuf();

    /**
     * Returns the value of the '<em><b>Kui</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integral gain (<i>K</i><i><sub>UI</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #setKui(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Kui()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.kui' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKui();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #getKui()
     * @generated
     */
    void setKui( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKui()
     * @see #getKui()
     * @see #setKui(Double)
     * @generated
     */
    void unsetKui();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kui</em>' attribute is set.
     * @see #unsetKui()
     * @see #getKui()
     * @see #setKui(Double)
     * @generated
     */
    boolean isSetKui();

    /**
     * Returns the value of the '<em><b>Kul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL proportional gain (<i>K</i><i><sub>UL</sub></i>).  Typical value = 100.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kul</em>' attribute.
     * @see #isSetKul()
     * @see #unsetKul()
     * @see #setKul(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Kul()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.kul' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kul</em>' attribute.
     * @see #isSetKul()
     * @see #unsetKul()
     * @see #getKul()
     * @generated
     */
    void setKul( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKul()
     * @see #getKul()
     * @see #setKul(Double)
     * @generated
     */
    void unsetKul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kul</em>' attribute is set.
     * @see #unsetKul()
     * @see #getKul()
     * @see #setKul(Double)
     * @generated
     */
    boolean isSetKul();

    /**
     * Returns the value of the '<em><b>Vulmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL output maximum limit (<i>V</i><i><sub>ULMAX</sub></i>) (&gt; UnderexcLimIEEE1.vulmin).  Typical value = 18.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vulmax</em>' attribute.
     * @see #isSetVulmax()
     * @see #unsetVulmax()
     * @see #setVulmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vulmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vulmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVulmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vulmax</em>' attribute.
     * @see #isSetVulmax()
     * @see #unsetVulmax()
     * @see #getVulmax()
     * @generated
     */
    void setVulmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmax()
     * @see #getVulmax()
     * @see #setVulmax(Double)
     * @generated
     */
    void unsetVulmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vulmax</em>' attribute is set.
     * @see #unsetVulmax()
     * @see #getVulmax()
     * @see #setVulmax(Double)
     * @generated
     */
    boolean isSetVulmax();

    /**
     * Returns the value of the '<em><b>Vulmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL output minimum limit (<i>V</i><i><sub>ULMIN</sub></i>) (&lt; UnderexcLimIEEE1.vulmax).  Typical value = -18.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vulmin</em>' attribute.
     * @see #isSetVulmin()
     * @see #unsetVulmin()
     * @see #setVulmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vulmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vulmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVulmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vulmin</em>' attribute.
     * @see #isSetVulmin()
     * @see #unsetVulmin()
     * @see #getVulmin()
     * @generated
     */
    void setVulmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmin()
     * @see #getVulmin()
     * @see #setVulmin(Double)
     * @generated
     */
    void unsetVulmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vulmin</em>' attribute is set.
     * @see #unsetVulmin()
     * @see #getVulmin()
     * @see #setVulmin(Double)
     * @generated
     */
    boolean isSetVulmin();

    /**
     * Returns the value of the '<em><b>Vuimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integrator output minimum limit (<i>V</i><i><sub>UIMIN</sub></i>) (&lt; UnderexcLimIEEE1.vuimax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #setVuimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vuimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vuimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @generated
     */
    void setVuimin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Double)
     * @generated
     */
    void unsetVuimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimin</em>' attribute is set.
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Double)
     * @generated
     */
    boolean isSetVuimin();

    /**
     * Returns the value of the '<em><b>Vuimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integrator output maximum limit (<i>V</i><i><sub>UIMAX</sub></i>) (&gt; UnderexcLimIEEE1.vuimin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #setVuimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE1_Vuimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE1.vuimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #getVuimax()
     * @generated
     */
    void setVuimax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Double)
     * @generated
     */
    void unsetVuimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimax</em>' attribute is set.
     * @see #unsetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Double)
     * @generated
     */
    boolean isSetVuimax();

} // UnderexcLimIEEE1
