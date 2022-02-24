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
 * A representation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For a detailed substation model a topological node is a set of connectivity nodes that, in the current network state, are connected together through any type of closed switches, including  jumpers. Topological nodes change as the current network state changes (i.e., switches, breakers, etc. change state).
 * For a planning model, switch statuses are not used to form topological nodes. Instead they are manually created or deleted in a model builder tool. Topological nodes maintained this way are also called "busses".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode()
 * @model
 * @generated
 */
public interface TopologicalNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Angle Ref Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The island for which the node is an angle reference.   Normally there is one angle reference node for each island.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_AngleRefTopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getAngleRefTopologicalNode
     * @model opposite="AngleRefTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.AngleRefTopologicalIsland' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalIsland getAngleRefTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @generated
     */
    void setAngleRefTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetAngleRefTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle Ref Topological Island</em>' reference is set.
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetAngleRefTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Sv Injection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The injection flows state variables associated with the topological node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Injection</em>' reference.
     * @see #isSetSvInjection()
     * @see #unsetSvInjection()
     * @see #setSvInjection(SvInjection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_SvInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.SvInjection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SvInjection getSvInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Injection</em>' reference.
     * @see #isSetSvInjection()
     * @see #unsetSvInjection()
     * @see #getSvInjection()
     * @generated
     */
    void setSvInjection( SvInjection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvInjection()
     * @see #getSvInjection()
     * @see #setSvInjection(SvInjection)
     * @generated
     */
    void unsetSvInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Injection</em>' reference is set.
     * @see #unsetSvInjection()
     * @see #getSvInjection()
     * @see #setSvInjection(SvInjection)
     * @generated
     */
    boolean isSetSvInjection();

    /**
     * Returns the value of the '<em><b>Sv Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The state voltage associated with the topological node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Voltage</em>' reference.
     * @see #isSetSvVoltage()
     * @see #unsetSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_SvVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.SvVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SvVoltage getSvVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Voltage</em>' reference.
     * @see #isSetSvVoltage()
     * @see #unsetSvVoltage()
     * @see #getSvVoltage()
     * @generated
     */
    void setSvVoltage( SvVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvVoltage()
     * @see #getSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @generated
     */
    void unsetSvVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Voltage</em>' reference is set.
     * @see #unsetSvVoltage()
     * @see #getSvVoltage()
     * @see #setSvVoltage(SvVoltage)
     * @generated
     */
    boolean isSetSvVoltage();

    /**
     * Returns the value of the '<em><b>Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A topological node belongs to a topological island.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_TopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland#getTopologicalNodes
     * @model opposite="TopologicalNodes" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.TopologicalIsland' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalIsland getTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @generated
     */
    void setTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Island</em>' reference is set.
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectivity nodes combine together to form this topological node.  May depend on the current state of switches in the network.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connectivity Nodes</em>' reference list.
     * @see #isSetConnectivityNodes()
     * @see #unsetConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_ConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.ConnectivityNodes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ConnectivityNode > getConnectivityNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    void unsetConnectivityNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Nodes</em>' reference list is set.
     * @see #unsetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    boolean isSetConnectivityNodes();

    /**
     * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reporting group to which the topological node belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reporting Group</em>' reference.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_ReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.ReportingGroup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ReportingGroup getReportingGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingGroup()
     * @see #getReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @generated
     */
    void unsetReportingGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference is set.
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
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The base voltage of the topological node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.BaseVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The terminals associated with the topological node.   This can be used as an alternative to the connectivity node path to terminal, thus making it unnecessary to model connectivity nodes in some cases.   Note that if connectivity nodes are in the model, this association would probably not be used as an input specification.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference list.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Terminal > getTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference list is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectivity node container to which the topological node belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTopologicalNode_ConnectivityNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TopologicalNode.ConnectivityNodeContainer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ConnectivityNodeContainer getConnectivityNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    void unsetConnectivityNodeContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node Container</em>' reference is set.
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    boolean isSetConnectivityNodeContainer();

} // TopologicalNode
