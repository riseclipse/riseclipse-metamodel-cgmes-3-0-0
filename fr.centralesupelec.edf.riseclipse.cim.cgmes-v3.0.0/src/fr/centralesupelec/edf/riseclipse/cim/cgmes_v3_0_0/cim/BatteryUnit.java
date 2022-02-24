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
 * A representation of the model object '<em><b>Battery Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrochemical energy storage device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getRatedE <em>Rated E</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getBatteryState <em>Battery State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getStoredE <em>Stored E</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBatteryUnit()
 * @model
 * @generated
 */
public interface BatteryUnit extends PowerElectronicsUnit {
    /**
     * Returns the value of the '<em><b>Rated E</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Full energy storage capacity of the battery. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated E</em>' attribute.
     * @see #isSetRatedE()
     * @see #unsetRatedE()
     * @see #setRatedE(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBatteryUnit_RatedE()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RealEnergy" transient="true" ordered="false"
     *        extendedMetaData="name='BatteryUnit.ratedE' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getRatedE <em>Rated E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated E</em>' attribute.
     * @see #isSetRatedE()
     * @see #unsetRatedE()
     * @see #getRatedE()
     * @generated
     */
    void setRatedE( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getRatedE <em>Rated E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedE()
     * @see #getRatedE()
     * @see #setRatedE(Double)
     * @generated
     */
    void unsetRatedE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getRatedE <em>Rated E</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated E</em>' attribute is set.
     * @see #unsetRatedE()
     * @see #getRatedE()
     * @see #setRatedE(Double)
     * @generated
     */
    boolean isSetRatedE();

    /**
     * Returns the value of the '<em><b>Battery State</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryStateKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The current state of the battery (charging, full, etc.).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Battery State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryStateKind
     * @see #isSetBatteryState()
     * @see #unsetBatteryState()
     * @see #setBatteryState(BatteryStateKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBatteryUnit_BatteryState()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BatteryUnit.batteryState' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BatteryStateKind getBatteryState();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getBatteryState <em>Battery State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Battery State</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryStateKind
     * @see #isSetBatteryState()
     * @see #unsetBatteryState()
     * @see #getBatteryState()
     * @generated
     */
    void setBatteryState( BatteryStateKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getBatteryState <em>Battery State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBatteryState()
     * @see #getBatteryState()
     * @see #setBatteryState(BatteryStateKind)
     * @generated
     */
    void unsetBatteryState();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getBatteryState <em>Battery State</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Battery State</em>' attribute is set.
     * @see #unsetBatteryState()
     * @see #getBatteryState()
     * @see #setBatteryState(BatteryStateKind)
     * @generated
     */
    boolean isSetBatteryState();

    /**
     * Returns the value of the '<em><b>Stored E</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of energy currently stored. The attribute shall be a positive value or zero and lower than BatteryUnit.ratedE.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Stored E</em>' attribute.
     * @see #isSetStoredE()
     * @see #unsetStoredE()
     * @see #setStoredE(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBatteryUnit_StoredE()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RealEnergy" transient="true" ordered="false"
     *        extendedMetaData="name='BatteryUnit.storedE' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStoredE();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getStoredE <em>Stored E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stored E</em>' attribute.
     * @see #isSetStoredE()
     * @see #unsetStoredE()
     * @see #getStoredE()
     * @generated
     */
    void setStoredE( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getStoredE <em>Stored E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStoredE()
     * @see #getStoredE()
     * @see #setStoredE(Double)
     * @generated
     */
    void unsetStoredE();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BatteryUnit#getStoredE <em>Stored E</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stored E</em>' attribute is set.
     * @see #unsetStoredE()
     * @see #getStoredE()
     * @see #setStoredE(Double)
     * @generated
     */
    boolean isSetStoredE();

} // BatteryUnit
