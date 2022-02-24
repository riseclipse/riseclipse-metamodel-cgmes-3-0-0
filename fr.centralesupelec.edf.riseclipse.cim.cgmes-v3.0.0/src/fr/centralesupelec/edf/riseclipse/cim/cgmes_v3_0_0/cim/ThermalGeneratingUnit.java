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
 * A representation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generating unit whose prime mover could be a steam turbine, combustion turbine, or diesel engine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getThermalGeneratingUnit()
 * @model
 * @generated
 */
public interface ThermalGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Fossil Fuels</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A thermal generating unit may have one or more fossil fuels.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fossil Fuels</em>' reference list.
     * @see #isSetFossilFuels()
     * @see #unsetFossilFuels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getThermalGeneratingUnit_FossilFuels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ThermalGeneratingUnit.FossilFuels' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< FossilFuel > getFossilFuels();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFossilFuels()
     * @see #getFossilFuels()
     * @generated
     */
    void unsetFossilFuels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fossil Fuels</em>' reference list is set.
     * @see #unsetFossilFuels()
     * @see #getFossilFuels()
     * @generated
     */
    boolean isSetFossilFuels();

    /**
     * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A thermal generating unit may be a member of a compressed air energy storage plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getThermalGeneratingUnit_CAESPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CAESPlant#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ThermalGeneratingUnit.CAESPlant' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CAESPlant getCAESPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @generated
     */
    void setCAESPlant( CAESPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    void unsetCAESPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CAES Plant</em>' reference is set.
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    boolean isSetCAESPlant();

    /**
     * Returns the value of the '<em><b>Combined Cycle Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A thermal generating unit may be a member of a combined cycle plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Combined Cycle Plant</em>' reference.
     * @see #isSetCombinedCyclePlant()
     * @see #unsetCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getThermalGeneratingUnit_CombinedCyclePlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant#getThermalGeneratingUnits
     * @model opposite="ThermalGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ThermalGeneratingUnit.CombinedCyclePlant' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CombinedCyclePlant getCombinedCyclePlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combined Cycle Plant</em>' reference.
     * @see #isSetCombinedCyclePlant()
     * @see #unsetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @generated
     */
    void setCombinedCyclePlant( CombinedCyclePlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @generated
     */
    void unsetCombinedCyclePlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Combined Cycle Plant</em>' reference is set.
     * @see #unsetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @generated
     */
    boolean isSetCombinedCyclePlant();

    /**
     * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A thermal generating unit may be a member of a cogeneration plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getThermalGeneratingUnit_CogenerationPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant#getThermalGeneratingUnits
     * @model opposite="ThermalGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ThermalGeneratingUnit.CogenerationPlant' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CogenerationPlant getCogenerationPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @generated
     */
    void setCogenerationPlant( CogenerationPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    void unsetCogenerationPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogeneration Plant</em>' reference is set.
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    boolean isSetCogenerationPlant();

} // ThermalGeneratingUnit
