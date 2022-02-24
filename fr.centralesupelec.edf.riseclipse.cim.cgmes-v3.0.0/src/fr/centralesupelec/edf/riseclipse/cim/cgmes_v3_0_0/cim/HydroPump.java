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
 * A representation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A synchronous motor-driven pump, typically associated with a pumped storage plant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPump()
 * @model
 * @generated
 */
public interface HydroPump extends Equipment {
    /**
     * Returns the value of the '<em><b>Rotating Machine</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rotating Machine</em>' reference.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPump_RotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump
     * @model opposite="HydroPump" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='HydroPump.RotatingMachine' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RotatingMachine getRotatingMachine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotating Machine</em>' reference.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    void setRotatingMachine( RotatingMachine value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotatingMachine()
     * @see #getRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @generated
     */
    void unsetRotatingMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotating Machine</em>' reference is set.
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @see #setRotatingMachine(RotatingMachine)
     * @generated
     */
    boolean isSetRotatingMachine();

    /**
     * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The hydro pump may be a member of a pumped storage plant or a pump for distributing water.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getHydroPump_HydroPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant#getHydroPumps
     * @model opposite="HydroPumps" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='HydroPump.HydroPowerPlant' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroPowerPlant getHydroPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @generated
     */
    void setHydroPowerPlant( HydroPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    void unsetHydroPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Power Plant</em>' reference is set.
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    boolean isSetHydroPowerPlant();

} // HydroPump
