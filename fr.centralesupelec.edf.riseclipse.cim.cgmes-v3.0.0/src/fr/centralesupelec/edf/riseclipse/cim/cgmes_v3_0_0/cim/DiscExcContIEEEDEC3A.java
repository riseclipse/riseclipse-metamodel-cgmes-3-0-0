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
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC3A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE type DEC3A model. In some systems, the stabilizer output is disconnected from the regulator immediately following a severe fault to prevent the stabilizer from competing with action of voltage regulator during the first swing.
 * Reference: IEEE 421.5-2005 12.4.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC3A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC3A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Tdr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reset time delay (<i>T</i><i><sub>DR</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdr</em>' attribute.
     * @see #isSetTdr()
     * @see #unsetTdr()
     * @see #setTdr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC3A_Tdr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC3A.tdr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdr</em>' attribute.
     * @see #isSetTdr()
     * @see #unsetTdr()
     * @see #getTdr()
     * @generated
     */
    void setTdr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdr()
     * @see #getTdr()
     * @see #setTdr(Double)
     * @generated
     */
    void unsetTdr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdr</em>' attribute is set.
     * @see #unsetTdr()
     * @see #getTdr()
     * @see #setTdr(Double)
     * @generated
     */
    boolean isSetTdr();

    /**
     * Returns the value of the '<em><b>Vtmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Terminal undervoltage comparison level (<i>V</i><i><sub>TMIN</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #setVtmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC3A_Vtmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC3A.vtmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @generated
     */
    void setVtmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Double)
     * @generated
     */
    void unsetVtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtmin</em>' attribute is set.
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Double)
     * @generated
     */
    boolean isSetVtmin();

} // DiscExcContIEEEDEC3A
