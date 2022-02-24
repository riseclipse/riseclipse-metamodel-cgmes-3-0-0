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
 * A representation of the model object '<em><b>Cross Compound Turbine Governor Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Turbine-governor cross-compound function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCrossCompoundTurbineGovernorDynamics()
 * @model
 * @generated
 */
public interface CrossCompoundTurbineGovernorDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>High Pressure Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High-pressure synchronous machine with which this cross-compound turbine governor is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>High Pressure Synchronous Machine Dynamics</em>' reference.
     * @see #isSetHighPressureSynchronousMachineDynamics()
     * @see #unsetHighPressureSynchronousMachineDynamics()
     * @see #setHighPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCrossCompoundTurbineGovernorDynamics_HighPressureSynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics
     * @model opposite="CrossCompoundTurbineGovernorDyanmics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='CrossCompoundTurbineGovernorDynamics.HighPressureSynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getHighPressureSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Pressure Synchronous Machine Dynamics</em>' reference.
     * @see #isSetHighPressureSynchronousMachineDynamics()
     * @see #unsetHighPressureSynchronousMachineDynamics()
     * @see #getHighPressureSynchronousMachineDynamics()
     * @generated
     */
    void setHighPressureSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighPressureSynchronousMachineDynamics()
     * @see #getHighPressureSynchronousMachineDynamics()
     * @see #setHighPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetHighPressureSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Pressure Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetHighPressureSynchronousMachineDynamics()
     * @see #getHighPressureSynchronousMachineDynamics()
     * @see #setHighPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetHighPressureSynchronousMachineDynamics();

    /**
     * Returns the value of the '<em><b>Low Pressure Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low-pressure synchronous machine with which this cross-compound turbine governor is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Low Pressure Synchronous Machine Dynamics</em>' reference.
     * @see #isSetLowPressureSynchronousMachineDynamics()
     * @see #unsetLowPressureSynchronousMachineDynamics()
     * @see #setLowPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCrossCompoundTurbineGovernorDynamics_LowPressureSynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics
     * @model opposite="CrossCompoundTurbineGovernorDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='CrossCompoundTurbineGovernorDynamics.LowPressureSynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getLowPressureSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Pressure Synchronous Machine Dynamics</em>' reference.
     * @see #isSetLowPressureSynchronousMachineDynamics()
     * @see #unsetLowPressureSynchronousMachineDynamics()
     * @see #getLowPressureSynchronousMachineDynamics()
     * @generated
     */
    void setLowPressureSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowPressureSynchronousMachineDynamics()
     * @see #getLowPressureSynchronousMachineDynamics()
     * @see #setLowPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetLowPressureSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Pressure Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetLowPressureSynchronousMachineDynamics()
     * @see #getLowPressureSynchronousMachineDynamics()
     * @see #setLowPressureSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetLowPressureSynchronousMachineDynamics();

} // CrossCompoundTurbineGovernorDynamics
