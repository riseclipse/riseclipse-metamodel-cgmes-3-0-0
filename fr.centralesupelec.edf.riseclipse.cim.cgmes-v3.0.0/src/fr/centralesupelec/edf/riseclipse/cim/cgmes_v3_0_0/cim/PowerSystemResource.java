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
 * A representation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A power system resource (PSR) can be an item of equipment such as a switch, an equipment container containing many individual items of equipment such as a substation, or an organisational entity such as sub-control area. Power system resources can have measurements associated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerSystemResource()
 * @model
 * @generated
 */
public interface PowerSystemResource extends IdentifiedObject {

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources <em>Power System Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Location of this power system resource.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(Location)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerSystemResource_Location()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPowerSystemResources
     * @model opposite="PowerSystemResources" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PowerSystemResource.Location' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( Location value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getLocation <em>Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' reference is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The measurements associated with this power system resource.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerSystemResource_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PowerSystemResource.Measurements' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Measurement > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

    /**
     * Returns the value of the '<em><b>Controls</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The controller outputs used to actually govern a regulating device, e.g. the magnetization of a synchronous machine or capacitor bank breaker actuator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Controls</em>' reference list.
     * @see #isSetControls()
     * @see #unsetControls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerSystemResource_Controls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PowerSystemResource.Controls' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Control > getControls();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getControls <em>Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControls()
     * @see #getControls()
     * @generated
     */
    void unsetControls();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getControls <em>Controls</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Controls</em>' reference list is set.
     * @see #unsetControls()
     * @see #getControls()
     * @generated
     */
    boolean isSetControls();
} // PowerSystemResource
