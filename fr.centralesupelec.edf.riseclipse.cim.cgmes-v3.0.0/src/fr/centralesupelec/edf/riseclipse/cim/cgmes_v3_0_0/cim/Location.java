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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It can be defined with one or more position points (coordinates) in a given coordinate system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getMainAddress <em>Main Address</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getLocations <em>Locations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coordinate system used to describe position points of this location.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Coordinate System</em>' reference.
     * @see #isSetCoordinateSystem()
     * @see #unsetCoordinateSystem()
     * @see #setCoordinateSystem(CoordinateSystem)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLocation_CoordinateSystem()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem#getLocations
     * @model opposite="Locations" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Location.CoordinateSystem' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CoordinateSystem getCoordinateSystem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem <em>Coordinate System</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Coordinate System</em>' reference.
     * @see #isSetCoordinateSystem()
     * @see #unsetCoordinateSystem()
     * @see #getCoordinateSystem()
     * @generated
     */
    void setCoordinateSystem( CoordinateSystem value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem <em>Coordinate System</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoordinateSystem()
     * @see #getCoordinateSystem()
     * @see #setCoordinateSystem(CoordinateSystem)
     * @generated
     */
    void unsetCoordinateSystem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getCoordinateSystem <em>Coordinate System</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Coordinate System</em>' reference is set.
     * @see #unsetCoordinateSystem()
     * @see #getCoordinateSystem()
     * @see #setCoordinateSystem(CoordinateSystem)
     * @generated
     */
    boolean isSetCoordinateSystem();

    /**
     * Returns the value of the '<em><b>Power System Resources</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All power system resources at this location.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Resources</em>' reference.
     * @see #isSetPowerSystemResources()
     * @see #unsetPowerSystemResources()
     * @see #setPowerSystemResources(PowerSystemResource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLocation_PowerSystemResources()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation
     * @model opposite="Location" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Location.PowerSystemResources' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemResource getPowerSystemResources();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources <em>Power System Resources</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Resources</em>' reference.
     * @see #isSetPowerSystemResources()
     * @see #unsetPowerSystemResources()
     * @see #getPowerSystemResources()
     * @generated
     */
    void setPowerSystemResources( PowerSystemResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources <em>Power System Resources</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResources()
     * @see #getPowerSystemResources()
     * @see #setPowerSystemResources(PowerSystemResource)
     * @generated
     */
    void unsetPowerSystemResources();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources <em>Power System Resources</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resources</em>' reference is set.
     * @see #unsetPowerSystemResources()
     * @see #getPowerSystemResources()
     * @see #setPowerSystemResources(PowerSystemResource)
     * @generated
     */
    boolean isSetPowerSystemResources();

    /**
     * Returns the value of the '<em><b>Position Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sequence of position points describing this location, expressed in coordinate system 'Location.CoordinateSystem'.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Position Points</em>' reference list.
     * @see #isSetPositionPoints()
     * @see #unsetPositionPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLocation_PositionPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation
     * @model opposite="Location" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Location.PositionPoints' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< PositionPoint > getPositionPoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPositionPoints <em>Position Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositionPoints()
     * @see #getPositionPoints()
     * @generated
     */
    void unsetPositionPoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPositionPoints <em>Position Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position Points</em>' reference list is set.
     * @see #unsetPositionPoints()
     * @see #getPositionPoints()
     * @generated
     */
    boolean isSetPositionPoints();

    /**
     * Returns the value of the '<em><b>Main Address</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Main address of the location.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Main Address</em>' reference.
     * @see #isSetMainAddress()
     * @see #unsetMainAddress()
     * @see #setMainAddress(StreetAddress)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLocation_MainAddress()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Location.mainAddress' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StreetAddress getMainAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getMainAddress <em>Main Address</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main Address</em>' reference.
     * @see #isSetMainAddress()
     * @see #unsetMainAddress()
     * @see #getMainAddress()
     * @generated
     */
    void setMainAddress( StreetAddress value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getMainAddress <em>Main Address</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMainAddress()
     * @see #getMainAddress()
     * @see #setMainAddress(StreetAddress)
     * @generated
     */
    void unsetMainAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getMainAddress <em>Main Address</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Main Address</em>' reference is set.
     * @see #unsetMainAddress()
     * @see #getMainAddress()
     * @see #setMainAddress(StreetAddress)
     * @generated
     */
    boolean isSetMainAddress();

} // Location
