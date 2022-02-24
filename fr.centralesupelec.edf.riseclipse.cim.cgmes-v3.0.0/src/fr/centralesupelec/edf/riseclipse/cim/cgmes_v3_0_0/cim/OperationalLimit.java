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
 * A representation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value and normal value associated with a specific kind of limit.
 * The sub class value and normalValue attributes vary inversely to the associated OperationalLimitType.acceptableDuration (acceptableDuration for short).
 * If a particular piece of equipment has multiple operational limits of the same kind (apparent power, current, etc.), the limit with the greatest acceptableDuration shall have the smallest limit value and the limit with the smallest acceptableDuration shall have the largest limit value.  Note: A large current can only be allowed to flow through a piece of equipment for a short duration without causing damage, but a lesser current can be allowed to flow for a longer duration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimit()
 * @model
 * @generated
 */
public interface OperationalLimit extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Operational Limit Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The limit type associated with this limit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit Type</em>' reference.
     * @see #isSetOperationalLimitType()
     * @see #unsetOperationalLimitType()
     * @see #setOperationalLimitType(OperationalLimitType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimit_OperationalLimitType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getOperationalLimit
     * @model opposite="OperationalLimit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='OperationalLimit.OperationalLimitType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OperationalLimitType getOperationalLimitType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operational Limit Type</em>' reference.
     * @see #isSetOperationalLimitType()
     * @see #unsetOperationalLimitType()
     * @see #getOperationalLimitType()
     * @generated
     */
    void setOperationalLimitType( OperationalLimitType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitType()
     * @see #getOperationalLimitType()
     * @see #setOperationalLimitType(OperationalLimitType)
     * @generated
     */
    void unsetOperationalLimitType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Type</em>' reference is set.
     * @see #unsetOperationalLimitType()
     * @see #getOperationalLimitType()
     * @see #setOperationalLimitType(OperationalLimitType)
     * @generated
     */
    boolean isSetOperationalLimitType();

    /**
     * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The limit set to which the limit values belong.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit Set</em>' reference.
     * @see #isSetOperationalLimitSet()
     * @see #unsetOperationalLimitSet()
     * @see #setOperationalLimitSet(OperationalLimitSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimit_OperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getOperationalLimitValue
     * @model opposite="OperationalLimitValue" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='OperationalLimit.OperationalLimitSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OperationalLimitSet getOperationalLimitSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operational Limit Set</em>' reference.
     * @see #isSetOperationalLimitSet()
     * @see #unsetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    void setOperationalLimitSet( OperationalLimitSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @see #setOperationalLimitSet(OperationalLimitSet)
     * @generated
     */
    void unsetOperationalLimitSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Set</em>' reference is set.
     * @see #unsetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @see #setOperationalLimitSet(OperationalLimitSet)
     * @generated
     */
    boolean isSetOperationalLimitSet();

} // OperationalLimit
