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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Discrete represents a discrete Measurement, i.e. a Measurement representing discrete values, e.g. a Breaker position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscrete()
 * @model
 * @generated
 */
public interface Discrete extends Measurement {
    /**
     * Returns the value of the '<em><b>Discrete Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete <em>Discrete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The values connected to this measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discrete Values</em>' reference list.
     * @see #isSetDiscreteValues()
     * @see #unsetDiscreteValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscrete_DiscreteValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete
     * @model opposite="Discrete" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Discrete.DiscreteValues' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiscreteValue > getDiscreteValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscreteValues()
     * @see #getDiscreteValues()
     * @generated
     */
    void unsetDiscreteValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete Values</em>' reference list is set.
     * @see #unsetDiscreteValues()
     * @see #getDiscreteValues()
     * @generated
     */
    boolean isSetDiscreteValues();

    /**
     * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ValueAliasSet used for translation of a MeasurementValue.value to a name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscrete_ValueAliasSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getDiscretes
     * @model opposite="Discretes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Discrete.ValueAliasSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ValueAliasSet getValueAliasSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @generated
     */
    void setValueAliasSet( ValueAliasSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    void unsetValueAliasSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value Alias Set</em>' reference is set.
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    boolean isSetValueAliasSet();

} // Discrete
