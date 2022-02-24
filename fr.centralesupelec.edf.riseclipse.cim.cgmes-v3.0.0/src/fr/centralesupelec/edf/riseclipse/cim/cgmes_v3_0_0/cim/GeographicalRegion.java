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
 * A representation of the model object '<em><b>Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A geographical region of a power system network model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeographicalRegion()
 * @model
 * @generated
 */
public interface GeographicalRegion extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Regions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All sub-geographical regions within this geographical region.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regions</em>' reference list.
     * @see #isSetRegions()
     * @see #unsetRegions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeographicalRegion_Regions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion
     * @model opposite="Region" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GeographicalRegion.Regions' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SubGeographicalRegion > getRegions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion#getRegions <em>Regions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegions()
     * @see #getRegions()
     * @generated
     */
    void unsetRegions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion#getRegions <em>Regions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regions</em>' reference list is set.
     * @see #unsetRegions()
     * @see #getRegions()
     * @generated
     */
    boolean isSetRegions();

} // GeographicalRegion
