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
 * A representation of the model object '<em><b>Street Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Street details, in the context of address.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral <em>Address General</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getFloorIdentification <em>Floor Identification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail()
 * @model
 * @generated
 */
public interface StreetDetail extends EObject {
    /**
     * Returns the value of the '<em><b>Suite Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of the apartment or suite.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Suite Number</em>' attribute.
     * @see #isSetSuiteNumber()
     * @see #unsetSuiteNumber()
     * @see #setSuiteNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_SuiteNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.suiteNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getSuiteNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suite Number</em>' attribute.
     * @see #isSetSuiteNumber()
     * @see #unsetSuiteNumber()
     * @see #getSuiteNumber()
     * @generated
     */
    void setSuiteNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuiteNumber()
     * @see #getSuiteNumber()
     * @see #setSuiteNumber(String)
     * @generated
     */
    void unsetSuiteNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suite Number</em>' attribute is set.
     * @see #unsetSuiteNumber()
     * @see #getSuiteNumber()
     * @see #setSuiteNumber(String)
     * @generated
     */
    boolean isSetSuiteNumber();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of street. Examples include: street, circle, boulevard, avenue, road, drive, etc.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Type()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Building Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (if applicable) In certain cases the physical location of the place of interest does not have a direct point of entry from the street, but may be located inside a larger structure such as a building, complex, office block, apartment, etc.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #setBuildingName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_BuildingName()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.buildingName' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getBuildingName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @generated
     */
    void setBuildingName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    void unsetBuildingName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Building Name</em>' attribute is set.
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    boolean isSetBuildingName();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Prefix to the street name. For example: North, South, East, West.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Prefix()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.prefix' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Address General</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * First line of a free form address or some additional address information (for example a mail stop).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address General</em>' attribute.
     * @see #isSetAddressGeneral()
     * @see #unsetAddressGeneral()
     * @see #setAddressGeneral(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_AddressGeneral()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.addressGeneral' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getAddressGeneral();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General</em>' attribute.
     * @see #isSetAddressGeneral()
     * @see #unsetAddressGeneral()
     * @see #getAddressGeneral()
     * @generated
     */
    void setAddressGeneral( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral()
     * @see #getAddressGeneral()
     * @see #setAddressGeneral(String)
     * @generated
     */
    void unsetAddressGeneral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General</em>' attribute is set.
     * @see #unsetAddressGeneral()
     * @see #getAddressGeneral()
     * @see #setAddressGeneral(String)
     * @generated
     */
    boolean isSetAddressGeneral();

    /**
     * Returns the value of the '<em><b>Address General2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (if applicable) Second line of a free form address.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address General2</em>' attribute.
     * @see #isSetAddressGeneral2()
     * @see #unsetAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_AddressGeneral2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.addressGeneral2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getAddressGeneral2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General2</em>' attribute.
     * @see #isSetAddressGeneral2()
     * @see #unsetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @generated
     */
    void setAddressGeneral2( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @generated
     */
    void unsetAddressGeneral2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General2</em>' attribute is set.
     * @see #unsetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @generated
     */
    boolean isSetAddressGeneral2();

    /**
     * Returns the value of the '<em><b>Address General3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (if applicable) Third line of a free form address.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address General3</em>' attribute.
     * @see #isSetAddressGeneral3()
     * @see #unsetAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_AddressGeneral3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.addressGeneral3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getAddressGeneral3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General3</em>' attribute.
     * @see #isSetAddressGeneral3()
     * @see #unsetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @generated
     */
    void setAddressGeneral3( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @generated
     */
    void unsetAddressGeneral3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General3</em>' attribute is set.
     * @see #unsetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @generated
     */
    boolean isSetAddressGeneral3();

    /**
     * Returns the value of the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Suffix to the street name. For example: North, South, East, West.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #setSuffix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Suffix()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.suffix' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getSuffix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @generated
     */
    void setSuffix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    void unsetSuffix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suffix</em>' attribute is set.
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    boolean isSetSuffix();

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (if applicable) Utilities often make use of external reference systems, such as those of the town-planner's department or surveyor general's mapping system, that allocate global reference codes to streets.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #setCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Code()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.code' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getCode <em>Code</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    void unsetCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getCode <em>Code</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designator of the specific location on the street.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number</em>' attribute.
     * @see #isSetNumber()
     * @see #unsetNumber()
     * @see #setNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Number()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.number' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #isSetNumber()
     * @see #unsetNumber()
     * @see #getNumber()
     * @generated
     */
    void setNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNumber()
     * @see #getNumber()
     * @see #setNumber(String)
     * @generated
     */
    void unsetNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getNumber <em>Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Number</em>' attribute is set.
     * @see #unsetNumber()
     * @see #getNumber()
     * @see #setNumber(String)
     * @generated
     */
    boolean isSetNumber();

    /**
     * Returns the value of the '<em><b>Within Town Limits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * True if this street is within the legal geographical boundaries of the specified town (default).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Within Town Limits</em>' attribute.
     * @see #isSetWithinTownLimits()
     * @see #unsetWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_WithinTownLimits()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.withinTownLimits' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getWithinTownLimits();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Within Town Limits</em>' attribute.
     * @see #isSetWithinTownLimits()
     * @see #unsetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @generated
     */
    void setWithinTownLimits( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @generated
     */
    void unsetWithinTownLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Within Town Limits</em>' attribute is set.
     * @see #unsetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @generated
     */
    boolean isSetWithinTownLimits();

    /**
     * Returns the value of the '<em><b>Floor Identification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The identification by name or number, expressed as text, of the floor in the building as part of this address.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Floor Identification</em>' attribute.
     * @see #isSetFloorIdentification()
     * @see #unsetFloorIdentification()
     * @see #setFloorIdentification(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_FloorIdentification()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.floorIdentification' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getFloorIdentification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getFloorIdentification <em>Floor Identification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Floor Identification</em>' attribute.
     * @see #isSetFloorIdentification()
     * @see #unsetFloorIdentification()
     * @see #getFloorIdentification()
     * @generated
     */
    void setFloorIdentification( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getFloorIdentification <em>Floor Identification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFloorIdentification()
     * @see #getFloorIdentification()
     * @see #setFloorIdentification(String)
     * @generated
     */
    void unsetFloorIdentification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getFloorIdentification <em>Floor Identification</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Floor Identification</em>' attribute is set.
     * @see #unsetFloorIdentification()
     * @see #getFloorIdentification()
     * @see #setFloorIdentification(String)
     * @generated
     */
    boolean isSetFloorIdentification();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the street.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetDetail_Name()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetDetail.name' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getName <em>Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

} // StreetDetail
