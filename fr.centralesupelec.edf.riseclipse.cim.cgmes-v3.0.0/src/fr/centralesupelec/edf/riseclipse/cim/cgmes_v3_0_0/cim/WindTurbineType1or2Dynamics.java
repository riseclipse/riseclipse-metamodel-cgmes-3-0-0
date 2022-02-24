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
 * A representation of the model object '<em><b>Wind Turbine Type1or2 Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent class supporting relationships to wind turbines type 1 and type 2 and their control models.  Generator model for wind turbine of type 1 or type 2 is a standard asynchronous generator model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType1or2Dynamics()
 * @model
 * @generated
 */
public interface WindTurbineType1or2Dynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Remote input signal used by this wind generator type 1 or type 2 model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType1or2Dynamics_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics
     * @model opposite="WindTurbineType1or2Dynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType1or2Dynamics.RemoteInputSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RemoteInputSignal getRemoteInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @generated
     */
    void setRemoteInputSignal( RemoteInputSignal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Input Signal</em>' reference is set.
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    boolean isSetRemoteInputSignal();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Asynchronous machine model with which this wind generator type 1 or type 2 model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType1or2Dynamics_AsynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics
     * @model opposite="WindTurbineType1or2Dynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType1or2Dynamics.AsynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineDynamics getAsynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    void unsetAsynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Dynamics</em>' reference is set.
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    boolean isSetAsynchronousMachineDynamics();

} // WindTurbineType1or2Dynamics
