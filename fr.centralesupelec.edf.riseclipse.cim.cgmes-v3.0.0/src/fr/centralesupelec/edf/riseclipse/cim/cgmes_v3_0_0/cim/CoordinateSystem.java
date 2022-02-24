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
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Coordinate reference system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCoordinateSystem()
 * @model
 * @generated
 */
public interface CoordinateSystem extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Crs Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A Uniform Resource Name (URN) for the coordinate reference system (crs) used to define 'Location.PositionPoints'.
     * An example would be the European Petroleum Survey Group (EPSG) code for a coordinate reference system, defined in URN under the Open Geospatial Consortium (OGC) namespace as: urn:ogc:def:crs:EPSG::XXXX, where XXXX is an EPSG code (a full list of codes can be found at the EPSG Registry web site http://www.epsg-registry.org/). To define the coordinate system as being WGS84 (latitude, longitude) using an EPSG OGC, this attribute would be urn:ogc:def:crs:EPSG::4236.
     * A profile should limit this code to a set of allowed URNs agreed to by all sending and receiving parties.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Crs Urn</em>' attribute.
     * @see #isSetCrsUrn()
     * @see #unsetCrsUrn()
     * @see #setCrsUrn(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCoordinateSystem_CrsUrn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='CoordinateSystem.crsUrn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getCrsUrn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crs Urn</em>' attribute.
     * @see #isSetCrsUrn()
     * @see #unsetCrsUrn()
     * @see #getCrsUrn()
     * @generated
     */
    void setCrsUrn( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrsUrn()
     * @see #getCrsUrn()
     * @see #setCrsUrn(String)
     * @generated
     */
    void unsetCrsUrn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crs Urn</em>' attribute is set.
     * @see #unsetCrsUrn()
     * @see #getCrsUrn()
     * @see #setCrsUrn(String)
     * @generated
     */
    boolean isSetCrsUrn();

    /**
     * Returns the value of the '<em><b>Locations</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem <em>Coordinate System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All locations described with position points in this coordinate system.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Locations</em>' reference list.
     * @see #isSetLocations()
     * @see #unsetLocations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCoordinateSystem_Locations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem
     * @model opposite="CoordinateSystem" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='CoordinateSystem.Locations' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Location > getLocations();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getLocations <em>Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocations()
     * @see #getLocations()
     * @generated
     */
    void unsetLocations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getLocations <em>Locations</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Locations</em>' reference list is set.
     * @see #unsetLocations()
     * @see #getLocations()
     * @generated
     */
    boolean isSetLocations();

} // CoordinateSystem
