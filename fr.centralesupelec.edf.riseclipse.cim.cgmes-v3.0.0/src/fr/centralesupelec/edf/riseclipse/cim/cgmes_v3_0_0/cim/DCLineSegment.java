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
 * A representation of the model object '<em><b>DC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getResistance <em>Resistance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLineSegment()
 * @model
 * @generated
 */
public interface DCLineSegment extends DCConductingEquipment {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLineSegment_Length()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='DCLineSegment.length' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getLength <em>Length</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLength()
     * @see #getLength()
     * @see #setLength(Double)
     * @generated
     */
    void unsetLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getLength <em>Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length</em>' attribute is set.
     * @see #unsetLength()
     * @see #getLength()
     * @see #setLength(Double)
     * @generated
     */
    boolean isSetLength();

    /**
     * Returns the value of the '<em><b>Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistance of the DC line segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #setResistance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLineSegment_Resistance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='DCLineSegment.resistance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getResistance <em>Resistance</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    void unsetResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getResistance <em>Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistance</em>' attribute is set.
     * @see #unsetResistance()
     * @see #getResistance()
     * @see #setResistance(Double)
     * @generated
     */
    boolean isSetResistance();

    /**
     * Returns the value of the '<em><b>Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Capacitance of the DC line segment. Significant for cables only.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #setCapacitance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLineSegment_Capacitance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Capacitance" transient="true" ordered="false"
     *        extendedMetaData="name='DCLineSegment.capacitance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCapacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getCapacitance <em>Capacitance</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Double)
     * @generated
     */
    void unsetCapacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getCapacitance <em>Capacitance</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Inductance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inductance of the DC line segment. Negligible compared with DCSeriesDevice used for smoothing.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inductance</em>' attribute.
     * @see #isSetInductance()
     * @see #unsetInductance()
     * @see #setInductance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCLineSegment_Inductance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Inductance" transient="true" ordered="false"
     *        extendedMetaData="name='DCLineSegment.inductance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getInductance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getInductance <em>Inductance</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getInductance <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInductance()
     * @see #getInductance()
     * @see #setInductance(Double)
     * @generated
     */
    void unsetInductance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLineSegment#getInductance <em>Inductance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inductance</em>' attribute is set.
     * @see #unsetInductance()
     * @see #getInductance()
     * @see #setInductance(Double)
     * @generated
     */
    boolean isSetInductance();

} // DCLineSegment
