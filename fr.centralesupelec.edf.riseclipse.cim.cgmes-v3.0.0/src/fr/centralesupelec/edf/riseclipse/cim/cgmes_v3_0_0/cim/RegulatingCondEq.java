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
 * A representation of the model object '<em><b>Regulating Cond Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of conducting equipment that can regulate a quantity (i.e. voltage or flow) at a specific point in the network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingCondEq()
 * @model
 * @generated
 */
public interface RegulatingCondEq extends EnergyConnection {
    /**
     * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The regulating control scheme in which this equipment participates.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingCondEq_RegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingControl#getRegulatingCondEq
     * @model opposite="RegulatingCondEq" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RegulatingCondEq.RegulatingControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RegulatingControl getRegulatingControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    void setRegulatingControl( RegulatingControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    void unsetRegulatingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Control</em>' reference is set.
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    boolean isSetRegulatingControl();

    /**
     * Returns the value of the '<em><b>Control Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the regulation status of the equipment.  True is regulating, false is not regulating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRegulatingCondEq_ControlEnabled()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='RegulatingCondEq.controlEnabled' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getControlEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @generated
     */
    void setControlEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    void unsetControlEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegulatingCondEq#getControlEnabled <em>Control Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Enabled</em>' attribute is set.
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    boolean isSetControlEnabled();

} // RegulatingCondEq
