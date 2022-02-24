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
 * A representation of the model object '<em><b>Asynchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Asynchronous machine whose behaviour is described by reference to a standard model expressed in either time constant reactance form or equivalent circuit form <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * Parameter details:
 * <ol>
 * 	<li>Asynchronous machine parameters such as <i>Xl, Xs,</i> etc. are actually used as inductances in the model, but are commonly referred to as reactances since, at nominal frequency, the PU values are the same. However, some references use the symbol <i>L</i> instead of <i>X</i>.</li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineDynamics()
 * @model
 * @generated
 */
public interface AsynchronousMachineDynamics extends RotatingMachineDynamics {
    /**
     * Returns the value of the '<em><b>Asynchronous Machine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Asynchronous machine to which this asynchronous machine dynamics model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine</em>' reference.
     * @see #isSetAsynchronousMachine()
     * @see #unsetAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineDynamics_AsynchronousMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineDynamics.AsynchronousMachine' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachine getAsynchronousMachine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine</em>' reference.
     * @see #isSetAsynchronousMachine()
     * @see #unsetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @generated
     */
    void setAsynchronousMachine( AsynchronousMachine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @generated
     */
    void unsetAsynchronousMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine</em>' reference is set.
     * @see #unsetAsynchronousMachine()
     * @see #getAsynchronousMachine()
     * @see #setAsynchronousMachine(AsynchronousMachine)
     * @generated
     */
    boolean isSetAsynchronousMachine();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 1 or type 2 model associated with this asynchronous machine model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference.
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineDynamics_WindTurbineType1or2Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineDynamics.WindTurbineType1or2Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference.
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @generated
     */
    void setWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @generated
     */
    void unsetWindTurbineType1or2Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference is set.
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @generated
     */
    boolean isSetWindTurbineType1or2Dynamics();

    /**
     * Returns the value of the '<em><b>Turbine Governor Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine-governor model associated with this asynchronous machine model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Governor Dynamics</em>' reference.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineDynamics_TurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineDynamics.TurbineGovernorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TurbineGovernorDynamics getTurbineGovernorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    void unsetTurbineGovernorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Governor Dynamics</em>' reference is set.
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @see #setTurbineGovernorDynamics(TurbineGovernorDynamics)
     * @generated
     */
    boolean isSetTurbineGovernorDynamics();

    /**
     * Returns the value of the '<em><b>Mechanical Load Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanical load model associated with this asynchronous machine model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mechanical Load Dynamics</em>' reference.
     * @see #isSetMechanicalLoadDynamics()
     * @see #unsetMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineDynamics_MechanicalLoadDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getAsynchronousMachineDynamics
     * @model opposite="AsynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineDynamics.MechanicalLoadDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MechanicalLoadDynamics getMechanicalLoadDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanical Load Dynamics</em>' reference.
     * @see #isSetMechanicalLoadDynamics()
     * @see #unsetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @generated
     */
    void setMechanicalLoadDynamics( MechanicalLoadDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    void unsetMechanicalLoadDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mechanical Load Dynamics</em>' reference is set.
     * @see #unsetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    boolean isSetMechanicalLoadDynamics();

} // AsynchronousMachineDynamics
