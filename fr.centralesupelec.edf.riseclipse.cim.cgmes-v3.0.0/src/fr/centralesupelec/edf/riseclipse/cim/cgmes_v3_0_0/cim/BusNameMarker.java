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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to apply user standard names to TopologicalNodes. Associated with one or more terminals that are normally connected with the bus name.    The associated terminals are normally connected by non-retained switches. For a ring bus station configuration, all BusbarSection terminals in the ring are typically associated.   For a breaker and a half scheme, both BusbarSections would normally be associated.  For a ring bus, all BusbarSections would normally be associated.  For a "straight" busbar configuration, normally only the main terminal at the BusbarSection would be associated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusNameMarker()
 * @model
 * @generated
 */
public interface BusNameMarker extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reporting group to which this bus name marker belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reporting Group</em>' reference.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusNameMarker_ReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getBusNameMarker
     * @model opposite="BusNameMarker" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='BusNameMarker.ReportingGroup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ReportingGroup getReportingGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reporting Group</em>' reference.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    void setReportingGroup( ReportingGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingGroup()
     * @see #getReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @generated
     */
    void unsetReportingGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Group</em>' reference is set.
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @generated
     */
    boolean isSetReportingGroup();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker <em>Bus Name Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The terminals associated with this bus name marker.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference list.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusNameMarker_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker
     * @model opposite="BusNameMarker" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BusNameMarker.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ACDCTerminal > getTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getTerminal <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getTerminal <em>Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference list is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Priority of bus name marker for use as topology bus name.  Use 0 for do not care.  Use 1 for highest priority.  Use 2 as priority is less than 1 and so on.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #setPriority(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusNameMarker_Priority()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='BusNameMarker.priority' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(BigInteger)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getPriority <em>Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' attribute is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(BigInteger)
     * @generated
     */
    boolean isSetPriority();

} // BusNameMarker
