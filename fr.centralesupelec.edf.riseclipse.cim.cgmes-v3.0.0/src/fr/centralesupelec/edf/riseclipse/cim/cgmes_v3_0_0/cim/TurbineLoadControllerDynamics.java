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
 * A representation of the model object '<em><b>Turbine Load Controller Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Turbine load controller function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineLoadControllerDynamics()
 * @model
 * @generated
 */
public interface TurbineLoadControllerDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Turbine Governor Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics <em>Turbine Load Controller Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine-governor controlled by this turbine load controller.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Governor Dynamics</em>' reference.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineLoadControllerDynamics_TurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getTurbineLoadControllerDynamics
     * @model opposite="TurbineLoadControllerDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TurbineLoadControllerDynamics.TurbineGovernorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TurbineGovernorDynamics getTurbineGovernorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Governor Dynamics</em>' reference.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @generated
     */
    void setTurbineGovernorDynamics( TurbineGovernorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    void unsetTurbineGovernorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Governor Dynamics</em>' reference is set.
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    boolean isSetTurbineGovernorDynamics();

} // TurbineLoadControllerDynamics
