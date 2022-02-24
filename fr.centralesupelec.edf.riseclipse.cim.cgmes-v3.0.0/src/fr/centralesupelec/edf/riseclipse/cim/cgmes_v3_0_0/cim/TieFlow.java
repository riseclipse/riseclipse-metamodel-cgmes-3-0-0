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
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the structure (in terms of location and direction) of the net interchange constraint for a control area. This constraint may be used by either AGC or power flow.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTieFlow()
 * @model
 * @generated
 */
public interface TieFlow extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Control Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getTieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The control area of the tie flows.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #setControlArea(ControlArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTieFlow_ControlArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getTieFlow
     * @model opposite="TieFlow" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TieFlow.ControlArea' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ControlArea getControlArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @generated
     */
    void setControlArea( ControlArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    void unsetControlArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea <em>Control Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area</em>' reference is set.
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    boolean isSetControlArea();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The terminal to which this tie flow belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTieFlow_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTieFlow
     * @model opposite="TieFlow" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TieFlow.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the sign of the tie flow associated with a control area. True if positive flow into the terminal (load convention) is also positive flow into the control area.  See the description of ControlArea for further explanation of how TieFlow.positiveFlowIn is used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTieFlow_PositiveFlowIn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TieFlow.positiveFlowIn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getPositiveFlowIn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @generated
     */
    void setPositiveFlowIn( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    void unsetPositiveFlowIn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive Flow In</em>' attribute is set.
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    boolean isSetPositiveFlowIn();

} // TieFlow
