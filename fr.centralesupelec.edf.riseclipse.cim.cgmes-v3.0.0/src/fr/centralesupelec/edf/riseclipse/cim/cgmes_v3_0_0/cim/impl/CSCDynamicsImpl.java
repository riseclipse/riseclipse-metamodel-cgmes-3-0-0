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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSC Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CSCDynamicsImpl#getCSConverter <em>CS Converter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSCDynamicsImpl extends HVDCDynamicsImpl implements CSCDynamics {
    /**
     * The cached value of the '{@link #getCSConverter() <em>CS Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCSConverter()
     * @generated
     * @ordered
     */
    protected CsConverter csConverter;

    /**
     * This is true if the CS Converter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean csConverterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CSCDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCSCDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsConverter getCSConverter() {
        return csConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCSConverter( CsConverter newCSConverter, NotificationChain msgs ) {
        CsConverter oldCSConverter = csConverter;
        csConverter = newCSConverter;
        boolean oldCSConverterESet = csConverterESet;
        csConverterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CSC_DYNAMICS__CS_CONVERTER, oldCSConverter, newCSConverter, !oldCSConverterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCSConverter( CsConverter newCSConverter ) {
        if( newCSConverter != csConverter ) {
            NotificationChain msgs = null;
            if( csConverter != null )
                msgs = ( ( InternalEObject ) csConverter ).eInverseRemove( this, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                        CsConverter.class, msgs );
            if( newCSConverter != null )
                msgs = ( ( InternalEObject ) newCSConverter ).eInverseAdd( this, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                        CsConverter.class, msgs );
            msgs = basicSetCSConverter( newCSConverter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCSConverterESet = csConverterESet;
            csConverterESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CSC_DYNAMICS__CS_CONVERTER,
                        newCSConverter, newCSConverter, !oldCSConverterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCSConverter( NotificationChain msgs ) {
        CsConverter oldCSConverter = csConverter;
        csConverter = null;
        boolean oldCSConverterESet = csConverterESet;
        csConverterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CSC_DYNAMICS__CS_CONVERTER, oldCSConverter, null, oldCSConverterESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCSConverter() {
        if( csConverter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) csConverter ).eInverseRemove( this, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                    CsConverter.class, msgs );
            msgs = basicUnsetCSConverter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCSConverterESet = csConverterESet;
            csConverterESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CSC_DYNAMICS__CS_CONVERTER, null,
                        null, oldCSConverterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCSConverter() {
        return csConverterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            if( csConverter != null )
                msgs = ( ( InternalEObject ) csConverter ).eInverseRemove( this, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                        CsConverter.class, msgs );
            return basicSetCSConverter( ( CsConverter ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            return basicUnsetCSConverter( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            return getCSConverter();
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
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            setCSConverter( ( CsConverter ) newValue );
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
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            unsetCSConverter();
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
        case CimPackage.CSC_DYNAMICS__CS_CONVERTER:
            return isSetCSConverter();
        }
        return super.eIsSet( featureID );
    }

} //CSCDynamicsImpl
