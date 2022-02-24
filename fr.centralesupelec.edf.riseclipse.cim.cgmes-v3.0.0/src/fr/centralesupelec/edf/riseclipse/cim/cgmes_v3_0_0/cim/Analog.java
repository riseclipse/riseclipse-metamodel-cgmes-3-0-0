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
 * A representation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Analog represents an analog Measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getAnalogValues <em>Analog Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalog()
 * @model
 * @generated
 */
public interface Analog extends Measurement {
    /**
     * Returns the value of the '<em><b>Analog Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog <em>Analog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The values connected to this measurement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analog Values</em>' reference list.
     * @see #isSetAnalogValues()
     * @see #unsetAnalogValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalog_AnalogValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog
     * @model opposite="Analog" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Analog.AnalogValues' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< AnalogValue > getAnalogValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getAnalogValues <em>Analog Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogValues()
     * @see #getAnalogValues()
     * @generated
     */
    void unsetAnalogValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getAnalogValues <em>Analog Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Values</em>' reference list is set.
     * @see #unsetAnalogValues()
     * @see #getAnalogValues()
     * @generated
     */
    boolean isSetAnalogValues();

    /**
     * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true then this measurement is an active power, reactive power or current with the convention that a positive value measured at the Terminal means power is flowing into the related PowerSystemResource.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalog_PositiveFlowIn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Analog.positiveFlowIn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getPositiveFlowIn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @generated
     */
    void setPositiveFlowIn( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    void unsetPositiveFlowIn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive Flow In</em>' attribute is set.
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    boolean isSetPositiveFlowIn();

    /**
     * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A measurement may have zero or more limit ranges defined for it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Limit Sets</em>' reference list.
     * @see #isSetLimitSets()
     * @see #unsetLimitSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalog_LimitSets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet#getMeasurements
     * @model opposite="Measurements" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Analog.LimitSets' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< AnalogLimitSet > getLimitSets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getLimitSets <em>Limit Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimitSets()
     * @see #getLimitSets()
     * @generated
     */
    void unsetLimitSets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getLimitSets <em>Limit Sets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit Sets</em>' reference list is set.
     * @see #unsetLimitSets()
     * @see #getLimitSets()
     * @generated
     */
    boolean isSetLimitSets();

} // Analog
