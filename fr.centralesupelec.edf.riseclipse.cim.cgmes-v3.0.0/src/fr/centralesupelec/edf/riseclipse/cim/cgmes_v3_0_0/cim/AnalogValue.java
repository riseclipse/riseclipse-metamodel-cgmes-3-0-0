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
 * A representation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AnalogValue represents an analog MeasurementValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog <em>Analog</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogValue()
 * @model
 * @generated
 */
public interface AnalogValue extends MeasurementValue {
    /**
     * Returns the value of the '<em><b>Analog</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getAnalogValues <em>Analog Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement to which this value is connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analog</em>' reference.
     * @see #isSetAnalog()
     * @see #unsetAnalog()
     * @see #setAnalog(Analog)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogValue_Analog()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog#getAnalogValues
     * @model opposite="AnalogValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='AnalogValue.Analog' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Analog getAnalog();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog</em>' reference.
     * @see #isSetAnalog()
     * @see #unsetAnalog()
     * @see #getAnalog()
     * @generated
     */
    void setAnalog( Analog value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalog()
     * @see #getAnalog()
     * @see #setAnalog(Analog)
     * @generated
     */
    void unsetAnalog();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalog <em>Analog</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog</em>' reference is set.
     * @see #unsetAnalog()
     * @see #getAnalog()
     * @see #setAnalog(Analog)
     * @generated
     */
    boolean isSetAnalog();

    /**
     * Returns the value of the '<em><b>Analog Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue <em>Analog Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Control variable associated with the MeasurementValue.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analog Control</em>' reference.
     * @see #isSetAnalogControl()
     * @see #unsetAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAnalogValue_AnalogControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl#getAnalogValue
     * @model opposite="AnalogValue" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AnalogValue.AnalogControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AnalogControl getAnalogControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog Control</em>' reference.
     * @see #isSetAnalogControl()
     * @see #unsetAnalogControl()
     * @see #getAnalogControl()
     * @generated
     */
    void setAnalogControl( AnalogControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogControl()
     * @see #getAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @generated
     */
    void unsetAnalogControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue#getAnalogControl <em>Analog Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Control</em>' reference is set.
     * @see #unsetAnalogControl()
     * @see #getAnalogControl()
     * @see #setAnalogControl(AnalogControl)
     * @generated
     */
    boolean isSetAnalogControl();

} // AnalogValue
