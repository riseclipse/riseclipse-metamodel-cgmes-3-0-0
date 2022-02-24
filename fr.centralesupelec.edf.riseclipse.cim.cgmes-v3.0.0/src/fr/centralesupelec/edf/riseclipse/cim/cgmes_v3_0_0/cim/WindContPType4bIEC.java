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
 * A representation of the model object '<em><b>Wind Cont PType4b IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * P control model type 4B.
 * Reference: IEC 61400-27-1:2015, 5.6.5.6.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC()
 * @model
 * @generated
 */
public interface WindContPType4bIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Turbine Type4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 4B model with which this wind control P type 4B model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC_WindTurbineType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC
     * @model opposite="WindContPType4bIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4bIEC.WindTurbineType4bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4bIEC getWindTurbineType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @generated
     */
    void setWindTurbineType4bIEC( WindTurbineType4bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    void unsetWindTurbineType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4b IEC</em>' reference is set.
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    boolean isSetWindTurbineType4bIEC();

    /**
     * Returns the value of the '<em><b>Tpordp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in power order lag (<i>T</i><i><sub>pordp4B</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpordp4b</em>' attribute.
     * @see #isSetTpordp4b()
     * @see #unsetTpordp4b()
     * @see #setTpordp4b(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC_Tpordp4b()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4bIEC.tpordp4b' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpordp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpordp4b</em>' attribute.
     * @see #isSetTpordp4b()
     * @see #unsetTpordp4b()
     * @see #getTpordp4b()
     * @generated
     */
    void setTpordp4b( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpordp4b()
     * @see #getTpordp4b()
     * @see #setTpordp4b(Double)
     * @generated
     */
    void unsetTpordp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpordp4b <em>Tpordp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpordp4b</em>' attribute is set.
     * @see #unsetTpordp4b()
     * @see #getTpordp4b()
     * @see #setTpordp4b(Double)
     * @generated
     */
    boolean isSetTpordp4b();

    /**
     * Returns the value of the '<em><b>Tufiltp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage measurement filter time constant (<i>T</i><i><sub>ufiltp4B</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tufiltp4b</em>' attribute.
     * @see #isSetTufiltp4b()
     * @see #unsetTufiltp4b()
     * @see #setTufiltp4b(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC_Tufiltp4b()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4bIEC.tufiltp4b' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTufiltp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp4b</em>' attribute.
     * @see #isSetTufiltp4b()
     * @see #unsetTufiltp4b()
     * @see #getTufiltp4b()
     * @generated
     */
    void setTufiltp4b( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp4b()
     * @see #getTufiltp4b()
     * @see #setTufiltp4b(Double)
     * @generated
     */
    void unsetTufiltp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTufiltp4b <em>Tufiltp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp4b</em>' attribute is set.
     * @see #unsetTufiltp4b()
     * @see #getTufiltp4b()
     * @see #setTufiltp4b(Double)
     * @generated
     */
    boolean isSetTufiltp4b();

    /**
     * Returns the value of the '<em><b>Dpmaxp4b</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum wind turbine power ramp rate (<i>dp</i><i><sub>maxp4B</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpmaxp4b</em>' attribute.
     * @see #isSetDpmaxp4b()
     * @see #unsetDpmaxp4b()
     * @see #setDpmaxp4b(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC_Dpmaxp4b()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4bIEC.dpmaxp4b' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpmaxp4b();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmaxp4b</em>' attribute.
     * @see #isSetDpmaxp4b()
     * @see #unsetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @generated
     */
    void setDpmaxp4b( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @see #setDpmaxp4b(Double)
     * @generated
     */
    void unsetDpmaxp4b();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getDpmaxp4b <em>Dpmaxp4b</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmaxp4b</em>' attribute is set.
     * @see #unsetDpmaxp4b()
     * @see #getDpmaxp4b()
     * @see #setDpmaxp4b(Double)
     * @generated
     */
    boolean isSetDpmaxp4b();

    /**
     * Returns the value of the '<em><b>Tpaero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in aerodynamic power response (<i>T</i><i><sub>paero</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpaero</em>' attribute.
     * @see #isSetTpaero()
     * @see #unsetTpaero()
     * @see #setTpaero(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType4bIEC_Tpaero()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType4bIEC.tpaero' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpaero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpaero</em>' attribute.
     * @see #isSetTpaero()
     * @see #unsetTpaero()
     * @see #getTpaero()
     * @generated
     */
    void setTpaero( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpaero()
     * @see #getTpaero()
     * @see #setTpaero(Double)
     * @generated
     */
    void unsetTpaero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getTpaero <em>Tpaero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpaero</em>' attribute is set.
     * @see #unsetTpaero()
     * @see #getTpaero()
     * @see #setTpaero(Double)
     * @generated
     */
    boolean isSetTpaero();

} // WindContPType4bIEC
