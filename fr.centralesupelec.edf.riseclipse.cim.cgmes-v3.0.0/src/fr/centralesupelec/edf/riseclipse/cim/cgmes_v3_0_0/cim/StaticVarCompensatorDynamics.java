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
 * A representation of the model object '<em><b>Static Var Compensator Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Static var compensator whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator <em>Static Var Compensator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensatorDynamics()
 * @model
 * @generated
 */
public interface StaticVarCompensatorDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Static Var Compensator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Static Var Compensator to which Static Var Compensator dynamics model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Static Var Compensator</em>' reference.
     * @see #isSetStaticVarCompensator()
     * @see #unsetStaticVarCompensator()
     * @see #setStaticVarCompensator(StaticVarCompensator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensatorDynamics_StaticVarCompensator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics
     * @model opposite="StaticVarCompensatorDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensatorDynamics.StaticVarCompensator' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StaticVarCompensator getStaticVarCompensator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator <em>Static Var Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Var Compensator</em>' reference.
     * @see #isSetStaticVarCompensator()
     * @see #unsetStaticVarCompensator()
     * @see #getStaticVarCompensator()
     * @generated
     */
    void setStaticVarCompensator( StaticVarCompensator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator <em>Static Var Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStaticVarCompensator()
     * @see #getStaticVarCompensator()
     * @see #setStaticVarCompensator(StaticVarCompensator)
     * @generated
     */
    void unsetStaticVarCompensator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator <em>Static Var Compensator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static Var Compensator</em>' reference is set.
     * @see #unsetStaticVarCompensator()
     * @see #getStaticVarCompensator()
     * @see #setStaticVarCompensator(StaticVarCompensator)
     * @generated
     */
    boolean isSetStaticVarCompensator();

} // StaticVarCompensatorDynamics
