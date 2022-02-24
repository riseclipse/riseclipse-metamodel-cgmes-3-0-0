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
 * A representation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiscreteValue represents a discrete MeasurementValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscreteValue()
 * @model
 * @generated
 */
public interface DiscreteValue extends MeasurementValue {
    /**
     * Returns the value of the '<em><b>Discrete</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement to which this value is connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discrete</em>' reference.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #setDiscrete(Discrete)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscreteValue_Discrete()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete#getDiscreteValues
     * @model opposite="DiscreteValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiscreteValue.Discrete' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Discrete getDiscrete();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discrete</em>' reference.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @generated
     */
    void setDiscrete( Discrete value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Discrete)
     * @generated
     */
    void unsetDiscrete();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete</em>' reference is set.
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Discrete)
     * @generated
     */
    boolean isSetDiscrete();

    /**
     * Returns the value of the '<em><b>Command</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue <em>Discrete Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Control variable associated with the MeasurementValue.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Command</em>' reference.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #setCommand(Command)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscreteValue_Command()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command#getDiscreteValue
     * @model opposite="DiscreteValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiscreteValue.Command' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Command getCommand();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand <em>Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command</em>' reference.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #getCommand()
     * @generated
     */
    void setCommand( Command value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand <em>Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommand()
     * @see #getCommand()
     * @see #setCommand(Command)
     * @generated
     */
    void unsetCommand();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue#getCommand <em>Command</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Command</em>' reference is set.
     * @see #unsetCommand()
     * @see #getCommand()
     * @see #setCommand(Command)
     * @generated
     */
    boolean isSetCommand();

} // DiscreteValue
