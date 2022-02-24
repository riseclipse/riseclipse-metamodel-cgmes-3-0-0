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
 * A representation of the model object '<em><b>Control Area Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A control area generating unit. This class is needed so that alternate control area definitions may include the same generating unit.   It should be noted that only one instance within a control area should reference a specific generating unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlAreaGeneratingUnit()
 * @model
 * @generated
 */
public interface ControlAreaGeneratingUnit extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Control Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The parent control area for the generating unit specifications.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #setControlArea(ControlArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlAreaGeneratingUnit_ControlArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getControlAreaGeneratingUnit
     * @model opposite="ControlAreaGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ControlAreaGeneratingUnit.ControlArea' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ControlArea getControlArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @generated
     */
    void setControlArea( ControlArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    void unsetControlArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area</em>' reference is set.
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    boolean isSetControlArea();

    /**
     * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The generating unit specified for this control area.  Note that a control area should include a GeneratingUnit only once.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlAreaGeneratingUnit_GeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getControlAreaGeneratingUnit
     * @model opposite="ControlAreaGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ControlAreaGeneratingUnit.GeneratingUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GeneratingUnit getGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @generated
     */
    void setGeneratingUnit( GeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    void unsetGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generating Unit</em>' reference is set.
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    boolean isSetGeneratingUnit();

} // ControlAreaGeneratingUnit
