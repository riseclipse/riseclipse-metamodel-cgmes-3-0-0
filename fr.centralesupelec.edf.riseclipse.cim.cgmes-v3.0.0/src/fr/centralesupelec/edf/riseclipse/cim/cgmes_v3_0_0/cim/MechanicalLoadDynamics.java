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
 * A representation of the model object '<em><b>Mechanical Load Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mechanical load function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMechanicalLoadDynamics()
 * @model
 * @generated
 */
public interface MechanicalLoadDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine model with which this mechanical load model is associated. MechanicalLoadDynamics shall have either an association to SynchronousMachineDynamics or AsynchronousMachineDyanmics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMechanicalLoadDynamics_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics
     * @model opposite="MechanicalLoadDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MechanicalLoadDynamics.SynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @generated
     */
    void setSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetSynchronousMachineDynamics();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Asynchronous machine model with which this mechanical load model is associated. MechanicalLoadDynamics shall have either an association to SynchronousMachineDynamics or to AsynchronousMachineDynamics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMechanicalLoadDynamics_AsynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics
     * @model opposite="MechanicalLoadDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MechanicalLoadDynamics.AsynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineDynamics getAsynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @generated
     */
    void setAsynchronousMachineDynamics( AsynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    void unsetAsynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Dynamics</em>' reference is set.
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    boolean isSetAsynchronousMachineDynamics();

} // MechanicalLoadDynamics
