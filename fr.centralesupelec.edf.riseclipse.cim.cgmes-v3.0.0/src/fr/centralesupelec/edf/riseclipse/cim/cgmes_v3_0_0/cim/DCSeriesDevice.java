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
 * A representation of the model object '<em><b>DC Series Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A series device within the DC system, typically a reactor used for filtering or smoothing.  Needed for transient and short circuit studies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCSeriesDevice()
 * @model
 * @generated
 */
public interface DCSeriesDevice extends DCConductingEquipment {
    /**
     * Returns the value of the '<em><b>Inductance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inductance of the device.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inductance</em>' attribute.
     * @see #isSetInductance()
     * @see #unsetInductance()
     * @see #setInductance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCSeriesDevice_Inductance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Inductance" transient="true" ordered="false"
     *        extendedMetaData="name='DCSeriesDevice.inductance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getInductance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getInductance <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inductance</em>' attribute.
     * @see #isSetInductance()
     * @see #unsetInductance()
     * @see #getInductance()
     * @generated
     */
    void setInductance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getInductance <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInductance()
     * @see #getInductance()
     * @see #setInductance(Double)
     * @generated
     */
    void unsetInductance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getInductance <em>Inductance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inductance</em>' attribute is set.
     * @see #unsetInductance()
     * @see #getInductance()
     * @see #setInductance(Double)
     * @generated
     */
    boolean isSetInductance();

    /**
     * Returns the value of the '<em><b>Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistance of the DC device.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #setResistance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCSeriesDevice_Resistance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='DCSeriesDevice.resistance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #getResistance()
     * @generated
     */
    void setResistance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    void unsetResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice#getResistance <em>Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistance</em>' attribute is set.
     * @see #unsetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    boolean isSetResistance();

} // DCSeriesDevice
