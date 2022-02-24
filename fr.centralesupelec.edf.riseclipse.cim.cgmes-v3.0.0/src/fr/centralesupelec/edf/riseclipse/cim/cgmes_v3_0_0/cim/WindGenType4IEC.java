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
 * A representation of the model object '<em><b>Wind Gen Type4 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEC type 4 generator set model.
 * Reference: IEC 61400-27-1:2015, 5.6.3.4.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmin <em>Diqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC()
 * @model
 * @generated
 */
public interface WindGenType4IEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Diqmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive current ramp rate (<i>di</i><i><sub>qmax</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diqmax</em>' attribute.
     * @see #isSetDiqmax()
     * @see #unsetDiqmax()
     * @see #setDiqmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_Diqmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.diqmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDiqmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmax <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diqmax</em>' attribute.
     * @see #isSetDiqmax()
     * @see #unsetDiqmax()
     * @see #getDiqmax()
     * @generated
     */
    void setDiqmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmax <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiqmax()
     * @see #getDiqmax()
     * @see #setDiqmax(Double)
     * @generated
     */
    void unsetDiqmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmax <em>Diqmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diqmax</em>' attribute is set.
     * @see #unsetDiqmax()
     * @see #getDiqmax()
     * @see #setDiqmax(Double)
     * @generated
     */
    boolean isSetDiqmax();

    /**
     * Returns the value of the '<em><b>Diqmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive current ramp rate (<i>di</i><i><sub>qmin</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diqmin</em>' attribute.
     * @see #isSetDiqmin()
     * @see #unsetDiqmin()
     * @see #setDiqmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_Diqmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.diqmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDiqmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmin <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diqmin</em>' attribute.
     * @see #isSetDiqmin()
     * @see #unsetDiqmin()
     * @see #getDiqmin()
     * @generated
     */
    void setDiqmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmin <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiqmin()
     * @see #getDiqmin()
     * @see #setDiqmin(Double)
     * @generated
     */
    void unsetDiqmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDiqmin <em>Diqmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diqmin</em>' attribute is set.
     * @see #unsetDiqmin()
     * @see #getDiqmin()
     * @see #setDiqmin(Double)
     * @generated
     */
    boolean isSetDiqmin();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4a IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 4A model with which this wind generator type 4 model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4a IEC</em>' reference.
     * @see #isSetWindTurbineType4aIEC()
     * @see #unsetWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_WindTurbineType4aIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4aIEC#getWindGenType4IEC
     * @model opposite="WindGenType4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.WindTurbineType4aIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4aIEC getWindTurbineType4aIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4aIEC()
     * @see #getWindTurbineType4aIEC()
     * @see #setWindTurbineType4aIEC(WindTurbineType4aIEC)
     * @generated
     */
    void unsetWindTurbineType4aIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}' reference is set.
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
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T</i><i><sub>g</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_Tg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.tg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #getTg()
     * @generated
     */
    void setTg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getTg <em>Tg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tg</em>' attribute is set.
     * @see #unsetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    boolean isSetTg();

    /**
     * Returns the value of the '<em><b>Dipmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum active current ramp rate (<i>di</i><i><sub>pmax</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dipmax</em>' attribute.
     * @see #isSetDipmax()
     * @see #unsetDipmax()
     * @see #setDipmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_Dipmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.dipmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDipmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDipmax <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dipmax</em>' attribute.
     * @see #isSetDipmax()
     * @see #unsetDipmax()
     * @see #getDipmax()
     * @generated
     */
    void setDipmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDipmax <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDipmax()
     * @see #getDipmax()
     * @see #setDipmax(Double)
     * @generated
     */
    void unsetDipmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getDipmax <em>Dipmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dipmax</em>' attribute is set.
     * @see #unsetDipmax()
     * @see #getDipmax()
     * @see #setDipmax(Double)
     * @generated
     */
    boolean isSetDipmax();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 4B model with which this wind generator type 4 model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindGenType4IEC_WindTurbineType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindGenType4IEC
     * @model opposite="WindGenType4IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindGenType4IEC.WindTurbineType4bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4bIEC getWindTurbineType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    void unsetWindTurbineType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType4IEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4b IEC</em>' reference is set.
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    boolean isSetWindTurbineType4bIEC();

} // WindGenType4IEC
