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
 * A representation of the model object '<em><b>Energy Scheduling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to define the type of generation for scheduling purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySchedulingType()
 * @model
 * @generated
 */
public interface EnergySchedulingType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Energy Source</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy Source of a particular Energy Scheduling Type.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Source</em>' reference list.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySchedulingType_EnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType
     * @model opposite="EnergySchedulingType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySchedulingType.EnergySource' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< EnergySource > getEnergySource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    void unsetEnergySource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Source</em>' reference list is set.
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    boolean isSetEnergySource();

} // EnergySchedulingType
