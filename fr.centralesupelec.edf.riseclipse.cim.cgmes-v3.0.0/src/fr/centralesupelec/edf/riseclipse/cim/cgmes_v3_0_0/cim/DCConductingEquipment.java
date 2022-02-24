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
 * A representation of the model object '<em><b>DC Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The parts of the DC power system that are designed to carry current or that are conductively connected through DC terminals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getRatedUdc <em>Rated Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getDCTerminals <em>DC Terminals</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConductingEquipment()
 * @model
 * @generated
 */
public interface DCConductingEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>Rated Udc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated DC device voltage. The attribute shall be a positive value. It is configuration data used in power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Udc</em>' attribute.
     * @see #isSetRatedUdc()
     * @see #unsetRatedUdc()
     * @see #setRatedUdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConductingEquipment_RatedUdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='DCConductingEquipment.ratedUdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedUdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getRatedUdc <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Udc</em>' attribute.
     * @see #isSetRatedUdc()
     * @see #unsetRatedUdc()
     * @see #getRatedUdc()
     * @generated
     */
    void setRatedUdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getRatedUdc <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedUdc()
     * @see #getRatedUdc()
     * @see #setRatedUdc(Double)
     * @generated
     */
    void unsetRatedUdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getRatedUdc <em>Rated Udc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Udc</em>' attribute is set.
     * @see #unsetRatedUdc()
     * @see #getRatedUdc()
     * @see #setRatedUdc(Double)
     * @generated
     */
    boolean isSetRatedUdc();

    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A DC conducting equipment has DC terminals.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConductingEquipment_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal#getDCConductingEquipment
     * @model opposite="DCConductingEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCConductingEquipment.DCTerminals' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

} // DCConductingEquipment
