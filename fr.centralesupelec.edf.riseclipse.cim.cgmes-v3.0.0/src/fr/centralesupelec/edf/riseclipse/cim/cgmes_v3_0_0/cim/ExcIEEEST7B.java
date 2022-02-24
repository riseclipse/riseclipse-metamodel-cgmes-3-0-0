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
 * A representation of the model object '<em><b>Exc IEEEST7B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type ST7B model. This model is representative of static potential-source excitation systems. In this system, the AVR consists of a PI voltage regulator. A phase lead-lag filter in series allows the introduction of a derivative function, typically used with brushless excitation systems. In that case, the regulator is of the PID type. In addition, the terminal voltage channel includes a phase lead-lag filter.  The AVR includes the appropriate inputs on its reference for overexcitation limiter (OEL1), underexcitation limiter (UEL), stator current limiter (SCL), and current compensator (DROOP). All these limitations, when they work at voltage reference level, keep the PSS (VS signal from PSS) in operation. However, the UEL limitation can also be transferred to the high value (HV) gate acting on the output signal. In addition, the output signal passes through a low value (LV) gate for a ceiling overexcitation limiter (OEL2).
 * Reference: IEEE 421.5-2005, 7.7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKl <em>Kl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKh <em>Kh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getUelin <em>Uelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmin <em>Vmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTia <em>Tia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getOelin <em>Oelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKia <em>Kia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKpa <em>Kpa</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B()
 * @model
 * @generated
 */
public interface ExcIEEEST7B extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lead time constant (<i>T</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    boolean isSetTc();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lag time constant (<i>T</i><i><sub>B</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    boolean isSetTb();

    /**
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Feedback time constant of inner loop field voltage regulator (<i>T</i><i><sub>G</sub></i>) (&gt;= 0). Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Tg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.tg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #getTg()
     * @generated
     */
    void setTg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTg <em>Tg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tg</em>' attribute is set.
     * @see #unsetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    boolean isSetTg();

    /**
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation control system stabilizer time constant (<i>T</i><i><sub>F</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #getTf()
     * @generated
     */
    void setTf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTf <em>Tf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf</em>' attribute is set.
     * @see #unsetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    boolean isSetTf();

    /**
     * Returns the value of the '<em><b>Kl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low-value gate feedback gain (<i>K</i><i><sub>L</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl</em>' attribute.
     * @see #isSetKl()
     * @see #unsetKl()
     * @see #setKl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Kl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.kl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKl <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl</em>' attribute.
     * @see #isSetKl()
     * @see #unsetKl()
     * @see #getKl()
     * @generated
     */
    void setKl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKl <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl()
     * @see #getKl()
     * @see #setKl(Double)
     * @generated
     */
    void unsetKl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKl <em>Kl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl</em>' attribute is set.
     * @see #unsetKl()
     * @see #getKl()
     * @see #setKl(Double)
     * @generated
     */
    boolean isSetKl();

    /**
     * Returns the value of the '<em><b>Kh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High-value gate feedback gain (<i>K</i><i><sub>H</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #setKh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Kh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.kh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #getKh()
     * @generated
     */
    void setKh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    void unsetKh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKh <em>Kh</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh</em>' attribute is set.
     * @see #unsetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    boolean isSetKh();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Vrmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.vrmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @generated
     */
    void setVrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    boolean isSetVrmax();

    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -4,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Vrmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.vrmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @generated
     */
    void setVrmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    boolean isSetVrmin();

    /**
     * Returns the value of the '<em><b>Uelin</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BUELselectorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL input selector (<i>UELin</i>). Typical value = noUELinput.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uelin</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BUELselectorKind
     * @see #isSetUelin()
     * @see #unsetUelin()
     * @see #setUelin(ExcST7BUELselectorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Uelin()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.uelin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ExcST7BUELselectorKind getUelin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getUelin <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uelin</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BUELselectorKind
     * @see #isSetUelin()
     * @see #unsetUelin()
     * @see #getUelin()
     * @generated
     */
    void setUelin( ExcST7BUELselectorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getUelin <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUelin()
     * @see #getUelin()
     * @see #setUelin(ExcST7BUELselectorKind)
     * @generated
     */
    void unsetUelin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getUelin <em>Uelin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uelin</em>' attribute is set.
     * @see #unsetUelin()
     * @see #getUelin()
     * @see #setUelin(ExcST7BUELselectorKind)
     * @generated
     */
    boolean isSetUelin();

    /**
     * Returns the value of the '<em><b>Vmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage reference signal (<i>V</i><i><sub>MAX</sub></i>) (&gt; 0 and &gt; ExcIEEEST7B.vmin).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #setVmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Vmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.vmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #getVmax()
     * @generated
     */
    void setVmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmax()
     * @see #getVmax()
     * @see #setVmax(Double)
     * @generated
     */
    void unsetVmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmax <em>Vmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmax</em>' attribute is set.
     * @see #unsetVmax()
     * @see #getVmax()
     * @see #setVmax(Double)
     * @generated
     */
    boolean isSetVmax();

    /**
     * Returns the value of the '<em><b>Vmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage reference signal (<i>V</i><i><sub>MIN</sub></i>) (&gt; 0 and &lt; ExcIEEEST7B.vmax).  Typical value = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #setVmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Vmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.vmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #getVmin()
     * @generated
     */
    void setVmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmin()
     * @see #getVmin()
     * @see #setVmin(Double)
     * @generated
     */
    void unsetVmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getVmin <em>Vmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmin</em>' attribute is set.
     * @see #unsetVmin()
     * @see #getVmin()
     * @see #setVmin(Double)
     * @generated
     */
    boolean isSetVmin();

    /**
     * Returns the value of the '<em><b>Tia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Feedback time constant (<i>T</i><i><sub>IA</sub></i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tia</em>' attribute.
     * @see #isSetTia()
     * @see #unsetTia()
     * @see #setTia(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Tia()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.tia' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTia();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTia <em>Tia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tia</em>' attribute.
     * @see #isSetTia()
     * @see #unsetTia()
     * @see #getTia()
     * @generated
     */
    void setTia( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTia <em>Tia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTia()
     * @see #getTia()
     * @see #setTia(Double)
     * @generated
     */
    void unsetTia();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getTia <em>Tia</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tia</em>' attribute is set.
     * @see #unsetTia()
     * @see #getTia()
     * @see #setTia(Double)
     * @generated
     */
    boolean isSetTia();

    /**
     * Returns the value of the '<em><b>Oelin</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BOELselectorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL input selector (<i>OELin</i>).  Typical value = noOELinput.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Oelin</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BOELselectorKind
     * @see #isSetOelin()
     * @see #unsetOelin()
     * @see #setOelin(ExcST7BOELselectorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Oelin()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.oelin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ExcST7BOELselectorKind getOelin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getOelin <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oelin</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST7BOELselectorKind
     * @see #isSetOelin()
     * @see #unsetOelin()
     * @see #getOelin()
     * @generated
     */
    void setOelin( ExcST7BOELselectorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getOelin <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOelin()
     * @see #getOelin()
     * @see #setOelin(ExcST7BOELselectorKind)
     * @generated
     */
    void unsetOelin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getOelin <em>Oelin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oelin</em>' attribute is set.
     * @see #unsetOelin()
     * @see #getOelin()
     * @see #setOelin(ExcST7BOELselectorKind)
     * @generated
     */
    boolean isSetOelin();

    /**
     * Returns the value of the '<em><b>Kia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator integral gain (<i>K</i><i><sub>IA</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kia</em>' attribute.
     * @see #isSetKia()
     * @see #unsetKia()
     * @see #setKia(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Kia()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.kia' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKia();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKia <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kia</em>' attribute.
     * @see #isSetKia()
     * @see #unsetKia()
     * @see #getKia()
     * @generated
     */
    void setKia( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKia <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKia()
     * @see #getKia()
     * @see #setKia(Double)
     * @generated
     */
    void unsetKia();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKia <em>Kia</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kia</em>' attribute is set.
     * @see #unsetKia()
     * @see #getKia()
     * @see #setKia(Double)
     * @generated
     */
    boolean isSetKia();

    /**
     * Returns the value of the '<em><b>Kpa</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator proportional gain (<i>K</i><i><sub>PA</sub></i>) (&gt; 0).  Typical value = 40.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpa</em>' attribute.
     * @see #isSetKpa()
     * @see #unsetKpa()
     * @see #setKpa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST7B_Kpa()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST7B.kpa' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKpa <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpa</em>' attribute.
     * @see #isSetKpa()
     * @see #unsetKpa()
     * @see #getKpa()
     * @generated
     */
    void setKpa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKpa <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpa()
     * @see #getKpa()
     * @see #setKpa(Double)
     * @generated
     */
    void unsetKpa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST7B#getKpa <em>Kpa</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpa</em>' attribute is set.
     * @see #unsetKpa()
     * @see #getKpa()
     * @see #setKpa(Double)
     * @generated
     */
    boolean isSetKpa();

} // ExcIEEEST7B
