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
 * A representation of the model object '<em><b>Power Electronics Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection to the AC network for energy production or consumption that uses power electronics rather than rotating machines.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getPowerElectronicsUnit <em>Power Electronics Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection()
 * @model
 * @generated
 */
public interface PowerElectronicsConnection extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive power limit for the unit. This is the minimum (nameplate) limit for the unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_MinQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.minQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @generated
     */
    void setMinQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMinQ <em>Min Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Q</em>' attribute is set.
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    boolean isSetMinQ();

    /**
     * Returns the value of the '<em><b>Rated S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nameplate apparent power rating for the unit.
     * The attribute shall have a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #setRatedS(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_RatedS()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPower" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.ratedS' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @generated
     */
    void setRatedS( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Double)
     * @generated
     */
    void unsetRatedS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedS <em>Rated S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated S</em>' attribute is set.
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Double)
     * @generated
     */
    boolean isSetRatedS();

    /**
     * Returns the value of the '<em><b>Rated U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated voltage (nameplate data, Ur in IEC 60909-0). It is primarily used for short circuit data exchange according to IEC 60909.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #setRatedU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_RatedU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.ratedU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @generated
     */
    void setRatedU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Double)
     * @generated
     */
    void unsetRatedU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getRatedU <em>Rated U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated U</em>' attribute is set.
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Double)
     * @generated
     */
    boolean isSetRatedU();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection <em>Power Electronics Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind turbine type 3 or type 4 dynamics model associated with this power electronics connection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference.
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_WindTurbineType3or4Dynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics#getPowerElectronicsConnection
     * @model opposite="PowerElectronicsConnection" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.WindTurbineType3or4Dynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference.
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     */
    void setWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @generated
     */
    void unsetWindTurbineType3or4Dynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 Dynamics</em>' reference is set.
     * @see #unsetWindTurbineType3or4Dynamics()
     * @see #getWindTurbineType3or4Dynamics()
     * @see #setWindTurbineType3or4Dynamics(WindTurbineType3or4Dynamics)
     * @generated
     */
    boolean isSetWindTurbineType3or4Dynamics();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    void setP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    boolean isSetP();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>Power Electronics Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsUnit#getPowerElectronicsConnection <em>Power Electronics Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An AC network connection may have several power electronics units connecting through it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power Electronics Unit</em>' reference.
     * @see #isSetPowerElectronicsUnit()
     * @see #unsetPowerElectronicsUnit()
     * @see #setPowerElectronicsUnit(PowerElectronicsUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_PowerElectronicsUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsUnit#getPowerElectronicsConnection
     * @model opposite="PowerElectronicsConnection" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.PowerElectronicsUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerElectronicsUnit getPowerElectronicsUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getPowerElectronicsUnit <em>Power Electronics Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Electronics Unit</em>' reference.
     * @see #isSetPowerElectronicsUnit()
     * @see #unsetPowerElectronicsUnit()
     * @see #getPowerElectronicsUnit()
     * @generated
     */
    void setPowerElectronicsUnit( PowerElectronicsUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getPowerElectronicsUnit <em>Power Electronics Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerElectronicsUnit()
     * @see #getPowerElectronicsUnit()
     * @see #setPowerElectronicsUnit(PowerElectronicsUnit)
     * @generated
     */
    void unsetPowerElectronicsUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getPowerElectronicsUnit <em>Power Electronics Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Electronics Unit</em>' reference is set.
     * @see #unsetPowerElectronicsUnit()
     * @see #getPowerElectronicsUnit()
     * @see #setPowerElectronicsUnit(PowerElectronicsUnit)
     * @generated
     */
    boolean isSetPowerElectronicsUnit();

    /**
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPowerElectronicsConnection_MaxQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='PowerElectronicsConnection.maxQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @generated
     */
    void setMaxQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    boolean isSetMaxQ();

} // PowerElectronicsConnection
