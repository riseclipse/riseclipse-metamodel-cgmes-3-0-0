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
 * A representation of the model object '<em><b>Wind Turbine Type3or4 Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent class supporting relationships to wind turbines type 3 and type 4 and wind plant including their control models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics <em>Wind Plant Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection <em>Power Electronics Connection</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType3or4Dynamics()
 * @model
 * @generated
 */
public interface WindTurbineType3or4Dynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Wind Plant Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind plant with which the wind turbines type 3 or type 4 are associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Dynamics</em>' reference.
     * @see #isSetWindPlantDynamics()
     * @see #unsetWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType3or4Dynamics_WindPlantDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getWindTurbineType3or4Dynamics
     * @model opposite="WindTurbineType3or4Dynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType3or4Dynamics.WindPlantDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantDynamics getWindPlantDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Dynamics</em>' reference.
     * @see #isSetWindPlantDynamics()
     * @see #unsetWindPlantDynamics()
     * @see #getWindPlantDynamics()
     * @generated
     */
    void setWindPlantDynamics( WindPlantDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantDynamics()
     * @see #getWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @generated
     */
    void unsetWindPlantDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Dynamics</em>' reference is set.
     * @see #unsetWindPlantDynamics()
     * @see #getWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @generated
     */
    boolean isSetWindPlantDynamics();

    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Remote input signal used by these wind turbine type 3 or type 4 models.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType3or4Dynamics_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics
     * @model opposite="WindTurbineType3or4Dynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType3or4Dynamics.RemoteInputSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RemoteInputSignal getRemoteInputSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @see #setRemoteInputSignal(RemoteInputSignal)
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}' reference is set.
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
     * Returns the value of the '<em><b>Power Electronics Connection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The power electronics connection associated with this wind turbine type 3 or type 4 dynamics model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power Electronics Connection</em>' reference.
     * @see #isSetPowerElectronicsConnection()
     * @see #unsetPowerElectronicsConnection()
     * @see #setPowerElectronicsConnection(PowerElectronicsConnection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType3or4Dynamics_PowerElectronicsConnection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics
     * @model opposite="WindTurbineType3or4Dynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType3or4Dynamics.PowerElectronicsConnection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerElectronicsConnection getPowerElectronicsConnection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection <em>Power Electronics Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Electronics Connection</em>' reference.
     * @see #isSetPowerElectronicsConnection()
     * @see #unsetPowerElectronicsConnection()
     * @see #getPowerElectronicsConnection()
     * @generated
     */
    void setPowerElectronicsConnection( PowerElectronicsConnection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection <em>Power Electronics Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerElectronicsConnection()
     * @see #getPowerElectronicsConnection()
     * @see #setPowerElectronicsConnection(PowerElectronicsConnection)
     * @generated
     */
    void unsetPowerElectronicsConnection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection <em>Power Electronics Connection</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Electronics Connection</em>' reference is set.
     * @see #unsetPowerElectronicsConnection()
     * @see #getPowerElectronicsConnection()
     * @see #setPowerElectronicsConnection(PowerElectronicsConnection)
     * @generated
     */
    boolean isSetPowerElectronicsConnection();

} // WindTurbineType3or4Dynamics
