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
 * A representation of the model object '<em><b>Sv Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State variable for switch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch <em>Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getOpen <em>Open</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvSwitch()
 * @model
 * @generated
 */
public interface SvSwitch extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSvSwitch <em>Sv Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The switch associated with the switch state.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #setSwitch(Switch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvSwitch_Switch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSvSwitch
     * @model opposite="SvSwitch" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvSwitch.Switch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Switch getSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @generated
     */
    void setSwitch( Switch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    void unsetSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch <em>Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch</em>' reference is set.
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    boolean isSetSwitch();

    /**
     * Returns the value of the '<em><b>Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attribute tells if the computed state of the switch is considered open.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #setOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvSwitch_Open()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='SvSwitch.open' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #getOpen()
     * @generated
     */
    void setOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    void unsetOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getOpen <em>Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open</em>' attribute is set.
     * @see #unsetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    boolean isSetOpen();

} // SvSwitch
