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
 * A representation of the model object '<em><b>Underexc Lim IEEE2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type UEL2 underexcitation limiter which has either a straight-line or multi-segment characteristic when plotted in terms of machine reactive power output vs. real power output.
 * Reference: IEEE UEL2 421.5-2005, 10.2  (limit characteristic lookup table shown in Figure 10.4 (p 32)).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKfb <em>Kfb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmin <em>Vulmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmax <em>Vulmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP10 <em>P10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimin <em>Vuimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ10 <em>Q10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuq <em>Tuq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTup <em>Tup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTul <em>Tul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuv <em>Tuv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu4 <em>Tu4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu3 <em>Tu3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu2 <em>Tu2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu1 <em>Tu1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKul <em>Kul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKuf <em>Kuf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP5 <em>P5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP4 <em>P4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP7 <em>P7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP6 <em>P6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP9 <em>P9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP8 <em>P8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP3 <em>P3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP2 <em>P2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ6 <em>Q6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ5 <em>Q5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ8 <em>Q8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ7 <em>Q7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ9 <em>Q9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ2 <em>Q2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ4 <em>Q4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ3 <em>Q3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK1 <em>K1</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2()
 * @model
 * @generated
 */
public interface UnderexcLimIEEE2 extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Kfb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain associated with optional integrator feedback input signal to UEL (<i>K</i><i><sub>FB</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kfb</em>' attribute.
     * @see #isSetKfb()
     * @see #unsetKfb()
     * @see #setKfb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Kfb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.kfb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKfb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKfb <em>Kfb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kfb</em>' attribute.
     * @see #isSetKfb()
     * @see #unsetKfb()
     * @see #getKfb()
     * @generated
     */
    void setKfb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKfb <em>Kfb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKfb()
     * @see #getKfb()
     * @see #setKfb(Double)
     * @generated
     */
    void unsetKfb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKfb <em>Kfb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kfb</em>' attribute is set.
     * @see #unsetKfb()
     * @see #getKfb()
     * @see #setKfb(Double)
     * @generated
     */
    boolean isSetKfb();

    /**
     * Returns the value of the '<em><b>Vulmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL output minimum limit (<i>V</i><i><sub>ULMIN</sub></i>) (&lt; UnderexcLimIEEE2.vulmax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vulmin</em>' attribute.
     * @see #isSetVulmin()
     * @see #unsetVulmin()
     * @see #setVulmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Vulmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.vulmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVulmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmin <em>Vulmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmin <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmin()
     * @see #getVulmin()
     * @see #setVulmin(Double)
     * @generated
     */
    void unsetVulmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmin <em>Vulmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vulmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL output maximum limit (<i>V</i><i><sub>ULMAX</sub></i>) (&gt; UnderexcLimIEEE2.vulmin).  Typical value = 0,25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vulmax</em>' attribute.
     * @see #isSetVulmax()
     * @see #unsetVulmax()
     * @see #setVulmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Vulmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.vulmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVulmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmax <em>Vulmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmax <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmax()
     * @see #getVulmax()
     * @see #setVulmax(Double)
     * @generated
     */
    void unsetVulmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVulmax <em>Vulmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vuimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integrator output maximum limit (<i>V</i><i><sub>UIMAX</sub></i>) (&gt; UnderexcLimIEEE2.vuimin).  Typical value = 0,25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #setVuimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Vuimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.vuimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimax <em>Vuimax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Double)
     * @generated
     */
    void unsetVuimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimax <em>Vuimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimax</em>' attribute is set.
     * @see #unsetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Double)
     * @generated
     */
    boolean isSetVuimax();

    /**
     * Returns the value of the '<em><b>P10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>10</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P10</em>' attribute.
     * @see #isSetP10()
     * @see #unsetP10()
     * @see #setP10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP10 <em>P10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P10</em>' attribute.
     * @see #isSetP10()
     * @see #unsetP10()
     * @see #getP10()
     * @generated
     */
    void setP10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP10 <em>P10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP10()
     * @see #getP10()
     * @see #setP10(Double)
     * @generated
     */
    void unsetP10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP10 <em>P10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P10</em>' attribute is set.
     * @see #unsetP10()
     * @see #getP10()
     * @see #setP10(Double)
     * @generated
     */
    boolean isSetP10();

    /**
     * Returns the value of the '<em><b>Vuimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integrator output minimum limit (<i>V</i><i><sub>UIMIN</sub></i>) (&lt; UnderexcLimIEEE2.vuimax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #setVuimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Vuimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.vuimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimin <em>Vuimin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Double)
     * @generated
     */
    void unsetVuimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getVuimin <em>Vuimin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Q10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>10</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q10</em>' attribute.
     * @see #isSetQ10()
     * @see #unsetQ10()
     * @see #setQ10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ10 <em>Q10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q10</em>' attribute.
     * @see #isSetQ10()
     * @see #unsetQ10()
     * @see #getQ10()
     * @generated
     */
    void setQ10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ10 <em>Q10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ10()
     * @see #getQ10()
     * @see #setQ10(Double)
     * @generated
     */
    void unsetQ10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ10 <em>Q10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q10</em>' attribute is set.
     * @see #unsetQ10()
     * @see #getQ10()
     * @see #setQ10(Double)
     * @generated
     */
    boolean isSetQ10();

    /**
     * Returns the value of the '<em><b>Tuq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power filter time constant (<i>T</i><i><sub>UQ</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tuq</em>' attribute.
     * @see #isSetTuq()
     * @see #unsetTuq()
     * @see #setTuq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tuq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tuq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTuq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuq <em>Tuq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tuq</em>' attribute.
     * @see #isSetTuq()
     * @see #unsetTuq()
     * @see #getTuq()
     * @generated
     */
    void setTuq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuq <em>Tuq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTuq()
     * @see #getTuq()
     * @see #setTuq(Double)
     * @generated
     */
    void unsetTuq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuq <em>Tuq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tuq</em>' attribute is set.
     * @see #unsetTuq()
     * @see #getTuq()
     * @see #setTuq(Double)
     * @generated
     */
    boolean isSetTuq();

    /**
     * Returns the value of the '<em><b>Tup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power filter time constant (<i>T</i><i><sub>UP</sub></i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tup</em>' attribute.
     * @see #isSetTup()
     * @see #unsetTup()
     * @see #setTup(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tup()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTup <em>Tup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tup</em>' attribute.
     * @see #isSetTup()
     * @see #unsetTup()
     * @see #getTup()
     * @generated
     */
    void setTup( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTup <em>Tup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTup()
     * @see #getTup()
     * @see #setTup(Double)
     * @generated
     */
    void unsetTup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTup <em>Tup</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tup</em>' attribute is set.
     * @see #unsetTup()
     * @see #getTup()
     * @see #setTup(Double)
     * @generated
     */
    boolean isSetTup();

    /**
     * Returns the value of the '<em><b>Tul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant associated with optional integrator feedback input signal to UEL (<i>T</i><i><sub>UL</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tul</em>' attribute.
     * @see #isSetTul()
     * @see #unsetTul()
     * @see #setTul(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tul()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tul' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTul <em>Tul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tul</em>' attribute.
     * @see #isSetTul()
     * @see #unsetTul()
     * @see #getTul()
     * @generated
     */
    void setTul( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTul <em>Tul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTul()
     * @see #getTul()
     * @see #setTul(Double)
     * @generated
     */
    void unsetTul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTul <em>Tul</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tul</em>' attribute is set.
     * @see #unsetTul()
     * @see #getTul()
     * @see #setTul(Double)
     * @generated
     */
    boolean isSetTul();

    /**
     * Returns the value of the '<em><b>Tuv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage filter time constant (<i>T</i><i><sub>UV</sub></i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tuv</em>' attribute.
     * @see #isSetTuv()
     * @see #unsetTuv()
     * @see #setTuv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tuv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tuv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTuv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuv <em>Tuv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tuv</em>' attribute.
     * @see #isSetTuv()
     * @see #unsetTuv()
     * @see #getTuv()
     * @generated
     */
    void setTuv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuv <em>Tuv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTuv()
     * @see #getTuv()
     * @see #setTuv(Double)
     * @generated
     */
    void unsetTuv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTuv <em>Tuv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tuv</em>' attribute is set.
     * @see #unsetTuv()
     * @see #getTuv()
     * @see #setTuv(Double)
     * @generated
     */
    boolean isSetTuv();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tu4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tu4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu4 <em>Tu4</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu4 <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu4()
     * @see #getTu4()
     * @see #setTu4(Double)
     * @generated
     */
    void unsetTu4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu4 <em>Tu4</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tu3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tu3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu3 <em>Tu3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu3 <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu3()
     * @see #getTu3()
     * @see #setTu3(Double)
     * @generated
     */
    void unsetTu3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu3 <em>Tu3</em>}' attribute is set.
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
     * UEL lag time constant (<i>T</i><i><sub>U2</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tu2</em>' attribute.
     * @see #isSetTu2()
     * @see #unsetTu2()
     * @see #setTu2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tu2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tu2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu2 <em>Tu2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu2 <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu2()
     * @see #getTu2()
     * @see #setTu2(Double)
     * @generated
     */
    void unsetTu2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu2 <em>Tu2</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Tu1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.tu1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTu1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu1 <em>Tu1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu1 <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu1()
     * @see #getTu1()
     * @see #setTu1(Double)
     * @generated
     */
    void unsetTu1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getTu1 <em>Tu1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL proportional gain (<i>K</i><i><sub>UL</sub></i>).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kul</em>' attribute.
     * @see #isSetKul()
     * @see #unsetKul()
     * @see #setKul(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Kul()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.kul' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKul <em>Kul</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKul <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKul()
     * @see #getKul()
     * @see #setKul(Double)
     * @generated
     */
    void unsetKul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKul <em>Kul</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kui</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL integral gain (<i>K</i><i><sub>UI</sub></i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #setKui(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Kui()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.kui' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKui();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKui <em>Kui</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKui()
     * @see #getKui()
     * @see #setKui(Double)
     * @generated
     */
    void unsetKui();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKui <em>Kui</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kuf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL excitation system stabilizer gain (<i>K</i><i><sub>UF</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kuf</em>' attribute.
     * @see #isSetKuf()
     * @see #unsetKuf()
     * @see #setKuf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Kuf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.kuf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKuf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKuf <em>Kuf</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKuf <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKuf()
     * @see #getKuf()
     * @see #setKuf(Double)
     * @generated
     */
    void unsetKuf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getKuf <em>Kuf</em>}' attribute is set.
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
     * Returns the value of the '<em><b>P5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>5</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P5</em>' attribute.
     * @see #isSetP5()
     * @see #unsetP5()
     * @see #setP5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP5 <em>P5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P5</em>' attribute.
     * @see #isSetP5()
     * @see #unsetP5()
     * @see #getP5()
     * @generated
     */
    void setP5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP5 <em>P5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP5()
     * @see #getP5()
     * @see #setP5(Double)
     * @generated
     */
    void unsetP5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP5 <em>P5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P5</em>' attribute is set.
     * @see #unsetP5()
     * @see #getP5()
     * @see #setP5(Double)
     * @generated
     */
    boolean isSetP5();

    /**
     * Returns the value of the '<em><b>P4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>4</sub></i>).  Typical value = 1,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P4</em>' attribute.
     * @see #isSetP4()
     * @see #unsetP4()
     * @see #setP4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP4 <em>P4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P4</em>' attribute.
     * @see #isSetP4()
     * @see #unsetP4()
     * @see #getP4()
     * @generated
     */
    void setP4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP4 <em>P4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP4()
     * @see #getP4()
     * @see #setP4(Double)
     * @generated
     */
    void unsetP4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP4 <em>P4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P4</em>' attribute is set.
     * @see #unsetP4()
     * @see #getP4()
     * @see #setP4(Double)
     * @generated
     */
    boolean isSetP4();

    /**
     * Returns the value of the '<em><b>P7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>7</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P7</em>' attribute.
     * @see #isSetP7()
     * @see #unsetP7()
     * @see #setP7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP7 <em>P7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P7</em>' attribute.
     * @see #isSetP7()
     * @see #unsetP7()
     * @see #getP7()
     * @generated
     */
    void setP7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP7 <em>P7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP7()
     * @see #getP7()
     * @see #setP7(Double)
     * @generated
     */
    void unsetP7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP7 <em>P7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P7</em>' attribute is set.
     * @see #unsetP7()
     * @see #getP7()
     * @see #setP7(Double)
     * @generated
     */
    boolean isSetP7();

    /**
     * Returns the value of the '<em><b>P6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>6</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P6</em>' attribute.
     * @see #isSetP6()
     * @see #unsetP6()
     * @see #setP6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP6 <em>P6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P6</em>' attribute.
     * @see #isSetP6()
     * @see #unsetP6()
     * @see #getP6()
     * @generated
     */
    void setP6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP6 <em>P6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP6()
     * @see #getP6()
     * @see #setP6(Double)
     * @generated
     */
    void unsetP6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP6 <em>P6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P6</em>' attribute is set.
     * @see #unsetP6()
     * @see #getP6()
     * @see #setP6(Double)
     * @generated
     */
    boolean isSetP6();

    /**
     * Returns the value of the '<em><b>P9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>9</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P9</em>' attribute.
     * @see #isSetP9()
     * @see #unsetP9()
     * @see #setP9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP9 <em>P9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P9</em>' attribute.
     * @see #isSetP9()
     * @see #unsetP9()
     * @see #getP9()
     * @generated
     */
    void setP9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP9 <em>P9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP9()
     * @see #getP9()
     * @see #setP9(Double)
     * @generated
     */
    void unsetP9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP9 <em>P9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P9</em>' attribute is set.
     * @see #unsetP9()
     * @see #getP9()
     * @see #setP9(Double)
     * @generated
     */
    boolean isSetP9();

    /**
     * Returns the value of the '<em><b>P8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>8</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>P8</em>' attribute.
     * @see #isSetP8()
     * @see #unsetP8()
     * @see #setP8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP8 <em>P8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P8</em>' attribute.
     * @see #isSetP8()
     * @see #unsetP8()
     * @see #getP8()
     * @generated
     */
    void setP8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP8 <em>P8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP8()
     * @see #getP8()
     * @see #setP8(Double)
     * @generated
     */
    void unsetP8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP8 <em>P8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P8</em>' attribute is set.
     * @see #unsetP8()
     * @see #getP8()
     * @see #setP8(Double)
     * @generated
     */
    boolean isSetP8();

    /**
     * Returns the value of the '<em><b>P1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>1</sub></i>).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P1</em>' attribute.
     * @see #isSetP1()
     * @see #unsetP1()
     * @see #setP1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP1 <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P1</em>' attribute.
     * @see #isSetP1()
     * @see #unsetP1()
     * @see #getP1()
     * @generated
     */
    void setP1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP1 <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP1()
     * @see #getP1()
     * @see #setP1(Double)
     * @generated
     */
    void unsetP1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP1 <em>P1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P1</em>' attribute is set.
     * @see #unsetP1()
     * @see #getP1()
     * @see #setP1(Double)
     * @generated
     */
    boolean isSetP1();

    /**
     * Returns the value of the '<em><b>P0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>0</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P0</em>' attribute.
     * @see #isSetP0()
     * @see #unsetP0()
     * @see #setP0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP0 <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P0</em>' attribute.
     * @see #isSetP0()
     * @see #unsetP0()
     * @see #getP0()
     * @generated
     */
    void setP0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP0 <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP0()
     * @see #getP0()
     * @see #setP0(Double)
     * @generated
     */
    void unsetP0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP0 <em>P0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P0</em>' attribute is set.
     * @see #unsetP0()
     * @see #getP0()
     * @see #setP0(Double)
     * @generated
     */
    boolean isSetP0();

    /**
     * Returns the value of the '<em><b>P3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>3</sub></i>).  Typical value = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P3</em>' attribute.
     * @see #isSetP3()
     * @see #unsetP3()
     * @see #setP3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP3 <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P3</em>' attribute.
     * @see #isSetP3()
     * @see #unsetP3()
     * @see #getP3()
     * @generated
     */
    void setP3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP3 <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP3()
     * @see #getP3()
     * @see #setP3(Double)
     * @generated
     */
    void unsetP3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP3 <em>P3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P3</em>' attribute is set.
     * @see #unsetP3()
     * @see #getP3()
     * @see #setP3(Double)
     * @generated
     */
    boolean isSetP3();

    /**
     * Returns the value of the '<em><b>P2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power values for endpoints (<i>P</i><i><sub>2</sub></i>).  Typical value = 0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P2</em>' attribute.
     * @see #isSetP2()
     * @see #unsetP2()
     * @see #setP2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_P2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.p2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP2 <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P2</em>' attribute.
     * @see #isSetP2()
     * @see #unsetP2()
     * @see #getP2()
     * @generated
     */
    void setP2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP2 <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP2()
     * @see #getP2()
     * @see #setP2(Double)
     * @generated
     */
    void unsetP2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getP2 <em>P2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P2</em>' attribute is set.
     * @see #unsetP2()
     * @see #getP2()
     * @see #setP2(Double)
     * @generated
     */
    boolean isSetP2();

    /**
     * Returns the value of the '<em><b>Q6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>6</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q6</em>' attribute.
     * @see #isSetQ6()
     * @see #unsetQ6()
     * @see #setQ6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ6 <em>Q6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q6</em>' attribute.
     * @see #isSetQ6()
     * @see #unsetQ6()
     * @see #getQ6()
     * @generated
     */
    void setQ6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ6 <em>Q6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ6()
     * @see #getQ6()
     * @see #setQ6(Double)
     * @generated
     */
    void unsetQ6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ6 <em>Q6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q6</em>' attribute is set.
     * @see #unsetQ6()
     * @see #getQ6()
     * @see #setQ6(Double)
     * @generated
     */
    boolean isSetQ6();

    /**
     * Returns the value of the '<em><b>Q5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>5</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q5</em>' attribute.
     * @see #isSetQ5()
     * @see #unsetQ5()
     * @see #setQ5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ5 <em>Q5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q5</em>' attribute.
     * @see #isSetQ5()
     * @see #unsetQ5()
     * @see #getQ5()
     * @generated
     */
    void setQ5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ5 <em>Q5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ5()
     * @see #getQ5()
     * @see #setQ5(Double)
     * @generated
     */
    void unsetQ5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ5 <em>Q5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q5</em>' attribute is set.
     * @see #unsetQ5()
     * @see #getQ5()
     * @see #setQ5(Double)
     * @generated
     */
    boolean isSetQ5();

    /**
     * Returns the value of the '<em><b>Q8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>8</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q8</em>' attribute.
     * @see #isSetQ8()
     * @see #unsetQ8()
     * @see #setQ8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ8 <em>Q8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q8</em>' attribute.
     * @see #isSetQ8()
     * @see #unsetQ8()
     * @see #getQ8()
     * @generated
     */
    void setQ8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ8 <em>Q8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ8()
     * @see #getQ8()
     * @see #setQ8(Double)
     * @generated
     */
    void unsetQ8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ8 <em>Q8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q8</em>' attribute is set.
     * @see #unsetQ8()
     * @see #getQ8()
     * @see #setQ8(Double)
     * @generated
     */
    boolean isSetQ8();

    /**
     * Returns the value of the '<em><b>Q7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>7</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q7</em>' attribute.
     * @see #isSetQ7()
     * @see #unsetQ7()
     * @see #setQ7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ7 <em>Q7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q7</em>' attribute.
     * @see #isSetQ7()
     * @see #unsetQ7()
     * @see #getQ7()
     * @generated
     */
    void setQ7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ7 <em>Q7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ7()
     * @see #getQ7()
     * @see #setQ7(Double)
     * @generated
     */
    void unsetQ7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ7 <em>Q7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q7</em>' attribute is set.
     * @see #unsetQ7()
     * @see #getQ7()
     * @see #setQ7(Double)
     * @generated
     */
    boolean isSetQ7();

    /**
     * Returns the value of the '<em><b>Q9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>9</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q9</em>' attribute.
     * @see #isSetQ9()
     * @see #unsetQ9()
     * @see #setQ9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ9 <em>Q9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q9</em>' attribute.
     * @see #isSetQ9()
     * @see #unsetQ9()
     * @see #getQ9()
     * @generated
     */
    void setQ9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ9 <em>Q9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ9()
     * @see #getQ9()
     * @see #setQ9(Double)
     * @generated
     */
    void unsetQ9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ9 <em>Q9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q9</em>' attribute is set.
     * @see #unsetQ9()
     * @see #getQ9()
     * @see #setQ9(Double)
     * @generated
     */
    boolean isSetQ9();

    /**
     * Returns the value of the '<em><b>Q0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>0</sub></i>).  Typical value = -0,31.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q0</em>' attribute.
     * @see #isSetQ0()
     * @see #unsetQ0()
     * @see #setQ0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ0 <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q0</em>' attribute.
     * @see #isSetQ0()
     * @see #unsetQ0()
     * @see #getQ0()
     * @generated
     */
    void setQ0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ0 <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ0()
     * @see #getQ0()
     * @see #setQ0(Double)
     * @generated
     */
    void unsetQ0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ0 <em>Q0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q0</em>' attribute is set.
     * @see #unsetQ0()
     * @see #getQ0()
     * @see #setQ0(Double)
     * @generated
     */
    boolean isSetQ0();

    /**
     * Returns the value of the '<em><b>Q2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>2</sub></i>).  Typical value = -0,28.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q2</em>' attribute.
     * @see #isSetQ2()
     * @see #unsetQ2()
     * @see #setQ2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ2 <em>Q2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q2</em>' attribute.
     * @see #isSetQ2()
     * @see #unsetQ2()
     * @see #getQ2()
     * @generated
     */
    void setQ2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ2 <em>Q2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ2()
     * @see #getQ2()
     * @see #setQ2(Double)
     * @generated
     */
    void unsetQ2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ2 <em>Q2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q2</em>' attribute is set.
     * @see #unsetQ2()
     * @see #getQ2()
     * @see #setQ2(Double)
     * @generated
     */
    boolean isSetQ2();

    /**
     * Returns the value of the '<em><b>Q1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>1</sub></i>).  Typical value = -0,31.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q1</em>' attribute.
     * @see #isSetQ1()
     * @see #unsetQ1()
     * @see #setQ1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ1 <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q1</em>' attribute.
     * @see #isSetQ1()
     * @see #unsetQ1()
     * @see #getQ1()
     * @generated
     */
    void setQ1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ1 <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ1()
     * @see #getQ1()
     * @see #setQ1(Double)
     * @generated
     */
    void unsetQ1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ1 <em>Q1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q1</em>' attribute is set.
     * @see #unsetQ1()
     * @see #getQ1()
     * @see #setQ1(Double)
     * @generated
     */
    boolean isSetQ1();

    /**
     * Returns the value of the '<em><b>Q4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>4</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q4</em>' attribute.
     * @see #isSetQ4()
     * @see #unsetQ4()
     * @see #setQ4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ4 <em>Q4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q4</em>' attribute.
     * @see #isSetQ4()
     * @see #unsetQ4()
     * @see #getQ4()
     * @generated
     */
    void setQ4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ4 <em>Q4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ4()
     * @see #getQ4()
     * @see #setQ4(Double)
     * @generated
     */
    void unsetQ4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ4 <em>Q4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q4</em>' attribute is set.
     * @see #unsetQ4()
     * @see #getQ4()
     * @see #setQ4(Double)
     * @generated
     */
    boolean isSetQ4();

    /**
     * Returns the value of the '<em><b>Q3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power values for endpoints (<i>Q</i><i><sub>3</sub></i>).  Typical value = -0,21.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q3</em>' attribute.
     * @see #isSetQ3()
     * @see #unsetQ3()
     * @see #setQ3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_Q3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.q3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ3 <em>Q3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q3</em>' attribute.
     * @see #isSetQ3()
     * @see #unsetQ3()
     * @see #getQ3()
     * @generated
     */
    void setQ3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ3 <em>Q3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ3()
     * @see #getQ3()
     * @see #setQ3(Double)
     * @generated
     */
    void unsetQ3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getQ3 <em>Q3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q3</em>' attribute is set.
     * @see #unsetQ3()
     * @see #getQ3()
     * @see #setQ3(Double)
     * @generated
     */
    boolean isSetQ3();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL terminal voltage exponent applied to reactive power output from UEL limit look-up table (<i>k2</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #getK2()
     * @generated
     */
    void setK2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK2 <em>K2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K2</em>' attribute is set.
     * @see #unsetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    boolean isSetK2();

    /**
     * Returns the value of the '<em><b>K1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL terminal voltage exponent applied to real power input to UEL limit look-up table (<i>k1</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLimIEEE2_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLimIEEE2.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #getK1()
     * @generated
     */
    void setK1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimIEEE2#getK1 <em>K1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K1</em>' attribute is set.
     * @see #unsetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    boolean isSetK1();

} // UnderexcLimIEEE2
