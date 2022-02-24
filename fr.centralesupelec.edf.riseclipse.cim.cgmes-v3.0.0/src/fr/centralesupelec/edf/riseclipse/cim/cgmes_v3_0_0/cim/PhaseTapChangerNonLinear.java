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
 * A representation of the model object '<em><b>Phase Tap Changer Non Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The non-linear phase tap changer describes the non-linear behaviour of a phase tap changer. This is a base class for the symmetrical and asymmetrical phase tap changer models. The details of these models can be found in IEC 61970-301.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMin <em>XMin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerNonLinear()
 * @model
 * @generated
 */
public interface PhaseTapChangerNonLinear extends PhaseTapChanger {
    /**
     * Returns the value of the '<em><b>Voltage Step Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage step increment on the out of phase winding (the PowerTransformerEnd where the TapChanger is located) specified in percent of rated voltage of the PowerTransformerEnd. A positive value means a positive voltage variation from the Terminal at the PowerTransformerEnd, where the TapChanger is located, into the transformer.
     * When the increment is negative, the voltage decreases when the tap step increases.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Step Increment</em>' attribute.
     * @see #isSetVoltageStepIncrement()
     * @see #unsetVoltageStepIncrement()
     * @see #setVoltageStepIncrement(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerNonLinear_VoltageStepIncrement()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerNonLinear.voltageStepIncrement' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageStepIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Step Increment</em>' attribute.
     * @see #isSetVoltageStepIncrement()
     * @see #unsetVoltageStepIncrement()
     * @see #getVoltageStepIncrement()
     * @generated
     */
    void setVoltageStepIncrement( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageStepIncrement()
     * @see #getVoltageStepIncrement()
     * @see #setVoltageStepIncrement(Double)
     * @generated
     */
    void unsetVoltageStepIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Step Increment</em>' attribute is set.
     * @see #unsetVoltageStepIncrement()
     * @see #getVoltageStepIncrement()
     * @see #setVoltageStepIncrement(Double)
     * @generated
     */
    boolean isSetVoltageStepIncrement();

    /**
     * Returns the value of the '<em><b>XMax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactance depends on the tap position according to a "u" shaped curve. The maximum reactance (xMax) appears at the low and high tap positions. Depending on the “u” curve the attribute can be either higher or lower than PowerTransformerEnd.x.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XMax</em>' attribute.
     * @see #isSetXMax()
     * @see #unsetXMax()
     * @see #setXMax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerNonLinear_XMax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerNonLinear.xMax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMax</em>' attribute.
     * @see #isSetXMax()
     * @see #unsetXMax()
     * @see #getXMax()
     * @generated
     */
    void setXMax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMax()
     * @see #getXMax()
     * @see #setXMax(Double)
     * @generated
     */
    void unsetXMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMax</em>' attribute is set.
     * @see #unsetXMax()
     * @see #getXMax()
     * @see #setXMax(Double)
     * @generated
     */
    boolean isSetXMax();

    /**
     * Returns the value of the '<em><b>XMin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactance depend on the tap position according to a "u" shaped curve. The minimum reactance (xMin) appear at the mid tap position.   PowerTransformerEnd.x shall be consistent with PhaseTapChangerLinear.xMin and PhaseTapChangerNonLinear.xMin. In case of inconsistency, PowerTransformerEnd.x shall be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XMin</em>' attribute.
     * @see #isSetXMin()
     * @see #unsetXMin()
     * @see #setXMin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerNonLinear_XMin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerNonLinear.xMin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMin <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMin</em>' attribute.
     * @see #isSetXMin()
     * @see #unsetXMin()
     * @see #getXMin()
     * @generated
     */
    void setXMin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMin <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMin()
     * @see #getXMin()
     * @see #setXMin(Double)
     * @generated
     */
    void unsetXMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerNonLinear#getXMin <em>XMin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMin</em>' attribute is set.
     * @see #unsetXMin()
     * @see #getXMin()
     * @see #setXMin(Double)
     * @generated
     */
    boolean isSetXMin();

} // PhaseTapChangerNonLinear
