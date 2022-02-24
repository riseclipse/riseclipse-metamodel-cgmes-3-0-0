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
 * A representation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic equivalent for an energy supplier on a transmission or distribution voltage level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMax <em>PMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMin <em>PMin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getXn <em>Xn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getRn <em>Rn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getReactivePower <em>Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getActivePower <em>Active Power</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource()
 * @model
 * @generated
 */
public interface EnergySource extends EnergyConnection {
    /**
     * Returns the value of the '<em><b>PMax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the maximum active power that can be produced by the source. Load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PMax</em>' attribute.
     * @see #isSetPMax()
     * @see #unsetPMax()
     * @see #setPMax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_PMax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.pMax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMax <em>PMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PMax</em>' attribute.
     * @see #isSetPMax()
     * @see #unsetPMax()
     * @see #getPMax()
     * @generated
     */
    void setPMax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMax <em>PMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPMax()
     * @see #getPMax()
     * @see #setPMax(Double)
     * @generated
     */
    void unsetPMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMax <em>PMax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PMax</em>' attribute is set.
     * @see #unsetPMax()
     * @see #getPMax()
     * @see #setPMax(Double)
     * @generated
     */
    boolean isSetPMax();

    /**
     * Returns the value of the '<em><b>PMin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the minimum active power that can be produced by the source. Load sign convention is used, i.e. positive sign means flow out from a TopologicalNode (bus) into the conducting equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PMin</em>' attribute.
     * @see #isSetPMin()
     * @see #unsetPMin()
     * @see #setPMin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_PMin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.pMin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMin <em>PMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PMin</em>' attribute.
     * @see #isSetPMin()
     * @see #unsetPMin()
     * @see #getPMin()
     * @generated
     */
    void setPMin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMin <em>PMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPMin()
     * @see #getPMin()
     * @see #setPMin(Double)
     * @generated
     */
    void unsetPMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getPMin <em>PMin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PMin</em>' attribute is set.
     * @see #unsetPMin()
     * @see #getPMin()
     * @see #setPMin(Double)
     * @generated
     */
    boolean isSetPMin();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence Thevenin reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>Xn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence Thevenin reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xn</em>' attribute.
     * @see #isSetXn()
     * @see #unsetXn()
     * @see #setXn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_Xn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.xn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getXn <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xn</em>' attribute.
     * @see #isSetXn()
     * @see #unsetXn()
     * @see #getXn()
     * @generated
     */
    void setXn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getXn <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXn()
     * @see #getXn()
     * @see #setXn(Double)
     * @generated
     */
    void unsetXn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getXn <em>Xn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xn</em>' attribute is set.
     * @see #unsetXn()
     * @see #getXn()
     * @see #setXn(Double)
     * @generated
     */
    boolean isSetXn();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence Thevenin reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_X()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.x' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #getX()
     * @generated
     */
    void setX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getX <em>X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X</em>' attribute is set.
     * @see #unsetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    boolean isSetX();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence Thevenin resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence Thevenin resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>Rn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence Thevenin resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rn</em>' attribute.
     * @see #isSetRn()
     * @see #unsetRn()
     * @see #setRn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_Rn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.rn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getRn <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rn</em>' attribute.
     * @see #isSetRn()
     * @see #unsetRn()
     * @see #getRn()
     * @generated
     */
    void setRn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getRn <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRn()
     * @see #getRn()
     * @see #setRn(Double)
     * @generated
     */
    void unsetRn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getRn <em>Rn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rn</em>' attribute is set.
     * @see #unsetRn()
     * @see #getRn()
     * @see #setRn(Double)
     * @generated
     */
    boolean isSetRn();

    /**
     * Returns the value of the '<em><b>Voltage Magnitude</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase-to-phase open circuit voltage magnitude used when voltage characteristics need to be imposed at the node associated with the terminal of the energy source, such as when voltages and angles from the transmission level are used as input to the distribution network. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Magnitude</em>' attribute.
     * @see #isSetVoltageMagnitude()
     * @see #unsetVoltageMagnitude()
     * @see #setVoltageMagnitude(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_VoltageMagnitude()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.voltageMagnitude' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageMagnitude();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Magnitude</em>' attribute.
     * @see #isSetVoltageMagnitude()
     * @see #unsetVoltageMagnitude()
     * @see #getVoltageMagnitude()
     * @generated
     */
    void setVoltageMagnitude( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageMagnitude()
     * @see #getVoltageMagnitude()
     * @see #setVoltageMagnitude(Double)
     * @generated
     */
    void unsetVoltageMagnitude();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Magnitude</em>' attribute is set.
     * @see #unsetVoltageMagnitude()
     * @see #getVoltageMagnitude()
     * @see #setVoltageMagnitude(Double)
     * @generated
     */
    boolean isSetVoltageMagnitude();

    /**
     * Returns the value of the '<em><b>Voltage Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase angle of a-phase open circuit used when voltage characteristics need to be imposed at the node associated with the terminal of the energy source, such as when voltages and angles from the transmission level are used as input to the distribution network. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Angle</em>' attribute.
     * @see #isSetVoltageAngle()
     * @see #unsetVoltageAngle()
     * @see #setVoltageAngle(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_VoltageAngle()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleRadians" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.voltageAngle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageAngle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Angle</em>' attribute.
     * @see #isSetVoltageAngle()
     * @see #unsetVoltageAngle()
     * @see #getVoltageAngle()
     * @generated
     */
    void setVoltageAngle( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageAngle()
     * @see #getVoltageAngle()
     * @see #setVoltageAngle(Double)
     * @generated
     */
    void unsetVoltageAngle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Angle</em>' attribute is set.
     * @see #unsetVoltageAngle()
     * @see #getVoltageAngle()
     * @see #setVoltageAngle(Double)
     * @generated
     */
    boolean isSetVoltageAngle();

    /**
     * Returns the value of the '<em><b>Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High voltage source reactive injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reactive Power</em>' attribute.
     * @see #isSetReactivePower()
     * @see #unsetReactivePower()
     * @see #setReactivePower(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_ReactivePower()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.reactivePower' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getReactivePower <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reactive Power</em>' attribute.
     * @see #isSetReactivePower()
     * @see #unsetReactivePower()
     * @see #getReactivePower()
     * @generated
     */
    void setReactivePower( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getReactivePower <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReactivePower()
     * @see #getReactivePower()
     * @see #setReactivePower(Double)
     * @generated
     */
    void unsetReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getReactivePower <em>Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reactive Power</em>' attribute is set.
     * @see #unsetReactivePower()
     * @see #getReactivePower()
     * @see #setReactivePower(Double)
     * @generated
     */
    boolean isSetReactivePower();

    /**
     * Returns the value of the '<em><b>Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High voltage source active injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Active Power</em>' attribute.
     * @see #isSetActivePower()
     * @see #unsetActivePower()
     * @see #setActivePower(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_ActivePower()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.activePower' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getActivePower <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active Power</em>' attribute.
     * @see #isSetActivePower()
     * @see #unsetActivePower()
     * @see #getActivePower()
     * @generated
     */
    void setActivePower( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getActivePower <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActivePower()
     * @see #getActivePower()
     * @see #setActivePower(Double)
     * @generated
     */
    void unsetActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getActivePower <em>Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Active Power</em>' attribute is set.
     * @see #unsetActivePower()
     * @see #getActivePower()
     * @see #setActivePower(Double)
     * @generated
     */
    boolean isSetActivePower();

    /**
     * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase-to-phase nominal voltage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal Voltage</em>' attribute.
     * @see #isSetNominalVoltage()
     * @see #unsetNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_NominalVoltage()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='EnergySource.nominalVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
     * @see #isSetNominalVoltage()
     * @see #unsetNominalVoltage()
     * @see #getNominalVoltage()
     * @generated
     */
    void setNominalVoltage( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalVoltage()
     * @see #getNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @generated
     */
    void unsetNominalVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Voltage</em>' attribute is set.
     * @see #unsetNominalVoltage()
     * @see #getNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @generated
     */
    boolean isSetNominalVoltage();

    /**
     * Returns the value of the '<em><b>Energy Scheduling Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType#getEnergySource <em>Energy Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy Scheduling Type of an Energy Source.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Scheduling Type</em>' reference.
     * @see #isSetEnergySchedulingType()
     * @see #unsetEnergySchedulingType()
     * @see #setEnergySchedulingType(EnergySchedulingType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergySource_EnergySchedulingType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType#getEnergySource
     * @model opposite="EnergySource" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='EnergySource.EnergySchedulingType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EnergySchedulingType getEnergySchedulingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Scheduling Type</em>' reference.
     * @see #isSetEnergySchedulingType()
     * @see #unsetEnergySchedulingType()
     * @see #getEnergySchedulingType()
     * @generated
     */
    void setEnergySchedulingType( EnergySchedulingType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySchedulingType()
     * @see #getEnergySchedulingType()
     * @see #setEnergySchedulingType(EnergySchedulingType)
     * @generated
     */
    void unsetEnergySchedulingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource#getEnergySchedulingType <em>Energy Scheduling Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Scheduling Type</em>' reference is set.
     * @see #unsetEnergySchedulingType()
     * @see #getEnergySchedulingType()
     * @see #setEnergySchedulingType(EnergySchedulingType)
     * @generated
     */
    boolean isSetEnergySchedulingType();

} // EnergySource
