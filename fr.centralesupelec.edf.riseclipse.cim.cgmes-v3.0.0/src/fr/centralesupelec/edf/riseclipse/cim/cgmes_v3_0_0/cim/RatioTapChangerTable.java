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
 * A representation of the model object '<em><b>Ratio Tap Changer Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a curve for how the voltage magnitude and impedance varies with the tap step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChangerTable()
 * @model
 * @generated
 */
public interface RatioTapChangerTable extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Ratio Tap Changer Table Point</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTablePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTablePoint#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Points of this table.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ratio Tap Changer Table Point</em>' reference list.
     * @see #isSetRatioTapChangerTablePoint()
     * @see #unsetRatioTapChangerTablePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChangerTable_RatioTapChangerTablePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTablePoint#getRatioTapChangerTable
     * @model opposite="RatioTapChangerTable" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RatioTapChangerTable.RatioTapChangerTablePoint' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RatioTapChangerTablePoint > getRatioTapChangerTablePoint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChangerTablePoint()
     * @see #getRatioTapChangerTablePoint()
     * @generated
     */
    void unsetRatioTapChangerTablePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer Table Point</em>' reference list is set.
     * @see #unsetRatioTapChangerTablePoint()
     * @see #getRatioTapChangerTablePoint()
     * @generated
     */
    boolean isSetRatioTapChangerTablePoint();

    /**
     * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ratio tap changer of this tap ratio table.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ratio Tap Changer</em>' reference list.
     * @see #isSetRatioTapChanger()
     * @see #unsetRatioTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChangerTable_RatioTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable
     * @model opposite="RatioTapChangerTable" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RatioTapChangerTable.RatioTapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RatioTapChanger > getRatioTapChanger();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @generated
     */
    void unsetRatioTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer</em>' reference list is set.
     * @see #unsetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @generated
     */
    boolean isSetRatioTapChanger();

} // RatioTapChangerTable
