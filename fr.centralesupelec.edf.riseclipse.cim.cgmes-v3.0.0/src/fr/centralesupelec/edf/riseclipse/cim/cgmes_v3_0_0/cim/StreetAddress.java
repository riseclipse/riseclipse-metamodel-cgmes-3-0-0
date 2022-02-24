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
 * A representation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General purpose street and postal address information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getTownDetail <em>Town Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPoBox <em>Po Box</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress()
 * @model
 * @generated
 */
public interface StreetAddress extends EObject {
    /**
     * Returns the value of the '<em><b>Status</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Status of this address.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Status</em>' reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #setStatus(Status)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_Status()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.status' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Status getStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStatus <em>Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #getStatus()
     * @generated
     */
    void setStatus( Status value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStatus <em>Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    void unsetStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStatus <em>Status</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status</em>' reference is set.
     * @see #unsetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    boolean isSetStatus();

    /**
     * Returns the value of the '<em><b>Street Detail</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Street detail.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Street Detail</em>' reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_StreetDetail()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.streetDetail' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    StreetDetail getStreetDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Street Detail</em>' reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @generated
     */
    void setStreetDetail( StreetDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    void unsetStreetDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Street Detail</em>' reference is set.
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    boolean isSetStreetDetail();

    /**
     * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Postal code for the address.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #setPostalCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_PostalCode()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.postalCode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getPostalCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @generated
     */
    void setPostalCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    void unsetPostalCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Postal Code</em>' attribute is set.
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    boolean isSetPostalCode();

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The language in which the address is specified, using ISO 639-1 two digit language code.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #isSetLanguage()
     * @see #unsetLanguage()
     * @see #setLanguage(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_Language()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.language' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #isSetLanguage()
     * @see #unsetLanguage()
     * @see #getLanguage()
     * @generated
     */
    void setLanguage( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLanguage()
     * @see #getLanguage()
     * @see #setLanguage(String)
     * @generated
     */
    void unsetLanguage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getLanguage <em>Language</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Language</em>' attribute is set.
     * @see #unsetLanguage()
     * @see #getLanguage()
     * @see #setLanguage(String)
     * @generated
     */
    boolean isSetLanguage();

    /**
     * Returns the value of the '<em><b>Town Detail</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Town detail.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Town Detail</em>' reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #setTownDetail(TownDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_TownDetail()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.townDetail' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TownDetail getTownDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Town Detail</em>' reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @generated
     */
    void setTownDetail( TownDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    void unsetTownDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Town Detail</em>' reference is set.
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    boolean isSetTownDetail();

    /**
     * Returns the value of the '<em><b>Po Box</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Post office box.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #setPoBox(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStreetAddress_PoBox()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='StreetAddress.poBox' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getPoBox();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @generated
     */
    void setPoBox( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    void unsetPoBox();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Po Box</em>' attribute is set.
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    boolean isSetPoBox();

} // StreetAddress
