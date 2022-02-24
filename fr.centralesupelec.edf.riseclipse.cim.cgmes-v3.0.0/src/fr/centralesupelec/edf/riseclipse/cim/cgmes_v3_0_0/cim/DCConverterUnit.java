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
 * A representation of the model object '<em><b>DC Converter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indivisible operative unit comprising all equipment between the point of common coupling on the AC side and the point of common coupling – DC side, essentially one or more converters, together with one or more converter transformers, converter control equipment, essential protective and switching devices and auxiliaries, if any, used for conversion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConverterUnit()
 * @model
 * @generated
 */
public interface DCConverterUnit extends DCEquipmentContainer {
    /**
     * Returns the value of the '<em><b>Operation Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterOperatingModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operating mode of an HVDC bipole (bipolar, monopolar metallic return, etc).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterOperatingModeKind
     * @see #isSetOperationMode()
     * @see #unsetOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConverterUnit_OperationMode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DCConverterUnit.operationMode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DCConverterOperatingModeKind getOperationMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterOperatingModeKind
     * @see #isSetOperationMode()
     * @see #unsetOperationMode()
     * @see #getOperationMode()
     * @generated
     */
    void setOperationMode( DCConverterOperatingModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationMode()
     * @see #getOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @generated
     */
    void unsetOperationMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operation Mode</em>' attribute is set.
     * @see #unsetOperationMode()
     * @see #getOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @generated
     */
    boolean isSetOperationMode();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getDCConverterUnit <em>DC Converter Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The containing substation of the DC converter unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDCConverterUnit_Substation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getDCConverterUnit
     * @model opposite="DCConverterUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DCConverterUnit.Substation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' reference is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    boolean isSetSubstation();

} // DCConverterUnit
