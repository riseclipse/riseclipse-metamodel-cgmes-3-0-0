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
 * A representation of the model object '<em><b>Wind Turbine Type4b IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wind turbine IEC type 4B.
 * Reference: IEC 61400-27-1:2015, 5.5.5.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4bIEC()
 * @model
 * @generated
 */
public interface WindTurbineType4bIEC extends WindTurbineType4IEC {
    /**
     * Returns the value of the '<em><b>Wind Cont PType4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind control P type 4B model associated with this wind turbine type 4B model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont PType4b IEC</em>' reference.
     * @see #isSetWindContPType4bIEC()
     * @see #unsetWindContPType4bIEC()
     * @see #setWindContPType4bIEC(WindContPType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4bIEC_WindContPType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType4bIEC#getWindTurbineType4bIEC
     * @model opposite="WindTurbineType4bIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType4bIEC.WindContPType4bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContPType4bIEC getWindContPType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType4b IEC</em>' reference.
     * @see #isSetWindContPType4bIEC()
     * @see #unsetWindContPType4bIEC()
     * @see #getWindContPType4bIEC()
     * @generated
     */
    void setWindContPType4bIEC( WindContPType4bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType4bIEC()
     * @see #getWindContPType4bIEC()
     * @see #setWindContPType4bIEC(WindContPType4bIEC)
     * @generated
     */
    void unsetWindContPType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindContPType4bIEC <em>Wind Cont PType4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType4b IEC</em>' reference is set.
     * @see #unsetWindContPType4bIEC()
     * @see #getWindContPType4bIEC()
     * @see #setWindContPType4bIEC(WindContPType4bIEC)
     * @generated
     */
    boolean isSetWindContPType4bIEC();

    /**
     * Returns the value of the '<em><b>Wind Mech IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind mechanical model associated with this wind turbine type 4B model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4bIEC_WindMechIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC
     * @model opposite="WindTurbineType4bIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType4bIEC.WindMechIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindMechIEC getWindMechIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @generated
     */
    void setWindMechIEC( WindMechIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    void unsetWindMechIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Mech IEC</em>' reference is set.
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    boolean isSetWindMechIEC();

    /**
     * Returns the value of the '<em><b>Wind Gen Type4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 4 model associated with this wind turbine type 4B model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Type4 IEC</em>' reference.
     * @see #isSetWindGenType4IEC()
     * @see #unsetWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindTurbineType4bIEC_WindGenType4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC
     * @model opposite="WindTurbineType4bIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindTurbineType4bIEC.WindGenType4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenType4IEC getWindGenType4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenType4IEC()
     * @see #getWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @generated
     */
    void unsetWindGenType4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Type4 IEC</em>' reference is set.
     * @see #unsetWindGenType4IEC()
     * @see #getWindGenType4IEC()
     * @see #setWindGenType4IEC(WindGenType4IEC)
     * @generated
     */
    boolean isSetWindGenType4IEC();

} // WindTurbineType4bIEC
