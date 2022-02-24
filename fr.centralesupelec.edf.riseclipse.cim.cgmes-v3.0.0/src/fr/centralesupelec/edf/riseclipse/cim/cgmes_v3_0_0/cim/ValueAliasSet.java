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
 * A representation of the model object '<em><b>Value Alias Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the translation of a set of values into a name and is intendend to facilitate custom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0-&gt;"Invalid", 1-&gt;"Open", 2-&gt;"Closed", 3-&gt;"Intermediate". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getRaiseLowerCommands <em>Raise Lower Commands</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getDiscretes <em>Discretes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getCommands <em>Commands</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getValueAliasSet()
 * @model
 * @generated
 */
public interface ValueAliasSet extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Raise Lower Commands</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet <em>Value Alias Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Commands using the set for translation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Raise Lower Commands</em>' reference list.
     * @see #isSetRaiseLowerCommands()
     * @see #unsetRaiseLowerCommands()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getValueAliasSet_RaiseLowerCommands()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RaiseLowerCommand#getValueAliasSet
     * @model opposite="ValueAliasSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ValueAliasSet.RaiseLowerCommands' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RaiseLowerCommand > getRaiseLowerCommands();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getRaiseLowerCommands <em>Raise Lower Commands</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRaiseLowerCommands()
     * @see #getRaiseLowerCommands()
     * @generated
     */
    void unsetRaiseLowerCommands();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getRaiseLowerCommands <em>Raise Lower Commands</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Raise Lower Commands</em>' reference list is set.
     * @see #unsetRaiseLowerCommands()
     * @see #getRaiseLowerCommands()
     * @generated
     */
    boolean isSetRaiseLowerCommands();

    /**
     * Returns the value of the '<em><b>Discretes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet <em>Value Alias Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Measurements using the set for translation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discretes</em>' reference list.
     * @see #isSetDiscretes()
     * @see #unsetDiscretes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getValueAliasSet_Discretes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getValueAliasSet
     * @model opposite="ValueAliasSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ValueAliasSet.Discretes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Discrete > getDiscretes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getDiscretes <em>Discretes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscretes()
     * @see #getDiscretes()
     * @generated
     */
    void unsetDiscretes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getDiscretes <em>Discretes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discretes</em>' reference list is set.
     * @see #unsetDiscretes()
     * @see #getDiscretes()
     * @generated
     */
    boolean isSetDiscretes();

    /**
     * Returns the value of the '<em><b>Commands</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet <em>Value Alias Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Commands using the set for translation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Commands</em>' reference list.
     * @see #isSetCommands()
     * @see #unsetCommands()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getValueAliasSet_Commands()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getValueAliasSet
     * @model opposite="ValueAliasSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ValueAliasSet.Commands' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Command > getCommands();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getCommands <em>Commands</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommands()
     * @see #getCommands()
     * @generated
     */
    void unsetCommands();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getCommands <em>Commands</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Commands</em>' reference list is set.
     * @see #unsetCommands()
     * @see #getCommands()
     * @generated
     */
    boolean isSetCommands();

    /**
     * Returns the value of the '<em><b>Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueToAlias}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ValueToAlias mappings included in the set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Values</em>' reference list.
     * @see #isSetValues()
     * @see #unsetValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getValueAliasSet_Values()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueToAlias#getValueAliasSet
     * @model opposite="ValueAliasSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ValueAliasSet.Values' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ValueToAlias > getValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getValues <em>Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValues()
     * @see #getValues()
     * @generated
     */
    void unsetValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet#getValues <em>Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Values</em>' reference list is set.
     * @see #unsetValues()
     * @see #getValues()
     * @generated
     */
    boolean isSetValues();

} // ValueAliasSet
