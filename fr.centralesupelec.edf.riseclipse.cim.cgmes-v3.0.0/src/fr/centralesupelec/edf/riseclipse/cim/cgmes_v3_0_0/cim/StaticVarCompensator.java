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
 * A representation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A facility for providing variable and controllable shunt reactive power. The SVC typically consists of a stepdown transformer, filter, thyristor-controlled reactor, and thyristor-switched capacitor arms.
 *
 * The SVC may operate in fixed MVar output mode or in voltage control mode. When in voltage control mode, the output of the SVC will be proportional to the deviation of voltage at the controlled bus from the voltage setpoint.  The SVC characteristic slope defines the proportion.  If the voltage at the controlled bus is equal to the voltage setpoint, the SVC MVar output is zero.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSlope <em>Slope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator()
 * @model
 * @generated
 */
public interface StaticVarCompensator extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Capacitive reactance at maximum capacitive reactive power.  Shall always be positive.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capacitive Rating</em>' attribute.
     * @see #isSetCapacitiveRating()
     * @see #unsetCapacitiveRating()
     * @see #setCapacitiveRating(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_CapacitiveRating()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.capacitiveRating' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCapacitiveRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
     * @see #isSetCapacitiveRating()
     * @see #unsetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @generated
     */
    void setCapacitiveRating( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @see #setCapacitiveRating(Double)
     * @generated
     */
    void unsetCapacitiveRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capacitive Rating</em>' attribute is set.
     * @see #unsetCapacitiveRating()
     * @see #getCapacitiveRating()
     * @see #setCapacitiveRating(Double)
     * @generated
     */
    boolean isSetCapacitiveRating();

    /**
     * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inductive reactance at maximum inductive reactive power.  Shall always be negative.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inductive Rating</em>' attribute.
     * @see #isSetInductiveRating()
     * @see #unsetInductiveRating()
     * @see #setInductiveRating(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_InductiveRating()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.inductiveRating' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getInductiveRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inductive Rating</em>' attribute.
     * @see #isSetInductiveRating()
     * @see #unsetInductiveRating()
     * @see #getInductiveRating()
     * @generated
     */
    void setInductiveRating( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInductiveRating()
     * @see #getInductiveRating()
     * @see #setInductiveRating(Double)
     * @generated
     */
    void unsetInductiveRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inductive Rating</em>' attribute is set.
     * @see #unsetInductiveRating()
     * @see #getInductiveRating()
     * @see #setInductiveRating(Double)
     * @generated
     */
    boolean isSetInductiveRating();

    /**
     * Returns the value of the '<em><b>Slope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The characteristics slope of an SVC defines how the reactive power output changes in proportion to the difference between the regulated bus voltage and the voltage setpoint.
     * The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Slope</em>' attribute.
     * @see #isSetSlope()
     * @see #unsetSlope()
     * @see #setSlope(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_Slope()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltagePerReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.slope' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSlope();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slope</em>' attribute.
     * @see #isSetSlope()
     * @see #unsetSlope()
     * @see #getSlope()
     * @generated
     */
    void setSlope( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSlope()
     * @see #getSlope()
     * @see #setSlope(Double)
     * @generated
     */
    void unsetSlope();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSlope <em>Slope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Slope</em>' attribute is set.
     * @see #unsetSlope()
     * @see #getSlope()
     * @see #setSlope(Double)
     * @generated
     */
    boolean isSetSlope();

    /**
     * Returns the value of the '<em><b>Voltage Set Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactive power output of the SVC is proportional to the difference between the voltage at the regulated bus and the voltage setpoint.  When the regulated bus voltage is equal to the voltage setpoint, the reactive power output is zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Set Point</em>' attribute.
     * @see #isSetVoltageSetPoint()
     * @see #unsetVoltageSetPoint()
     * @see #setVoltageSetPoint(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_VoltageSetPoint()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.voltageSetPoint' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageSetPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Set Point</em>' attribute.
     * @see #isSetVoltageSetPoint()
     * @see #unsetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @generated
     */
    void setVoltageSetPoint( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @see #setVoltageSetPoint(Double)
     * @generated
     */
    void unsetVoltageSetPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Set Point</em>' attribute is set.
     * @see #unsetVoltageSetPoint()
     * @see #getVoltageSetPoint()
     * @see #setVoltageSetPoint(Double)
     * @generated
     */
    boolean isSetVoltageSetPoint();

    /**
     * Returns the value of the '<em><b>Static Var Compensator Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator <em>Static Var Compensator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Static Var Compensator dynamics model used to describe dynamic behaviour of this Static Var Compensator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Static Var Compensator Dynamics</em>' reference.
     * @see #isSetStaticVarCompensatorDynamics()
     * @see #unsetStaticVarCompensatorDynamics()
     * @see #setStaticVarCompensatorDynamics(StaticVarCompensatorDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_StaticVarCompensatorDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics#getStaticVarCompensator
     * @model opposite="StaticVarCompensator" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.StaticVarCompensatorDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StaticVarCompensatorDynamics getStaticVarCompensatorDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Var Compensator Dynamics</em>' reference.
     * @see #isSetStaticVarCompensatorDynamics()
     * @see #unsetStaticVarCompensatorDynamics()
     * @see #getStaticVarCompensatorDynamics()
     * @generated
     */
    void setStaticVarCompensatorDynamics( StaticVarCompensatorDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStaticVarCompensatorDynamics()
     * @see #getStaticVarCompensatorDynamics()
     * @see #setStaticVarCompensatorDynamics(StaticVarCompensatorDynamics)
     * @generated
     */
    void unsetStaticVarCompensatorDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static Var Compensator Dynamics</em>' reference is set.
     * @see #unsetStaticVarCompensatorDynamics()
     * @see #getStaticVarCompensatorDynamics()
     * @see #setStaticVarCompensatorDynamics(StaticVarCompensatorDynamics)
     * @generated
     */
    boolean isSetStaticVarCompensatorDynamics();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>SVC Control Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCControlMode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * SVC control mode.
     * <!-- end-model-doc -->
     * @return the value of the '<em>SVC Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCControlMode
     * @see #isSetSVCControlMode()
     * @see #unsetSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStaticVarCompensator_SVCControlMode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StaticVarCompensator.sVCControlMode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SVCControlMode getSVCControlMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SVC Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCControlMode
     * @see #isSetSVCControlMode()
     * @see #unsetSVCControlMode()
     * @see #getSVCControlMode()
     * @generated
     */
    void setSVCControlMode( SVCControlMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSVCControlMode()
     * @see #getSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @generated
     */
    void unsetSVCControlMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SVC Control Mode</em>' attribute is set.
     * @see #unsetSVCControlMode()
     * @see #getSVCControlMode()
     * @see #setSVCControlMode(SVCControlMode)
     * @generated
     */
    boolean isSetSVCControlMode();

} // StaticVarCompensator
