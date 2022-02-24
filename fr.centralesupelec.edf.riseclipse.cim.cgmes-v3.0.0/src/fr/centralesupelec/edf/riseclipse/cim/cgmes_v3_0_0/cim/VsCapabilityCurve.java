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
 * A representation of the model object '<em><b>Vs Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The P-Q capability curve for a voltage source converter, with P on X-axis and Qmin and Qmax on Y1-axis and Y2-axis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsCapabilityCurve()
 * @model
 * @generated
 */
public interface VsCapabilityCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Vs Converter DC Sides</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All converters with this capability curve.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vs Converter DC Sides</em>' reference list.
     * @see #isSetVsConverterDCSides()
     * @see #unsetVsConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsCapabilityCurve_VsConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve
     * @model opposite="CapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VsCapabilityCurve.VsConverterDCSides' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< VsConverter > getVsConverterDCSides();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVsConverterDCSides()
     * @see #getVsConverterDCSides()
     * @generated
     */
    void unsetVsConverterDCSides();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vs Converter DC Sides</em>' reference list is set.
     * @see #unsetVsConverterDCSides()
     * @see #getVsConverterDCSides()
     * @generated
     */
    boolean isSetVsConverterDCSides();

} // VsCapabilityCurve
