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
 * A representation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConformLoad represent loads that follow a daily load change pattern where the pattern can be used to scale the load with a system load.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoad()
 * @model
 * @generated
 */
public interface ConformLoad extends EnergyConsumer {
    /**
     * Returns the value of the '<em><b>Load Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Group of this ConformLoad.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Group</em>' reference.
     * @see #isSetLoadGroup()
     * @see #unsetLoadGroup()
     * @see #setLoadGroup(ConformLoadGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConformLoad_LoadGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoadGroup#getEnergyConsumers
     * @model opposite="EnergyConsumers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ConformLoad.LoadGroup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ConformLoadGroup getLoadGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Group</em>' reference.
     * @see #isSetLoadGroup()
     * @see #unsetLoadGroup()
     * @see #getLoadGroup()
     * @generated
     */
    void setLoadGroup( ConformLoadGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadGroup()
     * @see #getLoadGroup()
     * @see #setLoadGroup(ConformLoadGroup)
     * @generated
     */
    void unsetLoadGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConformLoad#getLoadGroup <em>Load Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Group</em>' reference is set.
     * @see #unsetLoadGroup()
     * @see #getLoadGroup()
     * @see #setLoadGroup(ConformLoadGroup)
     * @generated
     */
    boolean isSetLoadGroup();

} // ConformLoad
