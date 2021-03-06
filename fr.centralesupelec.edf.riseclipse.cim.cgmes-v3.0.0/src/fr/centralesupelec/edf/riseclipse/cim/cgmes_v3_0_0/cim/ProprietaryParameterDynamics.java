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
 * A representation of the model object '<em><b>Proprietary Parameter Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.
 * This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getFloatParameterValue <em>Float Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVSCUserDefined <em>VSC User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getDiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getBooleanParameterValue <em>Boolean Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getOverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getIntegerParameterValue <em>Integer Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getParameterNumber <em>Parameter Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getCSCUserDefined <em>CSC User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSVCUserDefined <em>SVC User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getExcitationSystemUserDefined <em>Excitation System User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getMechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindPlantUserDefined <em>Wind Plant User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getUnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getAsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getLoadUserDefined <em>Load User Defined</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics()
 * @model
 * @generated
 */
public interface ProprietaryParameterDynamics extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Float Parameter Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Floating point parameter value.  If this attribute is populated, booleanParameterValue and integerParameterValue will not be.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Float Parameter Value</em>' attribute.
     * @see #isSetFloatParameterValue()
     * @see #unsetFloatParameterValue()
     * @see #setFloatParameterValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_FloatParameterValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.floatParameterValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFloatParameterValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getFloatParameterValue <em>Float Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Float Parameter Value</em>' attribute.
     * @see #isSetFloatParameterValue()
     * @see #unsetFloatParameterValue()
     * @see #getFloatParameterValue()
     * @generated
     */
    void setFloatParameterValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getFloatParameterValue <em>Float Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFloatParameterValue()
     * @see #getFloatParameterValue()
     * @see #setFloatParameterValue(Double)
     * @generated
     */
    void unsetFloatParameterValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getFloatParameterValue <em>Float Parameter Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Float Parameter Value</em>' attribute is set.
     * @see #unsetFloatParameterValue()
     * @see #getFloatParameterValue()
     * @see #setFloatParameterValue(Double)
     * @generated
     */
    boolean isSetFloatParameterValue();

    /**
     * Returns the value of the '<em><b>VSC User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>VSC User Defined</em>' reference.
     * @see #isSetVSCUserDefined()
     * @see #unsetVSCUserDefined()
     * @see #setVSCUserDefined(VSCUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_VSCUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.VSCUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VSCUserDefined getVSCUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVSCUserDefined <em>VSC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VSC User Defined</em>' reference.
     * @see #isSetVSCUserDefined()
     * @see #unsetVSCUserDefined()
     * @see #getVSCUserDefined()
     * @generated
     */
    void setVSCUserDefined( VSCUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVSCUserDefined <em>VSC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVSCUserDefined()
     * @see #getVSCUserDefined()
     * @see #setVSCUserDefined(VSCUserDefined)
     * @generated
     */
    void unsetVSCUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVSCUserDefined <em>VSC User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VSC User Defined</em>' reference is set.
     * @see #unsetVSCUserDefined()
     * @see #getVSCUserDefined()
     * @see #setVSCUserDefined(VSCUserDefined)
     * @generated
     */
    boolean isSetVSCUserDefined();

    /**
     * Returns the value of the '<em><b>Power System Stabilizer User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Stabilizer User Defined</em>' reference.
     * @see #isSetPowerSystemStabilizerUserDefined()
     * @see #unsetPowerSystemStabilizerUserDefined()
     * @see #setPowerSystemStabilizerUserDefined(PowerSystemStabilizerUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_PowerSystemStabilizerUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemStabilizerUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.PowerSystemStabilizerUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemStabilizerUserDefined getPowerSystemStabilizerUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Stabilizer User Defined</em>' reference.
     * @see #isSetPowerSystemStabilizerUserDefined()
     * @see #unsetPowerSystemStabilizerUserDefined()
     * @see #getPowerSystemStabilizerUserDefined()
     * @generated
     */
    void setPowerSystemStabilizerUserDefined( PowerSystemStabilizerUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemStabilizerUserDefined()
     * @see #getPowerSystemStabilizerUserDefined()
     * @see #setPowerSystemStabilizerUserDefined(PowerSystemStabilizerUserDefined)
     * @generated
     */
    void unsetPowerSystemStabilizerUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Stabilizer User Defined</em>' reference is set.
     * @see #unsetPowerSystemStabilizerUserDefined()
     * @see #getPowerSystemStabilizerUserDefined()
     * @see #setPowerSystemStabilizerUserDefined(PowerSystemStabilizerUserDefined)
     * @generated
     */
    boolean isSetPowerSystemStabilizerUserDefined();

    /**
     * Returns the value of the '<em><b>Discontinuous Excitation Control User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Discontinuous Excitation Control User Defined</em>' reference.
     * @see #isSetDiscontinuousExcitationControlUserDefined()
     * @see #unsetDiscontinuousExcitationControlUserDefined()
     * @see #setDiscontinuousExcitationControlUserDefined(DiscontinuousExcitationControlUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_DiscontinuousExcitationControlUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscontinuousExcitationControlUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.DiscontinuousExcitationControlUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiscontinuousExcitationControlUserDefined getDiscontinuousExcitationControlUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getDiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discontinuous Excitation Control User Defined</em>' reference.
     * @see #isSetDiscontinuousExcitationControlUserDefined()
     * @see #unsetDiscontinuousExcitationControlUserDefined()
     * @see #getDiscontinuousExcitationControlUserDefined()
     * @generated
     */
    void setDiscontinuousExcitationControlUserDefined( DiscontinuousExcitationControlUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getDiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscontinuousExcitationControlUserDefined()
     * @see #getDiscontinuousExcitationControlUserDefined()
     * @see #setDiscontinuousExcitationControlUserDefined(DiscontinuousExcitationControlUserDefined)
     * @generated
     */
    void unsetDiscontinuousExcitationControlUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getDiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discontinuous Excitation Control User Defined</em>' reference is set.
     * @see #unsetDiscontinuousExcitationControlUserDefined()
     * @see #getDiscontinuousExcitationControlUserDefined()
     * @see #setDiscontinuousExcitationControlUserDefined(DiscontinuousExcitationControlUserDefined)
     * @generated
     */
    boolean isSetDiscontinuousExcitationControlUserDefined();

    /**
     * Returns the value of the '<em><b>Boolean Parameter Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Boolean parameter value. If this attribute is populated, integerParameterValue and floatParameterValue will not be.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Boolean Parameter Value</em>' attribute.
     * @see #isSetBooleanParameterValue()
     * @see #unsetBooleanParameterValue()
     * @see #setBooleanParameterValue(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_BooleanParameterValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.booleanParameterValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getBooleanParameterValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getBooleanParameterValue <em>Boolean Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boolean Parameter Value</em>' attribute.
     * @see #isSetBooleanParameterValue()
     * @see #unsetBooleanParameterValue()
     * @see #getBooleanParameterValue()
     * @generated
     */
    void setBooleanParameterValue( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getBooleanParameterValue <em>Boolean Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBooleanParameterValue()
     * @see #getBooleanParameterValue()
     * @see #setBooleanParameterValue(Boolean)
     * @generated
     */
    void unsetBooleanParameterValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getBooleanParameterValue <em>Boolean Parameter Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Boolean Parameter Value</em>' attribute is set.
     * @see #unsetBooleanParameterValue()
     * @see #getBooleanParameterValue()
     * @see #setBooleanParameterValue(Boolean)
     * @generated
     */
    boolean isSetBooleanParameterValue();

    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type1 User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1UserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 User Defined</em>' reference.
     * @see #isSetPFVArControllerType1UserDefined()
     * @see #unsetPFVArControllerType1UserDefined()
     * @see #setPFVArControllerType1UserDefined(PFVArControllerType1UserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_PFVArControllerType1UserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1UserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.PFVArControllerType1UserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType1UserDefined getPFVArControllerType1UserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type1 User Defined</em>' reference.
     * @see #isSetPFVArControllerType1UserDefined()
     * @see #unsetPFVArControllerType1UserDefined()
     * @see #getPFVArControllerType1UserDefined()
     * @generated
     */
    void setPFVArControllerType1UserDefined( PFVArControllerType1UserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1UserDefined()
     * @see #getPFVArControllerType1UserDefined()
     * @see #setPFVArControllerType1UserDefined(PFVArControllerType1UserDefined)
     * @generated
     */
    void unsetPFVArControllerType1UserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type1 User Defined</em>' reference is set.
     * @see #unsetPFVArControllerType1UserDefined()
     * @see #getPFVArControllerType1UserDefined()
     * @see #setPFVArControllerType1UserDefined(PFVArControllerType1UserDefined)
     * @generated
     */
    boolean isSetPFVArControllerType1UserDefined();

    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type2 User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2UserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type2 User Defined</em>' reference.
     * @see #isSetPFVArControllerType2UserDefined()
     * @see #unsetPFVArControllerType2UserDefined()
     * @see #setPFVArControllerType2UserDefined(PFVArControllerType2UserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_PFVArControllerType2UserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType2UserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.PFVArControllerType2UserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType2UserDefined getPFVArControllerType2UserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFV Ar Controller Type2 User Defined</em>' reference.
     * @see #isSetPFVArControllerType2UserDefined()
     * @see #unsetPFVArControllerType2UserDefined()
     * @see #getPFVArControllerType2UserDefined()
     * @generated
     */
    void setPFVArControllerType2UserDefined( PFVArControllerType2UserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType2UserDefined()
     * @see #getPFVArControllerType2UserDefined()
     * @see #setPFVArControllerType2UserDefined(PFVArControllerType2UserDefined)
     * @generated
     */
    void unsetPFVArControllerType2UserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getPFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type2 User Defined</em>' reference is set.
     * @see #unsetPFVArControllerType2UserDefined()
     * @see #getPFVArControllerType2UserDefined()
     * @see #setPFVArControllerType2UserDefined(PFVArControllerType2UserDefined)
     * @generated
     */
    boolean isSetPFVArControllerType2UserDefined();

    /**
     * Returns the value of the '<em><b>Overexcitation Limiter User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Overexcitation Limiter User Defined</em>' reference.
     * @see #isSetOverexcitationLimiterUserDefined()
     * @see #unsetOverexcitationLimiterUserDefined()
     * @see #setOverexcitationLimiterUserDefined(OverexcitationLimiterUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_OverexcitationLimiterUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcitationLimiterUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.OverexcitationLimiterUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OverexcitationLimiterUserDefined getOverexcitationLimiterUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getOverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Overexcitation Limiter User Defined</em>' reference.
     * @see #isSetOverexcitationLimiterUserDefined()
     * @see #unsetOverexcitationLimiterUserDefined()
     * @see #getOverexcitationLimiterUserDefined()
     * @generated
     */
    void setOverexcitationLimiterUserDefined( OverexcitationLimiterUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getOverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverexcitationLimiterUserDefined()
     * @see #getOverexcitationLimiterUserDefined()
     * @see #setOverexcitationLimiterUserDefined(OverexcitationLimiterUserDefined)
     * @generated
     */
    void unsetOverexcitationLimiterUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getOverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Overexcitation Limiter User Defined</em>' reference is set.
     * @see #unsetOverexcitationLimiterUserDefined()
     * @see #getOverexcitationLimiterUserDefined()
     * @see #setOverexcitationLimiterUserDefined(OverexcitationLimiterUserDefined)
     * @generated
     */
    boolean isSetOverexcitationLimiterUserDefined();

    /**
     * Returns the value of the '<em><b>Turbine Load Controller User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Load Controller User Defined</em>' reference.
     * @see #isSetTurbineLoadControllerUserDefined()
     * @see #unsetTurbineLoadControllerUserDefined()
     * @see #setTurbineLoadControllerUserDefined(TurbineLoadControllerUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_TurbineLoadControllerUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineLoadControllerUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.TurbineLoadControllerUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TurbineLoadControllerUserDefined getTurbineLoadControllerUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Load Controller User Defined</em>' reference.
     * @see #isSetTurbineLoadControllerUserDefined()
     * @see #unsetTurbineLoadControllerUserDefined()
     * @see #getTurbineLoadControllerUserDefined()
     * @generated
     */
    void setTurbineLoadControllerUserDefined( TurbineLoadControllerUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineLoadControllerUserDefined()
     * @see #getTurbineLoadControllerUserDefined()
     * @see #setTurbineLoadControllerUserDefined(TurbineLoadControllerUserDefined)
     * @generated
     */
    void unsetTurbineLoadControllerUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Load Controller User Defined</em>' reference is set.
     * @see #unsetTurbineLoadControllerUserDefined()
     * @see #getTurbineLoadControllerUserDefined()
     * @see #setTurbineLoadControllerUserDefined(TurbineLoadControllerUserDefined)
     * @generated
     */
    boolean isSetTurbineLoadControllerUserDefined();

    /**
     * Returns the value of the '<em><b>Integer Parameter Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integer parameter value.  If this attribute is populated, booleanParameterValue and floatParameterValue will not be.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Integer Parameter Value</em>' attribute.
     * @see #isSetIntegerParameterValue()
     * @see #unsetIntegerParameterValue()
     * @see #setIntegerParameterValue(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_IntegerParameterValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.integerParameterValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getIntegerParameterValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getIntegerParameterValue <em>Integer Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Integer Parameter Value</em>' attribute.
     * @see #isSetIntegerParameterValue()
     * @see #unsetIntegerParameterValue()
     * @see #getIntegerParameterValue()
     * @generated
     */
    void setIntegerParameterValue( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getIntegerParameterValue <em>Integer Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntegerParameterValue()
     * @see #getIntegerParameterValue()
     * @see #setIntegerParameterValue(BigInteger)
     * @generated
     */
    void unsetIntegerParameterValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getIntegerParameterValue <em>Integer Parameter Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Integer Parameter Value</em>' attribute is set.
     * @see #unsetIntegerParameterValue()
     * @see #getIntegerParameterValue()
     * @see #setIntegerParameterValue(BigInteger)
     * @generated
     */
    boolean isSetIntegerParameterValue();

    /**
     * Returns the value of the '<em><b>Parameter Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sequence number of the parameter among the set of parameters associated with the related proprietary user-defined model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Parameter Number</em>' attribute.
     * @see #isSetParameterNumber()
     * @see #unsetParameterNumber()
     * @see #setParameterNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_ParameterNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.parameterNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getParameterNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getParameterNumber <em>Parameter Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter Number</em>' attribute.
     * @see #isSetParameterNumber()
     * @see #unsetParameterNumber()
     * @see #getParameterNumber()
     * @generated
     */
    void setParameterNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getParameterNumber <em>Parameter Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetParameterNumber()
     * @see #getParameterNumber()
     * @see #setParameterNumber(BigInteger)
     * @generated
     */
    void unsetParameterNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getParameterNumber <em>Parameter Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parameter Number</em>' attribute is set.
     * @see #unsetParameterNumber()
     * @see #getParameterNumber()
     * @see #setParameterNumber(BigInteger)
     * @generated
     */
    boolean isSetParameterNumber();

    /**
     * Returns the value of the '<em><b>CSC User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>CSC User Defined</em>' reference.
     * @see #isSetCSCUserDefined()
     * @see #unsetCSCUserDefined()
     * @see #setCSCUserDefined(CSCUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_CSCUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.CSCUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CSCUserDefined getCSCUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getCSCUserDefined <em>CSC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CSC User Defined</em>' reference.
     * @see #isSetCSCUserDefined()
     * @see #unsetCSCUserDefined()
     * @see #getCSCUserDefined()
     * @generated
     */
    void setCSCUserDefined( CSCUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getCSCUserDefined <em>CSC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCSCUserDefined()
     * @see #getCSCUserDefined()
     * @see #setCSCUserDefined(CSCUserDefined)
     * @generated
     */
    void unsetCSCUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getCSCUserDefined <em>CSC User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CSC User Defined</em>' reference is set.
     * @see #unsetCSCUserDefined()
     * @see #getCSCUserDefined()
     * @see #setCSCUserDefined(CSCUserDefined)
     * @generated
     */
    boolean isSetCSCUserDefined();

    /**
     * Returns the value of the '<em><b>SVC User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>SVC User Defined</em>' reference.
     * @see #isSetSVCUserDefined()
     * @see #unsetSVCUserDefined()
     * @see #setSVCUserDefined(SVCUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_SVCUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.SVCUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SVCUserDefined getSVCUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSVCUserDefined <em>SVC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SVC User Defined</em>' reference.
     * @see #isSetSVCUserDefined()
     * @see #unsetSVCUserDefined()
     * @see #getSVCUserDefined()
     * @generated
     */
    void setSVCUserDefined( SVCUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSVCUserDefined <em>SVC User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSVCUserDefined()
     * @see #getSVCUserDefined()
     * @see #setSVCUserDefined(SVCUserDefined)
     * @generated
     */
    void unsetSVCUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSVCUserDefined <em>SVC User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SVC User Defined</em>' reference is set.
     * @see #unsetSVCUserDefined()
     * @see #getSVCUserDefined()
     * @see #setSVCUserDefined(SVCUserDefined)
     * @generated
     */
    boolean isSetSVCUserDefined();

    /**
     * Returns the value of the '<em><b>Excitation System User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Excitation System User Defined</em>' reference.
     * @see #isSetExcitationSystemUserDefined()
     * @see #unsetExcitationSystemUserDefined()
     * @see #setExcitationSystemUserDefined(ExcitationSystemUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_ExcitationSystemUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.ExcitationSystemUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ExcitationSystemUserDefined getExcitationSystemUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getExcitationSystemUserDefined <em>Excitation System User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Excitation System User Defined</em>' reference.
     * @see #isSetExcitationSystemUserDefined()
     * @see #unsetExcitationSystemUserDefined()
     * @see #getExcitationSystemUserDefined()
     * @generated
     */
    void setExcitationSystemUserDefined( ExcitationSystemUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getExcitationSystemUserDefined <em>Excitation System User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExcitationSystemUserDefined()
     * @see #getExcitationSystemUserDefined()
     * @see #setExcitationSystemUserDefined(ExcitationSystemUserDefined)
     * @generated
     */
    void unsetExcitationSystemUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getExcitationSystemUserDefined <em>Excitation System User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Excitation System User Defined</em>' reference is set.
     * @see #unsetExcitationSystemUserDefined()
     * @see #getExcitationSystemUserDefined()
     * @see #setExcitationSystemUserDefined(ExcitationSystemUserDefined)
     * @generated
     */
    boolean isSetExcitationSystemUserDefined();

    /**
     * Returns the value of the '<em><b>Mechanical Load User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mechanical Load User Defined</em>' reference.
     * @see #isSetMechanicalLoadUserDefined()
     * @see #unsetMechanicalLoadUserDefined()
     * @see #setMechanicalLoadUserDefined(MechanicalLoadUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_MechanicalLoadUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.MechanicalLoadUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    MechanicalLoadUserDefined getMechanicalLoadUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getMechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanical Load User Defined</em>' reference.
     * @see #isSetMechanicalLoadUserDefined()
     * @see #unsetMechanicalLoadUserDefined()
     * @see #getMechanicalLoadUserDefined()
     * @generated
     */
    void setMechanicalLoadUserDefined( MechanicalLoadUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getMechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMechanicalLoadUserDefined()
     * @see #getMechanicalLoadUserDefined()
     * @see #setMechanicalLoadUserDefined(MechanicalLoadUserDefined)
     * @generated
     */
    void unsetMechanicalLoadUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getMechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mechanical Load User Defined</em>' reference is set.
     * @see #unsetMechanicalLoadUserDefined()
     * @see #getMechanicalLoadUserDefined()
     * @see #setMechanicalLoadUserDefined(MechanicalLoadUserDefined)
     * @generated
     */
    boolean isSetMechanicalLoadUserDefined();

    /**
     * Returns the value of the '<em><b>Wind Plant User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant User Defined</em>' reference.
     * @see #isSetWindPlantUserDefined()
     * @see #unsetWindPlantUserDefined()
     * @see #setWindPlantUserDefined(WindPlantUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_WindPlantUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.WindPlantUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantUserDefined getWindPlantUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindPlantUserDefined <em>Wind Plant User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant User Defined</em>' reference.
     * @see #isSetWindPlantUserDefined()
     * @see #unsetWindPlantUserDefined()
     * @see #getWindPlantUserDefined()
     * @generated
     */
    void setWindPlantUserDefined( WindPlantUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindPlantUserDefined <em>Wind Plant User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantUserDefined()
     * @see #getWindPlantUserDefined()
     * @see #setWindPlantUserDefined(WindPlantUserDefined)
     * @generated
     */
    void unsetWindPlantUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindPlantUserDefined <em>Wind Plant User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant User Defined</em>' reference is set.
     * @see #unsetWindPlantUserDefined()
     * @see #getWindPlantUserDefined()
     * @see #setWindPlantUserDefined(WindPlantUserDefined)
     * @generated
     */
    boolean isSetWindPlantUserDefined();

    /**
     * Returns the value of the '<em><b>Underexcitation Limiter User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Underexcitation Limiter User Defined</em>' reference.
     * @see #isSetUnderexcitationLimiterUserDefined()
     * @see #unsetUnderexcitationLimiterUserDefined()
     * @see #setUnderexcitationLimiterUserDefined(UnderexcitationLimiterUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_UnderexcitationLimiterUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcitationLimiterUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.UnderexcitationLimiterUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnderexcitationLimiterUserDefined getUnderexcitationLimiterUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getUnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Underexcitation Limiter User Defined</em>' reference.
     * @see #isSetUnderexcitationLimiterUserDefined()
     * @see #unsetUnderexcitationLimiterUserDefined()
     * @see #getUnderexcitationLimiterUserDefined()
     * @generated
     */
    void setUnderexcitationLimiterUserDefined( UnderexcitationLimiterUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getUnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnderexcitationLimiterUserDefined()
     * @see #getUnderexcitationLimiterUserDefined()
     * @see #setUnderexcitationLimiterUserDefined(UnderexcitationLimiterUserDefined)
     * @generated
     */
    void unsetUnderexcitationLimiterUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getUnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Underexcitation Limiter User Defined</em>' reference is set.
     * @see #unsetUnderexcitationLimiterUserDefined()
     * @see #getUnderexcitationLimiterUserDefined()
     * @see #setUnderexcitationLimiterUserDefined(UnderexcitationLimiterUserDefined)
     * @generated
     */
    boolean isSetUnderexcitationLimiterUserDefined();

    /**
     * Returns the value of the '<em><b>Turbine Governor User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Turbine Governor User Defined</em>' reference.
     * @see #isSetTurbineGovernorUserDefined()
     * @see #unsetTurbineGovernorUserDefined()
     * @see #setTurbineGovernorUserDefined(TurbineGovernorUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_TurbineGovernorUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.TurbineGovernorUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TurbineGovernorUserDefined getTurbineGovernorUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Governor User Defined</em>' reference.
     * @see #isSetTurbineGovernorUserDefined()
     * @see #unsetTurbineGovernorUserDefined()
     * @see #getTurbineGovernorUserDefined()
     * @generated
     */
    void setTurbineGovernorUserDefined( TurbineGovernorUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineGovernorUserDefined()
     * @see #getTurbineGovernorUserDefined()
     * @see #setTurbineGovernorUserDefined(TurbineGovernorUserDefined)
     * @generated
     */
    void unsetTurbineGovernorUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Governor User Defined</em>' reference is set.
     * @see #unsetTurbineGovernorUserDefined()
     * @see #getTurbineGovernorUserDefined()
     * @see #setTurbineGovernorUserDefined(TurbineGovernorUserDefined)
     * @generated
     */
    boolean isSetTurbineGovernorUserDefined();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine User Defined</em>' reference.
     * @see #isSetAsynchronousMachineUserDefined()
     * @see #unsetAsynchronousMachineUserDefined()
     * @see #setAsynchronousMachineUserDefined(AsynchronousMachineUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_AsynchronousMachineUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.AsynchronousMachineUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineUserDefined getAsynchronousMachineUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getAsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine User Defined</em>' reference.
     * @see #isSetAsynchronousMachineUserDefined()
     * @see #unsetAsynchronousMachineUserDefined()
     * @see #getAsynchronousMachineUserDefined()
     * @generated
     */
    void setAsynchronousMachineUserDefined( AsynchronousMachineUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getAsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineUserDefined()
     * @see #getAsynchronousMachineUserDefined()
     * @see #setAsynchronousMachineUserDefined(AsynchronousMachineUserDefined)
     * @generated
     */
    void unsetAsynchronousMachineUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getAsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine User Defined</em>' reference is set.
     * @see #unsetAsynchronousMachineUserDefined()
     * @see #getAsynchronousMachineUserDefined()
     * @see #setAsynchronousMachineUserDefined(AsynchronousMachineUserDefined)
     * @generated
     */
    boolean isSetAsynchronousMachineUserDefined();

    /**
     * Returns the value of the '<em><b>Voltage Compensator User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Compensator User Defined</em>' reference.
     * @see #isSetVoltageCompensatorUserDefined()
     * @see #unsetVoltageCompensatorUserDefined()
     * @see #setVoltageCompensatorUserDefined(VoltageCompensatorUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_VoltageCompensatorUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageCompensatorUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.VoltageCompensatorUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VoltageCompensatorUserDefined getVoltageCompensatorUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Compensator User Defined</em>' reference.
     * @see #isSetVoltageCompensatorUserDefined()
     * @see #unsetVoltageCompensatorUserDefined()
     * @see #getVoltageCompensatorUserDefined()
     * @generated
     */
    void setVoltageCompensatorUserDefined( VoltageCompensatorUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageCompensatorUserDefined()
     * @see #getVoltageCompensatorUserDefined()
     * @see #setVoltageCompensatorUserDefined(VoltageCompensatorUserDefined)
     * @generated
     */
    void unsetVoltageCompensatorUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Compensator User Defined</em>' reference is set.
     * @see #unsetVoltageCompensatorUserDefined()
     * @see #getVoltageCompensatorUserDefined()
     * @see #setVoltageCompensatorUserDefined(VoltageCompensatorUserDefined)
     * @generated
     */
    boolean isSetVoltageCompensatorUserDefined();

    /**
     * Returns the value of the '<em><b>Voltage Adjuster User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Adjuster User Defined</em>' reference.
     * @see #isSetVoltageAdjusterUserDefined()
     * @see #unsetVoltageAdjusterUserDefined()
     * @see #setVoltageAdjusterUserDefined(VoltageAdjusterUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_VoltageAdjusterUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.VoltageAdjusterUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VoltageAdjusterUserDefined getVoltageAdjusterUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Adjuster User Defined</em>' reference.
     * @see #isSetVoltageAdjusterUserDefined()
     * @see #unsetVoltageAdjusterUserDefined()
     * @see #getVoltageAdjusterUserDefined()
     * @generated
     */
    void setVoltageAdjusterUserDefined( VoltageAdjusterUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageAdjusterUserDefined()
     * @see #getVoltageAdjusterUserDefined()
     * @see #setVoltageAdjusterUserDefined(VoltageAdjusterUserDefined)
     * @generated
     */
    void unsetVoltageAdjusterUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getVoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Adjuster User Defined</em>' reference is set.
     * @see #unsetVoltageAdjusterUserDefined()
     * @see #getVoltageAdjusterUserDefined()
     * @see #setVoltageAdjusterUserDefined(VoltageAdjusterUserDefined)
     * @generated
     */
    boolean isSetVoltageAdjusterUserDefined();

    /**
     * Returns the value of the '<em><b>Wind Type1or2 User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType1or2UserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Type1or2 User Defined</em>' reference.
     * @see #isSetWindType1or2UserDefined()
     * @see #unsetWindType1or2UserDefined()
     * @see #setWindType1or2UserDefined(WindType1or2UserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_WindType1or2UserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType1or2UserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.WindType1or2UserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindType1or2UserDefined getWindType1or2UserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Type1or2 User Defined</em>' reference.
     * @see #isSetWindType1or2UserDefined()
     * @see #unsetWindType1or2UserDefined()
     * @see #getWindType1or2UserDefined()
     * @generated
     */
    void setWindType1or2UserDefined( WindType1or2UserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindType1or2UserDefined()
     * @see #getWindType1or2UserDefined()
     * @see #setWindType1or2UserDefined(WindType1or2UserDefined)
     * @generated
     */
    void unsetWindType1or2UserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Type1or2 User Defined</em>' reference is set.
     * @see #unsetWindType1or2UserDefined()
     * @see #getWindType1or2UserDefined()
     * @see #setWindType1or2UserDefined(WindType1or2UserDefined)
     * @generated
     */
    boolean isSetWindType1or2UserDefined();

    /**
     * Returns the value of the '<em><b>Wind Type3or4 User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType3or4UserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Type3or4 User Defined</em>' reference.
     * @see #isSetWindType3or4UserDefined()
     * @see #unsetWindType3or4UserDefined()
     * @see #setWindType3or4UserDefined(WindType3or4UserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_WindType3or4UserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindType3or4UserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.WindType3or4UserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindType3or4UserDefined getWindType3or4UserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Type3or4 User Defined</em>' reference.
     * @see #isSetWindType3or4UserDefined()
     * @see #unsetWindType3or4UserDefined()
     * @see #getWindType3or4UserDefined()
     * @generated
     */
    void setWindType3or4UserDefined( WindType3or4UserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindType3or4UserDefined()
     * @see #getWindType3or4UserDefined()
     * @see #setWindType3or4UserDefined(WindType3or4UserDefined)
     * @generated
     */
    void unsetWindType3or4UserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getWindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Type3or4 User Defined</em>' reference is set.
     * @see #unsetWindType3or4UserDefined()
     * @see #getWindType3or4UserDefined()
     * @see #setWindType3or4UserDefined(WindType3or4UserDefined)
     * @generated
     */
    boolean isSetWindType3or4UserDefined();

    /**
     * Returns the value of the '<em><b>Synchronous Machine User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine User Defined</em>' reference.
     * @see #isSetSynchronousMachineUserDefined()
     * @see #unsetSynchronousMachineUserDefined()
     * @see #setSynchronousMachineUserDefined(SynchronousMachineUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_SynchronousMachineUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.SynchronousMachineUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineUserDefined getSynchronousMachineUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine User Defined</em>' reference.
     * @see #isSetSynchronousMachineUserDefined()
     * @see #unsetSynchronousMachineUserDefined()
     * @see #getSynchronousMachineUserDefined()
     * @generated
     */
    void setSynchronousMachineUserDefined( SynchronousMachineUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineUserDefined()
     * @see #getSynchronousMachineUserDefined()
     * @see #setSynchronousMachineUserDefined(SynchronousMachineUserDefined)
     * @generated
     */
    void unsetSynchronousMachineUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getSynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine User Defined</em>' reference is set.
     * @see #unsetSynchronousMachineUserDefined()
     * @see #getSynchronousMachineUserDefined()
     * @see #setSynchronousMachineUserDefined(SynchronousMachineUserDefined)
     * @generated
     */
    boolean isSetSynchronousMachineUserDefined();

    /**
     * Returns the value of the '<em><b>Load User Defined</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proprietary user-defined model with which this parameter is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load User Defined</em>' reference.
     * @see #isSetLoadUserDefined()
     * @see #unsetLoadUserDefined()
     * @see #setLoadUserDefined(LoadUserDefined)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getProprietaryParameterDynamics_LoadUserDefined()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadUserDefined#getProprietaryParameterDynamics
     * @model opposite="ProprietaryParameterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ProprietaryParameterDynamics.LoadUserDefined' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    LoadUserDefined getLoadUserDefined();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getLoadUserDefined <em>Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load User Defined</em>' reference.
     * @see #isSetLoadUserDefined()
     * @see #unsetLoadUserDefined()
     * @see #getLoadUserDefined()
     * @generated
     */
    void setLoadUserDefined( LoadUserDefined value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getLoadUserDefined <em>Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadUserDefined()
     * @see #getLoadUserDefined()
     * @see #setLoadUserDefined(LoadUserDefined)
     * @generated
     */
    void unsetLoadUserDefined();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getLoadUserDefined <em>Load User Defined</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load User Defined</em>' reference is set.
     * @see #unsetLoadUserDefined()
     * @see #getLoadUserDefined()
     * @see #setLoadUserDefined(LoadUserDefined)
     * @generated
     */
    boolean isSetLoadUserDefined();

} // ProprietaryParameterDynamics
