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
 * A representation of the model object '<em><b>Wind Gen Turbine Type1a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wind turbine IEC type 1A.
 * Reference: IEC 61400-27-1:2015, 5.5.2.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenTurbineType1aIEC()
 * @model
 * @generated
 */
public interface WindGenTurbineType1aIEC extends WindTurbineType1or2IEC {
    /**
     * Returns the value of the '<em><b>Wind Aero Const IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind aerodynamic model associated with this wind turbine type 1A model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Aero Const IEC</em>' reference.
     * @see #isSetWindAeroConstIEC()
     * @see #unsetWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenTurbineType1aIEC_WindAeroConstIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroConstIEC#getWindGenTurbineType1aIEC
     * @model opposite="WindGenTurbineType1aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindGenTurbineType1aIEC.WindAeroConstIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindAeroConstIEC getWindAeroConstIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Aero Const IEC</em>' reference.
     * @see #isSetWindAeroConstIEC()
     * @see #unsetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @generated
     */
    void setWindAeroConstIEC( WindAeroConstIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @generated
     */
    void unsetWindAeroConstIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType1aIEC#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Aero Const IEC</em>' reference is set.
     * @see #unsetWindAeroConstIEC()
     * @see #getWindAeroConstIEC()
     * @see #setWindAeroConstIEC(WindAeroConstIEC)
     * @generated
     */
    boolean isSetWindAeroConstIEC();

} // WindGenTurbineType1aIEC
