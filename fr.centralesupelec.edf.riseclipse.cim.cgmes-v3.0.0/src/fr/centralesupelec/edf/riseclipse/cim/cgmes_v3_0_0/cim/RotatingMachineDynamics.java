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
 * A representation of the model object '<em><b>Rotating Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract parent class for all synchronous and asynchronous machine standard models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics()
 * @model
 * @generated
 */
public interface RotatingMachineDynamics extends DynamicsFunctionBlock {
    /**
     * Returns the value of the '<em><b>Saturation Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturation factor at rated terminal voltage (<i>S1</i>) (&gt;= 0).  Not used by simplified model.  Defined by defined by <i>S</i>(<i>E1</i>) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Saturation Factor</em>' attribute.
     * @see #isSetSaturationFactor()
     * @see #unsetSaturationFactor()
     * @see #setSaturationFactor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_SaturationFactor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.saturationFactor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSaturationFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor</em>' attribute.
     * @see #isSetSaturationFactor()
     * @see #unsetSaturationFactor()
     * @see #getSaturationFactor()
     * @generated
     */
    void setSaturationFactor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor()
     * @see #getSaturationFactor()
     * @see #setSaturationFactor(Double)
     * @generated
     */
    void unsetSaturationFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor <em>Saturation Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor</em>' attribute is set.
     * @see #unsetSaturationFactor()
     * @see #getSaturationFactor()
     * @see #setSaturationFactor(Double)
     * @generated
     */
    boolean isSetSaturationFactor();

    /**
     * Returns the value of the '<em><b>Stator Leakage Reactance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stator leakage reactance (<i>Xl</i>) (&gt;= 0). Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stator Leakage Reactance</em>' attribute.
     * @see #isSetStatorLeakageReactance()
     * @see #unsetStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_StatorLeakageReactance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.statorLeakageReactance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStatorLeakageReactance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stator Leakage Reactance</em>' attribute.
     * @see #isSetStatorLeakageReactance()
     * @see #unsetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @generated
     */
    void setStatorLeakageReactance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Double)
     * @generated
     */
    void unsetStatorLeakageReactance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stator Leakage Reactance</em>' attribute is set.
     * @see #unsetStatorLeakageReactance()
     * @see #getStatorLeakageReactance()
     * @see #setStatorLeakageReactance(Double)
     * @generated
     */
    boolean isSetStatorLeakageReactance();

    /**
     * Returns the value of the '<em><b>Stator Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stator (armature) resistance (<i>Rs</i>) (&gt;= 0). Typical value = 0,005.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stator Resistance</em>' attribute.
     * @see #isSetStatorResistance()
     * @see #unsetStatorResistance()
     * @see #setStatorResistance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_StatorResistance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.statorResistance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStatorResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stator Resistance</em>' attribute.
     * @see #isSetStatorResistance()
     * @see #unsetStatorResistance()
     * @see #getStatorResistance()
     * @generated
     */
    void setStatorResistance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatorResistance()
     * @see #getStatorResistance()
     * @see #setStatorResistance(Double)
     * @generated
     */
    void unsetStatorResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getStatorResistance <em>Stator Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stator Resistance</em>' attribute is set.
     * @see #unsetStatorResistance()
     * @see #getStatorResistance()
     * @see #setStatorResistance(Double)
     * @generated
     */
    boolean isSetStatorResistance();

    /**
     * Returns the value of the '<em><b>Damping</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damping torque coefficient (<i>D</i>) (&gt;= 0).  A proportionality constant that, when multiplied by the angular velocity of the rotor poles with respect to the magnetic field (frequency), results in the damping torque.  This value is often zero when the sources of damping torques (generator damper windings, load damping effects, etc.) are modelled in detail.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Damping</em>' attribute.
     * @see #isSetDamping()
     * @see #unsetDamping()
     * @see #setDamping(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_Damping()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.damping' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDamping();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Damping</em>' attribute.
     * @see #isSetDamping()
     * @see #unsetDamping()
     * @see #getDamping()
     * @generated
     */
    void setDamping( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDamping()
     * @see #getDamping()
     * @see #setDamping(Double)
     * @generated
     */
    void unsetDamping();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getDamping <em>Damping</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Damping</em>' attribute is set.
     * @see #unsetDamping()
     * @see #getDamping()
     * @see #setDamping(Double)
     * @generated
     */
    boolean isSetDamping();

    /**
     * Returns the value of the '<em><b>Saturation Factor120</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturation factor at 120% of rated terminal voltage (<i>S12</i>) (&gt;= RotatingMachineDynamics.saturationFactor). Not used by the simplified model, defined by <i>S</i>(<i>E2</i>) in the SynchronousMachineSaturationParameters diagram.  Typical value = 0,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Saturation Factor120</em>' attribute.
     * @see #isSetSaturationFactor120()
     * @see #unsetSaturationFactor120()
     * @see #setSaturationFactor120(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_SaturationFactor120()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.saturationFactor120' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSaturationFactor120();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor120</em>' attribute.
     * @see #isSetSaturationFactor120()
     * @see #unsetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @generated
     */
    void setSaturationFactor120( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @see #setSaturationFactor120(Double)
     * @generated
     */
    void unsetSaturationFactor120();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getSaturationFactor120 <em>Saturation Factor120</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor120</em>' attribute is set.
     * @see #unsetSaturationFactor120()
     * @see #getSaturationFactor120()
     * @see #setSaturationFactor120(Double)
     * @generated
     */
    boolean isSetSaturationFactor120();

    /**
     * Returns the value of the '<em><b>Inertia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inertia constant of generator or motor and mechanical load (<i>H</i>) (&gt; 0).  This is the specification for the stored energy in the rotating mass when operating at rated speed.  For a generator, this includes the generator plus all other elements (turbine, exciter) on the same shaft and has units of MW x s.  For a motor, it includes the motor plus its mechanical load. Conventional units are PU on the generator MVA base, usually expressed as MW x s / MVA or just s. This value is used in the accelerating power reference frame for operator training simulator solutions.  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inertia</em>' attribute.
     * @see #isSetInertia()
     * @see #unsetInertia()
     * @see #setInertia(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachineDynamics_Inertia()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachineDynamics.inertia' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getInertia();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inertia</em>' attribute.
     * @see #isSetInertia()
     * @see #unsetInertia()
     * @see #getInertia()
     * @generated
     */
    void setInertia( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInertia()
     * @see #getInertia()
     * @see #setInertia(Double)
     * @generated
     */
    void unsetInertia();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachineDynamics#getInertia <em>Inertia</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inertia</em>' attribute is set.
     * @see #unsetInertia()
     * @see #getInertia()
     * @see #setInertia(Double)
     * @generated
     */
    boolean isSetInertia();

} // RotatingMachineDynamics
