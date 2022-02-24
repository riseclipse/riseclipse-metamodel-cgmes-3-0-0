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
 * A representation of the model object '<em><b>Synchronous Machine Simplified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The simplified model represents a synchronous generator as a constant internal voltage behind an impedance<i> </i>(<i>Rs + jXp</i>) as shown in the Simplified diagram.
 * Since internal voltage is held constant, there is no <i>Efd</i> input and any excitation system model will be ignored.  There is also no <i>Ifd</i> output.
 * This model should not be used for representing a real generator except, perhaps, small generators whose response is insignificant.
 * The parameters used for the simplified model include:
 * - RotatingMachineDynamics.damping (<i>D</i>);
 * - RotatingMachineDynamics.inertia (<i>H</i>);
 * - RotatingMachineDynamics.statorLeakageReactance (used to exchange <i>jXp </i>for SynchronousMachineSimplified);
 * - RotatingMachineDynamics.statorResistance (<i>Rs</i>).
 * <!-- end-model-doc -->
 *
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineSimplified()
 * @model
 * @generated
 */
public interface SynchronousMachineSimplified extends SynchronousMachineDynamics {
} // SynchronousMachineSimplified
