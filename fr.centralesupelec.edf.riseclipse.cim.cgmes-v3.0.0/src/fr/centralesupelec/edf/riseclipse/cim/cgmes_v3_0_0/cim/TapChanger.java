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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mechanism for changing transformer winding tap positions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getStep <em>Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger()
 * @model
 * @generated
 */
public interface TapChanger extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Tap Changer Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The regulating control scheme in which this tap changer participates.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tap Changer Control</em>' reference.
     * @see #isSetTapChangerControl()
     * @see #unsetTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_TapChangerControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl#getTapChanger
     * @model opposite="TapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TapChanger.TapChangerControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TapChangerControl getTapChangerControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tap Changer Control</em>' reference.
     * @see #isSetTapChangerControl()
     * @see #unsetTapChangerControl()
     * @see #getTapChangerControl()
     * @generated
     */
    void setTapChangerControl( TapChangerControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapChangerControl()
     * @see #getTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @generated
     */
    void unsetTapChangerControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Changer Control</em>' reference is set.
     * @see #unsetTapChangerControl()
     * @see #getTapChangerControl()
     * @see #setTapChangerControl(TapChangerControl)
     * @generated
     */
    boolean isSetTapChangerControl();

    /**
     * Returns the value of the '<em><b>Normal Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tap step position used in "normal" network operation for this winding. For a "Fixed" tap changer indicates the current physical tap setting.
     * The attribute shall be equal to or greater than lowStep and equal to or less than highStep.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normal Step</em>' attribute.
     * @see #isSetNormalStep()
     * @see #unsetNormalStep()
     * @see #setNormalStep(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_NormalStep()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.normalStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getNormalStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Step</em>' attribute.
     * @see #isSetNormalStep()
     * @see #unsetNormalStep()
     * @see #getNormalStep()
     * @generated
     */
    void setNormalStep( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalStep()
     * @see #getNormalStep()
     * @see #setNormalStep(BigInteger)
     * @generated
     */
    void unsetNormalStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNormalStep <em>Normal Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Step</em>' attribute is set.
     * @see #unsetNormalStep()
     * @see #getNormalStep()
     * @see #setNormalStep(BigInteger)
     * @generated
     */
    boolean isSetNormalStep();

    /**
     * Returns the value of the '<em><b>Neutral U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage at which the winding operates at the neutral tap setting. It is the voltage at the terminal of the PowerTransformerEnd associated with the tap changer when all tap changers on the transformer are at their neutralStep position.  Normally neutralU of the tap changer is the same as ratedU of the PowerTransformerEnd, but it can differ in special cases such as when the tapping mechanism is separate from the winding more common on lower voltage transformers.
     * This attribute is not relevant for PhaseTapChangerAsymmetrical, PhaseTapChangerSymmetrical and PhaseTapChangerLinear.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Neutral U</em>' attribute.
     * @see #isSetNeutralU()
     * @see #unsetNeutralU()
     * @see #setNeutralU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_NeutralU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.neutralU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNeutralU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral U</em>' attribute.
     * @see #isSetNeutralU()
     * @see #unsetNeutralU()
     * @see #getNeutralU()
     * @generated
     */
    void setNeutralU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralU()
     * @see #getNeutralU()
     * @see #setNeutralU(Double)
     * @generated
     */
    void unsetNeutralU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralU <em>Neutral U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral U</em>' attribute is set.
     * @see #unsetNeutralU()
     * @see #getNeutralU()
     * @see #setNeutralU(Double)
     * @generated
     */
    boolean isSetNeutralU();

    /**
     * Returns the value of the '<em><b>High Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Highest possible tap step position, advance from neutral.
     * The attribute shall be greater than lowStep.
     * <!-- end-model-doc -->
     * @return the value of the '<em>High Step</em>' attribute.
     * @see #isSetHighStep()
     * @see #unsetHighStep()
     * @see #setHighStep(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_HighStep()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.highStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getHighStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getHighStep <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Step</em>' attribute.
     * @see #isSetHighStep()
     * @see #unsetHighStep()
     * @see #getHighStep()
     * @generated
     */
    void setHighStep( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getHighStep <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighStep()
     * @see #getHighStep()
     * @see #setHighStep(BigInteger)
     * @generated
     */
    void unsetHighStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getHighStep <em>High Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Step</em>' attribute is set.
     * @see #unsetHighStep()
     * @see #getHighStep()
     * @see #setHighStep(BigInteger)
     * @generated
     */
    boolean isSetHighStep();

    /**
     * Returns the value of the '<em><b>Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tap changer position.
     * Starting step for a steady state solution. Non integer values are allowed to support continuous tap variables. The reasons for continuous value are to support study cases where no discrete tap changer has yet been designed, a solution where a narrow voltage band forces the tap step to oscillate or to accommodate for a continuous solution as input.
     * The attribute shall be equal to or greater than lowStep and equal to or less than highStep.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Step</em>' attribute.
     * @see #isSetStep()
     * @see #unsetStep()
     * @see #setStep(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_Step()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.step' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getStep <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step</em>' attribute.
     * @see #isSetStep()
     * @see #unsetStep()
     * @see #getStep()
     * @generated
     */
    void setStep( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getStep <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStep()
     * @see #getStep()
     * @see #setStep(Double)
     * @generated
     */
    void unsetStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getStep <em>Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step</em>' attribute is set.
     * @see #unsetStep()
     * @see #getStep()
     * @see #setStep(Double)
     * @generated
     */
    boolean isSetStep();

    /**
     * Returns the value of the '<em><b>Control Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the regulation status of the equipment.  True is regulating, false is not regulating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_ControlEnabled()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.controlEnabled' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getControlEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Enabled</em>' attribute.
     * @see #isSetControlEnabled()
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @generated
     */
    void setControlEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    void unsetControlEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getControlEnabled <em>Control Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Enabled</em>' attribute is set.
     * @see #unsetControlEnabled()
     * @see #getControlEnabled()
     * @see #setControlEnabled(Boolean)
     * @generated
     */
    boolean isSetControlEnabled();

    /**
     * Returns the value of the '<em><b>Sv Tap Step</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tap step state associated with the tap changer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Tap Step</em>' reference.
     * @see #isSetSvTapStep()
     * @see #unsetSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_SvTapStep()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep#getTapChanger
     * @model opposite="TapChanger" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.SvTapStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SvTapStep getSvTapStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sv Tap Step</em>' reference.
     * @see #isSetSvTapStep()
     * @see #unsetSvTapStep()
     * @see #getSvTapStep()
     * @generated
     */
    void setSvTapStep( SvTapStep value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvTapStep()
     * @see #getSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @generated
     */
    void unsetSvTapStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Tap Step</em>' reference is set.
     * @see #unsetSvTapStep()
     * @see #getSvTapStep()
     * @see #setSvTapStep(SvTapStep)
     * @generated
     */
    boolean isSetSvTapStep();

    /**
     * Returns the value of the '<em><b>Low Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lowest possible tap step position, retard from neutral.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Low Step</em>' attribute.
     * @see #isSetLowStep()
     * @see #unsetLowStep()
     * @see #setLowStep(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_LowStep()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.lowStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getLowStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Step</em>' attribute.
     * @see #isSetLowStep()
     * @see #unsetLowStep()
     * @see #getLowStep()
     * @generated
     */
    void setLowStep( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowStep()
     * @see #getLowStep()
     * @see #setLowStep(BigInteger)
     * @generated
     */
    void unsetLowStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLowStep <em>Low Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Step</em>' attribute is set.
     * @see #unsetLowStep()
     * @see #getLowStep()
     * @see #setLowStep(BigInteger)
     * @generated
     */
    boolean isSetLowStep();

    /**
     * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The neutral tap step position for this winding.
     * The attribute shall be equal to or greater than lowStep and equal or less than highStep.
     * It is the step position where the voltage is neutralU when the other terminals of the transformer are at the ratedU.  If there are other tap changers on the transformer those taps are kept constant at their neutralStep.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Neutral Step</em>' attribute.
     * @see #isSetNeutralStep()
     * @see #unsetNeutralStep()
     * @see #setNeutralStep(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_NeutralStep()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.neutralStep' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getNeutralStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neutral Step</em>' attribute.
     * @see #isSetNeutralStep()
     * @see #unsetNeutralStep()
     * @see #getNeutralStep()
     * @generated
     */
    void setNeutralStep( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeutralStep()
     * @see #getNeutralStep()
     * @see #setNeutralStep(BigInteger)
     * @generated
     */
    void unsetNeutralStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Neutral Step</em>' attribute is set.
     * @see #unsetNeutralStep()
     * @see #getNeutralStep()
     * @see #setNeutralStep(BigInteger)
     * @generated
     */
    boolean isSetNeutralStep();

    /**
     * Returns the value of the '<em><b>Tap Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A TapChanger can have TapSchedules.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tap Schedules</em>' reference list.
     * @see #isSetTapSchedules()
     * @see #unsetTapSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_TapSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule#getTapChanger
     * @model opposite="TapChanger" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.TapSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TapSchedule > getTapSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTapSchedules()
     * @see #getTapSchedules()
     * @generated
     */
    void unsetTapSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getTapSchedules <em>Tap Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tap Schedules</em>' reference list is set.
     * @see #unsetTapSchedules()
     * @see #getTapSchedules()
     * @generated
     */
    boolean isSetTapSchedules();

    /**
     * Returns the value of the '<em><b>Ltc Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies whether or not a TapChanger has load tap changing capabilities.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ltc Flag</em>' attribute.
     * @see #isSetLtcFlag()
     * @see #unsetLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTapChanger_LtcFlag()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TapChanger.ltcFlag' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getLtcFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ltc Flag</em>' attribute.
     * @see #isSetLtcFlag()
     * @see #unsetLtcFlag()
     * @see #getLtcFlag()
     * @generated
     */
    void setLtcFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLtcFlag()
     * @see #getLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @generated
     */
    void unsetLtcFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger#getLtcFlag <em>Ltc Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ltc Flag</em>' attribute is set.
     * @see #unsetLtcFlag()
     * @see #getLtcFlag()
     * @see #setLtcFlag(Boolean)
     * @generated
     */
    boolean isSetLtcFlag();

} // TapChanger
