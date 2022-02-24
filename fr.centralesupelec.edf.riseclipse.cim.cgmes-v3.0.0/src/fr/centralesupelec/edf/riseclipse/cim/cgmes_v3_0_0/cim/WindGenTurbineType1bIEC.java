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
 * A representation of the model object '<em><b>Wind Gen Turbine Type1b IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wind turbine IEC type 1B.
 *
 * Reference: IEC 61400-27-1:2015, 5.5.2.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenTurbineType1bIEC()
 * @model
 * @generated
 */
public interface WindGenTurbineType1bIEC extends WindTurbineType1or2IEC {
    /**
     * Returns the value of the '<em><b>Wind Pitch Cont Power IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC <em>Wind Gen Turbine Type1b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pitch control power model associated with this wind turbine type 1B model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenTurbineType1bIEC_WindPitchContPowerIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindGenTurbineType1bIEC
     * @model opposite="WindGenTurbineType1bIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindGenTurbineType1bIEC.WindPitchContPowerIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPitchContPowerIEC getWindPitchContPowerIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @generated
     */
    void setWindPitchContPowerIEC( WindPitchContPowerIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    void unsetWindPitchContPowerIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1bIEC#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Pitch Cont Power IEC</em>' reference is set.
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    boolean isSetWindPitchContPowerIEC();

} // WindGenTurbineType1bIEC
