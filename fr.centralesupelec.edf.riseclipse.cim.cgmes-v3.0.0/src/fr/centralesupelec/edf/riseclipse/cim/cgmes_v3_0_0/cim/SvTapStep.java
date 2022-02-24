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
 * A representation of the model object '<em><b>Sv Tap Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State variable for transformer tap step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvTapStep()
 * @model
 * @generated
 */
public interface SvTapStep extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tap changer associated with the tap step state.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tap Changer</em>' reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #setTapChanger(TapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvTapStep_TapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep
     * @model opposite="SvTapStep" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvTapStep.TapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TapChanger getTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer</em>' reference.
     * @see #isSetTapChanger()
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @generated
     */
    void setTapChanger( TapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    void unsetTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer</em>' reference is set.
     * @see #unsetTapChanger()
     * @see #getTapChanger()
     * @see #setTapChanger(TapChanger)
     * @generated
     */
    boolean isSetTapChanger();

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The floating point tap position.   This is not the tap ratio, but rather the tap step position as defined by the related tap changer model and normally is constrained to be within the range of minimum and maximum tap positions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #setPosition(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvTapStep_Position()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SvTapStep.position' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #getPosition()
     * @generated
     */
    void setPosition( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosition()
     * @see #getPosition()
     * @see #setPosition(Double)
     * @generated
     */
    void unsetPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getPosition <em>Position</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position</em>' attribute is set.
     * @see #unsetPosition()
     * @see #getPosition()
     * @see #setPosition(Double)
     * @generated
     */
    boolean isSetPosition();

} // SvTapStep
