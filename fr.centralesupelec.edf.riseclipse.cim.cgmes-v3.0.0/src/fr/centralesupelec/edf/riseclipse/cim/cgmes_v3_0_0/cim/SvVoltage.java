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
 * A representation of the model object '<em><b>Sv Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State variable for voltage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getV <em>V</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvVoltage()
 * @model
 * @generated
 */
public interface SvVoltage extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage angle of the topological node complex voltage with respect to system reference.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Angle</em>' attribute.
     * @see #isSetAngle()
     * @see #unsetAngle()
     * @see #setAngle(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvVoltage_Angle()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='SvVoltage.angle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAngle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle</em>' attribute.
     * @see #isSetAngle()
     * @see #unsetAngle()
     * @see #getAngle()
     * @generated
     */
    void setAngle( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngle()
     * @see #getAngle()
     * @see #setAngle(Double)
     * @generated
     */
    void unsetAngle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getAngle <em>Angle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle</em>' attribute is set.
     * @see #unsetAngle()
     * @see #getAngle()
     * @see #setAngle(Double)
     * @generated
     */
    boolean isSetAngle();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological node associated with the voltage state.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvVoltage_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getSvVoltage
     * @model opposite="SvVoltage" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvVoltage.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TopologicalNode getTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}' reference is set.
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
     * Returns the value of the '<em><b>V</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage magnitude at the topological node. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>V</em>' attribute.
     * @see #isSetV()
     * @see #unsetV()
     * @see #setV(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvVoltage_V()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='SvVoltage.v' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getV();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getV <em>V</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>V</em>' attribute.
     * @see #isSetV()
     * @see #unsetV()
     * @see #getV()
     * @generated
     */
    void setV( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getV <em>V</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetV()
     * @see #getV()
     * @see #setV(Double)
     * @generated
     */
    void unsetV();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage#getV <em>V</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>V</em>' attribute is set.
     * @see #unsetV()
     * @see #getV()
     * @see #setV(Double)
     * @generated
     */
    boolean isSetV();

} // SvVoltage
