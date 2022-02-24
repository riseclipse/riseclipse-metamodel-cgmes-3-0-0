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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connectivity nodes are points where terminals of AC conducting equipment are connected together with zero impedance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint <em>Boundary Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNode()
 * @model
 * @generated
 */
public interface ConnectivityNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Terminals interconnected with zero impedance at a this connectivity node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminals</em>' reference list.
     * @see #isSetTerminals()
     * @see #unsetTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNode_Terminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getConnectivityNode
     * @model opposite="ConnectivityNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNode.Terminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Terminal > getTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTerminals <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminals()
     * @see #getTerminals()
     * @generated
     */
    void unsetTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTerminals <em>Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminals</em>' reference list is set.
     * @see #unsetTerminals()
     * @see #getTerminals()
     * @generated
     */
    boolean isSetTerminals();

    /**
     * Returns the value of the '<em><b>Boundary Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The boundary point associated with the connectivity node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Boundary Point</em>' reference.
     * @see #isSetBoundaryPoint()
     * @see #unsetBoundaryPoint()
     * @see #setBoundaryPoint(BoundaryPoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNode_BoundaryPoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode
     * @model opposite="ConnectivityNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNode.BoundaryPoint' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    BoundaryPoint getBoundaryPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint <em>Boundary Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boundary Point</em>' reference.
     * @see #isSetBoundaryPoint()
     * @see #unsetBoundaryPoint()
     * @see #getBoundaryPoint()
     * @generated
     */
    void setBoundaryPoint( BoundaryPoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint <em>Boundary Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBoundaryPoint()
     * @see #getBoundaryPoint()
     * @see #setBoundaryPoint(BoundaryPoint)
     * @generated
     */
    void unsetBoundaryPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint <em>Boundary Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Boundary Point</em>' reference is set.
     * @see #unsetBoundaryPoint()
     * @see #getBoundaryPoint()
     * @see #setBoundaryPoint(BoundaryPoint)
     * @generated
     */
    boolean isSetBoundaryPoint();

    /**
     * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Container of this connectivity node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNode_ConnectivityNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getConnectivityNodes
     * @model opposite="ConnectivityNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNode.ConnectivityNodeContainer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ConnectivityNodeContainer getConnectivityNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @generated
     */
    void setConnectivityNodeContainer( ConnectivityNodeContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    void unsetConnectivityNodeContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node Container</em>' reference is set.
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    boolean isSetConnectivityNodeContainer();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological node to which this connectivity node is assigned.  May depend on the current state of switches in the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConnectivityNode_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodes
     * @model opposite="ConnectivityNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ConnectivityNode.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalNode getTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void setTopologicalNode( TopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    boolean isSetTopologicalNode();

} // ConnectivityNode
