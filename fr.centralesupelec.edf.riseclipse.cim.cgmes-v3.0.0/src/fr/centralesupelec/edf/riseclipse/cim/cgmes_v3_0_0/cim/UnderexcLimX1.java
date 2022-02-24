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
 * A representation of the model object '<em><b>Underexc Lim X1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <font color="#0f0f0f">Allis-Chalmers minimum excitation limiter.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKf2 <em>Kf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getMelmax <em>Melmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1()
 * @model
 * @generated
 */
public interface UnderexcLimX1 extends UnderexcitationLimiterDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_Kf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.kf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKf2 <em>Kf2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKf2 <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf2()
     * @see #getKf2()
     * @see #setKf2(Double)
     * @generated
     */
    void unsetKf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKf2 <em>Kf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf2</em>' attribute is set.
     * @see #unsetKf2()
     * @see #getKf2()
     * @see #setKf2(Double)
     * @generated
     */
    boolean isSetKf2();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum excitation limit slope (<i>K</i>) (&gt; 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_K()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.k' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getK <em>K</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getK <em>K</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_Tf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.tf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTf2 <em>Tf2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    void unsetTf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTf2 <em>Tf2</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_Km()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.km' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKm <em>Km</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKm <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKm()
     * @see #getKm()
     * @see #setKm(Double)
     * @generated
     */
    void unsetKm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getKm <em>Km</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_Tm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.tm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTm <em>Tm</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTm()
     * @see #getTm()
     * @see #setTm(Double)
     * @generated
     */
    void unsetTm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getTm <em>Tm</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimX1_Melmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimX1.melmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMelmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getMelmax <em>Melmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getMelmax <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Double)
     * @generated
     */
    void unsetMelmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX1#getMelmax <em>Melmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Melmax</em>' attribute is set.
     * @see #unsetMelmax()
     * @see #getMelmax()
     * @see #setMelmax(Double)
     * @generated
     */
    boolean isSetMelmax();

} // UnderexcLimX1
