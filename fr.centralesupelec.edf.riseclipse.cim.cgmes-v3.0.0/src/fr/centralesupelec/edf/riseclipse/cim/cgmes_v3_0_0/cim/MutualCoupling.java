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
 * A representation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the zero sequence line mutual coupling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance21 <em>Distance21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling()
 * @model
 * @generated
 */
public interface MutualCoupling extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Second Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The starting terminal for the calculation of distances along the second branch of the mutual coupling.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Second Terminal</em>' reference.
     * @see #isSetSecond_Terminal()
     * @see #unsetSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_Second_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getHasSecondMutualCoupling
     * @model opposite="HasSecondMutualCoupling" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.Second_Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getSecond_Terminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Second Terminal</em>' reference.
     * @see #isSetSecond_Terminal()
     * @see #unsetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @generated
     */
    void setSecond_Terminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @generated
     */
    void unsetSecond_Terminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Second Terminal</em>' reference is set.
     * @see #unsetSecond_Terminal()
     * @see #getSecond_Terminal()
     * @see #setSecond_Terminal(Terminal)
     * @generated
     */
    boolean isSetSecond_Terminal();

    /**
     * Returns the value of the '<em><b>Distance22</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Distance to the end of coupled region from the second line's terminal with sequence number equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Distance22</em>' attribute.
     * @see #isSetDistance22()
     * @see #unsetDistance22()
     * @see #setDistance22(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_Distance22()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.distance22' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDistance22();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance22</em>' attribute.
     * @see #isSetDistance22()
     * @see #unsetDistance22()
     * @see #getDistance22()
     * @generated
     */
    void setDistance22( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance22()
     * @see #getDistance22()
     * @see #setDistance22(Double)
     * @generated
     */
    void unsetDistance22();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance22</em>' attribute is set.
     * @see #unsetDistance22()
     * @see #getDistance22()
     * @see #setDistance22(Double)
     * @generated
     */
    boolean isSetDistance22();

    /**
     * Returns the value of the '<em><b>Distance21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Distance to the start of coupled region from the second line's terminal with sequence number equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Distance21</em>' attribute.
     * @see #isSetDistance21()
     * @see #unsetDistance21()
     * @see #setDistance21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_Distance21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.distance21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDistance21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance21</em>' attribute.
     * @see #isSetDistance21()
     * @see #unsetDistance21()
     * @see #getDistance21()
     * @generated
     */
    void setDistance21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance21()
     * @see #getDistance21()
     * @see #setDistance21(Double)
     * @generated
     */
    void unsetDistance21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance21</em>' attribute is set.
     * @see #unsetDistance21()
     * @see #getDistance21()
     * @see #setDistance21(Double)
     * @generated
     */
    boolean isSetDistance21();

    /**
     * Returns the value of the '<em><b>B0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence mutual coupling shunt (charging) susceptance, uniformly distributed, of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>B0ch</em>' attribute.
     * @see #isSetB0ch()
     * @see #unsetB0ch()
     * @see #setB0ch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_B0ch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.b0ch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getB0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0ch()
     * @see #getB0ch()
     * @see #setB0ch(Double)
     * @generated
     */
    void unsetB0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getB0ch <em>B0ch</em>}' attribute is set.
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
     * Returns the value of the '<em><b>G0ch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence mutual coupling shunt (charging) conductance, uniformly distributed, of the entire line section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>G0ch</em>' attribute.
     * @see #isSetG0ch()
     * @see #unsetG0ch()
     * @see #setG0ch(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_G0ch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.g0ch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getG0ch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0ch()
     * @see #getG0ch()
     * @see #setG0ch(Double)
     * @generated
     */
    void unsetG0ch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getG0ch <em>G0ch</em>}' attribute is set.
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
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence branch-to-branch mutual impedance coupling, resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getR0 <em>R0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getR0 <em>R0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Distance11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Distance to the start of the coupled region from the first line's terminal having sequence number equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Distance11</em>' attribute.
     * @see #isSetDistance11()
     * @see #unsetDistance11()
     * @see #setDistance11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_Distance11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.distance11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDistance11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance11</em>' attribute.
     * @see #isSetDistance11()
     * @see #unsetDistance11()
     * @see #getDistance11()
     * @generated
     */
    void setDistance11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance11()
     * @see #getDistance11()
     * @see #setDistance11(Double)
     * @generated
     */
    void unsetDistance11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance11</em>' attribute is set.
     * @see #unsetDistance11()
     * @see #getDistance11()
     * @see #setDistance11(Double)
     * @generated
     */
    boolean isSetDistance11();

    /**
     * Returns the value of the '<em><b>Distance12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Distance to the end of the coupled region from the first line's terminal with sequence number equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Distance12</em>' attribute.
     * @see #isSetDistance12()
     * @see #unsetDistance12()
     * @see #setDistance12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_Distance12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.distance12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDistance12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distance12</em>' attribute.
     * @see #isSetDistance12()
     * @see #unsetDistance12()
     * @see #getDistance12()
     * @generated
     */
    void setDistance12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDistance12()
     * @see #getDistance12()
     * @see #setDistance12(Double)
     * @generated
     */
    void unsetDistance12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Distance12</em>' attribute is set.
     * @see #unsetDistance12()
     * @see #getDistance12()
     * @see #setDistance12(Double)
     * @generated
     */
    boolean isSetDistance12();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence branch-to-branch mutual impedance coupling, reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getX0 <em>X0</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getX0 <em>X0</em>}' attribute is set.
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
     * Returns the value of the '<em><b>First Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The starting terminal for the calculation of distances along the first branch of the mutual coupling.  Normally MutualCoupling would only be used for terminals of AC line segments.  The first and second terminals of a mutual coupling should point to different AC line segments.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Terminal</em>' reference.
     * @see #isSetFirst_Terminal()
     * @see #unsetFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getMutualCoupling_First_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getHasFirstMutualCoupling
     * @model opposite="HasFirstMutualCoupling" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='MutualCoupling.First_Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getFirst_Terminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Terminal</em>' reference.
     * @see #isSetFirst_Terminal()
     * @see #unsetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @generated
     */
    void setFirst_Terminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @generated
     */
    void unsetFirst_Terminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>First Terminal</em>' reference is set.
     * @see #unsetFirst_Terminal()
     * @see #getFirst_Terminal()
     * @see #setFirst_Terminal(Terminal)
     * @generated
     */
    boolean isSetFirst_Terminal();

} // MutualCoupling
