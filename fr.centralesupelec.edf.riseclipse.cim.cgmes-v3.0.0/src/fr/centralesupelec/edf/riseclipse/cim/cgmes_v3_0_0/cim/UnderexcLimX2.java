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
 * A representation of the model object '<em><b>Underexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <font color="#0f0f0f">Westinghouse minimum excitation limiter.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getQo <em>Qo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2()
 * @model
 * @generated
 */
public interface UnderexcLimX2 extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Km</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum excitation limit gain (<i>K</i><i><sub>M</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Km</em>' attribute.
     * @see #isSetKm()
     * @see #unsetKm()
     * @see #setKm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Km()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.km' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Km</em>' attribute.
     * @see #isSetKm()
     * @see #unsetKm()
     * @see #getKm()
     * @generated
     */
    void setKm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKm()
     * @see #getKm()
     * @see #setKm(Double)
     * @generated
     */
    void unsetKm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKm <em>Km</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Km</em>' attribute is set.
     * @see #unsetKm()
     * @see #getKm()
     * @see #setKm(Double)
     * @generated
     */
    boolean isSetKm();

    /**
     * Returns the value of the '<em><b>Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum excitation limit time constant (<i>T</i><i><sub>M</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #setTm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Tm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.tm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #getTm()
     * @generated
     */
    void setTm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTm()
     * @see #getTm()
     * @see #setTm(Double)
     * @generated
     */
    void unsetTm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTm <em>Tm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tm</em>' attribute is set.
     * @see #unsetTm()
     * @see #getTm()
     * @see #setTm(Double)
     * @generated
     */
    boolean isSetTm();

    /**
     * Returns the value of the '<em><b>Qo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation centre setting (<i>Q</i><i><sub>O</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qo</em>' attribute.
     * @see #isSetQo()
     * @see #unsetQo()
     * @see #setQo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Qo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.qo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qo</em>' attribute.
     * @see #isSetQo()
     * @see #unsetQo()
     * @see #getQo()
     * @generated
     */
    void setQo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQo()
     * @see #getQo()
     * @see #setQo(Double)
     * @generated
     */
    void unsetQo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getQo <em>Qo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qo</em>' attribute is set.
     * @see #unsetQo()
     * @see #getQo()
     * @see #setQo(Double)
     * @generated
     */
    boolean isSetQo();

    /**
     * Returns the value of the '<em><b>Melmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum excitation limit value (<i>MELMAX</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Melmax</em>' attribute.
     * @see #isSetMelmax()
     * @see #unsetMelmax()
     * @see #setMelmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Melmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.melmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMelmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Melmax</em>' attribute.
     * @see #isSetMelmax()
     * @see #unsetMelmax()
     * @see #getMelmax()
     * @generated
     */
    void setMelmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Double)
     * @generated
     */
    void unsetMelmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getMelmax <em>Melmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Melmax</em>' attribute is set.
     * @see #unsetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Double)
     * @generated
     */
    boolean isSetMelmax();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation radius (<i>R</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getR <em>R</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getR <em>R</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Differential time constant (<i>T</i><i><sub>F2</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #setTf2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Tf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.tf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    void unsetTf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getTf2 <em>Tf2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Differential gain (<i>K</i><i><sub>F2</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf2</em>' attribute.
     * @see #isSetKf2()
     * @see #unsetKf2()
     * @see #setKf2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX2_Kf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX2.kf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf2</em>' attribute.
     * @see #isSetKf2()
     * @see #unsetKf2()
     * @see #getKf2()
     * @generated
     */
    void setKf2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf2()
     * @see #getKf2()
     * @see #setKf2(Double)
     * @generated
     */
    void unsetKf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2#getKf2 <em>Kf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf2</em>' attribute is set.
     * @see #unsetKf2()
     * @see #getKf2()
     * @see #setKf2(Double)
     * @generated
     */
    boolean isSetKf2();

} // UnderexcLimX2
