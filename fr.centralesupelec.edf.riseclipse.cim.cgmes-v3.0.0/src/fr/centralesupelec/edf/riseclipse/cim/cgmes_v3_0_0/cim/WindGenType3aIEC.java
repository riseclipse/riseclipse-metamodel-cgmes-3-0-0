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
 * A representation of the model object '<em><b>Wind Gen Type3a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEC type 3A generator set model.
 * Reference: IEC 61400-27-1:2015, 5.6.3.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getTic <em>Tic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType3aIEC()
 * @model
 * @generated
 */
public interface WindGenType3aIEC extends WindGenType3IEC {
    /**
     * Returns the value of the '<em><b>Kpc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current PI controller proportional gain (<i>K</i><i><sub>Pc</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #setKpc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType3aIEC_Kpc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType3aIEC.kpc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #getKpc()
     * @generated
     */
    void setKpc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpc()
     * @see #getKpc()
     * @see #setKpc(Double)
     * @generated
     */
    void unsetKpc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getKpc <em>Kpc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpc</em>' attribute is set.
     * @see #unsetKpc()
     * @see #getKpc()
     * @see #setKpc(Double)
     * @generated
     */
    boolean isSetKpc();

    /**
     * Returns the value of the '<em><b>Tic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current PI controller integration time constant (<i>T</i><i><sub>Ic</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tic</em>' attribute.
     * @see #isSetTic()
     * @see #unsetTic()
     * @see #setTic(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType3aIEC_Tic()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType3aIEC.tic' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tic</em>' attribute.
     * @see #isSetTic()
     * @see #unsetTic()
     * @see #getTic()
     * @generated
     */
    void setTic( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTic()
     * @see #getTic()
     * @see #setTic(Double)
     * @generated
     */
    void unsetTic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getTic <em>Tic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tic</em>' attribute is set.
     * @see #unsetTic()
     * @see #getTic()
     * @see #setTic(Double)
     * @generated
     */
    boolean isSetTic();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4IEC#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 4 model with which this wind generator type 3A model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4 IEC</em>' reference.
     * @see #isSetWindTurbineType4IEC()
     * @see #unsetWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType3aIEC_WindTurbineType4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4IEC#getWindGenType3aIEC
     * @model opposite="WindGenType3aIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType3aIEC.WindTurbineType4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4IEC getWindTurbineType4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4 IEC</em>' reference.
     * @see #isSetWindTurbineType4IEC()
     * @see #unsetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @generated
     */
    void setWindTurbineType4IEC( WindTurbineType4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @generated
     */
    void unsetWindTurbineType4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3aIEC#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType4IEC()
     * @see #getWindTurbineType4IEC()
     * @see #setWindTurbineType4IEC(WindTurbineType4IEC)
     * @generated
     */
    boolean isSetWindTurbineType4IEC();

} // WindGenType3aIEC
