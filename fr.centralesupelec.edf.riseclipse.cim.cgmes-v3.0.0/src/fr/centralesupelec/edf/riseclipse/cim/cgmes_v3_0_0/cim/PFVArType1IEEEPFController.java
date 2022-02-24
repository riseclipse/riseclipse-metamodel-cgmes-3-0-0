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
 * A representation of the model object '<em><b>PFV Ar Type1 IEEEPF Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE PF controller type 1 which operates by moving the voltage reference directly.
 * Reference: IEEE 421.5-2005, 11.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController()
 * @model
 * @generated
 */
public interface PFVArType1IEEEPFController extends PFVArControllerType1Dynamics {
    /**
     * Returns the value of the '<em><b>Vpf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine power factor (<i>V</i><i><sub>PF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpf</em>' attribute.
     * @see #isSetVpf()
     * @see #unsetVpf()
     * @see #setVpf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vpf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vpf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpf</em>' attribute.
     * @see #isSetVpf()
     * @see #unsetVpf()
     * @see #getVpf()
     * @generated
     */
    void setVpf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpf()
     * @see #getVpf()
     * @see #setVpf(Double)
     * @generated
     */
    void unsetVpf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpf <em>Vpf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpf</em>' attribute is set.
     * @see #unsetVpf()
     * @see #getVpf()
     * @see #setVpf(Double)
     * @generated
     */
    boolean isSetVpf();

    /**
     * Returns the value of the '<em><b>Vitmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum machine terminal current needed to enable pf/var controller (<i>V</i><i><sub>ITMIN</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vitmin</em>' attribute.
     * @see #isSetVitmin()
     * @see #unsetVitmin()
     * @see #setVitmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vitmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vitmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVitmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vitmin</em>' attribute.
     * @see #isSetVitmin()
     * @see #unsetVitmin()
     * @see #getVitmin()
     * @generated
     */
    void setVitmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVitmin()
     * @see #getVitmin()
     * @see #setVitmin(Double)
     * @generated
     */
    void unsetVitmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVitmin <em>Vitmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vitmin</em>' attribute is set.
     * @see #unsetVitmin()
     * @see #getVitmin()
     * @see #setVitmin(Double)
     * @generated
     */
    boolean isSetVitmin();

    /**
     * Returns the value of the '<em><b>Vpfcbw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PF controller deadband (<i>V</i><i><sub>PFC_BW</sub></i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpfcbw</em>' attribute.
     * @see #isSetVpfcbw()
     * @see #unsetVpfcbw()
     * @see #setVpfcbw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vpfcbw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vpfcbw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpfcbw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpfcbw</em>' attribute.
     * @see #isSetVpfcbw()
     * @see #unsetVpfcbw()
     * @see #getVpfcbw()
     * @generated
     */
    void setVpfcbw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpfcbw()
     * @see #getVpfcbw()
     * @see #setVpfcbw(Double)
     * @generated
     */
    void unsetVpfcbw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfcbw <em>Vpfcbw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpfcbw</em>' attribute is set.
     * @see #unsetVpfcbw()
     * @see #getVpfcbw()
     * @see #setVpfcbw(Double)
     * @generated
     */
    boolean isSetVpfcbw();

    /**
     * Returns the value of the '<em><b>Ovex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Overexcitation Flag (<i>OVEX</i>)
     * true = overexcited
     * false = underexcited.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ovex</em>' attribute.
     * @see #isSetOvex()
     * @see #unsetOvex()
     * @see #setOvex(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Ovex()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.ovex' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOvex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ovex</em>' attribute.
     * @see #isSetOvex()
     * @see #unsetOvex()
     * @see #getOvex()
     * @generated
     */
    void setOvex( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOvex()
     * @see #getOvex()
     * @see #setOvex(Boolean)
     * @generated
     */
    void unsetOvex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getOvex <em>Ovex</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ovex</em>' attribute is set.
     * @see #unsetOvex()
     * @see #getOvex()
     * @see #setOvex(Boolean)
     * @generated
     */
    boolean isSetOvex();

    /**
     * Returns the value of the '<em><b>Vpfref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PF controller reference (<i>V</i><i><sub>PFREF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vpfref</em>' attribute.
     * @see #isSetVpfref()
     * @see #unsetVpfref()
     * @see #setVpfref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vpfref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vpfref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVpfref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpfref</em>' attribute.
     * @see #isSetVpfref()
     * @see #unsetVpfref()
     * @see #getVpfref()
     * @generated
     */
    void setVpfref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpfref()
     * @see #getVpfref()
     * @see #setVpfref(Double)
     * @generated
     */
    void unsetVpfref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVpfref <em>Vpfref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpfref</em>' attribute is set.
     * @see #unsetVpfref()
     * @see #getVpfref()
     * @see #setVpfref(Double)
     * @generated
     */
    boolean isSetVpfref();

    /**
     * Returns the value of the '<em><b>Vvtmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum machine terminal voltage needed for pf/var controller to be enabled (<i>V</i><i><sub>VTMAX</sub></i>) (&gt; PFVArType1IEEEPFController.vvtmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvtmax</em>' attribute.
     * @see #isSetVvtmax()
     * @see #unsetVvtmax()
     * @see #setVvtmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vvtmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vvtmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvtmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvtmax</em>' attribute.
     * @see #isSetVvtmax()
     * @see #unsetVvtmax()
     * @see #getVvtmax()
     * @generated
     */
    void setVvtmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Double)
     * @generated
     */
    void unsetVvtmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmax <em>Vvtmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvtmax</em>' attribute is set.
     * @see #unsetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Double)
     * @generated
     */
    boolean isSetVvtmax();

    /**
     * Returns the value of the '<em><b>Vvtmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum machine terminal voltage needed to enable pf/var controller (<i>V</i><i><sub>VTMIN</sub></i>) (&lt; PFVArType1IEEEPFController.vvtmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvtmin</em>' attribute.
     * @see #isSetVvtmin()
     * @see #unsetVvtmin()
     * @see #setVvtmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Vvtmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.vvtmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvtmin</em>' attribute.
     * @see #isSetVvtmin()
     * @see #unsetVvtmin()
     * @see #getVvtmin()
     * @generated
     */
    void setVvtmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Double)
     * @generated
     */
    void unsetVvtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getVvtmin <em>Vvtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvtmin</em>' attribute is set.
     * @see #unsetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Double)
     * @generated
     */
    boolean isSetVvtmin();

    /**
     * Returns the value of the '<em><b>Tpfc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PF controller time delay (<i>T</i><i><sub>PFC</sub></i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpfc</em>' attribute.
     * @see #isSetTpfc()
     * @see #unsetTpfc()
     * @see #setTpfc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEPFController_Tpfc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEPFController.tpfc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpfc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfc</em>' attribute.
     * @see #isSetTpfc()
     * @see #unsetTpfc()
     * @see #getTpfc()
     * @generated
     */
    void setTpfc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfc()
     * @see #getTpfc()
     * @see #setTpfc(Double)
     * @generated
     */
    void unsetTpfc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController#getTpfc <em>Tpfc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfc</em>' attribute is set.
     * @see #unsetTpfc()
     * @see #getTpfc()
     * @see #setTpfc(Double)
     * @generated
     */
    boolean isSetTpfc();

} // PFVArType1IEEEPFController
