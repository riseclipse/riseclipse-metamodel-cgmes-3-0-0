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
 * A representation of the model object '<em><b>PFV Ar Type1 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE VAR controller type 1 which operates by moving the voltage reference directly.
 * Reference: IEEE 421.5-2005, 11.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController()
 * @model
 * @generated
 */
public interface PFVArType1IEEEVArController extends PFVArControllerType1Dynamics {
    /**
     * Returns the value of the '<em><b>Tvarc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Var controller time delay (<i>T</i><i><sub>VARC</sub></i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tvarc</em>' attribute.
     * @see #isSetTvarc()
     * @see #unsetTvarc()
     * @see #setTvarc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Tvarc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.tvarc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTvarc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tvarc</em>' attribute.
     * @see #isSetTvarc()
     * @see #unsetTvarc()
     * @see #getTvarc()
     * @generated
     */
    void setTvarc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTvarc()
     * @see #getTvarc()
     * @see #setTvarc(Double)
     * @generated
     */
    void unsetTvarc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getTvarc <em>Tvarc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tvarc</em>' attribute is set.
     * @see #unsetTvarc()
     * @see #getTvarc()
     * @see #setTvarc(Double)
     * @generated
     */
    boolean isSetTvarc();

    /**
     * Returns the value of the '<em><b>Vvar</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine power factor (<i>V</i><i><sub>VAR</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvar</em>' attribute.
     * @see #isSetVvar()
     * @see #unsetVvar()
     * @see #setVvar(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Vvar()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.vvar' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvar();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvar</em>' attribute.
     * @see #isSetVvar()
     * @see #unsetVvar()
     * @see #getVvar()
     * @generated
     */
    void setVvar( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvar()
     * @see #getVvar()
     * @see #setVvar(Double)
     * @generated
     */
    void unsetVvar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvar <em>Vvar</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvar</em>' attribute is set.
     * @see #unsetVvar()
     * @see #getVvar()
     * @see #setVvar(Double)
     * @generated
     */
    boolean isSetVvar();

    /**
     * Returns the value of the '<em><b>Vvarcbw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Var controller deadband (<i>V</i><i><sub>VARC_BW</sub></i>).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvarcbw</em>' attribute.
     * @see #isSetVvarcbw()
     * @see #unsetVvarcbw()
     * @see #setVvarcbw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Vvarcbw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.vvarcbw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvarcbw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvarcbw</em>' attribute.
     * @see #isSetVvarcbw()
     * @see #unsetVvarcbw()
     * @see #getVvarcbw()
     * @generated
     */
    void setVvarcbw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvarcbw()
     * @see #getVvarcbw()
     * @see #setVvarcbw(Double)
     * @generated
     */
    void unsetVvarcbw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarcbw <em>Vvarcbw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvarcbw</em>' attribute is set.
     * @see #unsetVvarcbw()
     * @see #getVvarcbw()
     * @see #setVvarcbw(Double)
     * @generated
     */
    boolean isSetVvarcbw();

    /**
     * Returns the value of the '<em><b>Vvtmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum machine terminal voltage needed for pf/VAr controller to be enabled (<i>V</i><i><sub>VTMAX</sub></i>) (&gt; PVFArType1IEEEVArController.vvtmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvtmax</em>' attribute.
     * @see #isSetVvtmax()
     * @see #unsetVvtmax()
     * @see #setVvtmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Vvtmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.vvtmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvtmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmax()
     * @see #getVvtmax()
     * @see #setVvtmax(Double)
     * @generated
     */
    void unsetVvtmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmax <em>Vvtmax</em>}' attribute is set.
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
     * Minimum machine terminal voltage needed to enable pf/var controller (<i>V</i><i><sub>VTMIN</sub></i>) (&lt; PVFArType1IEEEVArController.vvtmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvtmin</em>' attribute.
     * @see #isSetVvtmin()
     * @see #unsetVvtmin()
     * @see #setVvtmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Vvtmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.vvtmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvtmin()
     * @see #getVvtmin()
     * @see #setVvtmin(Double)
     * @generated
     */
    void unsetVvtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvtmin <em>Vvtmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vvarref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Var controller reference (<i>V</i><i><sub>VARREF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vvarref</em>' attribute.
     * @see #isSetVvarref()
     * @see #unsetVvarref()
     * @see #setVvarref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPFVArType1IEEEVArController_Vvarref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PFVArType1IEEEVArController.vvarref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVvarref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vvarref</em>' attribute.
     * @see #isSetVvarref()
     * @see #unsetVvarref()
     * @see #getVvarref()
     * @generated
     */
    void setVvarref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVvarref()
     * @see #getVvarref()
     * @see #setVvarref(Double)
     * @generated
     */
    void unsetVvarref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEVArController#getVvarref <em>Vvarref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vvarref</em>' attribute is set.
     * @see #unsetVvarref()
     * @see #getVvarref()
     * @see #setVvarref(Double)
     * @generated
     */
    boolean isSetVvarref();

} // PFVArType1IEEEVArController
