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
 * A representation of the model object '<em><b>Voltage Adjuster Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Voltage adjuster function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageAdjusterDynamics()
 * @model
 * @generated
 */
public interface VoltageAdjusterDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>PFV Ar Controller Type1 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getVoltageAdjusterDynamics <em>Voltage Adjuster Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor or VAr controller type 1 model with which this voltage adjuster is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference.
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageAdjusterDynamics_PFVArControllerType1Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArControllerType1Dynamics#getVoltageAdjusterDynamics
     * @model opposite="VoltageAdjusterDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VoltageAdjusterDynamics.PFVArControllerType1Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PFVArControllerType1Dynamics getPFVArControllerType1Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    void unsetPFVArControllerType1Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageAdjusterDynamics#getPFVArControllerType1Dynamics <em>PFV Ar Controller Type1 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFV Ar Controller Type1 Dynamics</em>' reference is set.
     * @see #unsetPFVArControllerType1Dynamics()
     * @see #getPFVArControllerType1Dynamics()
     * @see #setPFVArControllerType1Dynamics(PFVArControllerType1Dynamics)
     * @generated
     */
    boolean isSetPFVArControllerType1Dynamics();

} // VoltageAdjusterDynamics
