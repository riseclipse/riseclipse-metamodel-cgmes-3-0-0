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
 * A representation of the model object '<em><b>Wind Cont PType4a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * P control model type 4A.
 * Reference: IEC 61400-27-1:2015, 5.6.5.5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4aIEC()
 * @model
 * @generated
 */
public interface WindContPType4aIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Turbine Type4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  Wind turbine type 4A model with which this wind control P type 4A model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4aIEC_WindTurbineType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC
     * @model opposite="WindContPType4aIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4aIEC.WindTurbineType4aIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4aIEC getWindTurbineType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @generated
     */
    void setWindTurbineType4aIEC( WindTurbineType4aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    void unsetWindTurbineType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4a IEC</em>' reference is set.
     * @see #unsetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    boolean isSetWindTurbineType4aIEC();

    /**
     * Returns the value of the '<em><b>Tufiltp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage measurement filter time constant (<i>T</i><i><sub>ufiltp4A</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tufiltp4a</em>' attribute.
     * @see #isSetTufiltp4a()
     * @see #unsetTufiltp4a()
     * @see #setTufiltp4a(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4aIEC_Tufiltp4a()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4aIEC.tufiltp4a' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTufiltp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp4a</em>' attribute.
     * @see #isSetTufiltp4a()
     * @see #unsetTufiltp4a()
     * @see #getTufiltp4a()
     * @generated
     */
    void setTufiltp4a( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp4a()
     * @see #getTufiltp4a()
     * @see #setTufiltp4a(Double)
     * @generated
     */
    void unsetTufiltp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTufiltp4a <em>Tufiltp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp4a</em>' attribute is set.
     * @see #unsetTufiltp4a()
     * @see #getTufiltp4a()
     * @see #setTufiltp4a(Double)
     * @generated
     */
    boolean isSetTufiltp4a();

    /**
     * Returns the value of the '<em><b>Dpmaxp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum wind turbine power ramp rate (<i>dp</i><i><sub>maxp4A</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpmaxp4a</em>' attribute.
     * @see #isSetDpmaxp4a()
     * @see #unsetDpmaxp4a()
     * @see #setDpmaxp4a(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4aIEC_Dpmaxp4a()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4aIEC.dpmaxp4a' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpmaxp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmaxp4a</em>' attribute.
     * @see #isSetDpmaxp4a()
     * @see #unsetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @generated
     */
    void setDpmaxp4a( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @see #setDpmaxp4a(Double)
     * @generated
     */
    void unsetDpmaxp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getDpmaxp4a <em>Dpmaxp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmaxp4a</em>' attribute is set.
     * @see #unsetDpmaxp4a()
     * @see #getDpmaxp4a()
     * @see #setDpmaxp4a(Double)
     * @generated
     */
    boolean isSetDpmaxp4a();

    /**
     * Returns the value of the '<em><b>Tpordp4a</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in power order lag (<i>T</i><i><sub>pordp4A</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpordp4a</em>' attribute.
     * @see #isSetTpordp4a()
     * @see #unsetTpordp4a()
     * @see #setTpordp4a(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4aIEC_Tpordp4a()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4aIEC.tpordp4a' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpordp4a();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpordp4a</em>' attribute.
     * @see #isSetTpordp4a()
     * @see #unsetTpordp4a()
     * @see #getTpordp4a()
     * @generated
     */
    void setTpordp4a( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpordp4a()
     * @see #getTpordp4a()
     * @see #setTpordp4a(Double)
     * @generated
     */
    void unsetTpordp4a();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getTpordp4a <em>Tpordp4a</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpordp4a</em>' attribute is set.
     * @see #unsetTpordp4a()
     * @see #getTpordp4a()
     * @see #setTpordp4a(Double)
     * @generated
     */
    boolean isSetTpordp4a();

} // WindContPType4aIEC
