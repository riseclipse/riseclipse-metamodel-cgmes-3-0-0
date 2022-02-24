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
 * A representation of the model object '<em><b>DC Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A modelling construct to provide a root class for containment of DC as well as AC equipment. The class differ from the EquipmentContaner for AC in that it may also contain DCNode-s. Hence it can contain both AC and DC equipment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCNodes <em>DC Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCEquipmentContainer()
 * @model
 * @generated
 */
public interface DCEquipmentContainer extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>DC Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC nodes contained in the DC equipment container.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Nodes</em>' reference list.
     * @see #isSetDCNodes()
     * @see #unsetDCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCEquipmentContainer_DCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode#getDCEquipmentContainer
     * @model opposite="DCEquipmentContainer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCEquipmentContainer.DCNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCNode > getDCNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCNodes <em>DC Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    void unsetDCNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCNodes <em>DC Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Nodes</em>' reference list is set.
     * @see #unsetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    boolean isSetDCNodes();

    /**
     * Returns the value of the '<em><b>DC Topological Node</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological nodes which belong to this connectivity node container.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Topological Node</em>' reference list.
     * @see #isSetDCTopologicalNode()
     * @see #unsetDCTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCEquipmentContainer_DCTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode#getDCEquipmentContainer
     * @model opposite="DCEquipmentContainer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCEquipmentContainer.DCTopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCTopologicalNode > getDCTopologicalNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCTopologicalNode <em>DC Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @generated
     */
    void unsetDCTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer#getDCTopologicalNode <em>DC Topological Node</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Node</em>' reference list is set.
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @generated
     */
    boolean isSetDCTopologicalNode();

} // DCEquipmentContainer
