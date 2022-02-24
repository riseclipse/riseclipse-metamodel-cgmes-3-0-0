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
 * A representation of the model object '<em><b>Wind Turbine Type4a IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wind turbine IEC type 4A.
 * Reference: IEC 61400-27-1:2015, 5.5.5.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4aIEC()
 * @model
 * @generated
 */
public interface WindTurbineType4aIEC extends WindTurbineType4IEC {
    /**
     * Returns the value of the '<em><b>Wind Cont PType4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind control P type 4A model associated with this wind turbine type 4A model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont PType4a IEC</em>' reference.
     * @see #isSetWindContPType4aIEC()
     * @see #unsetWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4aIEC_WindContPType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4aIEC#getWindTurbineType4aIEC
     * @model opposite="WindTurbineType4aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType4aIEC.WindContPType4aIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContPType4aIEC getWindContPType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType4a IEC</em>' reference.
     * @see #isSetWindContPType4aIEC()
     * @see #unsetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @generated
     */
    void setWindContPType4aIEC( WindContPType4aIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @generated
     */
    void unsetWindContPType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType4a IEC</em>' reference is set.
     * @see #unsetWindContPType4aIEC()
     * @see #getWindContPType4aIEC()
     * @see #setWindContPType4aIEC(WindContPType4aIEC)
     * @generated
     */
    boolean isSetWindContPType4aIEC();

    /**
     * Returns the value of the '<em><b>Wind Gen Type4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 4 model associated with this wind turbine type 4A model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Type4 IEC</em>' reference.
     * @see #isSetWindGenType4IEC()
     * @see #unsetWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4aIEC_WindGenType4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC
     * @model opposite="WindTurbineType4aIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType4aIEC.WindGenType4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenType4IEC getWindGenType4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Type4 IEC</em>' reference.
     * @see #isSetWindGenType4IEC()
     * @see #unsetWindGenType4IEC()
     * @see #getWindGenType4IEC()
     * @generated
     */
    void setWindGenType4IEC( WindGenType4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenType4IEC()
     * @see #getWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @generated
     */
    void unsetWindGenType4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Type4 IEC</em>' reference is set.
     * @see #unsetWindGenType4IEC()
     * @see #getWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @generated
     */
    boolean isSetWindGenType4IEC();

} // WindTurbineType4aIEC
