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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of equipment for purposes other than generation or utilization, through which electric energy in bulk is passed for the purposes of switching or modifying its characteristics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion <em>Region</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getVoltageLevels <em>Voltage Levels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getDCConverterUnit <em>DC Converter Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubstation()
 * @model
 * @generated
 */
public interface Substation extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Region</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The SubGeographicalRegion containing the substation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Region</em>' reference.
     * @see #isSetRegion()
     * @see #unsetRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubstation_Region()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getSubstations
     * @model opposite="Substations" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Substation.Region' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SubGeographicalRegion getRegion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion <em>Region</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegion()
     * @see #getRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @generated
     */
    void unsetRegion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion <em>Region</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Region</em>' reference is set.
     * @see #unsetRegion()
     * @see #getRegion()
     * @see #setRegion(SubGeographicalRegion)
     * @generated
     */
    boolean isSetRegion();

    /**
     * Returns the value of the '<em><b>Voltage Levels</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage levels within this substation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Levels</em>' reference list.
     * @see #isSetVoltageLevels()
     * @see #unsetVoltageLevels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubstation_VoltageLevels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation
     * @model opposite="Substation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Substation.VoltageLevels' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< VoltageLevel > getVoltageLevels();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getVoltageLevels <em>Voltage Levels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageLevels()
     * @see #getVoltageLevels()
     * @generated
     */
    void unsetVoltageLevels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getVoltageLevels <em>Voltage Levels</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Levels</em>' reference list is set.
     * @see #unsetVoltageLevels()
     * @see #getVoltageLevels()
     * @generated
     */
    boolean isSetVoltageLevels();

    /**
     * Returns the value of the '<em><b>DC Converter Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC converter unit belonging of the substation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Converter Unit</em>' reference list.
     * @see #isSetDCConverterUnit()
     * @see #unsetDCConverterUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubstation_DCConverterUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation
     * @model opposite="Substation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Substation.DCConverterUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCConverterUnit > getDCConverterUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getDCConverterUnit <em>DC Converter Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCConverterUnit()
     * @see #getDCConverterUnit()
     * @generated
     */
    void unsetDCConverterUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getDCConverterUnit <em>DC Converter Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Converter Unit</em>' reference list is set.
     * @see #unsetDCConverterUnit()
     * @see #getDCConverterUnit()
     * @generated
     */
    boolean isSetDCConverterUnit();

} // Substation
