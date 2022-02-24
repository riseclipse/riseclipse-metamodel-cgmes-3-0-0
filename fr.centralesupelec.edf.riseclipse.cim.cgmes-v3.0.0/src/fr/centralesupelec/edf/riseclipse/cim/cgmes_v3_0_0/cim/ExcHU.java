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
 * A representation of the model object '<em><b>Exc HU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hungarian excitation system, with built-in voltage transducer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImin <em>Imin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImax <em>Imax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTi <em>Ti</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAi <em>Ai</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAe <em>Ae</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAtr <em>Atr</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU()
 * @model
 * @generated
 */
public interface ExcHU extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Imin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Major loop PI tag output signal lower limit (<i>Imin</i>) (&lt; ExcHU.imax).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Imin</em>' attribute.
     * @see #isSetImin()
     * @see #unsetImin()
     * @see #setImin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Imin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.imin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getImin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImin <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imin</em>' attribute.
     * @see #isSetImin()
     * @see #unsetImin()
     * @see #getImin()
     * @generated
     */
    void setImin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImin <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImin()
     * @see #getImin()
     * @see #setImin(Double)
     * @generated
     */
    void unsetImin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImin <em>Imin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Imin</em>' attribute is set.
     * @see #unsetImin()
     * @see #getImin()
     * @see #setImin(Double)
     * @generated
     */
    boolean isSetImin();

    /**
     * Returns the value of the '<em><b>Imax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Major loop PI tag output signal upper limit (<i>Imax</i>) (&gt; ExcHU.imin).  Typical value = 2,19.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Imax</em>' attribute.
     * @see #isSetImax()
     * @see #unsetImax()
     * @see #setImax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Imax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.imax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getImax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImax <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imax</em>' attribute.
     * @see #isSetImax()
     * @see #unsetImax()
     * @see #getImax()
     * @generated
     */
    void setImax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImax <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImax()
     * @see #getImax()
     * @see #setImax(Double)
     * @generated
     */
    void unsetImax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getImax <em>Imax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Imax</em>' attribute is set.
     * @see #unsetImax()
     * @see #getImax()
     * @see #setImax(Double)
     * @generated
     */
    boolean isSetImax();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant (<i>Tr</i>) (&gt;= 0). If a voltage compensator is used in conjunction with this excitation system model, <i>Tr </i>should be set to 0.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Ti</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minor loop PI control tag integration time constant (<i>Ti</i>) (&gt;= 0).  Typical value = 0,01333.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti</em>' attribute.
     * @see #isSetTi()
     * @see #unsetTi()
     * @see #setTi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Ti()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.ti' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTi <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti</em>' attribute.
     * @see #isSetTi()
     * @see #unsetTi()
     * @see #getTi()
     * @generated
     */
    void setTi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTi <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi()
     * @see #getTi()
     * @see #setTi(Double)
     * @generated
     */
    void unsetTi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTi <em>Ti</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti</em>' attribute is set.
     * @see #unsetTi()
     * @see #getTi()
     * @see #setTi(Double)
     * @generated
     */
    boolean isSetTi();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Major loop PI tag integration time constant (<i>Te</i>) (&gt;= 0).  Typical value = 0,154.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    boolean isSetTe();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current base conversion constant (<i>Ki</i>).  Typical value = 0,21428.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #getKi()
     * @generated
     */
    void setKi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKi <em>Ki</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki</em>' attribute is set.
     * @see #unsetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    boolean isSetKi();

    /**
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage base conversion constant (<i>Ke</i>).  Typical value = 4,666.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Ke()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.ke' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #getKe()
     * @generated
     */
    void setKe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    boolean isSetKe();

    /**
     * Returns the value of the '<em><b>Ai</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minor loop PI tag gain factor (<i>Ai</i>).  Typical value = 22.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ai</em>' attribute.
     * @see #isSetAi()
     * @see #unsetAi()
     * @see #setAi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Ai()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.ai' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAi <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ai</em>' attribute.
     * @see #isSetAi()
     * @see #unsetAi()
     * @see #getAi()
     * @generated
     */
    void setAi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAi <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAi()
     * @see #getAi()
     * @see #setAi(Double)
     * @generated
     */
    void unsetAi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAi <em>Ai</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ai</em>' attribute is set.
     * @see #unsetAi()
     * @see #getAi()
     * @see #setAi(Double)
     * @generated
     */
    boolean isSetAi();

    /**
     * Returns the value of the '<em><b>Ae</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Major loop PI tag gain factor (<i>Ae</i>).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ae</em>' attribute.
     * @see #isSetAe()
     * @see #unsetAe()
     * @see #setAe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Ae()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.ae' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAe <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ae</em>' attribute.
     * @see #isSetAe()
     * @see #unsetAe()
     * @see #getAe()
     * @generated
     */
    void setAe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAe <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAe()
     * @see #getAe()
     * @see #setAe(Double)
     * @generated
     */
    void unsetAe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAe <em>Ae</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ae</em>' attribute is set.
     * @see #unsetAe()
     * @see #getAe()
     * @see #setAe(Double)
     * @generated
     */
    boolean isSetAe();

    /**
     * Returns the value of the '<em><b>Emax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage control signal upper limit on AVR base (<i>Emax</i>) (&gt; ExcHU.emin).  Typical value = 0,996.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #setEmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Emax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.emax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #getEmax()
     * @generated
     */
    void setEmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmax()
     * @see #getEmax()
     * @see #setEmax(Double)
     * @generated
     */
    void unsetEmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmax <em>Emax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emax</em>' attribute is set.
     * @see #unsetEmax()
     * @see #getEmax()
     * @see #setEmax(Double)
     * @generated
     */
    boolean isSetEmax();

    /**
     * Returns the value of the '<em><b>Emin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage control signal lower limit on AVR base (<i>Emin</i>) (&lt; ExcHU.emax).  Typical value = -0,866.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #setEmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Emin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.emin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #getEmin()
     * @generated
     */
    void setEmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmin()
     * @see #getEmin()
     * @see #setEmin(Double)
     * @generated
     */
    void unsetEmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getEmin <em>Emin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emin</em>' attribute is set.
     * @see #unsetEmin()
     * @see #getEmin()
     * @see #setEmin(Double)
     * @generated
     */
    boolean isSetEmin();

    /**
     * Returns the value of the '<em><b>Atr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * AVR constant (<i>Atr</i>).  Typical value = 2,19.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Atr</em>' attribute.
     * @see #isSetAtr()
     * @see #unsetAtr()
     * @see #setAtr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcHU_Atr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcHU.atr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAtr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAtr <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Atr</em>' attribute.
     * @see #isSetAtr()
     * @see #unsetAtr()
     * @see #getAtr()
     * @generated
     */
    void setAtr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAtr <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAtr()
     * @see #getAtr()
     * @see #setAtr(Double)
     * @generated
     */
    void unsetAtr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU#getAtr <em>Atr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Atr</em>' attribute is set.
     * @see #unsetAtr()
     * @see #getAtr()
     * @see #setAtr(Double)
     * @generated
     */
    boolean isSetAtr();

} // ExcHU
