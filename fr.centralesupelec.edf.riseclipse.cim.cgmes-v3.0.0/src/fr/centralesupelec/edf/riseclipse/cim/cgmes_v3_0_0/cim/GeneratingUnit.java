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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit()
 * @model
 * @generated
 */
public interface GeneratingUnit extends Equipment {
    /**
     * Returns the value of the '<em><b>Total Efficiency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The efficiency of the unit in converting the fuel into electrical energy.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Total Efficiency</em>' attribute.
     * @see #isSetTotalEfficiency()
     * @see #unsetTotalEfficiency()
     * @see #setTotalEfficiency(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_TotalEfficiency()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.totalEfficiency' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTotalEfficiency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total Efficiency</em>' attribute.
     * @see #isSetTotalEfficiency()
     * @see #unsetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @generated
     */
    void setTotalEfficiency( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @see #setTotalEfficiency(Double)
     * @generated
     */
    void unsetTotalEfficiency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Total Efficiency</em>' attribute is set.
     * @see #unsetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @see #setTotalEfficiency(Double)
     * @generated
     */
    boolean isSetTotalEfficiency();

    /**
     * Returns the value of the '<em><b>Rated Gross Min P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Gross Min P</em>' attribute.
     * @see #isSetRatedGrossMinP()
     * @see #unsetRatedGrossMinP()
     * @see #setRatedGrossMinP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_RatedGrossMinP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.ratedGrossMinP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedGrossMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Gross Min P</em>' attribute.
     * @see #isSetRatedGrossMinP()
     * @see #unsetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @generated
     */
    void setRatedGrossMinP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @see #setRatedGrossMinP(Double)
     * @generated
     */
    void unsetRatedGrossMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Gross Min P</em>' attribute is set.
     * @see #unsetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @see #setRatedGrossMinP(Double)
     * @generated
     */
    boolean isSetRatedGrossMinP();

    /**
     * Returns the value of the '<em><b>Startup Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The initial startup cost incurred for each start of the GeneratingUnit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_StartupCost()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Money" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.startupCost' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigDecimal getStartupCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @generated
     */
    void setStartupCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    void unsetStartupCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Cost</em>' attribute is set.
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    boolean isSetStartupCost();

    /**
     * Returns the value of the '<em><b>Rated Net Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Net Max P</em>' attribute.
     * @see #isSetRatedNetMaxP()
     * @see #unsetRatedNetMaxP()
     * @see #setRatedNetMaxP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_RatedNetMaxP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.ratedNetMaxP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedNetMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Net Max P</em>' attribute.
     * @see #isSetRatedNetMaxP()
     * @see #unsetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @generated
     */
    void setRatedNetMaxP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @see #setRatedNetMaxP(Double)
     * @generated
     */
    void unsetRatedNetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Net Max P</em>' attribute is set.
     * @see #unsetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @see #setRatedNetMaxP(Double)
     * @generated
     */
    boolean isSetRatedNetMaxP();

    /**
     * Returns the value of the '<em><b>Max Operating P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the maximum operating active power limit the dispatcher can enter for this unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Operating P</em>' attribute.
     * @see #isSetMaxOperatingP()
     * @see #unsetMaxOperatingP()
     * @see #setMaxOperatingP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_MaxOperatingP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.maxOperatingP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxOperatingP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Operating P</em>' attribute.
     * @see #isSetMaxOperatingP()
     * @see #unsetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @generated
     */
    void setMaxOperatingP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @see #setMaxOperatingP(Double)
     * @generated
     */
    void unsetMaxOperatingP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Operating P</em>' attribute is set.
     * @see #unsetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @see #setMaxOperatingP(Double)
     * @generated
     */
    boolean isSetMaxOperatingP();

    /**
     * Returns the value of the '<em><b>Rated Gross Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit's gross rated maximum capacity (book value).
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Gross Max P</em>' attribute.
     * @see #isSetRatedGrossMaxP()
     * @see #unsetRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_RatedGrossMaxP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.ratedGrossMaxP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedGrossMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Gross Max P</em>' attribute.
     * @see #isSetRatedGrossMaxP()
     * @see #unsetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @generated
     */
    void setRatedGrossMaxP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Double)
     * @generated
     */
    void unsetRatedGrossMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Gross Max P</em>' attribute is set.
     * @see #unsetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Double)
     * @generated
     */
    boolean isSetRatedGrossMaxP();

    /**
     * Returns the value of the '<em><b>Short PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generating unit short term economic participation factor.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Short PF</em>' attribute.
     * @see #isSetShortPF()
     * @see #unsetShortPF()
     * @see #setShortPF(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_ShortPF()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.shortPF' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getShortPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short PF</em>' attribute.
     * @see #isSetShortPF()
     * @see #unsetShortPF()
     * @see #getShortPF()
     * @generated
     */
    void setShortPF( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortPF()
     * @see #getShortPF()
     * @see #setShortPF(Double)
     * @generated
     */
    void unsetShortPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short PF</em>' attribute is set.
     * @see #unsetShortPF()
     * @see #getShortPF()
     * @see #setShortPF(Double)
     * @generated
     */
    boolean isSetShortPF();

    /**
     * Returns the value of the '<em><b>Nominal P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the governor speed change droop (governorSCD attribute).
     * The attribute shall be a positive value equal to or less than RotatingMachine.ratedS.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal P</em>' attribute.
     * @see #isSetNominalP()
     * @see #unsetNominalP()
     * @see #setNominalP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_NominalP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.nominalP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal P</em>' attribute.
     * @see #isSetNominalP()
     * @see #unsetNominalP()
     * @see #getNominalP()
     * @generated
     */
    void setNominalP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalP()
     * @see #getNominalP()
     * @see #setNominalP(Double)
     * @generated
     */
    void unsetNominalP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal P</em>' attribute is set.
     * @see #unsetNominalP()
     * @see #getNominalP()
     * @see #setNominalP(Double)
     * @generated
     */
    boolean isSetNominalP();

    /**
     * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time it takes to get the unit on-line, from the time that the prime mover mechanical power is applied.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Startup Time</em>' attribute.
     * @see #isSetStartupTime()
     * @see #unsetStartupTime()
     * @see #setStartupTime(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_StartupTime()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.startupTime' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStartupTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Time</em>' attribute.
     * @see #isSetStartupTime()
     * @see #unsetStartupTime()
     * @see #getStartupTime()
     * @generated
     */
    void setStartupTime( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupTime()
     * @see #getStartupTime()
     * @see #setStartupTime(Double)
     * @generated
     */
    void unsetStartupTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Time</em>' attribute is set.
     * @see #unsetStartupTime()
     * @see #getStartupTime()
     * @see #setStartupTime(Double)
     * @generated
     */
    boolean isSetStartupTime();

    /**
     * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor Speed Changer Droop.   This is the change in generator power output divided by the change in frequency normalized by the nominal power of the generator and the nominal frequency and expressed in percent and negated. A positive value of speed change droop provides additional generator output upon a drop in frequency.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_GovernorSCD()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.governorSCD' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGovernorSCD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @generated
     */
    void setGovernorSCD( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @generated
     */
    void unsetGovernorSCD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Governor SCD</em>' attribute is set.
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @generated
     */
    boolean isSetGovernorSCD();

    /**
     * Returns the value of the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gross To Net Active Power Curves</em>' reference list.
     * @see #isSetGrossToNetActivePowerCurves()
     * @see #unsetGrossToNetActivePowerCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_GrossToNetActivePowerCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GrossToNetActivePowerCurve#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.GrossToNetActivePowerCurves' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< GrossToNetActivePowerCurve > getGrossToNetActivePowerCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrossToNetActivePowerCurves()
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     */
    void unsetGrossToNetActivePowerCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gross To Net Active Power Curves</em>' reference list is set.
     * @see #unsetGrossToNetActivePowerCurves()
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     */
    boolean isSetGrossToNetActivePowerCurves();

    /**
     * Returns the value of the '<em><b>Gen Control Source</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratorControlSource}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The source of controls for a generating unit.  Defines the control status of the generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gen Control Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratorControlSource
     * @see #isSetGenControlSource()
     * @see #unsetGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_GenControlSource()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.genControlSource' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GeneratorControlSource getGenControlSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Control Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratorControlSource
     * @see #isSetGenControlSource()
     * @see #unsetGenControlSource()
     * @see #getGenControlSource()
     * @generated
     */
    void setGenControlSource( GeneratorControlSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenControlSource()
     * @see #getGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @generated
     */
    void unsetGenControlSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Control Source</em>' attribute is set.
     * @see #unsetGenControlSource()
     * @see #getGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @generated
     */
    boolean isSetGenControlSource();

    /**
     * Returns the value of the '<em><b>Rotating Machine</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rotating Machine</em>' reference list.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_RotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.RotatingMachine' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< RotatingMachine > getRotatingMachine();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    void unsetRotatingMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotating Machine</em>' reference list is set.
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    boolean isSetRotatingMachine();

    /**
     * Returns the value of the '<em><b>Normal PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generating unit economic participation factor.  The sum of the participation factors across generating units does not have to sum to one.  It is used for representing distributed slack participation factor. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normal PF</em>' attribute.
     * @see #isSetNormalPF()
     * @see #unsetNormalPF()
     * @see #setNormalPF(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_NormalPF()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.normalPF' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNormalPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal PF</em>' attribute.
     * @see #isSetNormalPF()
     * @see #unsetNormalPF()
     * @see #getNormalPF()
     * @generated
     */
    void setNormalPF( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalPF()
     * @see #getNormalPF()
     * @see #setNormalPF(Double)
     * @generated
     */
    void unsetNormalPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal PF</em>' attribute is set.
     * @see #unsetNormalPF()
     * @see #getNormalPF()
     * @see #setNormalPF(Double)
     * @generated
     */
    boolean isSetNormalPF();

    /**
     * Returns the value of the '<em><b>Long PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generating unit long term economic participation factor.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Long PF</em>' attribute.
     * @see #isSetLongPF()
     * @see #unsetLongPF()
     * @see #setLongPF(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_LongPF()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.longPF' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLongPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Long PF</em>' attribute.
     * @see #isSetLongPF()
     * @see #unsetLongPF()
     * @see #getLongPF()
     * @generated
     */
    void setLongPF( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLongPF()
     * @see #getLongPF()
     * @see #setLongPF(Double)
     * @generated
     */
    void unsetLongPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Long PF</em>' attribute is set.
     * @see #unsetLongPF()
     * @see #getLongPF()
     * @see #setLongPF(Double)
     * @generated
     */
    boolean isSetLongPF();

    /**
     * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ControlArea specifications for this generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_ControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.ControlAreaGeneratingUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    void unsetControlAreaGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area Generating Unit</em>' reference list is set.
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    boolean isSetControlAreaGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Min Operating P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the minimum operating active power limit the dispatcher can enter for this unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Operating P</em>' attribute.
     * @see #isSetMinOperatingP()
     * @see #unsetMinOperatingP()
     * @see #setMinOperatingP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_MinOperatingP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.minOperatingP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinOperatingP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Operating P</em>' attribute.
     * @see #isSetMinOperatingP()
     * @see #unsetMinOperatingP()
     * @see #getMinOperatingP()
     * @generated
     */
    void setMinOperatingP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinOperatingP()
     * @see #getMinOperatingP()
     * @see #setMinOperatingP(Double)
     * @generated
     */
    void unsetMinOperatingP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Operating P</em>' attribute is set.
     * @see #unsetMinOperatingP()
     * @see #getMinOperatingP()
     * @see #setMinOperatingP(Double)
     * @generated
     */
    boolean isSetMinOperatingP();

    /**
     * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The variable cost component of production per unit of ActivePower.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variable Cost</em>' attribute.
     * @see #isSetVariableCost()
     * @see #unsetVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_VariableCost()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Money" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.variableCost' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigDecimal getVariableCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable Cost</em>' attribute.
     * @see #isSetVariableCost()
     * @see #unsetVariableCost()
     * @see #getVariableCost()
     * @generated
     */
    void setVariableCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariableCost()
     * @see #getVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @generated
     */
    void unsetVariableCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Cost</em>' attribute is set.
     * @see #unsetVariableCost()
     * @see #getVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @generated
     */
    boolean isSetVariableCost();

    /**
     * Returns the value of the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGeneratingUnit_MaximumAllowableSpinningReserve()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GeneratingUnit.maximumAllowableSpinningReserve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaximumAllowableSpinningReserve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     */
    void setMaximumAllowableSpinningReserve( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Double)
     * @generated
     */
    void unsetMaximumAllowableSpinningReserve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute is set.
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Double)
     * @generated
     */
    boolean isSetMaximumAllowableSpinningReserve();

} // GeneratingUnit
