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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A wind driven generating unit, connected to the grid by means of a rotating machine.  May be used to represent a single turbine or an aggregation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant <em>Wind Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGeneratingUnit()
 * @model
 * @generated
 */
public interface WindGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Wind Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits <em>Wind Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A wind power plant may have wind generating units.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Power Plant</em>' reference.
     * @see #isSetWindPowerPlant()
     * @see #unsetWindPowerPlant()
     * @see #setWindPowerPlant(WindPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGeneratingUnit_WindPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant#getWindGeneratingUnits
     * @model opposite="WindGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindGeneratingUnit.WindPowerPlant' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    WindPowerPlant getWindPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant <em>Wind Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Power Plant</em>' reference.
     * @see #isSetWindPowerPlant()
     * @see #unsetWindPowerPlant()
     * @see #getWindPowerPlant()
     * @generated
     */
    void setWindPowerPlant( WindPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant <em>Wind Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPowerPlant()
     * @see #getWindPowerPlant()
     * @see #setWindPowerPlant(WindPowerPlant)
     * @generated
     */
    void unsetWindPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindPowerPlant <em>Wind Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Power Plant</em>' reference is set.
     * @see #unsetWindPowerPlant()
     * @see #getWindPowerPlant()
     * @see #setWindPowerPlant(WindPowerPlant)
     * @generated
     */
    boolean isSetWindPowerPlant();

    /**
     * Returns the value of the '<em><b>Wind Gen Unit Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenUnitKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The kind of wind generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenUnitKind
     * @see #isSetWindGenUnitType()
     * @see #unsetWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGeneratingUnit_WindGenUnitType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindGeneratingUnit.windGenUnitType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenUnitKind getWindGenUnitType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenUnitKind
     * @see #isSetWindGenUnitType()
     * @see #unsetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @generated
     */
    void setWindGenUnitType( WindGenUnitKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @generated
     */
    void unsetWindGenUnitType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Unit Type</em>' attribute is set.
     * @see #unsetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @generated
     */
    boolean isSetWindGenUnitType();

} // WindGeneratingUnit
