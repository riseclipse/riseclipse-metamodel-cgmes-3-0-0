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
 * A representation of the model object '<em><b>DC Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DC bus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalNode()
 * @model
 * @generated
 */
public interface DCTopologicalNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DC Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland#getDCTopologicalNodes <em>DC Topological Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A DC topological node belongs to a DC topological island.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Topological Island</em>' reference.
     * @see #isSetDCTopologicalIsland()
     * @see #unsetDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalNode_DCTopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland#getDCTopologicalNodes
     * @model opposite="DCTopologicalNodes" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCTopologicalNode.DCTopologicalIsland' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCTopologicalIsland getDCTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Topological Island</em>' reference.
     * @see #isSetDCTopologicalIsland()
     * @see #unsetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @generated
     */
    void setDCTopologicalIsland( DCTopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @generated
     */
    void unsetDCTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Island</em>' reference is set.
     * @see #unsetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @generated
     */
    boolean isSetDCTopologicalIsland();

    /**
     * Returns the value of the '<em><b>DC Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectivity node container to which the topological node belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Equipment Container</em>' reference.
     * @see #isSetDCEquipmentContainer()
     * @see #unsetDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalNode_DCEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCTopologicalNode.DCEquipmentContainer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCEquipmentContainer getDCEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    void unsetDCEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference is set.
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
     * Returns the value of the '<em><b>DC Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC connectivity nodes combined together to form this DC topological node.  May depend on the current state of switches in the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Nodes</em>' reference list.
     * @see #isSetDCNodes()
     * @see #unsetDCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalNode_DCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCTopologicalNode.DCNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCNode > getDCNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    void unsetDCNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Nodes</em>' reference list is set.
     * @see #unsetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    boolean isSetDCNodes();

    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * See association end TopologicalNode.Terminal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCTopologicalNode_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCBaseTerminal#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCTopologicalNode.DCTerminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCBaseTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

} // DCTopologicalNode
