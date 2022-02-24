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
 * A representation of the model object '<em><b>PFV Ar Type2 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE VAR controller type 2 which is a summing point type controller. It makes up the outside loop of a two-loop system. This controller is implemented as a slow PI type controller, and the voltage regulator forms the inner loop and is implemented as a fast controller.
 * Reference: IEEE 421.5-2005, 11.5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController()
 * @model
 * @generated
 */
public interface PFVArType2IEEEVArController extends PFVArControllerType2Dynamics {
    /**
     * Returns the value of the '<em><b>Vclmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum output of the pf controller (<i>V</i><i><sub>CLMT</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vclmt</em>' attribute.
     * @see #isSetVclmt()
     * @see #unsetVclmt()
     * @see #setVclmt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Vclmt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.vclmt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVclmt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vclmt</em>' attribute.
     * @see #isSetVclmt()
     * @see #unsetVclmt()
     * @see #getVclmt()
     * @generated
     */
    void setVclmt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVclmt()
     * @see #getVclmt()
     * @see #setVclmt(Double)
     * @generated
     */
    void unsetVclmt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVclmt <em>Vclmt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vclmt</em>' attribute is set.
     * @see #unsetVclmt()
     * @see #getVclmt()
     * @see #setVclmt(Double)
     * @generated
     */
    boolean isSetVclmt();

    /**
     * Returns the value of the '<em><b>Exlon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Overexcitation or under excitation flag (<i>EXLON</i>)
     * true = 1 (not in the overexcitation or underexcitation state, integral action is active)
     * false = 0 (in the overexcitation or underexcitation state, so integral action is disabled to allow the limiter to play its role).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Exlon</em>' attribute.
     * @see #isSetExlon()
     * @see #unsetExlon()
     * @see #setExlon(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Exlon()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.exlon' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getExlon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exlon</em>' attribute.
     * @see #isSetExlon()
     * @see #unsetExlon()
     * @see #getExlon()
     * @generated
     */
    void setExlon( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExlon()
     * @see #getExlon()
     * @see #setExlon(Boolean)
     * @generated
     */
    void unsetExlon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getExlon <em>Exlon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exlon</em>' attribute is set.
     * @see #unsetExlon()
     * @see #getExlon()
     * @see #setExlon(Boolean)
     * @generated
     */
    boolean isSetExlon();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain of the pf controller (<i>K</i><i><sub>I</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKi <em>Ki</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain of the pf controller (<i>K</i><i><sub>P</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Kp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.kp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #getKp()
     * @generated
     */
    void setKp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getKp <em>Kp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp</em>' attribute is set.
     * @see #unsetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    boolean isSetKp();

    /**
     * Returns the value of the '<em><b>Vs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generator sensing voltage (<i>V</i><i><sub>S</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vs</em>' attribute.
     * @see #isSetVs()
     * @see #unsetVs()
     * @see #setVs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Vs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.vs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vs</em>' attribute.
     * @see #isSetVs()
     * @see #unsetVs()
     * @see #getVs()
     * @generated
     */
    void setVs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVs()
     * @see #getVs()
     * @see #setVs(Double)
     * @generated
     */
    void unsetVs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVs <em>Vs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vs</em>' attribute is set.
     * @see #unsetVs()
     * @see #getVs()
     * @see #setVs(Double)
     * @generated
     */
    boolean isSetVs();

    /**
     * Returns the value of the '<em><b>Vref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator reference (<i>V</i><i><sub>REF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vref</em>' attribute.
     * @see #isSetVref()
     * @see #unsetVref()
     * @see #setVref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Vref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.vref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vref</em>' attribute.
     * @see #isSetVref()
     * @see #unsetVref()
     * @see #getVref()
     * @generated
     */
    void setVref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVref()
     * @see #getVref()
     * @see #setVref(Double)
     * @generated
     */
    void unsetVref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getVref <em>Vref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vref</em>' attribute is set.
     * @see #unsetVref()
     * @see #getVref()
     * @see #setVref(Double)
     * @generated
     */
    boolean isSetVref();

    /**
     * Returns the value of the '<em><b>Qref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power reference (<i>Q</i><i><sub>REF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qref</em>' attribute.
     * @see #isSetQref()
     * @see #unsetQref()
     * @see #setQref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType2IEEEVArController_Qref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType2IEEEVArController.qref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qref</em>' attribute.
     * @see #isSetQref()
     * @see #unsetQref()
     * @see #getQref()
     * @generated
     */
    void setQref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQref()
     * @see #getQref()
     * @see #setQref(Double)
     * @generated
     */
    void unsetQref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController#getQref <em>Qref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qref</em>' attribute is set.
     * @see #unsetQref()
     * @see #getQref()
     * @see #setQref(Double)
     * @generated
     */
    boolean isSetQref();

} // PFVArType2IEEEVArController
