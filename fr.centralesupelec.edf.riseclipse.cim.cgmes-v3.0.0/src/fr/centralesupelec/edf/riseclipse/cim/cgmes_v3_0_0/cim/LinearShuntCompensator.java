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
 * A representation of the model object '<em><b>Linear Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A linear shunt compensator has banks or sections with equal admittance values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLinearShuntCompensator()
 * @model
 * @generated
 */
public interface LinearShuntCompensator extends ShuntCompensator {
    /**
     * Returns the value of the '<em><b>BPer Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) susceptance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>BPer Section</em>' attribute.
     * @see #isSetBPerSection()
     * @see #unsetBPerSection()
     * @see #setBPerSection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLinearShuntCompensator_BPerSection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='LinearShuntCompensator.bPerSection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>BPer Section</em>' attribute.
     * @see #isSetBPerSection()
     * @see #unsetBPerSection()
     * @see #getBPerSection()
     * @generated
     */
    void setBPerSection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBPerSection()
     * @see #getBPerSection()
     * @see #setBPerSection(Double)
     * @generated
     */
    void unsetBPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>BPer Section</em>' attribute is set.
     * @see #unsetBPerSection()
     * @see #getBPerSection()
     * @see #setBPerSection(Double)
     * @generated
     */
    boolean isSetBPerSection();

    /**
     * Returns the value of the '<em><b>G0 Per Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) conductance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>G0 Per Section</em>' attribute.
     * @see #isSetG0PerSection()
     * @see #unsetG0PerSection()
     * @see #setG0PerSection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLinearShuntCompensator_G0PerSection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='LinearShuntCompensator.g0PerSection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getG0PerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0 Per Section</em>' attribute.
     * @see #isSetG0PerSection()
     * @see #unsetG0PerSection()
     * @see #getG0PerSection()
     * @generated
     */
    void setG0PerSection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0PerSection()
     * @see #getG0PerSection()
     * @see #setG0PerSection(Double)
     * @generated
     */
    void unsetG0PerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0 Per Section</em>' attribute is set.
     * @see #unsetG0PerSection()
     * @see #getG0PerSection()
     * @see #setG0PerSection(Double)
     * @generated
     */
    boolean isSetG0PerSection();

    /**
     * Returns the value of the '<em><b>B0 Per Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) susceptance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>B0 Per Section</em>' attribute.
     * @see #isSetB0PerSection()
     * @see #unsetB0PerSection()
     * @see #setB0PerSection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLinearShuntCompensator_B0PerSection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='LinearShuntCompensator.b0PerSection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getB0PerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0 Per Section</em>' attribute.
     * @see #isSetB0PerSection()
     * @see #unsetB0PerSection()
     * @see #getB0PerSection()
     * @generated
     */
    void setB0PerSection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0PerSection()
     * @see #getB0PerSection()
     * @see #setB0PerSection(Double)
     * @generated
     */
    void unsetB0PerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0 Per Section</em>' attribute is set.
     * @see #unsetB0PerSection()
     * @see #getB0PerSection()
     * @see #setB0PerSection(Double)
     * @generated
     */
    boolean isSetB0PerSection();

    /**
     * Returns the value of the '<em><b>GPer Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) conductance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>GPer Section</em>' attribute.
     * @see #isSetGPerSection()
     * @see #unsetGPerSection()
     * @see #setGPerSection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLinearShuntCompensator_GPerSection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='LinearShuntCompensator.gPerSection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGPerSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GPer Section</em>' attribute.
     * @see #isSetGPerSection()
     * @see #unsetGPerSection()
     * @see #getGPerSection()
     * @generated
     */
    void setGPerSection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Double)
     * @generated
     */
    void unsetGPerSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LinearShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GPer Section</em>' attribute is set.
     * @see #unsetGPerSection()
     * @see #getGPerSection()
     * @see #setGPerSection(Double)
     * @generated
     */
    boolean isSetGPerSection();

} // LinearShuntCompensator
