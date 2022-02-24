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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Town Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Town details, in the context of address.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCountry <em>Country</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail()
 * @model
 * @generated
 */
public interface TownDetail extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Town name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail_Name()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='TownDetail.name' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Town code.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #setCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail_Code()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='TownDetail.code' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #getCode()
     * @generated
     */
    void setCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    void unsetCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCode <em>Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Code</em>' attribute is set.
     * @see #unsetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    boolean isSetCode();

    /**
     * Returns the value of the '<em><b>Country</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the country.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Country</em>' attribute.
     * @see #isSetCountry()
     * @see #unsetCountry()
     * @see #setCountry(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail_Country()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='TownDetail.country' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getCountry();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCountry <em>Country</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Country</em>' attribute.
     * @see #isSetCountry()
     * @see #unsetCountry()
     * @see #getCountry()
     * @generated
     */
    void setCountry( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCountry <em>Country</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCountry()
     * @see #getCountry()
     * @see #setCountry(String)
     * @generated
     */
    void unsetCountry();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getCountry <em>Country</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Country</em>' attribute is set.
     * @see #unsetCountry()
     * @see #getCountry()
     * @see #setCountry(String)
     * @generated
     */
    boolean isSetCountry();

    /**
     * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the state or province.
     * <!-- end-model-doc -->
     * @return the value of the '<em>State Or Province</em>' attribute.
     * @see #isSetStateOrProvince()
     * @see #unsetStateOrProvince()
     * @see #setStateOrProvince(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail_StateOrProvince()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='TownDetail.stateOrProvince' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getStateOrProvince();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State Or Province</em>' attribute.
     * @see #isSetStateOrProvince()
     * @see #unsetStateOrProvince()
     * @see #getStateOrProvince()
     * @generated
     */
    void setStateOrProvince( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStateOrProvince()
     * @see #getStateOrProvince()
     * @see #setStateOrProvince(String)
     * @generated
     */
    void unsetStateOrProvince();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>State Or Province</em>' attribute is set.
     * @see #unsetStateOrProvince()
     * @see #getStateOrProvince()
     * @see #setStateOrProvince(String)
     * @generated
     */
    boolean isSetStateOrProvince();

    /**
     * Returns the value of the '<em><b>Section</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Town section. For example, it is common for there to be 36 sections per township.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Section</em>' attribute.
     * @see #isSetSection()
     * @see #unsetSection()
     * @see #setSection(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTownDetail_Section()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='TownDetail.section' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getSection <em>Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Section</em>' attribute.
     * @see #isSetSection()
     * @see #unsetSection()
     * @see #getSection()
     * @generated
     */
    void setSection( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getSection <em>Section</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSection()
     * @see #getSection()
     * @see #setSection(String)
     * @generated
     */
    void unsetSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail#getSection <em>Section</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Section</em>' attribute is set.
     * @see #unsetSection()
     * @see #getSection()
     * @see #setSection(String)
     * @generated
     */
    boolean isSetSection();

} // TownDetail
