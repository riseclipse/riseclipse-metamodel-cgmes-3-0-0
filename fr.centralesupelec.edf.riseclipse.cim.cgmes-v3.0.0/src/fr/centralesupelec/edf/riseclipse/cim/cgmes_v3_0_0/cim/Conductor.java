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
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Combination of conducting material with consistent electrical characteristics, building a single electrical system, used to carry current between points in the power system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductor()
 * @model
 * @generated
 */
public interface Conductor extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Segment length for calculating line section capabilities.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #setLength(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getConductor_Length()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='Conductor.length' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #getLength()
     * @generated
     */
    void setLength( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLength()
     * @see #getLength()
     * @see #setLength(Double)
     * @generated
     */
    void unsetLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductor#getLength <em>Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length</em>' attribute is set.
     * @see #unsetLength()
     * @see #getLength()
     * @see #setLength(Double)
     * @generated
     */
    boolean isSetLength();

} // Conductor
