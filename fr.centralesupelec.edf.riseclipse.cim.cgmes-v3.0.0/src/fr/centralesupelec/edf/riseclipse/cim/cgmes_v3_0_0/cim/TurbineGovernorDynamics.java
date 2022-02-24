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
 * A representation of the model object '<em><b>Turbine Governor Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Turbine-governor function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorDynamics()
 * @model
 * @generated
 */
public interface TurbineGovernorDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Turbine Load Controller Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine load controller providing input to this turbine-governor.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Load Controller Dynamics</em>' reference.
     * @see #isSetTurbineLoadControllerDynamics()
     * @see #unsetTurbineLoadControllerDynamics()
     * @see #setTurbineLoadControllerDynamics(TurbineLoadControllerDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorDynamics_TurbineLoadControllerDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics
     * @model opposite="TurbineGovernorDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TurbineGovernorDynamics.TurbineLoadControllerDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TurbineLoadControllerDynamics getTurbineLoadControllerDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Load Controller Dynamics</em>' reference.
     * @see #isSetTurbineLoadControllerDynamics()
     * @see #unsetTurbineLoadControllerDynamics()
     * @see #getTurbineLoadControllerDynamics()
     * @generated
     */
    void setTurbineLoadControllerDynamics( TurbineLoadControllerDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineLoadControllerDynamics()
     * @see #getTurbineLoadControllerDynamics()
     * @see #setTurbineLoadControllerDynamics(TurbineLoadControllerDynamics)
     * @generated
     */
    void unsetTurbineLoadControllerDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Load Controller Dynamics</em>' reference is set.
     * @see #unsetTurbineLoadControllerDynamics()
     * @see #getTurbineLoadControllerDynamics()
     * @see #setTurbineLoadControllerDynamics(TurbineLoadControllerDynamics)
     * @generated
     */
    boolean isSetTurbineLoadControllerDynamics();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine model with which this turbine-governor model is associated. TurbineGovernorDynamics shall have either an association to SynchronousMachineDynamics or to AsynchronousMachineDynamics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorDynamics_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getTurbineGovernorDynamics
     * @model opposite="TurbineGovernorDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TurbineGovernorDynamics.SynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Asynchronous machine model with which this turbine-governor model is associated. TurbineGovernorDynamics shall have either an association to SynchronousMachineDynamics or to AsynchronousMachineDynamics.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorDynamics_AsynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics
     * @model opposite="TurbineGovernorDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TurbineGovernorDynamics.AsynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineDynamics getAsynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    void unsetAsynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Dynamics</em>' reference is set.
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    boolean isSetAsynchronousMachineDynamics();

} // TurbineGovernorDynamics
