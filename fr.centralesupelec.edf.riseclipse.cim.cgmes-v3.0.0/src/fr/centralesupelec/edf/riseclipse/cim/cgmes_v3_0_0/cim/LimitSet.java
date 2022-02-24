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
 * A representation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLimitSet()
 * @model
 * @generated
 */
public interface LimitSet extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Percentage Limits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tells if the limit values are in percentage of normalValue or the specified Unit for Measurements and Controls.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Percentage Limits</em>' attribute.
     * @see #isSetIsPercentageLimits()
     * @see #unsetIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLimitSet_IsPercentageLimits()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='LimitSet.isPercentageLimits' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIsPercentageLimits();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Percentage Limits</em>' attribute.
     * @see #isSetIsPercentageLimits()
     * @see #unsetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @generated
     */
    void setIsPercentageLimits( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @generated
     */
    void unsetIsPercentageLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LimitSet#getIsPercentageLimits <em>Is Percentage Limits</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Percentage Limits</em>' attribute is set.
     * @see #unsetIsPercentageLimits()
     * @see #getIsPercentageLimits()
     * @see #setIsPercentageLimits(Boolean)
     * @generated
     */
    boolean isSetIsPercentageLimits();

} // LimitSet
