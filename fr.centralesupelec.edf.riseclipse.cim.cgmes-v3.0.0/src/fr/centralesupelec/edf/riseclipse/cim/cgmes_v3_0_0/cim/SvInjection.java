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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SvInjection reports the calculated bus injection minus the sum of the terminal flows. The terminal flow is positive out from the bus (load sign convention) and bus injection has positive flow into the bus. SvInjection may have the remainder after state estimation or slack after power flow calculation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getQInjection <em>QInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getPInjection <em>PInjection</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvInjection()
 * @model
 * @generated
 */
public interface SvInjection extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological node associated with the flow injection state variable.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvInjection_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvInjection
     * @model opposite="SvInjection" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvInjection.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalNode getTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    boolean isSetTopologicalNode();

    /**
     * Returns the value of the '<em><b>QInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactive power mismatch between calculated injection and initial injection.  Positive sign means injection into the TopologicalNode (bus).
     * <!-- end-model-doc -->
     * @return the value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #setQInjection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvInjection_QInjection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='SvInjection.qInjection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @generated
     */
    void setQInjection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Double)
     * @generated
     */
    void unsetQInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getQInjection <em>QInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QInjection</em>' attribute is set.
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Double)
     * @generated
     */
    boolean isSetQInjection();

    /**
     * Returns the value of the '<em><b>PInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The active power mismatch between calculated injection and initial injection.  Positive sign means injection into the TopologicalNode (bus).
     * <!-- end-model-doc -->
     * @return the value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #setPInjection(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvInjection_PInjection()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='SvInjection.pInjection' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @generated
     */
    void setPInjection( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Double)
     * @generated
     */
    void unsetPInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection#getPInjection <em>PInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PInjection</em>' attribute is set.
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Double)
     * @generated
     */
    boolean isSetPInjection();

} // SvInjection
