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
 * A representation of the model object '<em><b>Synchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Synchronous machine whose behaviour is described by reference to a standard model expressed in one of the following forms:
 * - simplified (or classical), where a group of generators or motors is not modelled in detail;
 * - detailed, in equivalent circuit form;
 * - detailed, in time constant reactance form; or
 * <font color="#0f0f0f">- by definition of a user-defined model.</font>
 * <font color="#0f0f0f">It is a common practice to represent small generators by a negative load rather than by a dynamic generator model when performing dynamics simulations. In this case, a SynchronousMachine in the static model is not represented by anything in the dynamics model, instead it is treated as an ordinary load.</font>
 * <font color="#0f0f0f">Parameter details:</font>
 * <ol>
 * 	<li><font color="#0f0f0f">Synchronous machine parameters such as <i>Xl, Xd, Xp</i> etc. are actually used as inductances in the models,</font> but are commonly referred to as reactances since, at nominal frequency, the PU values are the same. However, some references use the symbol <i>L</i> instead of <i>X</i>.</li>
 * </ol>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics()
 * @model
 * @generated
 */
public interface SynchronousMachineDynamics extends RotatingMachineDynamics {
    /**
     * Returns the value of the '<em><b>Cross Compound Turbine Governor Dyanmics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics <em>High Pressure Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The cross-compound turbine governor with which this high-pressure synchronous machine is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cross Compound Turbine Governor Dyanmics</em>' reference.
     * @see #isSetCrossCompoundTurbineGovernorDyanmics()
     * @see #unsetCrossCompoundTurbineGovernorDyanmics()
     * @see #setCrossCompoundTurbineGovernorDyanmics(CrossCompoundTurbineGovernorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_CrossCompoundTurbineGovernorDyanmics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getHighPressureSynchronousMachineDynamics
     * @model opposite="HighPressureSynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.CrossCompoundTurbineGovernorDyanmics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDyanmics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cross Compound Turbine Governor Dyanmics</em>' reference.
     * @see #isSetCrossCompoundTurbineGovernorDyanmics()
     * @see #unsetCrossCompoundTurbineGovernorDyanmics()
     * @see #getCrossCompoundTurbineGovernorDyanmics()
     * @generated
     */
    void setCrossCompoundTurbineGovernorDyanmics( CrossCompoundTurbineGovernorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrossCompoundTurbineGovernorDyanmics()
     * @see #getCrossCompoundTurbineGovernorDyanmics()
     * @see #setCrossCompoundTurbineGovernorDyanmics(CrossCompoundTurbineGovernorDynamics)
     * @generated
     */
    void unsetCrossCompoundTurbineGovernorDyanmics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cross Compound Turbine Governor Dyanmics</em>' reference is set.
     * @see #unsetCrossCompoundTurbineGovernorDyanmics()
     * @see #getCrossCompoundTurbineGovernorDyanmics()
     * @see #setCrossCompoundTurbineGovernorDyanmics(CrossCompoundTurbineGovernorDynamics)
     * @generated
     */
    boolean isSetCrossCompoundTurbineGovernorDyanmics();

    /**
     * Returns the value of the '<em><b>Excitation System Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation system model associated with this synchronous machine model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Excitation System Dynamics</em>' reference.
     * @see #isSetExcitationSystemDynamics()
     * @see #unsetExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_ExcitationSystemDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics
     * @model opposite="SynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.ExcitationSystemDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ExcitationSystemDynamics getExcitationSystemDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitationSystemDynamics()
     * @see #getExcitationSystemDynamics()
     * @see #setExcitationSystemDynamics(ExcitationSystemDynamics)
     * @generated
     */
    void unsetExcitationSystemDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Synchronous Machine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine to which synchronous machine dynamics model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine</em>' reference.
     * @see #isSetSynchronousMachine()
     * @see #unsetSynchronousMachine()
     * @see #setSynchronousMachine(SynchronousMachine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_SynchronousMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics
     * @model opposite="SynchronousMachineDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.SynchronousMachine' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachine getSynchronousMachine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine</em>' reference.
     * @see #isSetSynchronousMachine()
     * @see #unsetSynchronousMachine()
     * @see #getSynchronousMachine()
     * @generated
     */
    void setSynchronousMachine( SynchronousMachine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachine()
     * @see #getSynchronousMachine()
     * @see #setSynchronousMachine(SynchronousMachine)
     * @generated
     */
    void unsetSynchronousMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine</em>' reference is set.
     * @see #unsetSynchronousMachine()
     * @see #getSynchronousMachine()
     * @see #setSynchronousMachine(SynchronousMachine)
     * @generated
     */
    boolean isSetSynchronousMachine();

    /**
     * Returns the value of the '<em><b>Cross Compound Turbine Governor Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics <em>Low Pressure Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The cross-compound turbine governor with which this low-pressure synchronous machine is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cross Compound Turbine Governor Dynamics</em>' reference.
     * @see #isSetCrossCompoundTurbineGovernorDynamics()
     * @see #unsetCrossCompoundTurbineGovernorDynamics()
     * @see #setCrossCompoundTurbineGovernorDynamics(CrossCompoundTurbineGovernorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_CrossCompoundTurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics#getLowPressureSynchronousMachineDynamics
     * @model opposite="LowPressureSynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.CrossCompoundTurbineGovernorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cross Compound Turbine Governor Dynamics</em>' reference.
     * @see #isSetCrossCompoundTurbineGovernorDynamics()
     * @see #unsetCrossCompoundTurbineGovernorDynamics()
     * @see #getCrossCompoundTurbineGovernorDynamics()
     * @generated
     */
    void setCrossCompoundTurbineGovernorDynamics( CrossCompoundTurbineGovernorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrossCompoundTurbineGovernorDynamics()
     * @see #getCrossCompoundTurbineGovernorDynamics()
     * @see #setCrossCompoundTurbineGovernorDynamics(CrossCompoundTurbineGovernorDynamics)
     * @generated
     */
    void unsetCrossCompoundTurbineGovernorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cross Compound Turbine Governor Dynamics</em>' reference is set.
     * @see #unsetCrossCompoundTurbineGovernorDynamics()
     * @see #getCrossCompoundTurbineGovernorDynamics()
     * @see #setCrossCompoundTurbineGovernorDynamics(CrossCompoundTurbineGovernorDynamics)
     * @generated
     */
    boolean isSetCrossCompoundTurbineGovernorDynamics();

    /**
     * Returns the value of the '<em><b>Gen ICompensation For Gen J</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compensation of voltage compensator's generator for current flow out of this  generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gen ICompensation For Gen J</em>' reference list.
     * @see #isSetGenICompensationForGenJ()
     * @see #unsetGenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_GenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics
     * @model opposite="SynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.GenICompensationForGenJ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< GenICompensationForGenJ > getGenICompensationForGenJ();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    void unsetGenICompensationForGenJ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen ICompensation For Gen J</em>' reference list is set.
     * @see #unsetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    boolean isSetGenICompensationForGenJ();

    /**
     * Returns the value of the '<em><b>Turbine Governor Dynamics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine-governor model associated with this synchronous machine model. Multiplicity of greater than one is intended to support hydro units that have multiple turbines on one generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Governor Dynamics</em>' reference list.
     * @see #isSetTurbineGovernorDynamics()
     * @see #unsetTurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_TurbineGovernorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics#getSynchronousMachineDynamics
     * @model opposite="SynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.TurbineGovernorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TurbineGovernorDynamics > getTurbineGovernorDynamics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @generated
     */
    void unsetTurbineGovernorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Governor Dynamics</em>' reference list is set.
     * @see #unsetTurbineGovernorDynamics()
     * @see #getTurbineGovernorDynamics()
     * @generated
     */
    boolean isSetTurbineGovernorDynamics();

    /**
     * Returns the value of the '<em><b>Mechanical Load Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanical load model associated with this synchronous machine model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mechanical Load Dynamics</em>' reference.
     * @see #isSetMechanicalLoadDynamics()
     * @see #unsetMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDynamics_MechanicalLoadDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics#getSynchronousMachineDynamics
     * @model opposite="SynchronousMachineDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDynamics.MechanicalLoadDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MechanicalLoadDynamics getMechanicalLoadDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    void unsetMechanicalLoadDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mechanical Load Dynamics</em>' reference is set.
     * @see #unsetMechanicalLoadDynamics()
     * @see #getMechanicalLoadDynamics()
     * @see #setMechanicalLoadDynamics(MechanicalLoadDynamics)
     * @generated
     */
    boolean isSetMechanicalLoadDynamics();

} // SynchronousMachineDynamics
