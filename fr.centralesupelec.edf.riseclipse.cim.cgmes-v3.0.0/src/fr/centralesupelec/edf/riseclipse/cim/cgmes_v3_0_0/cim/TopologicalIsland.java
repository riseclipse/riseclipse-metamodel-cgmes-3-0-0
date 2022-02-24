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
 * A representation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrically connected subset of the network. Topological islands can change as the current network state changes, e.g. due to:
 * - disconnect switches or breakers changing state in a SCADA/EMS.
 * - manual creation, change or deletion of topological nodes in a planning tool.
 * Only energised TopologicalNode-s shall be part of the topological island.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalIsland()
 * @model
 * @generated
 */
public interface TopologicalIsland extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Angle Ref Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The angle reference for the island.   Normally there is one TopologicalNode that is selected as the angle reference for each island.   Other reference schemes exist, so the association is typically optional.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Angle Ref Topological Node</em>' reference.
     * @see #isSetAngleRefTopologicalNode()
     * @see #unsetAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalIsland_AngleRefTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland
     * @model opposite="AngleRefTopologicalIsland" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TopologicalIsland.AngleRefTopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalNode getAngleRefTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Ref Topological Node</em>' reference.
     * @see #isSetAngleRefTopologicalNode()
     * @see #unsetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @generated
     */
    void setAngleRefTopologicalNode( TopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetAngleRefTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle Ref Topological Node</em>' reference is set.
     * @see #unsetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @generated
     */
    boolean isSetAngleRefTopologicalNode();

    /**
     * Returns the value of the '<em><b>Topological Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A topological node belongs to a topological island.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Nodes</em>' reference list.
     * @see #isSetTopologicalNodes()
     * @see #unsetTopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalIsland_TopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland
     * @model opposite="TopologicalIsland" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TopologicalIsland.TopologicalNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNodes()
     * @see #getTopologicalNodes()
     * @generated
     */
    void unsetTopologicalNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Nodes</em>' reference list is set.
     * @see #unsetTopologicalNodes()
     * @see #getTopologicalNodes()
     * @generated
     */
    boolean isSetTopologicalNodes();

} // TopologicalIsland
