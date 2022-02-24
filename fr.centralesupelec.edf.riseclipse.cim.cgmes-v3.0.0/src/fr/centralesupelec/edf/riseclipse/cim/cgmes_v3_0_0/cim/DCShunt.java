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
 * A representation of the model object '<em><b>DC Shunt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A shunt device within the DC system, typically used for filtering.  Needed for transient and short circuit studies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCShunt()
 * @model
 * @generated
 */
public interface DCShunt extends DCConductingEquipment {
    /**
     * Returns the value of the '<em><b>Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Capacitance of the DC shunt.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #setCapacitance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCShunt_Capacitance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Capacitance" transient="true" ordered="false"
     *        extendedMetaData="name='DCShunt.capacitance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCapacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @generated
     */
    void setCapacitance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Double)
     * @generated
     */
    void unsetCapacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capacitance</em>' attribute is set.
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Double)
     * @generated
     */
    boolean isSetCapacitance();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCShunt_Resistance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='DCShunt.resistance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getResistance <em>Resistance</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    void unsetResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCShunt#getResistance <em>Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistance</em>' attribute is set.
     * @see #unsetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    boolean isSetResistance();

} // DCShunt
