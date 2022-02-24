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
 * A representation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system.
 * For symmetrical, transposed three phase lines, it is sufficient to use attributes of the line segment, which describe impedances and admittances for the entire length of the segment.  Additionally impedances can be computed by using length and associated per length impedances.
 * The BaseVoltage at the two ends of ACLineSegments in a Line shall have the same BaseVoltage.nominalVoltage. However, boundary lines may have slightly different BaseVoltage.nominalVoltages and variation is allowed. Larger voltage difference in general requires use of an equivalent branch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getCut <em>Cut</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getBch <em>Bch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getClamp <em>Clamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getGch <em>Gch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR0 <em>R0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment()
 * @model
 * @generated
 */
public interface ACLineSegment extends Conductor {
    /**
     * Returns the value of the '<em><b>Clamp</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment <em>AC Line Segment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The clamps connected to the line segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Clamp</em>' reference list.
     * @see #isSetClamp()
     * @see #unsetClamp()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_Clamp()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment
     * @model opposite="ACLineSegment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.Clamp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Clamp > getClamp();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getClamp <em>Clamp</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClamp()
     * @see #getClamp()
     * @generated
     */
    void unsetClamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getClamp <em>Clamp</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Clamp</em>' reference list is set.
     * @see #unsetClamp()
     * @see #getClamp()
     * @generated
     */
    boolean isSetClamp();

    /**
     * Returns the value of the '<em><b>Gch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) conductance, uniformly distributed, of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gch</em>' attribute.
     * @see #isSetGch()
     * @see #unsetGch()
     * @see #setGch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_Gch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.gch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getGch <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gch</em>' attribute.
     * @see #isSetGch()
     * @see #unsetGch()
     * @see #getGch()
     * @generated
     */
    void setGch( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getGch <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGch()
     * @see #getGch()
     * @see #setGch(Double)
     * @generated
     */
    void unsetGch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getGch <em>Gch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gch</em>' attribute is set.
     * @see #unsetGch()
     * @see #getGch()
     * @see #setGch(Double)
     * @generated
     */
    boolean isSetGch();

    /**
     * Returns the value of the '<em><b>G0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) conductance, uniformly distributed, of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>G0ch</em>' attribute.
     * @see #isSetG0ch()
     * @see #unsetG0ch()
     * @see #setG0ch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_G0ch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.g0ch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getG0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getG0ch <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0ch</em>' attribute.
     * @see #isSetG0ch()
     * @see #unsetG0ch()
     * @see #getG0ch()
     * @generated
     */
    void setG0ch( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getG0ch <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0ch()
     * @see #getG0ch()
     * @see #setG0ch(Double)
     * @generated
     */
    void unsetG0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getG0ch <em>G0ch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0ch</em>' attribute is set.
     * @see #unsetG0ch()
     * @see #getG0ch()
     * @see #setG0ch(Double)
     * @generated
     */
    boolean isSetG0ch();

    /**
     * Returns the value of the '<em><b>Short Circuit End Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum permitted temperature at the end of SC for the calculation of minimum short-circuit currents. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Short Circuit End Temperature</em>' attribute.
     * @see #isSetShortCircuitEndTemperature()
     * @see #unsetShortCircuitEndTemperature()
     * @see #setShortCircuitEndTemperature(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_ShortCircuitEndTemperature()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Temperature" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.shortCircuitEndTemperature' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getShortCircuitEndTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Circuit End Temperature</em>' attribute.
     * @see #isSetShortCircuitEndTemperature()
     * @see #unsetShortCircuitEndTemperature()
     * @see #getShortCircuitEndTemperature()
     * @generated
     */
    void setShortCircuitEndTemperature( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortCircuitEndTemperature()
     * @see #getShortCircuitEndTemperature()
     * @see #setShortCircuitEndTemperature(Double)
     * @generated
     */
    void unsetShortCircuitEndTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short Circuit End Temperature</em>' attribute is set.
     * @see #unsetShortCircuitEndTemperature()
     * @see #getShortCircuitEndTemperature()
     * @see #setShortCircuitEndTemperature(Double)
     * @generated
     */
    boolean isSetShortCircuitEndTemperature();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series reactance of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX0 <em>X0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX0 <em>X0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>B0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>B0ch</em>' attribute.
     * @see #isSetB0ch()
     * @see #unsetB0ch()
     * @see #setB0ch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_B0ch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.b0ch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getB0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getB0ch <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0ch</em>' attribute.
     * @see #isSetB0ch()
     * @see #unsetB0ch()
     * @see #getB0ch()
     * @generated
     */
    void setB0ch( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getB0ch <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0ch()
     * @see #getB0ch()
     * @see #setB0ch(Double)
     * @generated
     */
    void unsetB0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getB0ch <em>B0ch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0ch</em>' attribute is set.
     * @see #unsetB0ch()
     * @see #getB0ch()
     * @see #setB0ch(Double)
     * @generated
     */
    boolean isSetB0ch();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series resistance of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR0 <em>R0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR0 <em>R0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Cut</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment <em>AC Line Segment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cuts applied to the line segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cut</em>' reference list.
     * @see #isSetCut()
     * @see #unsetCut()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_Cut()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment
     * @model opposite="ACLineSegment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.Cut' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Cut > getCut();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getCut <em>Cut</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCut()
     * @see #getCut()
     * @generated
     */
    void unsetCut();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getCut <em>Cut</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cut</em>' reference list is set.
     * @see #unsetCut()
     * @see #getCut()
     * @generated
     */
    boolean isSetCut();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series reactance of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_X()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.x' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX <em>X</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getX <em>X</em>}' attribute is set.
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
     * Positive sequence series resistance of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR <em>R</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getR <em>R</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Bch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) susceptance, uniformly distributed, of the entire line section.  This value represents the full charging over the full length of the line.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bch</em>' attribute.
     * @see #isSetBch()
     * @see #unsetBch()
     * @see #setBch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACLineSegment_Bch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='ACLineSegment.bch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getBch <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bch</em>' attribute.
     * @see #isSetBch()
     * @see #unsetBch()
     * @see #getBch()
     * @generated
     */
    void setBch( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getBch <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBch()
     * @see #getBch()
     * @see #setBch(Double)
     * @generated
     */
    void unsetBch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getBch <em>Bch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bch</em>' attribute is set.
     * @see #unsetBch()
     * @see #getBch()
     * @see #setBch(Double)
     * @generated
     */
    boolean isSetBch();

} // ACLineSegment
