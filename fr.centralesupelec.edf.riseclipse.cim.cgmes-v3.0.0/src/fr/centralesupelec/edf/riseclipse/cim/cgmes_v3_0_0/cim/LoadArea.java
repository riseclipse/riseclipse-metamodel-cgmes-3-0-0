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
 * A representation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class is the root or first level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadArea()
 * @model
 * @generated
 */
public interface LoadArea extends EnergyArea {
    /**
     * Returns the value of the '<em><b>Sub Load Areas</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea#getLoadArea <em>Load Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The SubLoadAreas in the LoadArea.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sub Load Areas</em>' reference list.
     * @see #isSetSubLoadAreas()
     * @see #unsetSubLoadAreas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadArea_SubLoadAreas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea#getLoadArea
     * @model opposite="LoadArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='LoadArea.SubLoadAreas' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SubLoadArea > getSubLoadAreas();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubLoadAreas()
     * @see #getSubLoadAreas()
     * @generated
     */
    void unsetSubLoadAreas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Load Areas</em>' reference list is set.
     * @see #unsetSubLoadAreas()
     * @see #getSubLoadAreas()
     * @generated
     */
    boolean isSetSubLoadAreas();

} // LoadArea
