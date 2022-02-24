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
 * A representation of the model object '<em><b>Dynamics Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract parent class for all Dynamics function blocks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDynamicsFunctionBlock()
 * @model
 * @generated
 */
public interface DynamicsFunctionBlock extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Function block used indicator.
     * true = use of function block is enabled
     * false = use of function block is disabled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #setEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDynamicsFunctionBlock_Enabled()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='DynamicsFunctionBlock.enabled' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @generated
     */
    void setEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    void unsetEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DynamicsFunctionBlock#getEnabled <em>Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enabled</em>' attribute is set.
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    boolean isSetEnabled();

} // DynamicsFunctionBlock
