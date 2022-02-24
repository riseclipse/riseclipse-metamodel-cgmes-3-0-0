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
 * A representation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A base class for all objects that may contain connectivity nodes or topological nodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNodeContainer()
 * @model
 * @generated
 */
public interface ConnectivityNodeContainer extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Connectivity nodes which belong to this connectivity node container.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connectivity Nodes</em>' reference list.
     * @see #isSetConnectivityNodes()
     * @see #unsetConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNodeContainer_ConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer
     * @model opposite="ConnectivityNodeContainer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNodeContainer.ConnectivityNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ConnectivityNode > getConnectivityNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    void unsetConnectivityNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Nodes</em>' reference list is set.
     * @see #unsetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    boolean isSetConnectivityNodes();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological nodes which belong to this connectivity node container.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference list.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNodeContainer_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer
     * @model opposite="ConnectivityNodeContainer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNodeContainer.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference list is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    boolean isSetTopologicalNode();

} // ConnectivityNodeContainer
