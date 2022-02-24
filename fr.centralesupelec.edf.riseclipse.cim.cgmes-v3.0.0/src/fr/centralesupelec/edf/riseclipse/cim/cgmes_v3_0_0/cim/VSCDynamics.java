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
 * A representation of the model object '<em><b>VSC Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VSC function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter <em>Vs Converter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVSCDynamics()
 * @model
 * @generated
 */
public interface VSCDynamics extends HVDCDynamics {
    /**
     * Returns the value of the '<em><b>Vs Converter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics <em>VSC Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage source converter to which voltage source converter dynamics model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vs Converter</em>' reference.
     * @see #isSetVsConverter()
     * @see #unsetVsConverter()
     * @see #setVsConverter(VsConverter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVSCDynamics_VsConverter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics
     * @model opposite="VSCDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VSCDynamics.VsConverter' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VsConverter getVsConverter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter <em>Vs Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vs Converter</em>' reference.
     * @see #isSetVsConverter()
     * @see #unsetVsConverter()
     * @see #getVsConverter()
     * @generated
     */
    void setVsConverter( VsConverter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter <em>Vs Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsConverter()
     * @see #getVsConverter()
     * @see #setVsConverter(VsConverter)
     * @generated
     */
    void unsetVsConverter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter <em>Vs Converter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vs Converter</em>' reference is set.
     * @see #unsetVsConverter()
     * @see #getVsConverter()
     * @see #setVsConverter(VsConverter)
     * @generated
     */
    boolean isSetVsConverter();

} // VSCDynamics
