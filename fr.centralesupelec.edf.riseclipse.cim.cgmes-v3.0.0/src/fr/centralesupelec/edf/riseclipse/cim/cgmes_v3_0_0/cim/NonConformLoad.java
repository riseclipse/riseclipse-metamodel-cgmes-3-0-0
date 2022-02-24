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
 * A representation of the model object '<em><b>Non Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NonConformLoad represents loads that do not follow a daily load change pattern and whose changes are not correlated with the daily load change pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonConformLoad()
 * @model
 * @generated
 */
public interface NonConformLoad extends EnergyConsumer {
    /**
     * Returns the value of the '<em><b>Load Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Group of this ConformLoad.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Group</em>' reference.
     * @see #isSetLoadGroup()
     * @see #unsetLoadGroup()
     * @see #setLoadGroup(NonConformLoadGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonConformLoad_LoadGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoadGroup#getEnergyConsumers
     * @model opposite="EnergyConsumers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='NonConformLoad.LoadGroup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    NonConformLoadGroup getLoadGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Group</em>' reference.
     * @see #isSetLoadGroup()
     * @see #unsetLoadGroup()
     * @see #getLoadGroup()
     * @generated
     */
    void setLoadGroup( NonConformLoadGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadGroup()
     * @see #getLoadGroup()
     * @see #setLoadGroup(NonConformLoadGroup)
     * @generated
     */
    void unsetLoadGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonConformLoad#getLoadGroup <em>Load Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Group</em>' reference is set.
     * @see #unsetLoadGroup()
     * @see #getLoadGroup()
     * @see #setLoadGroup(NonConformLoadGroup)
     * @generated
     */
    boolean isSetLoadGroup();

} // NonConformLoad
