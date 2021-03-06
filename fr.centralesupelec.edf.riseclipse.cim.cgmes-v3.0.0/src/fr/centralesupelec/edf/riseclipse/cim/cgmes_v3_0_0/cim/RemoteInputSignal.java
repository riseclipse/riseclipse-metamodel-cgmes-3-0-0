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
 * A representation of the model object '<em><b>Remote Input Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supports connection to a terminal associated with a remote bus from which an input signal of a specific type is coming.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getRemoteSignalType <em>Remote Signal Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics <em>Wind Plant Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal()
 * @model
 * @generated
 */
public interface RemoteInputSignal extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Remote Signal Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteSignalKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote Signal Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteSignalKind
     * @see #isSetRemoteSignalType()
     * @see #unsetRemoteSignalType()
     * @see #setRemoteSignalType(RemoteSignalKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_RemoteSignalType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.remoteSignalType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RemoteSignalKind getRemoteSignalType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getRemoteSignalType <em>Remote Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Signal Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteSignalKind
     * @see #isSetRemoteSignalType()
     * @see #unsetRemoteSignalType()
     * @see #getRemoteSignalType()
     * @generated
     */
    void setRemoteSignalType( RemoteSignalKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getRemoteSignalType <em>Remote Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteSignalType()
     * @see #getRemoteSignalType()
     * @see #setRemoteSignalType(RemoteSignalKind)
     * @generated
     */
    void unsetRemoteSignalType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getRemoteSignalType <em>Remote Signal Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Signal Type</em>' attribute is set.
     * @see #unsetRemoteSignalType()
     * @see #getRemoteSignalType()
     * @see #setRemoteSignalType(RemoteSignalKind)
     * @generated
     */
    boolean isSetRemoteSignalType();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 1 or type 2 model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 Dynamics</em>' reference.
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #unsetWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_WindTurbineType1or2Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2Dynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.WindTurbineType1or2Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2Dynamics()
     * @see #getWindTurbineType1or2Dynamics()
     * @see #setWindTurbineType1or2Dynamics(WindTurbineType1or2Dynamics)
     * @generated
     */
    void unsetWindTurbineType1or2Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType1or2Dynamics <em>Wind Turbine Type1or2 Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>PFV Ar Controller Type1 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor or VAr controller type 1 model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_PFVArControllerType1Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.PFVArControllerType1Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType1Dynamics getPFVArControllerType1Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    void unsetPFVArControllerType1Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Voltage Compensator Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage compensator model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Compensator Dynamics</em>' reference.
     * @see #isSetVoltageCompensatorDynamics()
     * @see #unsetVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_VoltageCompensatorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorDynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.VoltageCompensatorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VoltageCompensatorDynamics getVoltageCompensatorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    void unsetVoltageCompensatorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getVoltageCompensatorDynamics <em>Voltage Compensator Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Compensator Dynamics</em>' reference is set.
     * @see #unsetVoltageCompensatorDynamics()
     * @see #getVoltageCompensatorDynamics()
     * @see #setVoltageCompensatorDynamics(VoltageCompensatorDynamics)
     * @generated
     */
    boolean isSetVoltageCompensatorDynamics();

    /**
     * Returns the value of the '<em><b>Underexcitation Limiter Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Underexcitation limiter model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Underexcitation Limiter Dynamics</em>' reference.
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #unsetUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_UnderexcitationLimiterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterDynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.UnderexcitationLimiterDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderexcitationLimiterDynamics()
     * @see #getUnderexcitationLimiterDynamics()
     * @see #setUnderexcitationLimiterDynamics(UnderexcitationLimiterDynamics)
     * @generated
     */
    void unsetUnderexcitationLimiterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getUnderexcitationLimiterDynamics <em>Underexcitation Limiter Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Discontinuous Excitation Control Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous excitation control model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discontinuous Excitation Control Dynamics</em>' reference.
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #unsetDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_DiscontinuousExcitationControlDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlDynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.DiscontinuousExcitationControlDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscontinuousExcitationControlDynamics()
     * @see #getDiscontinuousExcitationControlDynamics()
     * @see #setDiscontinuousExcitationControlDynamics(DiscontinuousExcitationControlDynamics)
     * @generated
     */
    void unsetDiscontinuousExcitationControlDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getDiscontinuousExcitationControlDynamics <em>Discontinuous Excitation Control Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Remote terminal with which this input signal is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 or type 4 models using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference.
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_WindTurbineType3or4Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.WindTurbineType3or4Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference.
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     */
    void setWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @generated
     */
    void unsetWindTurbineType3or4Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference is set.
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @generated
     */
    boolean isSetWindTurbineType3or4Dynamics();

    /**
     * Returns the value of the '<em><b>Power System Stabilizer Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power system stabilizer model using this remote input signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Stabilizer Dynamics</em>' reference.
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #unsetPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_PowerSystemStabilizerDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerDynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.PowerSystemStabilizerDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemStabilizerDynamics()
     * @see #getPowerSystemStabilizerDynamics()
     * @see #setPowerSystemStabilizerDynamics(PowerSystemStabilizerDynamics)
     * @generated
     */
    void unsetPowerSystemStabilizerDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getPowerSystemStabilizerDynamics <em>Power System Stabilizer Dynamics</em>}' reference is set.
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
     * Returns the value of the '<em><b>Wind Plant Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal <em>Remote Input Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind plant using the remote signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Dynamics</em>' reference.
     * @see #isSetWindPlantDynamics()
     * @see #unsetWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRemoteInputSignal_WindPlantDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantDynamics#getRemoteInputSignal
     * @model opposite="RemoteInputSignal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RemoteInputSignal.WindPlantDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantDynamics getWindPlantDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantDynamics()
     * @see #getWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @generated
     */
    void unsetWindPlantDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RemoteInputSignal#getWindPlantDynamics <em>Wind Plant Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Dynamics</em>' reference is set.
     * @see #unsetWindPlantDynamics()
     * @see #getWindPlantDynamics()
     * @see #setWindPlantDynamics(WindPlantDynamics)
     * @generated
     */
    boolean isSetWindPlantDynamics();

} // RemoteInputSignal
