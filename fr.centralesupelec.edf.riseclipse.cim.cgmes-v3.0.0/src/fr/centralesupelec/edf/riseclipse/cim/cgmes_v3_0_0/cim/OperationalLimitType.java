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

import org.eclipse.emf.common.util.EList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The operational meaning of a category of limits.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getIsInfiniteDuration <em>Is Infinite Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType()
 * @model
 * @generated
 */
public interface OperationalLimitType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitDirectionKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The direction of the limit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType_Direction()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitType.direction' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OperationalLimitDirectionKind getDirection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitDirectionKind
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection( OperationalLimitDirectionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(OperationalLimitDirectionKind)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Types of limits defined in the ENTSO-E Operational Handbook Policy 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(LimitKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType_Kind()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitType.kind' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    LimitKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( LimitKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(LimitKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(LimitKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Acceptable Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The nominal acceptable duration of the limit. Limits are commonly expressed in terms of the time limit for which the limit is normally acceptable. The actual acceptable duration of a specific limit may depend on other local factors such as temperature or wind speed. The attribute has meaning only if the flag isInfiniteDuration is set to false, hence it shall not be exchanged when isInfiniteDuration is set to true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Acceptable Duration</em>' attribute.
     * @see #isSetAcceptableDuration()
     * @see #unsetAcceptableDuration()
     * @see #setAcceptableDuration(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType_AcceptableDuration()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitType.acceptableDuration' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAcceptableDuration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Acceptable Duration</em>' attribute.
     * @see #isSetAcceptableDuration()
     * @see #unsetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @generated
     */
    void setAcceptableDuration( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @see #setAcceptableDuration(Double)
     * @generated
     */
    void unsetAcceptableDuration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Acceptable Duration</em>' attribute is set.
     * @see #unsetAcceptableDuration()
     * @see #getAcceptableDuration()
     * @see #setAcceptableDuration(Double)
     * @generated
     */
    boolean isSetAcceptableDuration();

    /**
     * Returns the value of the '<em><b>Operational Limit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operational limits associated with this type of limit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit</em>' reference list.
     * @see #isSetOperationalLimit()
     * @see #unsetOperationalLimit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType_OperationalLimit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit#getOperationalLimitType
     * @model opposite="OperationalLimitType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitType.OperationalLimit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< OperationalLimit > getOperationalLimit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimit()
     * @see #getOperationalLimit()
     * @generated
     */
    void unsetOperationalLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit</em>' reference list is set.
     * @see #unsetOperationalLimit()
     * @see #getOperationalLimit()
     * @generated
     */
    boolean isSetOperationalLimit();

    /**
     * Returns the value of the '<em><b>Is Infinite Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines if the operational limit type has infinite duration. If true, the limit has infinite duration. If false, the limit has definite duration which is defined by the attribute acceptableDuration.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Infinite Duration</em>' attribute.
     * @see #isSetIsInfiniteDuration()
     * @see #unsetIsInfiniteDuration()
     * @see #setIsInfiniteDuration(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOperationalLimitType_IsInfiniteDuration()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='OperationalLimitType.isInfiniteDuration' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIsInfiniteDuration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getIsInfiniteDuration <em>Is Infinite Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Infinite Duration</em>' attribute.
     * @see #isSetIsInfiniteDuration()
     * @see #unsetIsInfiniteDuration()
     * @see #getIsInfiniteDuration()
     * @generated
     */
    void setIsInfiniteDuration( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getIsInfiniteDuration <em>Is Infinite Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsInfiniteDuration()
     * @see #getIsInfiniteDuration()
     * @see #setIsInfiniteDuration(Boolean)
     * @generated
     */
    void unsetIsInfiniteDuration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType#getIsInfiniteDuration <em>Is Infinite Duration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Infinite Duration</em>' attribute is set.
     * @see #unsetIsInfiniteDuration()
     * @see #getIsInfiniteDuration()
     * @see #setIsInfiniteDuration(Boolean)
     * @generated
     */
    boolean isSetIsInfiniteDuration();

} // OperationalLimitType
