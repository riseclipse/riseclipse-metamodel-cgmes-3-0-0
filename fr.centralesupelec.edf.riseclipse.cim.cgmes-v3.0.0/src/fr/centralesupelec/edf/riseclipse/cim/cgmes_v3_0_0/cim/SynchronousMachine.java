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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electromechanical device that operates with shaft rotating synchronously with the network. It is a single machine operating either as a generator or synchronous condenser or pump.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMu <em>Mu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getIkk <em>Ikk</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthing <em>Earthing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine()
 * @model
 * @generated
 */
public interface SynchronousMachine extends RotatingMachine {
    /**
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive power limit for the unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_MinQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.minQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @generated
     */
    void setMinQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Q</em>' attribute is set.
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    boolean isSetMinQ();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine dynamics model used to describe dynamic behaviour of this synchronous machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getSynchronousMachine
     * @model opposite="SynchronousMachine" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.SynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Mu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Factor to calculate the breaking current (Section 4.5.2.1 in IEC 60909-0).
     * Used only for single fed short circuit on a generator (Section 4.3.4.2. in IEC 60909-0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mu</em>' attribute.
     * @see #isSetMu()
     * @see #unsetMu()
     * @see #setMu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_Mu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.mu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mu</em>' attribute.
     * @see #isSetMu()
     * @see #unsetMu()
     * @see #getMu()
     * @generated
     */
    void setMu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMu()
     * @see #getMu()
     * @see #setMu(Double)
     * @generated
     */
    void unsetMu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mu</em>' attribute is set.
     * @see #unsetMu()
     * @see #getMu()
     * @see #setMu(Double)
     * @generated
     */
    boolean isSetMu();

    /**
     * Returns the value of the '<em><b>R2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #setR2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_R2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.r2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #getR2()
     * @generated
     */
    void setR2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR2()
     * @see #getR2()
     * @see #setR2(Double)
     * @generated
     */
    void unsetR2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R2</em>' attribute is set.
     * @see #unsetR2()
     * @see #getR2()
     * @see #setR2(Double)
     * @generated
     */
    boolean isSetR2();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence resistance of the synchronous machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>Ikk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Steady-state short-circuit current (in A for the profile) of generator with compound excitation during 3-phase short circuit.
     * - Ikk=0: Generator with no compound excitation.
     * - Ikk&lt;&gt;0: Generator with compound excitation.
     * Ikk is used to calculate the minimum steady-state short-circuit current for generators with compound excitation.
     * (4.6.1.2 in IEC 60909-0:2001).
     * Used only for single fed short circuit on a generator. (4.3.4.2. in IEC 60909-0:2001).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ikk</em>' attribute.
     * @see #isSetIkk()
     * @see #unsetIkk()
     * @see #setIkk(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_Ikk()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.ikk' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIkk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ikk</em>' attribute.
     * @see #isSetIkk()
     * @see #unsetIkk()
     * @see #getIkk()
     * @generated
     */
    void setIkk( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIkk()
     * @see #getIkk()
     * @see #setIkk(Double)
     * @generated
     */
    void unsetIkk();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ikk</em>' attribute is set.
     * @see #unsetIkk()
     * @see #getIkk()
     * @see #setIkk(Double)
     * @generated
     */
    boolean isSetIkk();

    /**
     * Returns the value of the '<em><b>Earthing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether or not the generator is earthed. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Earthing</em>' attribute.
     * @see #isSetEarthing()
     * @see #unsetEarthing()
     * @see #setEarthing(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_Earthing()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.earthing' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getEarthing();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing</em>' attribute.
     * @see #isSetEarthing()
     * @see #unsetEarthing()
     * @see #getEarthing()
     * @generated
     */
    void setEarthing( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthing()
     * @see #getEarthing()
     * @see #setEarthing(Boolean)
     * @generated
     */
    void unsetEarthing();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing</em>' attribute is set.
     * @see #unsetEarthing()
     * @see #getEarthing()
     * @see #setEarthing(Boolean)
     * @generated
     */
    boolean isSetEarthing();

    /**
     * Returns the value of the '<em><b>Sat Direct Trans X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturated Direct-axis transient reactance. The attribute is primarily used for short circuit calculations according to ANSI.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sat Direct Trans X</em>' attribute.
     * @see #isSetSatDirectTransX()
     * @see #unsetSatDirectTransX()
     * @see #setSatDirectTransX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_SatDirectTransX()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.satDirectTransX' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSatDirectTransX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Trans X</em>' attribute.
     * @see #isSetSatDirectTransX()
     * @see #unsetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @generated
     */
    void setSatDirectTransX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @see #setSatDirectTransX(Double)
     * @generated
     */
    void unsetSatDirectTransX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Trans X</em>' attribute is set.
     * @see #unsetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @see #setSatDirectTransX(Double)
     * @generated
     */
    boolean isSetSatDirectTransX();

    /**
     * Returns the value of the '<em><b>Earthing Star Point X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generator star point earthing reactance (Xe). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Earthing Star Point X</em>' attribute.
     * @see #isSetEarthingStarPointX()
     * @see #unsetEarthingStarPointX()
     * @see #setEarthingStarPointX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_EarthingStarPointX()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.earthingStarPointX' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEarthingStarPointX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing Star Point X</em>' attribute.
     * @see #isSetEarthingStarPointX()
     * @see #unsetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @generated
     */
    void setEarthingStarPointX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @see #setEarthingStarPointX(Double)
     * @generated
     */
    void unsetEarthingStarPointX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing Star Point X</em>' attribute is set.
     * @see #unsetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @see #setEarthingStarPointX(Double)
     * @generated
     */
    boolean isSetEarthingStarPointX();

    /**
     * Returns the value of the '<em><b>Earthing Star Point R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generator star point earthing resistance (Re). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Earthing Star Point R</em>' attribute.
     * @see #isSetEarthingStarPointR()
     * @see #unsetEarthingStarPointR()
     * @see #setEarthingStarPointR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_EarthingStarPointR()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.earthingStarPointR' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEarthingStarPointR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing Star Point R</em>' attribute.
     * @see #isSetEarthingStarPointR()
     * @see #unsetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @generated
     */
    void setEarthingStarPointR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @see #setEarthingStarPointR(Double)
     * @generated
     */
    void unsetEarthingStarPointR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing Star Point R</em>' attribute is set.
     * @see #unsetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @see #setEarthingStarPointR(Double)
     * @generated
     */
    boolean isSetEarthingStarPointR();

    /**
     * Returns the value of the '<em><b>X2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #setX2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_X2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.x2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #getX2()
     * @generated
     */
    void setX2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2()
     * @see #getX2()
     * @see #setX2(Double)
     * @generated
     */
    void unsetX2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2</em>' attribute is set.
     * @see #unsetX2()
     * @see #getX2()
     * @see #setX2(Double)
     * @generated
     */
    boolean isSetX2();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence reactance of the synchronous machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>Sat Direct Subtrans X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis subtransient reactance saturated, also known as Xd"sat.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sat Direct Subtrans X</em>' attribute.
     * @see #isSetSatDirectSubtransX()
     * @see #unsetSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_SatDirectSubtransX()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.satDirectSubtransX' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSatDirectSubtransX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Subtrans X</em>' attribute.
     * @see #isSetSatDirectSubtransX()
     * @see #unsetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @generated
     */
    void setSatDirectSubtransX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Double)
     * @generated
     */
    void unsetSatDirectSubtransX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Subtrans X</em>' attribute is set.
     * @see #unsetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Double)
     * @generated
     */
    boolean isSetSatDirectSubtransX();

    /**
     * Returns the value of the '<em><b>Voltage Regulation Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Range of generator voltage regulation (PG in IEC 60909-0) used for calculation of the impedance correction factor KG defined in IEC 60909-0.
     * This attribute is used to describe the operating voltage of the generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Regulation Range</em>' attribute.
     * @see #isSetVoltageRegulationRange()
     * @see #unsetVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_VoltageRegulationRange()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.voltageRegulationRange' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageRegulationRange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Regulation Range</em>' attribute.
     * @see #isSetVoltageRegulationRange()
     * @see #unsetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @generated
     */
    void setVoltageRegulationRange( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Double)
     * @generated
     */
    void unsetVoltageRegulationRange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Regulation Range</em>' attribute is set.
     * @see #unsetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Double)
     * @generated
     */
    boolean isSetVoltageRegulationRange();

    /**
     * Returns the value of the '<em><b>Sat Direct Sync X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axes saturated synchronous reactance (xdsat); reciprocal of short-circuit ration. Used for short circuit data exchange, only for single fed short circuit on a generator. (4.3.4.2. in IEC 60909-0:2001).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sat Direct Sync X</em>' attribute.
     * @see #isSetSatDirectSyncX()
     * @see #unsetSatDirectSyncX()
     * @see #setSatDirectSyncX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_SatDirectSyncX()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.satDirectSyncX' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSatDirectSyncX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Sync X</em>' attribute.
     * @see #isSetSatDirectSyncX()
     * @see #unsetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @generated
     */
    void setSatDirectSyncX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @see #setSatDirectSyncX(Double)
     * @generated
     */
    void unsetSatDirectSyncX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Sync X</em>' attribute is set.
     * @see #unsetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @see #setSatDirectSyncX(Double)
     * @generated
     */
    boolean isSetSatDirectSyncX();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Equivalent resistance (RG) of generator. RG is considered for the calculation of all currents, except for the calculation of the peak current ip. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>Short Circuit Rotor Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShortCircuitRotorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of rotor, used by short circuit applications, only for single fed short circuit according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Short Circuit Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShortCircuitRotorKind
     * @see #isSetShortCircuitRotorType()
     * @see #unsetShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_ShortCircuitRotorType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.shortCircuitRotorType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ShortCircuitRotorKind getShortCircuitRotorType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Circuit Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShortCircuitRotorKind
     * @see #isSetShortCircuitRotorType()
     * @see #unsetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @generated
     */
    void setShortCircuitRotorType( ShortCircuitRotorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @generated
     */
    void unsetShortCircuitRotorType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short Circuit Rotor Type</em>' attribute is set.
     * @see #unsetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @generated
     */
    boolean isSetShortCircuitRotorType();

    /**
     * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineOperatingMode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current mode of operation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineOperatingMode
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_OperatingMode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.operatingMode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineOperatingMode getOperatingMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineOperatingMode
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @generated
     */
    void setOperatingMode( SynchronousMachineOperatingMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @generated
     */
    void unsetOperatingMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @generated
     */
    boolean isSetOperatingMode();

    /**
     * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Priority of unit for use as powerflow voltage phase angle reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_ReferencePriority()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.referencePriority' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getReferencePriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @generated
     */
    void setReferencePriority( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @generated
     */
    void unsetReferencePriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reference Priority</em>' attribute is set.
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @generated
     */
    boolean isSetReferencePriority();

    /**
     * Returns the value of the '<em><b>QPercent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Part of the coordinated reactive control that comes from this machine. The attribute is used as a participation factor not necessarily summing up to 100% for the participating devices in the control.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QPercent</em>' attribute.
     * @see #isSetQPercent()
     * @see #unsetQPercent()
     * @see #setQPercent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_QPercent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.qPercent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQPercent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QPercent</em>' attribute.
     * @see #isSetQPercent()
     * @see #unsetQPercent()
     * @see #getQPercent()
     * @generated
     */
    void setQPercent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQPercent()
     * @see #getQPercent()
     * @see #setQPercent(Double)
     * @generated
     */
    void unsetQPercent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QPercent</em>' attribute is set.
     * @see #unsetQPercent()
     * @see #getQPercent()
     * @see #setQPercent(Double)
     * @generated
     */
    boolean isSetQPercent();

    /**
     * Returns the value of the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The default reactive capability curve for use by a synchronous machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Initial Reactive Capability Curve</em>' reference.
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_InitialReactiveCapabilityCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines
     * @model opposite="InitiallyUsedBySynchronousMachines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.InitialReactiveCapabilityCurve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ReactiveCapabilityCurve getInitialReactiveCapabilityCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Reactive Capability Curve</em>' reference.
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @generated
     */
    void setInitialReactiveCapabilityCurve( ReactiveCapabilityCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    void unsetInitialReactiveCapabilityCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Reactive Capability Curve</em>' reference is set.
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    boolean isSetInitialReactiveCapabilityCurve();

    /**
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_MaxQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.maxQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @generated
     */
    void setMaxQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    boolean isSetMaxQ();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Modes that this synchronous machine can operate in.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(SynchronousMachineKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachine_Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachine.type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineKind getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( SynchronousMachineKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(SynchronousMachineKind)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(SynchronousMachineKind)
     * @generated
     */
    boolean isSetType();

} // SynchronousMachine
