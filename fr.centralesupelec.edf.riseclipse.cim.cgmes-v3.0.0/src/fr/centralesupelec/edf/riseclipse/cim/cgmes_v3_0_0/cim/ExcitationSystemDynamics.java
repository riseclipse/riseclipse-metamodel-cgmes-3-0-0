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
 * A representation of the model object '<em><b>Excitation System Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Excitation system function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics()
 * @model
 * @generated
 */
public interface ExcitationSystemDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Underexcitation Limiter Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Undrexcitation limiter model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Underexcitation Limiter Dynamics</em>' reference.
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_UnderexcitationLimiterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.UnderexcitationLimiterDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underexcitation Limiter Dynamics</em>' reference.
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @generated
     */
    void setUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @generated
     */
    void unsetUnderexcitationLimiterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underexcitation Limiter Dynamics</em>' reference is set.
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @generated
     */
    boolean isSetUnderexcitationLimiterDynamics();

    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type2 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2Dynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor or VAr controller type 2 model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_PFVArControllerType2Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2Dynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.PFVArControllerType2Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType2Dynamics getPFVArControllerType2Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @generated
     */
    void setPFVArControllerType2Dynamics( PFVArControllerType2Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @generated
     */
    void unsetPFVArControllerType2Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType2Dynamics <em>PFV Ar Controller Type2 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type2 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType2Dynamics()
     * @see #getPFVArControllerType2Dynamics()
     * @see #setPFVArControllerType2Dynamics(PFVArControllerType2Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType2Dynamics();

    /**
     * Returns the value of the '<em><b>Discontinuous Excitation Control Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous excitation control model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference.
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_DiscontinuousExcitationControlDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.DiscontinuousExcitationControlDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference.
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @generated
     */
    void setDiscontinuousExcitationControlDynamics( DiscontinuousExcitationControlDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @generated
     */
    void unsetDiscontinuousExcitationControlDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference is set.
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @generated
     */
    boolean isSetDiscontinuousExcitationControlDynamics();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machine model with which this excitation system model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.SynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>PFV Ar Controller Type1 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor or VAr controller type 1 model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_PFVArControllerType1Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.PFVArControllerType1Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType1Dynamics getPFVArControllerType1Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @generated
     */
    void setPFVArControllerType1Dynamics( PFVArControllerType1Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    void unsetPFVArControllerType1Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType1Dynamics();

    /**
     * Returns the value of the '<em><b>Overexcitation Limiter Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Overexcitation limiter model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Overexcitation Limiter Dynamics</em>' reference.
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_OverexcitationLimiterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.OverexcitationLimiterDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OverexcitationLimiterDynamics getOverexcitationLimiterDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Overexcitation Limiter Dynamics</em>' reference.
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @generated
     */
    void setOverexcitationLimiterDynamics( OverexcitationLimiterDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @generated
     */
    void unsetOverexcitationLimiterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getOverexcitationLimiterDynamics <em>Overexcitation Limiter Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Overexcitation Limiter Dynamics</em>' reference is set.
     * @see #unsetOverexcitationLimiterDynamics()
     * @see #getOverexcitationLimiterDynamics()
     * @see #setOverexcitationLimiterDynamics(OverexcitationLimiterDynamics)
     * @generated
     */
    boolean isSetOverexcitationLimiterDynamics();

    /**
     * Returns the value of the '<em><b>Power System Stabilizer Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power system stabilizer model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Stabilizer Dynamics</em>' reference.
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_PowerSystemStabilizerDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.PowerSystemStabilizerDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Stabilizer Dynamics</em>' reference.
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @generated
     */
    void setPowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @generated
     */
    void unsetPowerSystemStabilizerDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Stabilizer Dynamics</em>' reference is set.
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @generated
     */
    boolean isSetPowerSystemStabilizerDynamics();

    /**
     * Returns the value of the '<em><b>Voltage Compensator Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage compensator model associated with this excitation system model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Compensator Dynamics</em>' reference.
     * @see #isSetVoltageCompensatorDynamics()
     * @see #unsetVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcitationSystemDynamics_VoltageCompensatorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics#getExcitationSystemDynamics
     * @model opposite="ExcitationSystemDynamics" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ExcitationSystemDynamics.VoltageCompensatorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VoltageCompensatorDynamics getVoltageCompensatorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Compensator Dynamics</em>' reference.
     * @see #isSetVoltageCompensatorDynamics()
     * @see #unsetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @generated
     */
    void setVoltageCompensatorDynamics( VoltageCompensatorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    void unsetVoltageCompensatorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Compensator Dynamics</em>' reference is set.
     * @see #unsetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    boolean isSetVoltageCompensatorDynamics();

} // ExcitationSystemDynamics
