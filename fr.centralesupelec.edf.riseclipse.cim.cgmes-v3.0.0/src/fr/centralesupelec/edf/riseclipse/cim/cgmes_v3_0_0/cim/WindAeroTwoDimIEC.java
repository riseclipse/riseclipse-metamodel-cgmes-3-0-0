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
 * A representation of the model object '<em><b>Wind Aero Two Dim IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two-dimensional aerodynamic model.
 * Reference: IEC 61400-27-1:2015, 5.6.1.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC()
 * @model
 * @generated
 */
public interface WindAeroTwoDimIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Omegazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rotor speed if the wind turbine is not derated (<i>omega</i><i><sub>0</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #setOmegazero(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Omegazero()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.omegazero' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmegazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @generated
     */
    void setOmegazero( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Double)
     * @generated
     */
    void unsetOmegazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegazero</em>' attribute is set.
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Double)
     * @generated
     */
    boolean isSetOmegazero();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 model with which this wind aerodynamic model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC
     * @model opposite="WindAeroTwoDimIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.WindTurbineType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

    /**
     * Returns the value of the '<em><b>Thetav2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Blade angle at twice rated wind speed (<i>theta</i><i><sub>v2</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetav2</em>' attribute.
     * @see #isSetThetav2()
     * @see #unsetThetav2()
     * @see #setThetav2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Thetav2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.thetav2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetav2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetav2</em>' attribute.
     * @see #isSetThetav2()
     * @see #unsetThetav2()
     * @see #getThetav2()
     * @generated
     */
    void setThetav2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetav2()
     * @see #getThetav2()
     * @see #setThetav2(Double)
     * @generated
     */
    void unsetThetav2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetav2</em>' attribute is set.
     * @see #unsetThetav2()
     * @see #getThetav2()
     * @see #setThetav2(Double)
     * @generated
     */
    boolean isSetThetav2();

    /**
     * Returns the value of the '<em><b>Dpomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Partial derivative of aerodynamic power with respect to changes in WTR speed (<i>dp</i><i><sub>omega</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #setDpomega(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Dpomega()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.dpomega' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @generated
     */
    void setDpomega( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Double)
     * @generated
     */
    void unsetDpomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpomega</em>' attribute is set.
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Double)
     * @generated
     */
    boolean isSetDpomega();

    /**
     * Returns the value of the '<em><b>Dptheta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Partial derivative of aerodynamic power with respect to changes in pitch angle (<i>dp</i><i><sub>theta</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #setDptheta(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Dptheta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.dptheta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDptheta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @generated
     */
    void setDptheta( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Double)
     * @generated
     */
    void unsetDptheta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dptheta</em>' attribute is set.
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Double)
     * @generated
     */
    boolean isSetDptheta();

    /**
     * Returns the value of the '<em><b>Pavail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Available aerodynamic power (<i>p</i><i><sub>avail</sub></i><i>)</i>. It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #setPavail(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Pavail()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.pavail' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPavail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #getPavail()
     * @generated
     */
    void setPavail( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPavail()
     * @see #getPavail()
     * @see #setPavail(Double)
     * @generated
     */
    void unsetPavail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pavail</em>' attribute is set.
     * @see #unsetPavail()
     * @see #getPavail()
     * @see #setPavail(Double)
     * @generated
     */
    boolean isSetPavail();

    /**
     * Returns the value of the '<em><b>Dpv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Partial derivative (<i>dp</i><i><sub>v1</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpv1</em>' attribute.
     * @see #isSetDpv1()
     * @see #unsetDpv1()
     * @see #setDpv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Dpv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.dpv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpv1</em>' attribute.
     * @see #isSetDpv1()
     * @see #unsetDpv1()
     * @see #getDpv1()
     * @generated
     */
    void setDpv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpv1()
     * @see #getDpv1()
     * @see #setDpv1(Double)
     * @generated
     */
    void unsetDpv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpv1</em>' attribute is set.
     * @see #unsetDpv1()
     * @see #getDpv1()
     * @see #setDpv1(Double)
     * @generated
     */
    boolean isSetDpv1();

    /**
     * Returns the value of the '<em><b>Thetazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pitch angle if the wind turbine is not derated (<i>theta</i><i><sub>0</sub></i>). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #setThetazero(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroTwoDimIEC_Thetazero()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroTwoDimIEC.thetazero' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @generated
     */
    void setThetazero( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Double)
     * @generated
     */
    void unsetThetazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetazero</em>' attribute is set.
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Double)
     * @generated
     */
    boolean isSetThetazero();

} // WindAeroTwoDimIEC
