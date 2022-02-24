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
 * A representation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reactive power rating envelope versus the synchronous machine's active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReactiveCapabilityCurve()
 * @model
 * @generated
 */
public interface ReactiveCapabilityCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous machines using this curve as default.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Initially Used By Synchronous Machines</em>' reference list.
     * @see #isSetInitiallyUsedBySynchronousMachines()
     * @see #unsetInitiallyUsedBySynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine#getInitialReactiveCapabilityCurve
     * @model opposite="InitialReactiveCapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ReactiveCapabilityCurve.InitiallyUsedBySynchronousMachines' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SynchronousMachine > getInitiallyUsedBySynchronousMachines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitiallyUsedBySynchronousMachines()
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     */
    void unsetInitiallyUsedBySynchronousMachines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initially Used By Synchronous Machines</em>' reference list is set.
     * @see #unsetInitiallyUsedBySynchronousMachines()
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     */
    boolean isSetInitiallyUsedBySynchronousMachines();

    /**
     * Returns the value of the '<em><b>Equivalent Injection</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The equivalent injection using this reactive capability curve.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equivalent Injection</em>' reference list.
     * @see #isSetEquivalentInjection()
     * @see #unsetEquivalentInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReactiveCapabilityCurve_EquivalentInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve
     * @model opposite="ReactiveCapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ReactiveCapabilityCurve.EquivalentInjection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< EquivalentInjection > getEquivalentInjection();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentInjection()
     * @see #getEquivalentInjection()
     * @generated
     */
    void unsetEquivalentInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Injection</em>' reference list is set.
     * @see #unsetEquivalentInjection()
     * @see #getEquivalentInjection()
     * @generated
     */
    boolean isSetEquivalentInjection();

} // ReactiveCapabilityCurve
