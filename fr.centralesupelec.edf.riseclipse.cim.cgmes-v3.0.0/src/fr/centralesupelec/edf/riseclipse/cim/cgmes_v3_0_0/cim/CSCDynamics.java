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
 * A representation of the model object '<em><b>CSC Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CSC function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter <em>CS Converter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCSCDynamics()
 * @model
 * @generated
 */
public interface CSCDynamics extends HVDCDynamics {
    /**
     * Returns the value of the '<em><b>CS Converter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics <em>CSC Dynamics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current source converter to which current source converter dynamics model applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>CS Converter</em>' reference.
     * @see #isSetCSConverter()
     * @see #unsetCSConverter()
     * @see #setCSConverter(CsConverter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCSCDynamics_CSConverter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics
     * @model opposite="CSCDynamics" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='CSCDynamics.CSConverter' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CsConverter getCSConverter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter <em>CS Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CS Converter</em>' reference.
     * @see #isSetCSConverter()
     * @see #unsetCSConverter()
     * @see #getCSConverter()
     * @generated
     */
    void setCSConverter( CsConverter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter <em>CS Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCSConverter()
     * @see #getCSConverter()
     * @see #setCSConverter(CsConverter)
     * @generated
     */
    void unsetCSConverter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter <em>CS Converter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CS Converter</em>' reference is set.
     * @see #unsetCSConverter()
     * @see #getCSConverter()
     * @see #setCSConverter(CsConverter)
     * @generated
     */
    boolean isSetCSConverter();

} // CSCDynamics
