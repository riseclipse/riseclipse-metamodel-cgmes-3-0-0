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
 * A representation of the model object '<em><b>Overexc Lim2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Different from LimIEEEOEL, LimOEL2 has a fixed pickup threshold and reduces the excitation set-point by means of a non-windup integral regulator.
 * <i>Irated</i> is the rated machine excitation current (calculated from nameplate conditions: <i>V</i><i><sub>nom</sub></i>, <i>P</i><i><sub>nom</sub></i>, <i>CosPhi</i><i><sub>nom</sub></i>).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getKoi <em>Koi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimax <em>Voimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimin <em>Voimin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLim2()
 * @model
 * @generated
 */
public interface OverexcLim2 extends OverexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Koi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain Over excitation limiter (<i>K</i><i><sub>OI</sub></i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Koi</em>' attribute.
     * @see #isSetKoi()
     * @see #unsetKoi()
     * @see #setKoi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLim2_Koi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLim2.koi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKoi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Koi</em>' attribute.
     * @see #isSetKoi()
     * @see #unsetKoi()
     * @see #getKoi()
     * @generated
     */
    void setKoi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKoi()
     * @see #getKoi()
     * @see #setKoi(Double)
     * @generated
     */
    void unsetKoi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getKoi <em>Koi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Koi</em>' attribute is set.
     * @see #unsetKoi()
     * @see #getKoi()
     * @see #setKoi(Double)
     * @generated
     */
    boolean isSetKoi();

    /**
     * Returns the value of the '<em><b>Ifdlim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limit value of rated field current (<i>I</i><i><sub>FDLIM</sub></i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #setIfdlim(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLim2_Ifdlim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLim2.ifdlim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIfdlim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @generated
     */
    void setIfdlim( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Double)
     * @generated
     */
    void unsetIfdlim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getIfdlim <em>Ifdlim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifdlim</em>' attribute is set.
     * @see #unsetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Double)
     * @generated
     */
    boolean isSetIfdlim();

    /**
     * Returns the value of the '<em><b>Voimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum error signal (<i>V</i><i><sub>OIMAX</sub></i>) (&gt; OverexcLim2.voimin).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voimax</em>' attribute.
     * @see #isSetVoimax()
     * @see #unsetVoimax()
     * @see #setVoimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLim2_Voimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLim2.voimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voimax</em>' attribute.
     * @see #isSetVoimax()
     * @see #unsetVoimax()
     * @see #getVoimax()
     * @generated
     */
    void setVoimax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoimax()
     * @see #getVoimax()
     * @see #setVoimax(Double)
     * @generated
     */
    void unsetVoimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimax <em>Voimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voimax</em>' attribute is set.
     * @see #unsetVoimax()
     * @see #getVoimax()
     * @see #setVoimax(Double)
     * @generated
     */
    boolean isSetVoimax();

    /**
     * Returns the value of the '<em><b>Voimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum error signal (<i>V</i><i><sub>OIMIN</sub></i>) (&lt; OverexcLim2.voimax).  Typical value = -9999.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voimin</em>' attribute.
     * @see #isSetVoimin()
     * @see #unsetVoimin()
     * @see #setVoimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLim2_Voimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLim2.voimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voimin</em>' attribute.
     * @see #isSetVoimin()
     * @see #unsetVoimin()
     * @see #getVoimin()
     * @generated
     */
    void setVoimin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoimin()
     * @see #getVoimin()
     * @see #setVoimin(Double)
     * @generated
     */
    void unsetVoimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2#getVoimin <em>Voimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voimin</em>' attribute is set.
     * @see #unsetVoimin()
     * @see #getVoimin()
     * @see #setVoimin(Double)
     * @generated
     */
    boolean isSetVoimin();

} // OverexcLim2
