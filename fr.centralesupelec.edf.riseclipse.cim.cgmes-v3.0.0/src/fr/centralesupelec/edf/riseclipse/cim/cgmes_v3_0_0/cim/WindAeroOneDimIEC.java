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
 * A representation of the model object '<em><b>Wind Aero One Dim IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One-dimensional aerodynamic model.
 * Reference: IEC 61400-27-1:2015, 5.6.1.2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getThetaomega <em>Thetaomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroOneDimIEC()
 * @model
 * @generated
 */
public interface WindAeroOneDimIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Thetaomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Initial pitch angle (<i>theta</i><i><sub>omega0</sub></i>). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetaomega</em>' attribute.
     * @see #isSetThetaomega()
     * @see #unsetThetaomega()
     * @see #setThetaomega(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroOneDimIEC_Thetaomega()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroOneDimIEC.thetaomega' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetaomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getThetaomega <em>Thetaomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetaomega</em>' attribute.
     * @see #isSetThetaomega()
     * @see #unsetThetaomega()
     * @see #getThetaomega()
     * @generated
     */
    void setThetaomega( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getThetaomega <em>Thetaomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetaomega()
     * @see #getThetaomega()
     * @see #setThetaomega(Double)
     * @generated
     */
    void unsetThetaomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getThetaomega <em>Thetaomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetaomega</em>' attribute is set.
     * @see #unsetThetaomega()
     * @see #getThetaomega()
     * @see #setThetaomega(Double)
     * @generated
     */
    boolean isSetThetaomega();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Aerodynamic gain (<i>k</i><i><sub>a</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroOneDimIEC_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroOneDimIEC.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 model with which this wind aerodynamic model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindAeroOneDimIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindAeroOneDimIEC
     * @model opposite="WindAeroOneDimIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindAeroOneDimIEC.WindTurbineType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindAeroOneDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

} // WindAeroOneDimIEC
