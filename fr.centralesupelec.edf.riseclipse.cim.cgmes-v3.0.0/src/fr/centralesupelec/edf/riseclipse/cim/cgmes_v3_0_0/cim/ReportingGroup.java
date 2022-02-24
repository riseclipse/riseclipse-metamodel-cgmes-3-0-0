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
 * A representation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reporting group is used for various ad-hoc groupings used for reporting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReportingGroup()
 * @model
 * @generated
 */
public interface ReportingGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bus name markers that belong to this reporting group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bus Name Marker</em>' reference list.
     * @see #isSetBusNameMarker()
     * @see #unsetBusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReportingGroup_BusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup
     * @model opposite="ReportingGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ReportingGroup.BusNameMarker' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< BusNameMarker > getBusNameMarker();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    void unsetBusNameMarker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bus Name Marker</em>' reference list is set.
     * @see #unsetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    boolean isSetBusNameMarker();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological nodes that belong to the reporting group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference list.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getReportingGroup_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup
     * @model opposite="ReportingGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ReportingGroup.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference list is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    boolean isSetTopologicalNode();

} // ReportingGroup
