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
 * A representation of the model object '<em><b>Wind Aero Const IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Constant aerodynamic torque model which assumes that the aerodynamic torque is constant.
 * Reference: IEC 61400-27-1:2015, 5.6.1.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroConstIEC()
 * @model
 * @generated
 */
public interface WindAeroConstIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type1a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 1A model with which this wind aerodynamic model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference.
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroConstIEC_WindGenTurbineType1aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC
     * @model opposite="WindAeroConstIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroConstIEC.WindGenTurbineType1aIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenTurbineType1aIEC getWindGenTurbineType1aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference.
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @generated
     */
    void setWindGenTurbineType1aIEC( WindGenTurbineType1aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @generated
     */
    void unsetWindGenTurbineType1aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type1a IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType1aIEC()
     * @see #getWindGenTurbineType1aIEC()
     * @see #setWindGenTurbineType1aIEC(WindGenTurbineType1aIEC)
     * @generated
     */
    boolean isSetWindGenTurbineType1aIEC();

} // WindAeroConstIEC
