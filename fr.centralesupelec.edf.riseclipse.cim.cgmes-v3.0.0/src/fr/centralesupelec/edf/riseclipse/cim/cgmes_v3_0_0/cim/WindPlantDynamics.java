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
 * A representation of the model object '<em><b>Wind Plant Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent class supporting relationships to wind turbines type 3 and type 4 and wind plant IEC and user-defined wind plants including their control models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantDynamics()
 * @model
 * @generated
 */
public interface WindPlantDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 Dynamics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics <em>Wind Plant Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind turbine type 3 or type 4 associated with this wind plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference list.
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantDynamics_WindTurbineType3or4Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics
     * @model opposite="WindPlantDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantDynamics.WindTurbineType3or4Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindTurbineType3or4Dynamics > getWindTurbineType3or4Dynamics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     */
    void unsetWindTurbineType3or4Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference list is set.
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     */
    boolean isSetWindTurbineType3or4Dynamics();

    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics <em>Wind Plant Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The remote signal with which this power plant is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantDynamics_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics
     * @model opposite="WindPlantDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindPlantDynamics.RemoteInputSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RemoteInputSignal getRemoteInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Input Signal</em>' reference is set.
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    boolean isSetRemoteInputSignal();

} // WindPlantDynamics
