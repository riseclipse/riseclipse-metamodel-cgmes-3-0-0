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
 * A representation of the model object '<em><b>Load Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Load whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * A standard feature of dynamic load behaviour modelling is the ability to associate the same behaviour to multiple energy consumers by means of a single load definition.  The load model is always applied to individual bus loads (energy consumers).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadDynamics()
 * @model
 * @generated
 */
public interface LoadDynamics extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy consumer to which this dynamics load model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Consumer</em>' reference list.
     * @see #isSetEnergyConsumer()
     * @see #unsetEnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadDynamics_EnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics
     * @model opposite="LoadDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='LoadDynamics.EnergyConsumer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< EnergyConsumer > getEnergyConsumer();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics#getEnergyConsumer <em>Energy Consumer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    void unsetEnergyConsumer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics#getEnergyConsumer <em>Energy Consumer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumer</em>' reference list is set.
     * @see #unsetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    boolean isSetEnergyConsumer();

} // LoadDynamics
