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
 * A representation of the model object '<em><b>Analog Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An analog control used for supervisory control.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogControl()
 * @model
 * @generated
 */
public interface AnalogControl extends Control {
    /**
     * Returns the value of the '<em><b>Analog Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The MeasurementValue that is controlled.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogControl_AnalogValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl
     * @model opposite="AnalogControl" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AnalogControl.AnalogValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AnalogValue getAnalogValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @generated
     */
    void setAnalogValue( AnalogValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    void unsetAnalogValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Value</em>' reference is set.
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    boolean isSetAnalogValue();

    /**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Normal value range minimum for any of the Control.value. Used for scaling, e.g. in bar graphs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #setMinValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogControl_MinValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='AnalogControl.minValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #isSetMinValue()
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @generated
     */
    void setMinValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Double)
     * @generated
     */
    void unsetMinValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMinValue <em>Min Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Value</em>' attribute is set.
     * @see #unsetMinValue()
     * @see #getMinValue()
     * @see #setMinValue(Double)
     * @generated
     */
    boolean isSetMinValue();

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Normal value range maximum for any of the Control.value. Used for scaling, e.g. in bar graphs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #setMaxValue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogControl_MaxValue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='AnalogControl.maxValue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #isSetMaxValue()
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Double)
     * @generated
     */
    void unsetMaxValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getMaxValue <em>Max Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Value</em>' attribute is set.
     * @see #unsetMaxValue()
     * @see #getMaxValue()
     * @see #setMaxValue(Double)
     * @generated
     */
    boolean isSetMaxValue();

} // AnalogControl
