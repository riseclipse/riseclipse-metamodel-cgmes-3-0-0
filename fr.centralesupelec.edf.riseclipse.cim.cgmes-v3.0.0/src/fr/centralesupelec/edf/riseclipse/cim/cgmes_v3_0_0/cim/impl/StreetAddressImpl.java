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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetDetail;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TownDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getTownDetail <em>Town Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StreetAddressImpl#getPoBox <em>Po Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetAddressImpl extends MinimalEObjectImpl.Container implements StreetAddress {
    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStreetDetail()
     * @generated
     * @ordered
     */
    protected StreetDetail streetDetail;

    /**
     * This is true if the Street Detail reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean streetDetailESet;

    /**
     * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostalCode()
     * @generated
     * @ordered
     */
    protected static final String POSTAL_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostalCode()
     * @generated
     * @ordered
     */
    protected String postalCode = POSTAL_CODE_EDEFAULT;

    /**
     * This is true if the Postal Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean postalCodeESet;

    /**
     * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected static final String LANGUAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected String language = LANGUAGE_EDEFAULT;

    /**
     * This is true if the Language attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean languageESet;

    /**
     * The cached value of the '{@link #getTownDetail() <em>Town Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTownDetail()
     * @generated
     * @ordered
     */
    protected TownDetail townDetail;

    /**
     * This is true if the Town Detail reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean townDetailESet;

    /**
     * The default value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoBox()
     * @generated
     * @ordered
     */
    protected static final String PO_BOX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoBox()
     * @generated
     * @ordered
     */
    protected String poBox = PO_BOX_EDEFAULT;

    /**
     * This is true if the Po Box attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean poBoxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StreetAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStreetAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        if( status != null && status.eIsProxy() ) {
            InternalEObject oldStatus = ( InternalEObject ) status;
            status = ( Status ) eResolveProxy( oldStatus );
            if( status != oldStatus ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.STREET_ADDRESS__STATUS,
                            oldStatus, status ) );
            }
        }
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Status basicGetStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatus( Status newStatus ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__STATUS, oldStatus,
                    status, !oldStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatus() {
        Status oldStatus = status;
        boolean oldStatusESet = statusESet;
        status = null;
        statusESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__STATUS, oldStatus,
                    null, oldStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetDetail getStreetDetail() {
        if( streetDetail != null && streetDetail.eIsProxy() ) {
            InternalEObject oldStreetDetail = ( InternalEObject ) streetDetail;
            streetDetail = ( StreetDetail ) eResolveProxy( oldStreetDetail );
            if( streetDetail != oldStreetDetail ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.STREET_ADDRESS__STREET_DETAIL, oldStreetDetail, streetDetail ) );
            }
        }
        return streetDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StreetDetail basicGetStreetDetail() {
        return streetDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStreetDetail( StreetDetail newStreetDetail ) {
        StreetDetail oldStreetDetail = streetDetail;
        streetDetail = newStreetDetail;
        boolean oldStreetDetailESet = streetDetailESet;
        streetDetailESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__STREET_DETAIL,
                    oldStreetDetail, streetDetail, !oldStreetDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStreetDetail() {
        StreetDetail oldStreetDetail = streetDetail;
        boolean oldStreetDetailESet = streetDetailESet;
        streetDetail = null;
        streetDetailESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__STREET_DETAIL,
                    oldStreetDetail, null, oldStreetDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStreetDetail() {
        return streetDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPostalCode( String newPostalCode ) {
        String oldPostalCode = postalCode;
        postalCode = newPostalCode;
        boolean oldPostalCodeESet = postalCodeESet;
        postalCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__POSTAL_CODE,
                    oldPostalCode, postalCode, !oldPostalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPostalCode() {
        String oldPostalCode = postalCode;
        boolean oldPostalCodeESet = postalCodeESet;
        postalCode = POSTAL_CODE_EDEFAULT;
        postalCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__POSTAL_CODE,
                    oldPostalCode, POSTAL_CODE_EDEFAULT, oldPostalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPostalCode() {
        return postalCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLanguage() {
        return language;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLanguage( String newLanguage ) {
        String oldLanguage = language;
        language = newLanguage;
        boolean oldLanguageESet = languageESet;
        languageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__LANGUAGE, oldLanguage,
                    language, !oldLanguageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLanguage() {
        String oldLanguage = language;
        boolean oldLanguageESet = languageESet;
        language = LANGUAGE_EDEFAULT;
        languageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__LANGUAGE, oldLanguage,
                    LANGUAGE_EDEFAULT, oldLanguageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLanguage() {
        return languageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TownDetail getTownDetail() {
        if( townDetail != null && townDetail.eIsProxy() ) {
            InternalEObject oldTownDetail = ( InternalEObject ) townDetail;
            townDetail = ( TownDetail ) eResolveProxy( oldTownDetail );
            if( townDetail != oldTownDetail ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.STREET_ADDRESS__TOWN_DETAIL,
                            oldTownDetail, townDetail ) );
            }
        }
        return townDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TownDetail basicGetTownDetail() {
        return townDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTownDetail( TownDetail newTownDetail ) {
        TownDetail oldTownDetail = townDetail;
        townDetail = newTownDetail;
        boolean oldTownDetailESet = townDetailESet;
        townDetailESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__TOWN_DETAIL,
                    oldTownDetail, townDetail, !oldTownDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTownDetail() {
        TownDetail oldTownDetail = townDetail;
        boolean oldTownDetailESet = townDetailESet;
        townDetail = null;
        townDetailESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__TOWN_DETAIL,
                    oldTownDetail, null, oldTownDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTownDetail() {
        return townDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPoBox() {
        return poBox;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPoBox( String newPoBox ) {
        String oldPoBox = poBox;
        poBox = newPoBox;
        boolean oldPoBoxESet = poBoxESet;
        poBoxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__PO_BOX, oldPoBox, poBox,
                    !oldPoBoxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPoBox() {
        String oldPoBox = poBox;
        boolean oldPoBoxESet = poBoxESet;
        poBox = PO_BOX_EDEFAULT;
        poBoxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STREET_ADDRESS__PO_BOX, oldPoBox,
                    PO_BOX_EDEFAULT, oldPoBoxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPoBox() {
        return poBoxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STREET_ADDRESS__STATUS:
            if( resolve ) return getStatus();
            return basicGetStatus();
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            if( resolve ) return getStreetDetail();
            return basicGetStreetDetail();
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            return getPostalCode();
        case CimPackage.STREET_ADDRESS__LANGUAGE:
            return getLanguage();
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            if( resolve ) return getTownDetail();
            return basicGetTownDetail();
        case CimPackage.STREET_ADDRESS__PO_BOX:
            return getPoBox();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.STREET_ADDRESS__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            setStreetDetail( ( StreetDetail ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            setPostalCode( ( String ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__LANGUAGE:
            setLanguage( ( String ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            setTownDetail( ( TownDetail ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__PO_BOX:
            setPoBox( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.STREET_ADDRESS__STATUS:
            unsetStatus();
            return;
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            unsetStreetDetail();
            return;
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            unsetPostalCode();
            return;
        case CimPackage.STREET_ADDRESS__LANGUAGE:
            unsetLanguage();
            return;
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            unsetTownDetail();
            return;
        case CimPackage.STREET_ADDRESS__PO_BOX:
            unsetPoBox();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.STREET_ADDRESS__STATUS:
            return isSetStatus();
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            return isSetStreetDetail();
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            return isSetPostalCode();
        case CimPackage.STREET_ADDRESS__LANGUAGE:
            return isSetLanguage();
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            return isSetTownDetail();
        case CimPackage.STREET_ADDRESS__PO_BOX:
            return isSetPoBox();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (postalCode: " );
        if( postalCodeESet )
            result.append( postalCode );
        else
            result.append( "<unset>" );
        result.append( ", language: " );
        if( languageESet )
            result.append( language );
        else
            result.append( "<unset>" );
        result.append( ", poBox: " );
        if( poBoxESet )
            result.append( poBox );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StreetAddressImpl
