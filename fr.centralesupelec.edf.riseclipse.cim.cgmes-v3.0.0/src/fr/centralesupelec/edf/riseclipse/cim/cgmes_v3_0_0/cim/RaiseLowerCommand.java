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
 * A representation of the model object '<em><b>Raise Lower Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An analog control that increases or decreases a set point value with pulses. Unless otherwise specified, one pulse moves the set point by one.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRaiseLowerCommand()
 * @model
 * @generated
 */
public interface RaiseLowerCommand extends AnalogControl {
    /**
     * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getRaiseLowerCommands <em>Raise Lower Commands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ValueAliasSet used for translation of a Control value to a name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value Alias Set</em>' reference.
     * @see #isSetValueAliasSet()
     * @see #unsetValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRaiseLowerCommand_ValueAliasSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getRaiseLowerCommands
     * @model opposite="RaiseLowerCommands" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RaiseLowerCommand.ValueAliasSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ValueAliasSet getValueAliasSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet <em>Value Alias Set</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    void unsetValueAliasSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet <em>Value Alias Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value Alias Set</em>' reference is set.
     * @see #unsetValueAliasSet()
     * @see #getValueAliasSet()
     * @see #setValueAliasSet(ValueAliasSet)
     * @generated
     */
    boolean isSetValueAliasSet();

} // RaiseLowerCommand
