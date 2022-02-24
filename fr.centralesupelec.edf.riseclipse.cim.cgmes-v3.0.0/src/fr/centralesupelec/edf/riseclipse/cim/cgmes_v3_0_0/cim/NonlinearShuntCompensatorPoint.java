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
 * A representation of the model object '<em><b>Nonlinear Shunt Compensator Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A non linear shunt compensator bank or section admittance value. The number of NonlinearShuntCompenstorPoint instances associated with a NonlinearShuntCompensator shall be equal to ShuntCompensator.maximumSections. ShuntCompensator.sections shall only be set to one of the NonlinearShuntCompenstorPoint.sectionNumber. There is no interpolation between NonlinearShuntCompenstorPoint-s.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getSectionNumber <em>Section Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB0 <em>B0</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint()
 * @model
 * @generated
 */
public interface NonlinearShuntCompensatorPoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Section Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of the section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Section Number</em>' attribute.
     * @see #isSetSectionNumber()
     * @see #unsetSectionNumber()
     * @see #setSectionNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_SectionNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.sectionNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSectionNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getSectionNumber <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Section Number</em>' attribute.
     * @see #isSetSectionNumber()
     * @see #unsetSectionNumber()
     * @see #getSectionNumber()
     * @generated
     */
    void setSectionNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getSectionNumber <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSectionNumber()
     * @see #getSectionNumber()
     * @see #setSectionNumber(BigInteger)
     * @generated
     */
    void unsetSectionNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getSectionNumber <em>Section Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Section Number</em>' attribute is set.
     * @see #unsetSectionNumber()
     * @see #getSectionNumber()
     * @see #setSectionNumber(BigInteger)
     * @generated
     */
    boolean isSetSectionNumber();

    /**
     * Returns the value of the '<em><b>G0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) conductance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>G0</em>' attribute.
     * @see #isSetG0()
     * @see #unsetG0()
     * @see #setG0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_G0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.g0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getG0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG0 <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G0</em>' attribute.
     * @see #isSetG0()
     * @see #unsetG0()
     * @see #getG0()
     * @generated
     */
    void setG0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG0 <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG0()
     * @see #getG0()
     * @see #setG0(Double)
     * @generated
     */
    void unsetG0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG0 <em>G0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G0</em>' attribute is set.
     * @see #unsetG0()
     * @see #getG0()
     * @see #setG0(Double)
     * @generated
     */
    boolean isSetG0();

    /**
     * Returns the value of the '<em><b>B0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence shunt (charging) susceptance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>B0</em>' attribute.
     * @see #isSetB0()
     * @see #unsetB0()
     * @see #setB0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_B0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.b0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getB0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB0 <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B0</em>' attribute.
     * @see #isSetB0()
     * @see #unsetB0()
     * @see #getB0()
     * @generated
     */
    void setB0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB0 <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB0()
     * @see #getB0()
     * @see #setB0(Double)
     * @generated
     */
    void unsetB0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB0 <em>B0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B0</em>' attribute is set.
     * @see #unsetB0()
     * @see #getB0()
     * @see #setB0(Double)
     * @generated
     */
    boolean isSetB0();

    /**
     * Returns the value of the '<em><b>Nonlinear Shunt Compensator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator#getNonlinearShuntCompensatorPoints <em>Nonlinear Shunt Compensator Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Non-linear shunt compensator owning this point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nonlinear Shunt Compensator</em>' reference.
     * @see #isSetNonlinearShuntCompensator()
     * @see #unsetNonlinearShuntCompensator()
     * @see #setNonlinearShuntCompensator(NonlinearShuntCompensator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_NonlinearShuntCompensator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator#getNonlinearShuntCompensatorPoints
     * @model opposite="NonlinearShuntCompensatorPoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.NonlinearShuntCompensator' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    NonlinearShuntCompensator getNonlinearShuntCompensator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nonlinear Shunt Compensator</em>' reference.
     * @see #isSetNonlinearShuntCompensator()
     * @see #unsetNonlinearShuntCompensator()
     * @see #getNonlinearShuntCompensator()
     * @generated
     */
    void setNonlinearShuntCompensator( NonlinearShuntCompensator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonlinearShuntCompensator()
     * @see #getNonlinearShuntCompensator()
     * @see #setNonlinearShuntCompensator(NonlinearShuntCompensator)
     * @generated
     */
    void unsetNonlinearShuntCompensator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nonlinear Shunt Compensator</em>' reference is set.
     * @see #unsetNonlinearShuntCompensator()
     * @see #getNonlinearShuntCompensator()
     * @see #setNonlinearShuntCompensator(NonlinearShuntCompensator)
     * @generated
     */
    boolean isSetNonlinearShuntCompensator();

    /**
     * Returns the value of the '<em><b>G</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) conductance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #setG(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_G()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Conductance" transient="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.g' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getG();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #getG()
     * @generated
     */
    void setG( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG()
     * @see #getG()
     * @see #setG(Double)
     * @generated
     */
    void unsetG();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getG <em>G</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G</em>' attribute is set.
     * @see #unsetG()
     * @see #getG()
     * @see #setG(Double)
     * @generated
     */
    boolean isSetG();

    /**
     * Returns the value of the '<em><b>B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence shunt (charging) susceptance per section.
     * <!-- end-model-doc -->
     * @return the value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #setB(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getNonlinearShuntCompensatorPoint_B()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Susceptance" transient="true" ordered="false"
     *        extendedMetaData="name='NonlinearShuntCompensatorPoint.b' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getB();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #getB()
     * @generated
     */
    void setB( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB()
     * @see #getB()
     * @see #setB(Double)
     * @generated
     */
    void unsetB();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint#getB <em>B</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B</em>' attribute is set.
     * @see #unsetB()
     * @see #getB()
     * @see #setB(Double)
     * @generated
     */
    boolean isSetB();

} // NonlinearShuntCompensatorPoint
