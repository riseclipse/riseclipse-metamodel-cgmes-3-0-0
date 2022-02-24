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
 * A representation of the model object '<em><b>Phase Tap Changer Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a tap changer with a linear relation between the tap step and the phase angle difference across the transformer. This is a mathematical model that is an approximation of a real phase tap changer.
 * The phase angle is computed as stepPhaseShiftIncrement times the tap position.
 * The voltage magnitude of both sides is the same.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerLinear()
 * @model
 * @generated
 */
public interface PhaseTapChangerLinear extends PhaseTapChanger {
    /**
     * Returns the value of the '<em><b>Step Phase Shift Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase shift per step position. A positive value indicates a positive angle variation from the Terminal at the  PowerTransformerEnd,  where the TapChanger is located, into the transformer.
     * The actual phase shift increment might be more accurately computed from the symmetrical or asymmetrical models or a tap step table lookup if those are available.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Step Phase Shift Increment</em>' attribute.
     * @see #isSetStepPhaseShiftIncrement()
     * @see #unsetStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerLinear_StepPhaseShiftIncrement()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerLinear.stepPhaseShiftIncrement' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStepPhaseShiftIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Phase Shift Increment</em>' attribute.
     * @see #isSetStepPhaseShiftIncrement()
     * @see #unsetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @generated
     */
    void setStepPhaseShiftIncrement( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Double)
     * @generated
     */
    void unsetStepPhaseShiftIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Phase Shift Increment</em>' attribute is set.
     * @see #unsetStepPhaseShiftIncrement()
     * @see #getStepPhaseShiftIncrement()
     * @see #setStepPhaseShiftIncrement(Double)
     * @generated
     */
    boolean isSetStepPhaseShiftIncrement();

    /**
     * Returns the value of the '<em><b>XMin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactance depends on the tap position according to a "u" shaped curve. The minimum reactance (xMin) appears at the mid tap position.  PowerTransformerEnd.x shall be consistent with PhaseTapChangerLinear.xMin and PhaseTapChangerNonLinear.xMin. In case of inconsistency, PowerTransformerEnd.x shall be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XMin</em>' attribute.
     * @see #isSetXMin()
     * @see #unsetXMin()
     * @see #setXMin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerLinear_XMin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerLinear.xMin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMin()
     * @see #getXMin()
     * @see #setXMin(Double)
     * @generated
     */
    void unsetXMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMin <em>XMin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMin</em>' attribute is set.
     * @see #unsetXMin()
     * @see #getXMin()
     * @see #setXMin(Double)
     * @generated
     */
    boolean isSetXMin();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerLinear_XMax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerLinear.xMax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMax()
     * @see #getXMax()
     * @see #setXMax(Double)
     * @generated
     */
    void unsetXMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerLinear#getXMax <em>XMax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMax</em>' attribute is set.
     * @see #unsetXMax()
     * @see #getXMax()
     * @see #setXMax(Double)
     * @generated
     */
    boolean isSetXMax();

} // PhaseTapChangerLinear
