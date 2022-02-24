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
 * A representation of the model object '<em><b>DC Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DC nodes are points where terminals of DC conducting equipment are connected together with zero impedance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCNode()
 * @model
 * @generated
 */
public interface DCNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DC Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCNodes <em>DC Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC container for the DC nodes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Equipment Container</em>' reference.
     * @see #isSetDCEquipmentContainer()
     * @see #unsetDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCNode_DCEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCNodes
     * @model opposite="DCNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCNode.DCEquipmentContainer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCEquipmentContainer getDCEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Equipment Container</em>' reference.
     * @see #isSetDCEquipmentContainer()
     * @see #unsetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @generated
     */
    void setDCEquipmentContainer( DCEquipmentContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    void unsetDCEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Equipment Container</em>' reference is set.
     * @see #unsetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    boolean isSetDCEquipmentContainer();

    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DC base terminals interconnected with zero impedance at a this DC connectivity node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCNode_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal#getDCNode
     * @model opposite="DCNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCNode.DCTerminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCBaseTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

    /**
     * Returns the value of the '<em><b>DC Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC topological node to which this DC connectivity node is assigned.  May depend on the current state of switches in the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Topological Node</em>' reference.
     * @see #isSetDCTopologicalNode()
     * @see #unsetDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCNode_DCTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCNodes
     * @model opposite="DCNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCNode.DCTopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCTopologicalNode getDCTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Topological Node</em>' reference.
     * @see #isSetDCTopologicalNode()
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @generated
     */
    void setDCTopologicalNode( DCTopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    void unsetDCTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Node</em>' reference is set.
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    boolean isSetDCTopologicalNode();

} // DCNode
