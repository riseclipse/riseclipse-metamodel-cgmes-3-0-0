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
 * A representation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State variable for the number of sections in service for a shunt compensator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvShuntCompensatorSections()
 * @model
 * @generated
 */
public interface SvShuntCompensatorSections extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of sections in service as a continuous variable. The attribute shall be a positive value or zero. To get integer value scale with ShuntCompensator.bPerSection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #setSections(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvShuntCompensatorSections_Sections()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SvShuntCompensatorSections.sections' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #getSections()
     * @generated
     */
    void setSections( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSections()
     * @see #getSections()
     * @see #setSections(Double)
     * @generated
     */
    void unsetSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sections</em>' attribute is set.
     * @see #unsetSections()
     * @see #getSections()
     * @see #setSections(Double)
     * @generated
     */
    boolean isSetSections();

    /**
     * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The shunt compensator for which the state applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Shunt Compensator</em>' reference.
     * @see #isSetShuntCompensator()
     * @see #unsetShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvShuntCompensatorSections_ShuntCompensator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator#getSvShuntCompensatorSections
     * @model opposite="SvShuntCompensatorSections" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvShuntCompensatorSections.ShuntCompensator' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ShuntCompensator getShuntCompensator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shunt Compensator</em>' reference.
     * @see #isSetShuntCompensator()
     * @see #unsetShuntCompensator()
     * @see #getShuntCompensator()
     * @generated
     */
    void setShuntCompensator( ShuntCompensator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    void unsetShuntCompensator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shunt Compensator</em>' reference is set.
     * @see #unsetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    boolean isSetShuntCompensator();

} // SvShuntCompensatorSections
