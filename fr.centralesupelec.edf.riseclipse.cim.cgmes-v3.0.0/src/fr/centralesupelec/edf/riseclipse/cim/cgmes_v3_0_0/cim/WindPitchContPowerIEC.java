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
 * A representation of the model object '<em><b>Wind Pitch Cont Power IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pitch control power model.
 * Reference: IEC 61400-27-1:2015, 5.6.5.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPset <em>Pset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmin <em>Dpmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getUuvrt <em>Uuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPmin <em>Pmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC()
 * @model
 * @generated
 */
public interface WindPitchContPowerIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Pset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If <i>p</i><i><sub>init</sub></i><sub> </sub>&lt; <i>p</i><i><sub>set</sub></i><sub> </sub>then power will be ramped down to <i>p</i><i><sub>min</sub></i>. It is (<i>p</i><i><sub>set</sub></i>) in the IEC 61400-27-1:2015. It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pset</em>' attribute.
     * @see #isSetPset()
     * @see #unsetPset()
     * @see #setPset(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Pset()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.pset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPset <em>Pset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pset</em>' attribute.
     * @see #isSetPset()
     * @see #unsetPset()
     * @see #getPset()
     * @generated
     */
    void setPset( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPset <em>Pset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPset()
     * @see #getPset()
     * @see #setPset(Double)
     * @generated
     */
    void unsetPset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPset <em>Pset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pset</em>' attribute is set.
     * @see #unsetPset()
     * @see #getPset()
     * @see #setPset(Double)
     * @generated
     */
    boolean isSetPset();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this pitch control power model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC
     * @model opposite="WindPitchContPowerIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Dpmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate limit for increasing power (<i>dp</i><i><sub>max</sub></i>) (&gt; WindPitchContPowerIEC.dpmin). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #setDpmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Dpmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.dpmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @generated
     */
    void setDpmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Double)
     * @generated
     */
    void unsetDpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmax <em>Dpmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmax</em>' attribute is set.
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Double)
     * @generated
     */
    boolean isSetDpmax();

    /**
     * Returns the value of the '<em><b>Dpmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate limit for decreasing power (<i>dp</i><i><sub>min</sub></i>) (&lt; WindPitchContPowerIEC.dpmax). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpmin</em>' attribute.
     * @see #isSetDpmin()
     * @see #unsetDpmin()
     * @see #setDpmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Dpmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.dpmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmin <em>Dpmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmin</em>' attribute.
     * @see #isSetDpmin()
     * @see #unsetDpmin()
     * @see #getDpmin()
     * @generated
     */
    void setDpmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmin <em>Dpmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmin()
     * @see #getDpmin()
     * @see #setDpmin(Double)
     * @generated
     */
    void unsetDpmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getDpmin <em>Dpmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmin</em>' attribute is set.
     * @see #unsetDpmin()
     * @see #getDpmin()
     * @see #setDpmin(Double)
     * @generated
     */
    boolean isSetDpmin();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 2 model with which this pitch control power model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_WindGenTurbineType2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC#getWindPitchContPowerIEC
     * @model opposite="WindPitchContPowerIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.WindGenTurbineType2IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenTurbineType2IEC getWindGenTurbineType2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @generated
     */
    void setWindGenTurbineType2IEC( WindGenTurbineType2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    void unsetWindGenTurbineType2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType2IEC();

    /**
     * Returns the value of the '<em><b>Uuvrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dip detection threshold (<i>u</i><i><sub>UVRT</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uuvrt</em>' attribute.
     * @see #isSetUuvrt()
     * @see #unsetUuvrt()
     * @see #setUuvrt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Uuvrt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.uuvrt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUuvrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getUuvrt <em>Uuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuvrt</em>' attribute.
     * @see #isSetUuvrt()
     * @see #unsetUuvrt()
     * @see #getUuvrt()
     * @generated
     */
    void setUuvrt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getUuvrt <em>Uuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUuvrt()
     * @see #getUuvrt()
     * @see #setUuvrt(Double)
     * @generated
     */
    void unsetUuvrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getUuvrt <em>Uuvrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uuvrt</em>' attribute is set.
     * @see #unsetUuvrt()
     * @see #getUuvrt()
     * @see #setUuvrt(Double)
     * @generated
     */
    boolean isSetUuvrt();

    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type1b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 1B model with which this pitch control power model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type1b IEC</em>' reference.
     * @see #isSetWindGenTurbineType1bIEC()
     * @see #unsetWindGenTurbineType1bIEC()
     * @see #setWindGenTurbineType1bIEC(WindGenTurbineType1bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_WindGenTurbineType1bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC
     * @model opposite="WindPitchContPowerIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.WindGenTurbineType1bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenTurbineType1bIEC getWindGenTurbineType1bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type1b IEC</em>' reference.
     * @see #isSetWindGenTurbineType1bIEC()
     * @see #unsetWindGenTurbineType1bIEC()
     * @see #getWindGenTurbineType1bIEC()
     * @generated
     */
    void setWindGenTurbineType1bIEC( WindGenTurbineType1bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType1bIEC()
     * @see #getWindGenTurbineType1bIEC()
     * @see #setWindGenTurbineType1bIEC(WindGenTurbineType1bIEC)
     * @generated
     */
    void unsetWindGenTurbineType1bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type1b IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType1bIEC()
     * @see #getWindGenTurbineType1bIEC()
     * @see #setWindGenTurbineType1bIEC(WindGenTurbineType1bIEC)
     * @generated
     */
    boolean isSetWindGenTurbineType1bIEC();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage measurement time constant (<i>T</i><i><sub>r</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lag time constant (<i>T</i><i><sub>1</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>Pmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum power setting (<i>p</i><i><sub>min</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPitchContPowerIEC_Pmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPitchContPowerIEC.pmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #getPmin()
     * @generated
     */
    void setPmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getPmin <em>Pmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmin</em>' attribute is set.
     * @see #unsetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    boolean isSetPmin();

} // WindPitchContPowerIEC
