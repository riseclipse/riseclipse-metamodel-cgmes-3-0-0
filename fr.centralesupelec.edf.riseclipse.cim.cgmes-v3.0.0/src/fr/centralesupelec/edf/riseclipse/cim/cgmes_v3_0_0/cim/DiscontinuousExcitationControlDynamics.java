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
 * A representation of the model object '<em><b>Discontinuous Excitation Control Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Discontinuous excitation control function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model</font>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscontinuousExcitationControlDynamics()
 * @model
 * @generated
 */
public interface DiscontinuousExcitationControlDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Excitation System Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation system model with which this discontinuous excitation control model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Excitation System Dynamics</em>' reference.
     * @see #isSetExcitationSystemDynamics()
     * @see #unsetExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscontinuousExcitationControlDynamics_ExcitationSystemDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics
     * @model opposite="DiscontinuousExcitationControlDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiscontinuousExcitationControlDynamics.ExcitationSystemDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ExcitationSystemDynamics getExcitationSystemDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Excitation System Dynamics</em>' reference.
     * @see #isSetExcitationSystemDynamics()
     * @see #unsetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @generated
     */
    void setExcitationSystemDynamics( ExcitationSystemDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @generated
     */
    void unsetExcitationSystemDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Excitation System Dynamics</em>' reference is set.
     * @see #unsetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @generated
     */
    boolean isSetExcitationSystemDynamics();

    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Remote input signal used by this discontinuous excitation control system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscontinuousExcitationControlDynamics_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics
     * @model opposite="DiscontinuousExcitationControlDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiscontinuousExcitationControlDynamics.RemoteInputSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RemoteInputSignal getRemoteInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Input Signal</em>' reference is set.
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    boolean isSetRemoteInputSignal();

} // DiscontinuousExcitationControlDynamics
