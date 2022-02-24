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
 * A representation of the model object '<em><b>ACDC Converter DC Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DC electrical connection point at the AC/DC converter. The AC/DC converter is electrically connected also to the AC side. The AC connection is inherited from the AC conducting equipment in the same way as any other AC equipment. The AC/DC converter DC terminal is separate from generic DC terminal to restrict the connection with the AC side to AC/DC converter and so that no other DC conducting equipment can be connected to the AC side.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getPolarity <em>Polarity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverterDCTerminal()
 * @model
 * @generated
 */
public interface ACDCConverterDCTerminal extends DCBaseTerminal {
    /**
     * Returns the value of the '<em><b>Polarity</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCPolarityKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Represents the normal network polarity condition. Depending on the converter configuration the value shall be set as follows:
     * - For a monopole with two converter terminals use DCPolarityKind “positive” and “negative”.
     * - For a bi-pole or symmetric monopole with three converter terminals use DCPolarityKind “positive”, “middle” and “negative”.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Polarity</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCPolarityKind
     * @see #isSetPolarity()
     * @see #unsetPolarity()
     * @see #setPolarity(DCPolarityKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverterDCTerminal_Polarity()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCConverterDCTerminal.polarity' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCPolarityKind getPolarity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getPolarity <em>Polarity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Polarity</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCPolarityKind
     * @see #isSetPolarity()
     * @see #unsetPolarity()
     * @see #getPolarity()
     * @generated
     */
    void setPolarity( DCPolarityKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getPolarity <em>Polarity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPolarity()
     * @see #getPolarity()
     * @see #setPolarity(DCPolarityKind)
     * @generated
     */
    void unsetPolarity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getPolarity <em>Polarity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Polarity</em>' attribute is set.
     * @see #unsetPolarity()
     * @see #getPolarity()
     * @see #setPolarity(DCPolarityKind)
     * @generated
     */
    boolean isSetPolarity();

    /**
     * Returns the value of the '<em><b>DC Conducting Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getDCTerminals <em>DC Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A DC converter terminal belong to an DC converter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #setDCConductingEquipment(ACDCConverter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCConverterDCTerminal_DCConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverter#getDCTerminals
     * @model opposite="DCTerminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ACDCConverterDCTerminal.DCConductingEquipment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ACDCConverter getDCConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @generated
     */
    void setDCConductingEquipment( ACDCConverter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(ACDCConverter)
     * @generated
     */
    void unsetDCConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCConverterDCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Conducting Equipment</em>' reference is set.
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(ACDCConverter)
     * @generated
     */
    boolean isSetDCConductingEquipment();

} // ACDCConverterDCTerminal
