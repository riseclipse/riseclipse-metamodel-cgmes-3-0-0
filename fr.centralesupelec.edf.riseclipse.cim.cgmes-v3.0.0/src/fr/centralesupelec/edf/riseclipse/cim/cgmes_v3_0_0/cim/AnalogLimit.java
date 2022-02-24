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
 * A representation of the model object '<em><b>Analog Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Limit values for Analog measurements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getLimitSet <em>Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogLimit()
 * @model
 * @generated
 */
public interface AnalogLimit extends Limit {
    /**
     * Returns the value of the '<em><b>Limit Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet#getLimits <em>Limits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of limits.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Limit Set</em>' reference.
     * @see #isSetLimitSet()
     * @see #unsetLimitSet()
     * @see #setLimitSet(AnalogLimitSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogLimit_LimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet#getLimits
     * @model opposite="Limits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AnalogLimit.LimitSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AnalogLimitSet getLimitSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getLimitSet <em>Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit Set</em>' reference.
     * @see #isSetLimitSet()
     * @see #unsetLimitSet()
     * @see #getLimitSet()
     * @generated
     */
    void setLimitSet( AnalogLimitSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getLimitSet <em>Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimitSet()
     * @see #getLimitSet()
     * @see #setLimitSet(AnalogLimitSet)
     * @generated
     */
    void unsetLimitSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getLimitSet <em>Limit Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Set</em>' reference is set.
     * @see #unsetLimitSet()
     * @see #getLimitSet()
     * @see #setLimitSet(AnalogLimitSet)
     * @generated
     */
    boolean isSetLimitSet();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value to supervise against.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogLimit_Value()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='AnalogLimit.value' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Double)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimit#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Double)
     * @generated
     */
    boolean isSetValue();

} // AnalogLimit
