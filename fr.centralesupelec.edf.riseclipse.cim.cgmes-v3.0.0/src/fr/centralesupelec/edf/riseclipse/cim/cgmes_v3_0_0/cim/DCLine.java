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
 * A representation of the model object '<em><b>DC Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Overhead lines and/or cables connecting two or more HVDC substations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLine()
 * @model
 * @generated
 */
public interface DCLine extends DCEquipmentContainer {
    /**
     * Returns the value of the '<em><b>Region</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getDCLines <em>DC Lines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The SubGeographicalRegion containing the DC line.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Region</em>' reference.
     * @see #isSetRegion()
     * @see #unsetRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLine_Region()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getDCLines
     * @model opposite="DCLines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCLine.Region' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SubGeographicalRegion getRegion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region</em>' reference.
     * @see #isSetRegion()
     * @see #unsetRegion()
     * @see #getRegion()
     * @generated
     */
    void setRegion( SubGeographicalRegion value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegion()
     * @see #getRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @generated
     */
    void unsetRegion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion <em>Region</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Region</em>' reference is set.
     * @see #unsetRegion()
     * @see #getRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @generated
     */
    boolean isSetRegion();

} // DCLine
