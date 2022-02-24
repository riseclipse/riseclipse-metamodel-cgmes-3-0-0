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
 * A representation of the model object '<em><b>Overexc Lim IEEE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The over excitation limiter model is intended to represent the significant features of OELs necessary for some large-scale system studies. It is the result of a pragmatic approach to obtain a model that can be widely applied with attainable data from generator owners. An attempt to include all variations in the functionality of OELs and duplicate how they interact with the rest of the excitation systems would likely result in a level of application insufficient for the studies for which they are intended.
 * Reference: IEEE OEL 421.5-2005, 9.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE()
 * @model
 * @generated
 */
public interface OverexcLimIEEE extends OverexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Kcd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL cooldown gain (<i>K</i><i><sub>CD</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kcd</em>' attribute.
     * @see #isSetKcd()
     * @see #unsetKcd()
     * @see #setKcd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Kcd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.kcd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKcd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kcd</em>' attribute.
     * @see #isSetKcd()
     * @see #unsetKcd()
     * @see #getKcd()
     * @generated
     */
    void setKcd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKcd()
     * @see #getKcd()
     * @see #setKcd(Double)
     * @generated
     */
    void unsetKcd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKcd <em>Kcd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kcd</em>' attribute is set.
     * @see #unsetKcd()
     * @see #getKcd()
     * @see #setKcd(Double)
     * @generated
     */
    boolean isSetKcd();

    /**
     * Returns the value of the '<em><b>Kramp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL ramped limit rate (<i>K</i><i><sub>RAMP</sub></i>).  Unit = PU / s.  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kramp</em>' attribute.
     * @see #isSetKramp()
     * @see #unsetKramp()
     * @see #setKramp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Kramp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.kramp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKramp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kramp</em>' attribute.
     * @see #isSetKramp()
     * @see #unsetKramp()
     * @see #getKramp()
     * @generated
     */
    void setKramp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKramp()
     * @see #getKramp()
     * @see #setKramp(Double)
     * @generated
     */
    void unsetKramp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getKramp <em>Kramp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kramp</em>' attribute is set.
     * @see #unsetKramp()
     * @see #getKramp()
     * @see #setKramp(Double)
     * @generated
     */
    boolean isSetKramp();

    /**
     * Returns the value of the '<em><b>Hyst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL pickup/drop-out hysteresis (<i>HYST</i>).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hyst</em>' attribute.
     * @see #isSetHyst()
     * @see #unsetHyst()
     * @see #setHyst(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Hyst()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.hyst' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHyst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hyst</em>' attribute.
     * @see #isSetHyst()
     * @see #unsetHyst()
     * @see #getHyst()
     * @generated
     */
    void setHyst( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHyst()
     * @see #getHyst()
     * @see #setHyst(Double)
     * @generated
     */
    void unsetHyst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getHyst <em>Hyst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hyst</em>' attribute is set.
     * @see #unsetHyst()
     * @see #getHyst()
     * @see #setHyst(Double)
     * @generated
     */
    boolean isSetHyst();

    /**
     * Returns the value of the '<em><b>Ifdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL instantaneous field current limit (<i>I</i><i><sub>FDMAX</sub></i>).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifdmax</em>' attribute.
     * @see #isSetIfdmax()
     * @see #unsetIfdmax()
     * @see #setIfdmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Ifdmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.ifdmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIfdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifdmax</em>' attribute.
     * @see #isSetIfdmax()
     * @see #unsetIfdmax()
     * @see #getIfdmax()
     * @generated
     */
    void setIfdmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdmax()
     * @see #getIfdmax()
     * @see #setIfdmax(Double)
     * @generated
     */
    void unsetIfdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdmax <em>Ifdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifdmax</em>' attribute is set.
     * @see #unsetIfdmax()
     * @see #getIfdmax()
     * @see #setIfdmax(Double)
     * @generated
     */
    boolean isSetIfdmax();

    /**
     * Returns the value of the '<em><b>Ifdlim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL timed field current limit (<i>I</i><i><sub>FDLIM</sub></i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifdlim</em>' attribute.
     * @see #isSetIfdlim()
     * @see #unsetIfdlim()
     * @see #setIfdlim(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Ifdlim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.ifdlim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIfdlim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdlim()
     * @see #getIfdlim()
     * @see #setIfdlim(Double)
     * @generated
     */
    void unsetIfdlim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getIfdlim <em>Ifdlim</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Itfpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL timed field current limiter pickup level (<i>I</i><i><sub>TFPU</sub></i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Itfpu</em>' attribute.
     * @see #isSetItfpu()
     * @see #unsetItfpu()
     * @see #setItfpu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimIEEE_Itfpu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimIEEE.itfpu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getItfpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Itfpu</em>' attribute.
     * @see #isSetItfpu()
     * @see #unsetItfpu()
     * @see #getItfpu()
     * @generated
     */
    void setItfpu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetItfpu()
     * @see #getItfpu()
     * @see #setItfpu(Double)
     * @generated
     */
    void unsetItfpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE#getItfpu <em>Itfpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Itfpu</em>' attribute is set.
     * @see #unsetItfpu()
     * @see #getItfpu()
     * @see #setItfpu(Double)
     * @generated
     */
    boolean isSetItfpu();

} // OverexcLimIEEE
