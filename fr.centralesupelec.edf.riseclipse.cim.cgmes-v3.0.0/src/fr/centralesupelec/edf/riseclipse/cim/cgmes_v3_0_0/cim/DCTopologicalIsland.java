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
 * A representation of the model object '<em><b>DC Topological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrically connected subset of the network. DC topological islands can change as the current network state changes, e.g. due to:
 * - disconnect switches or breakers changing state in a SCADA/EMS.
 * - manual creation, change or deletion of topological nodes in a planning tool.
 * Only energised TopologicalNode-s shall be part of the topological island.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland#getDCTopologicalNodes <em>DC Topological Nodes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalIsland()
 * @model
 * @generated
 */
public interface DCTopologicalIsland extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DC Topological Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC topological nodes in a DC topological island.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Topological Nodes</em>' reference list.
     * @see #isSetDCTopologicalNodes()
     * @see #unsetDCTopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalIsland_DCTopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland
     * @model opposite="DCTopologicalIsland" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCTopologicalIsland.DCTopologicalNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCTopologicalNode > getDCTopologicalNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland#getDCTopologicalNodes <em>DC Topological Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalNodes()
     * @see #getDCTopologicalNodes()
     * @generated
     */
    void unsetDCTopologicalNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland#getDCTopologicalNodes <em>DC Topological Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Nodes</em>' reference list is set.
     * @see #unsetDCTopologicalNodes()
     * @see #getDCTopologicalNodes()
     * @generated
     */
    boolean isSetDCTopologicalNodes();

} // DCTopologicalIsland
