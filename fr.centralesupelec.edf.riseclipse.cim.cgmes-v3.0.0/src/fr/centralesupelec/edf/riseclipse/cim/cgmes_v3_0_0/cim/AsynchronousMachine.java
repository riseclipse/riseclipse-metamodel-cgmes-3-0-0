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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rotating machine whose shaft rotates asynchronously with the electrical field.  Also known as an induction machine with no external connection to the rotor windings, e.g. squirrel-cage induction machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getReversible <em>Reversible</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine()
 * @model
 * @generated
 */
public interface AsynchronousMachine extends RotatingMachine {
    /**
     * Returns the value of the '<em><b>Nominal Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nameplate data.  Depends on the slip and number of pole pairs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal Speed</em>' attribute.
     * @see #isSetNominalSpeed()
     * @see #unsetNominalSpeed()
     * @see #setNominalSpeed(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_NominalSpeed()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotationSpeed" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.nominalSpeed' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalSpeed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Speed</em>' attribute.
     * @see #isSetNominalSpeed()
     * @see #unsetNominalSpeed()
     * @see #getNominalSpeed()
     * @generated
     */
    void setNominalSpeed( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalSpeed()
     * @see #getNominalSpeed()
     * @see #setNominalSpeed(Double)
     * @generated
     */
    void unsetNominalSpeed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalSpeed <em>Nominal Speed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Speed</em>' attribute is set.
     * @see #unsetNominalSpeed()
     * @see #getNominalSpeed()
     * @see #setNominalSpeed(Double)
     * @generated
     */
    boolean isSetNominalSpeed();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine <em>Asynchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Asynchronous machine dynamics model used to describe dynamic behaviour of this asynchronous machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_AsynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics#getAsynchronousMachine
     * @model opposite="AsynchronousMachine" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.AsynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineDynamics getAsynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine Dynamics</em>' reference.
     * @see #isSetAsynchronousMachineDynamics()
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @generated
     */
    void setAsynchronousMachineDynamics( AsynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    void unsetAsynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Dynamics</em>' reference is set.
     * @see #unsetAsynchronousMachineDynamics()
     * @see #getAsynchronousMachineDynamics()
     * @see #setAsynchronousMachineDynamics(AsynchronousMachineDynamics)
     * @generated
     */
    boolean isSetAsynchronousMachineDynamics();

    /**
     * Returns the value of the '<em><b>Rated Mechanical Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated mechanical power (Pr in IEC 60909-0). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Mechanical Power</em>' attribute.
     * @see #isSetRatedMechanicalPower()
     * @see #unsetRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_RatedMechanicalPower()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.ratedMechanicalPower' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedMechanicalPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Mechanical Power</em>' attribute.
     * @see #isSetRatedMechanicalPower()
     * @see #unsetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @generated
     */
    void setRatedMechanicalPower( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Double)
     * @generated
     */
    void unsetRatedMechanicalPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRatedMechanicalPower <em>Rated Mechanical Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Mechanical Power</em>' attribute is set.
     * @see #unsetRatedMechanicalPower()
     * @see #getRatedMechanicalPower()
     * @see #setRatedMechanicalPower(Double)
     * @generated
     */
    boolean isSetRatedMechanicalPower();

    /**
     * Returns the value of the '<em><b>Reversible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates for converter drive motors if the power can be reversible. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reversible</em>' attribute.
     * @see #isSetReversible()
     * @see #unsetReversible()
     * @see #setReversible(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_Reversible()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.reversible' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getReversible();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reversible</em>' attribute.
     * @see #isSetReversible()
     * @see #unsetReversible()
     * @see #getReversible()
     * @generated
     */
    void setReversible( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReversible()
     * @see #getReversible()
     * @see #setReversible(Boolean)
     * @generated
     */
    void unsetReversible();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getReversible <em>Reversible</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reversible</em>' attribute is set.
     * @see #unsetReversible()
     * @see #getReversible()
     * @see #setReversible(Boolean)
     * @generated
     */
    boolean isSetReversible();

    /**
     * Returns the value of the '<em><b>Rx Locked Rotor Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Locked rotor ratio (R/X). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rx Locked Rotor Ratio</em>' attribute.
     * @see #isSetRxLockedRotorRatio()
     * @see #unsetRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_RxLockedRotorRatio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.rxLockedRotorRatio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRxLockedRotorRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx Locked Rotor Ratio</em>' attribute.
     * @see #isSetRxLockedRotorRatio()
     * @see #unsetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @generated
     */
    void setRxLockedRotorRatio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Double)
     * @generated
     */
    void unsetRxLockedRotorRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rx Locked Rotor Ratio</em>' attribute is set.
     * @see #unsetRxLockedRotorRatio()
     * @see #getRxLockedRotorRatio()
     * @see #setRxLockedRotorRatio(Double)
     * @generated
     */
    boolean isSetRxLockedRotorRatio();

    /**
     * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Efficiency of the asynchronous machine at nominal operation as a percentage. Indicator for converter drive motors. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #setEfficiency(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_Efficiency()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.efficiency' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfficiency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @generated
     */
    void setEfficiency( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Double)
     * @generated
     */
    void unsetEfficiency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getEfficiency <em>Efficiency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efficiency</em>' attribute is set.
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Double)
     * @generated
     */
    boolean isSetEfficiency();

    /**
     * Returns the value of the '<em><b>Pole Pair Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of pole pairs of stator. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pole Pair Number</em>' attribute.
     * @see #isSetPolePairNumber()
     * @see #unsetPolePairNumber()
     * @see #setPolePairNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_PolePairNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.polePairNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getPolePairNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pole Pair Number</em>' attribute.
     * @see #isSetPolePairNumber()
     * @see #unsetPolePairNumber()
     * @see #getPolePairNumber()
     * @generated
     */
    void setPolePairNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPolePairNumber()
     * @see #getPolePairNumber()
     * @see #setPolePairNumber(BigInteger)
     * @generated
     */
    void unsetPolePairNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getPolePairNumber <em>Pole Pair Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pole Pair Number</em>' attribute is set.
     * @see #unsetPolePairNumber()
     * @see #getPolePairNumber()
     * @see #setPolePairNumber(BigInteger)
     * @generated
     */
    boolean isSetPolePairNumber();

    /**
     * Returns the value of the '<em><b>Converter Fed Drive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether the machine is a converter fed drive. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Converter Fed Drive</em>' attribute.
     * @see #isSetConverterFedDrive()
     * @see #unsetConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_ConverterFedDrive()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.converterFedDrive' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getConverterFedDrive();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Converter Fed Drive</em>' attribute.
     * @see #isSetConverterFedDrive()
     * @see #unsetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @generated
     */
    void setConverterFedDrive( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @generated
     */
    void unsetConverterFedDrive();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getConverterFedDrive <em>Converter Fed Drive</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Converter Fed Drive</em>' attribute is set.
     * @see #unsetConverterFedDrive()
     * @see #getConverterFedDrive()
     * @see #setConverterFedDrive(Boolean)
     * @generated
     */
    boolean isSetConverterFedDrive();

    /**
     * Returns the value of the '<em><b>Ia Ir Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ratio of locked-rotor current to the rated current of the motor (Ia/Ir). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ia Ir Ratio</em>' attribute.
     * @see #isSetIaIrRatio()
     * @see #unsetIaIrRatio()
     * @see #setIaIrRatio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_IaIrRatio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.iaIrRatio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIaIrRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ia Ir Ratio</em>' attribute.
     * @see #isSetIaIrRatio()
     * @see #unsetIaIrRatio()
     * @see #getIaIrRatio()
     * @generated
     */
    void setIaIrRatio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIaIrRatio()
     * @see #getIaIrRatio()
     * @see #setIaIrRatio(Double)
     * @generated
     */
    void unsetIaIrRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getIaIrRatio <em>Ia Ir Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ia Ir Ratio</em>' attribute is set.
     * @see #unsetIaIrRatio()
     * @see #getIaIrRatio()
     * @see #setIaIrRatio(Double)
     * @generated
     */
    boolean isSetIaIrRatio();

    /**
     * Returns the value of the '<em><b>Asynchronous Machine Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the type of Asynchronous Machine (motor or generator).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Asynchronous Machine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineKind
     * @see #isSetAsynchronousMachineType()
     * @see #unsetAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_AsynchronousMachineType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.asynchronousMachineType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    AsynchronousMachineKind getAsynchronousMachineType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asynchronous Machine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineKind
     * @see #isSetAsynchronousMachineType()
     * @see #unsetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @generated
     */
    void setAsynchronousMachineType( AsynchronousMachineKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @generated
     */
    void unsetAsynchronousMachineType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asynchronous Machine Type</em>' attribute is set.
     * @see #unsetAsynchronousMachineType()
     * @see #getAsynchronousMachineType()
     * @see #setAsynchronousMachineType(AsynchronousMachineKind)
     * @generated
     */
    boolean isSetAsynchronousMachineType();

    /**
     * Returns the value of the '<em><b>Nominal Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nameplate data indicates if the machine is 50 Hz or 60 Hz.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal Frequency</em>' attribute.
     * @see #isSetNominalFrequency()
     * @see #unsetNominalFrequency()
     * @see #setNominalFrequency(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachine_NominalFrequency()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachine.nominalFrequency' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Frequency</em>' attribute.
     * @see #isSetNominalFrequency()
     * @see #unsetNominalFrequency()
     * @see #getNominalFrequency()
     * @generated
     */
    void setNominalFrequency( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalFrequency()
     * @see #getNominalFrequency()
     * @see #setNominalFrequency(Double)
     * @generated
     */
    void unsetNominalFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine#getNominalFrequency <em>Nominal Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Frequency</em>' attribute is set.
     * @see #unsetNominalFrequency()
     * @see #getNominalFrequency()
     * @see #setNominalFrequency(Double)
     * @generated
     */
    boolean isSetNominalFrequency();

} // AsynchronousMachine
