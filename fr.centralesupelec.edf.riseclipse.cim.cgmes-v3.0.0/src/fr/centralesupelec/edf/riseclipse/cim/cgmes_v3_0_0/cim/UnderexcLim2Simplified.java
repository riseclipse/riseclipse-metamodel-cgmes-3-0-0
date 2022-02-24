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
 * A representation of the model object '<em><b>Underexc Lim2 Simplified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simplified type UEL2 underexcitation limiter.  This model can be derived from UnderexcLimIEEE2.  The limit characteristic (look –up table) is a single straight-line, the same as UnderexcLimIEEE2 (see Figure 10.4 (p 32), IEEE 421.5-2005 Section 10.2).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified()
 * @model
 * @generated
 */
public interface UnderexcLim2Simplified extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Q1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Segment Q end point (<i>Q</i><i><sub>1</sub></i>).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q1</em>' attribute.
     * @see #isSetQ1()
     * @see #unsetQ1()
     * @see #setQ1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_Q1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.q1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ1()
     * @see #getQ1()
     * @see #setQ1(Double)
     * @generated
     */
    void unsetQ1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Q0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Segment Q initial point (<i>Q</i><i><sub>0</sub></i>).  Typical value = -0,31.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q0</em>' attribute.
     * @see #isSetQ0()
     * @see #unsetQ0()
     * @see #setQ0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_Q0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.q0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ0()
     * @see #getQ0()
     * @see #setQ0(Double)
     * @generated
     */
    void unsetQ0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kui</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain Under excitation limiter (<i>K</i><i><sub>UI</sub></i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #setKui(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_Kui()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.kui' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKui();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKui()
     * @see #getKui()
     * @see #setKui(Double)
     * @generated
     */
    void unsetKui();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vuimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum error signal (<i>V</i><i><sub>UIMAX</sub></i>) (&gt; UnderexcLim2Simplified.vuimin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #setVuimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_Vuimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.vuimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Double)
     * @generated
     */
    void unsetVuimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>P0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Segment P initial point (<i>P</i><i><sub>0</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P0</em>' attribute.
     * @see #isSetP0()
     * @see #unsetP0()
     * @see #setP0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_P0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.p0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP0()
     * @see #getP0()
     * @see #setP0(Double)
     * @generated
     */
    void unsetP0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>P1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Segment P end point (<i>P</i><i><sub>1</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P1</em>' attribute.
     * @see #isSetP1()
     * @see #unsetP1()
     * @see #setP1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_P1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.p1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP1()
     * @see #getP1()
     * @see #setP1(Double)
     * @generated
     */
    void unsetP1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vuimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum error signal (<i>V</i><i><sub>UIMIN</sub></i>) (&lt; UnderexcLim2Simplified.vuimax).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #setVuimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnderexcLim2Simplified_Vuimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='UnderexcLim2Simplified.vuimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVuimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Double)
     * @generated
     */
    void unsetVuimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimin</em>' attribute is set.
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Double)
     * @generated
     */
    boolean isSetVuimin();

} // UnderexcLim2Simplified
