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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Command is a discrete control used for supervisory control.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue <em>Discrete Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getNormalValue <em>Normal Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Control {
    /**
     * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getCommands <em>Commands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ValueAliasSet used for translation of a Control value to a name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCommand_ValueAliasSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getCommands
     * @model opposite="Commands" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Command.ValueAliasSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ValueAliasSet getValueAliasSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet <em>Value Alias Set</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    void unsetValueAliasSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet <em>Value Alias Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value Alias Set</em>' reference is set.
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    boolean isSetValueAliasSet();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value representing the actuator output.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCommand_Value()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='Command.value' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(BigInteger)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(BigInteger)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Discrete Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The MeasurementValue that is controlled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discrete Value</em>' reference.
     * @see #isSetDiscreteValue()
     * @see #unsetDiscreteValue()
     * @see #setDiscreteValue(DiscreteValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCommand_DiscreteValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand
     * @model opposite="Command" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Command.DiscreteValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiscreteValue getDiscreteValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue <em>Discrete Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discrete Value</em>' reference.
     * @see #isSetDiscreteValue()
     * @see #unsetDiscreteValue()
     * @see #getDiscreteValue()
     * @generated
     */
    void setDiscreteValue( DiscreteValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue <em>Discrete Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscreteValue()
     * @see #getDiscreteValue()
     * @see #setDiscreteValue(DiscreteValue)
     * @generated
     */
    void unsetDiscreteValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue <em>Discrete Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete Value</em>' reference is set.
     * @see #unsetDiscreteValue()
     * @see #getDiscreteValue()
     * @see #setDiscreteValue(DiscreteValue)
     * @generated
     */
    boolean isSetDiscreteValue();

    /**
     * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Normal value for Control.value e.g. used for percentage scaling.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normal Value</em>' attribute.
     * @see #isSetNormalValue()
     * @see #unsetNormalValue()
     * @see #setNormalValue(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCommand_NormalValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='Command.normalValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getNormalValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getNormalValue <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Value</em>' attribute.
     * @see #isSetNormalValue()
     * @see #unsetNormalValue()
     * @see #getNormalValue()
     * @generated
     */
    void setNormalValue( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getNormalValue <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalValue()
     * @see #getNormalValue()
     * @see #setNormalValue(BigInteger)
     * @generated
     */
    void unsetNormalValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getNormalValue <em>Normal Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Value</em>' attribute is set.
     * @see #unsetNormalValue()
     * @see #getNormalValue()
     * @see #setNormalValue(BigInteger)
     * @generated
     */
    boolean isSetNormalValue();

} // Command
