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
 * A representation of the model object '<em><b>Wind Cont Pitch Angle IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pitch angle control model.
 * Reference: IEC 61400-27-1:2015, 5.6.5.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC()
 * @model
 * @generated
 */
public interface WindContPitchAngleIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pitch cross coupling gain (<i>K</i><i><sub>PX</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpx</em>' attribute.
     * @see #isSetKpx()
     * @see #unsetKpx()
     * @see #setKpx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Kpx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.kpx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpx</em>' attribute.
     * @see #isSetKpx()
     * @see #unsetKpx()
     * @see #getKpx()
     * @generated
     */
    void setKpx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpx()
     * @see #getKpx()
     * @see #setKpx(Double)
     * @generated
     */
    void unsetKpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpx</em>' attribute is set.
     * @see #unsetKpx()
     * @see #getKpx()
     * @see #setKpx(Double)
     * @generated
     */
    boolean isSetKpx();

    /**
     * Returns the value of the '<em><b>Kpc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power PI controller proportional gain (<i>K</i><i><sub>Pc</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #setKpc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Kpc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.kpc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpc()
     * @see #getKpc()
     * @see #setKpc(Double)
     * @generated
     */
    void unsetKpc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power PI controller integration gain (<i>K</i><i><sub>Ic</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #setKic(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Kic()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.kic' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #getKic()
     * @generated
     */
    void setKic( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKic()
     * @see #getKic()
     * @see #setKic(Double)
     * @generated
     */
    void unsetKic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kic</em>' attribute is set.
     * @see #unsetKic()
     * @see #getKic()
     * @see #setKic(Double)
     * @generated
     */
    boolean isSetKic();

    /**
     * Returns the value of the '<em><b>Thetamin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum pitch angle (<i>theta</i><i><sub>min</sub></i>) (&lt; WindContPitchAngleIEC.thetamax). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetamin</em>' attribute.
     * @see #isSetThetamin()
     * @see #unsetThetamin()
     * @see #setThetamin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Thetamin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.thetamin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetamin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetamin</em>' attribute.
     * @see #isSetThetamin()
     * @see #unsetThetamin()
     * @see #getThetamin()
     * @generated
     */
    void setThetamin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetamin()
     * @see #getThetamin()
     * @see #setThetamin(Double)
     * @generated
     */
    void unsetThetamin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetamin</em>' attribute is set.
     * @see #unsetThetamin()
     * @see #getThetamin()
     * @see #setThetamin(Double)
     * @generated
     */
    boolean isSetThetamin();

    /**
     * Returns the value of the '<em><b>Ttheta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pitch time constant (<i>ttheta</i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ttheta</em>' attribute.
     * @see #isSetTtheta()
     * @see #unsetTtheta()
     * @see #setTtheta(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Ttheta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.ttheta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTtheta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ttheta</em>' attribute.
     * @see #isSetTtheta()
     * @see #unsetTtheta()
     * @see #getTtheta()
     * @generated
     */
    void setTtheta( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTtheta()
     * @see #getTtheta()
     * @see #setTtheta(Double)
     * @generated
     */
    void unsetTtheta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ttheta</em>' attribute is set.
     * @see #unsetTtheta()
     * @see #getTtheta()
     * @see #setTtheta(Double)
     * @generated
     */
    boolean isSetTtheta();

    /**
     * Returns the value of the '<em><b>Thetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum pitch angle (<i>theta</i><i><sub>max</sub></i>) (&gt; WindContPitchAngleIEC.thetamin). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetamax</em>' attribute.
     * @see #isSetThetamax()
     * @see #unsetThetamax()
     * @see #setThetamax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Thetamax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.thetamax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetamax</em>' attribute.
     * @see #isSetThetamax()
     * @see #unsetThetamax()
     * @see #getThetamax()
     * @generated
     */
    void setThetamax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetamax()
     * @see #getThetamax()
     * @see #setThetamax(Double)
     * @generated
     */
    void unsetThetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetamax</em>' attribute is set.
     * @see #unsetThetamax()
     * @see #getThetamax()
     * @see #setThetamax(Double)
     * @generated
     */
    boolean isSetThetamax();

    /**
     * Returns the value of the '<em><b>Kpomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed PI controller proportional gain (<i>K</i><i><sub>Pomega</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpomega</em>' attribute.
     * @see #isSetKpomega()
     * @see #unsetKpomega()
     * @see #setKpomega(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Kpomega()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.kpomega' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpomega</em>' attribute.
     * @see #isSetKpomega()
     * @see #unsetKpomega()
     * @see #getKpomega()
     * @generated
     */
    void setKpomega( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpomega()
     * @see #getKpomega()
     * @see #setKpomega(Double)
     * @generated
     */
    void unsetKpomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpomega</em>' attribute is set.
     * @see #unsetKpomega()
     * @see #getKpomega()
     * @see #setKpomega(Double)
     * @generated
     */
    boolean isSetKpomega();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 model with which this pitch control model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindContPitchAngleIEC
     * @model opposite="WindContPitchAngleIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.WindTurbineType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
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
     * Returns the value of the '<em><b>Dthetamin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum pitch negative ramp rate (<i>dtheta</i><i><sub>min</sub></i><i>)</i> (&lt; WindContPitchAngleIEC.dthetamax). It is a type-dependent parameter. Unit = degrees / s.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dthetamin</em>' attribute.
     * @see #isSetDthetamin()
     * @see #unsetDthetamin()
     * @see #setDthetamin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Dthetamin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.dthetamin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDthetamin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamin</em>' attribute.
     * @see #isSetDthetamin()
     * @see #unsetDthetamin()
     * @see #getDthetamin()
     * @generated
     */
    void setDthetamin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamin()
     * @see #getDthetamin()
     * @see #setDthetamin(Double)
     * @generated
     */
    void unsetDthetamin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamin</em>' attribute is set.
     * @see #unsetDthetamin()
     * @see #getDthetamin()
     * @see #setDthetamin(Double)
     * @generated
     */
    boolean isSetDthetamin();

    /**
     * Returns the value of the '<em><b>Dthetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum pitch positive ramp rate (<i>dtheta</i><i><sub>max</sub></i>) (&gt; WindContPitchAngleIEC.dthetamin). It is a type-dependent parameter. Unit = degrees / s.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #setDthetamax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Dthetamax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.dthetamax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDthetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @generated
     */
    void setDthetamax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Double)
     * @generated
     */
    void unsetDthetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamax</em>' attribute is set.
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Double)
     * @generated
     */
    boolean isSetDthetamax();

    /**
     * Returns the value of the '<em><b>Kiomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed PI controller integration gain (<i>K</i><i><sub>Iomega</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiomega</em>' attribute.
     * @see #isSetKiomega()
     * @see #unsetKiomega()
     * @see #setKiomega(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPitchAngleIEC_Kiomega()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPitchAngleIEC.kiomega' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiomega</em>' attribute.
     * @see #isSetKiomega()
     * @see #unsetKiomega()
     * @see #getKiomega()
     * @generated
     */
    void setKiomega( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiomega()
     * @see #getKiomega()
     * @see #setKiomega(Double)
     * @generated
     */
    void unsetKiomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiomega</em>' attribute is set.
     * @see #unsetKiomega()
     * @see #getKiomega()
     * @see #setKiomega(Double)
     * @generated
     */
    boolean isSetKiomega();

} // WindContPitchAngleIEC
